package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class info_des extends Activity implements B4AActivity{
	public static info_des mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (isFirst) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.info_des");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (info_des).");
				p.finish();
			}
		}
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		mostCurrent = this;
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.info_des");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.info_des", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (info_des) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (info_des) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEvent(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return info_des.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null) //workaround for emulator bug (Issue 2423)
            return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (info_des) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
			if (mostCurrent == null || mostCurrent != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (info_des) Resume **");
		    processBA.raiseEvent(mostCurrent._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        Object[] o;
        if (permissions.length > 0)
            o = new Object[] {permissions[0], grantResults[0] == 0};
        else
            o = new Object[] {"", false};
        processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _nama = "";
public static String _id = "";
public static String _lat = "";
public static String _lng = "";
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label7 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label8 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button7 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button6 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button5 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button4 = null;
public static String _idmes = "";
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview2 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview3 = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.info_utama _info_utama = null;
public b4a.example.galeri_ut _galeri_ut = null;
public b4a.example.pencarian_travel _pencarian_travel = null;
public b4a.example.lokasi _lokasi = null;
public b4a.example.info_travel _info_travel = null;
public b4a.example.pencarian_des _pencarian_des = null;
public b4a.example.pencarian_nama _pencarian_nama = null;
public b4a.example.lokasi_des _lokasi_des = null;
public b4a.example.lokasi_travel _lokasi_travel = null;
public b4a.example.lokasi_trav _lokasi_trav = null;
public b4a.example.home _home = null;
public b4a.example.addbooking _addbooking = null;
public b4a.example.starter _starter = null;
public b4a.example.booking _booking = null;
public b4a.example.login _login = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="info_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Activity.LoadLayout(\"informasi_utama\")";
mostCurrent._activity.LoadLayout("informasi_utama",mostCurrent.activityBA);
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Label7.Text=pencarian_des.name";
mostCurrent._label7.setText((Object)(mostCurrent._pencarian_des._name));
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="Label8.Text=pencarian_des.price";
mostCurrent._label8.setText((Object)(mostCurrent._pencarian_des._price));
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="ListView2.SingleLineLayout.Label.TextColor=Colors";
mostCurrent._listview2.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="ListView2.SingleLineLayout.Label.TextSize=16";
mostCurrent._listview2.getSingleLineLayout().Label.setTextSize((float) (16));
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="ListView2.SingleLineLayout.Label.Left=2%y";
mostCurrent._listview2.getSingleLineLayout().Label.setLeft(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA));
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="Job.Initialize(\"Jobcarides\", Me)";
_job._initialize(processBA,"Jobcarides",info_des.getObject());
RDebugUtils.currentLine=4915209;
 //BA.debugLineNum = 4915209;BA.debugLine="Job.PostString(\"http://192.168.100.13/wisatasolse";
_job._poststring("http://192.168.100.13/wisatasolsel/mobile/info_detail.php?id="+mostCurrent._pencarian_des._id,"");
RDebugUtils.currentLine=4915210;
 //BA.debugLineNum = 4915210;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="info_des";
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="info_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="Job.Initialize(\"Jobcarides\", Me)";
_job._initialize(processBA,"Jobcarides",info_des.getObject());
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="Job.PostString(\"http://192.168.100.13/wisatasolse";
_job._poststring("http://192.168.100.13/wisatasolsel/mobile/info_detail.php?id="+mostCurrent._pencarian_des._id,"");
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="Log(pencarian_des.id_tempat)";
anywheresoftware.b4a.keywords.Common.Log(mostCurrent._pencarian_des._id_tempat);
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
RDebugUtils.currentModule="info_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button1_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button1_click", null);
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub Button1_Click";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._main.getObject()));
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="End Sub";
return "";
}
public static String  _button2_click() throws Exception{
RDebugUtils.currentModule="info_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button2_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button2_click", null);
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub Button2_Click";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="StartActivity(pencarian_travel)";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._pencarian_travel.getObject()));
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="End Sub";
return "";
}
public static String  _button3_click() throws Exception{
RDebugUtils.currentModule="info_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button3_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button3_click", null);
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub Button3_Click";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="StartActivity(pencarian_nama)";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._pencarian_nama.getObject()));
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="End Sub";
return "";
}
public static String  _button4_click() throws Exception{
RDebugUtils.currentModule="info_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button4_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button4_click", null);
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub Button4_Click";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="StartActivity(pencarian_des)";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._pencarian_des.getObject()));
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="End Sub";
return "";
}
public static String  _button5_click() throws Exception{
RDebugUtils.currentModule="info_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button5_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button5_click", null);
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub Button5_Click";
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="StartActivity(lokasi_des)";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._lokasi_des.getObject()));
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="End Sub";
return "";
}
public static String  _button6_click() throws Exception{
RDebugUtils.currentModule="info_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button6_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button6_click", null);
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub Button6_Click";
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="End Sub";
return "";
}
public static String  _button7_click() throws Exception{
RDebugUtils.currentModule="info_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button7_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button7_click", null);
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub Button7_Click";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="StartActivity(galeri_ut)";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._galeri_ut.getObject()));
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="End Sub";
return "";
}
public static String  _detailnama() throws Exception{
RDebugUtils.currentModule="info_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "detailnama"))
	return (String) Debug.delegate(mostCurrent.activityBA, "detailnama", null);
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub detailNama";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"Loading ....");
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="ExecuteRemoteQuery(\"SELECT*FROM object_point wher";
_executeremotequery("SELECT*FROM object_point where id_package='"+mostCurrent._pencarian_des._id+"' ORDER BY object_point.no_urut ASC ","object");
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery(String _query,String _jobname) throws Exception{
RDebugUtils.currentModule="info_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "executeremotequery"))
	return (String) Debug.delegate(mostCurrent.activityBA, "executeremotequery", new Object[] {_query,_jobname});
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,info_des.getObject());
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="Job.PostString(\"\"&Main.server&\"json.php\", Query)";
_job._poststring(""+mostCurrent._main._server+"json.php",_query);
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="info_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _mes_array = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _status = "";
String _name = "";
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="res = Job.GetString";
_res = _job._getstring();
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="Log(\"nnnnnnnnnnnnnnn\")'tes";
anywheresoftware.b4a.keywords.Common.Log("nnnnnnnnnnnnnnn");
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="Log(\"Response from server :\"&res)";
anywheresoftware.b4a.keywords.Common.Log("Response from server :"+_res);
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"object","tujuan","Jobcarides")) {
case 0: {
RDebugUtils.currentLine=5242891;
 //BA.debugLineNum = 5242891;BA.debugLine="Dim mes_array As List";
_mes_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5242892;
 //BA.debugLineNum = 5242892;BA.debugLine="mes_array = parser.NextArray";
_mes_array = _parser.NextArray();
RDebugUtils.currentLine=5242893;
 //BA.debugLineNum = 5242893;BA.debugLine="For i=0 To mes_array.Size -1";
{
final int step13 = 1;
final int limit13 = (int) (_mes_array.getSize()-1);
for (_i = (int) (0) ; (step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13); _i = ((int)(0 + _i + step13)) ) {
RDebugUtils.currentLine=5242894;
 //BA.debugLineNum = 5242894;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5242896;
 //BA.debugLineNum = 5242896;BA.debugLine="m= mes_array.Get(i)";
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_mes_array.Get(_i)));
RDebugUtils.currentLine=5242897;
 //BA.debugLineNum = 5242897;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=5242898;
 //BA.debugLineNum = 5242898;BA.debugLine="Dim status As String";
_status = "";
RDebugUtils.currentLine=5242899;
 //BA.debugLineNum = 5242899;BA.debugLine="status=m.Get(\"status\")";
_status = BA.ObjectToString(_m.Get((Object)("status")));
RDebugUtils.currentLine=5242900;
 //BA.debugLineNum = 5242900;BA.debugLine="Log(status)";
anywheresoftware.b4a.keywords.Common.Log(_status);
RDebugUtils.currentLine=5242901;
 //BA.debugLineNum = 5242901;BA.debugLine="ListView2.AddSingleLine(m.Get(\"time\"))";
mostCurrent._listview2.AddSingleLine(BA.ObjectToString(_m.Get((Object)("time"))));
RDebugUtils.currentLine=5242902;
 //BA.debugLineNum = 5242902;BA.debugLine="ListView3.AddSingleLine(m.Get(\"estimated_hour";
mostCurrent._listview3.AddSingleLine(BA.ObjectToString(_m.Get((Object)("estimated_hour"))));
RDebugUtils.currentLine=5242904;
 //BA.debugLineNum = 5242904;BA.debugLine="If status == 1 Then";
if ((_status).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=5242905;
 //BA.debugLineNum = 5242905;BA.debugLine="id=m.Get(\"id_souvenir\")";
_id = BA.ObjectToString(_m.Get((Object)("id_souvenir")));
RDebugUtils.currentLine=5242906;
 //BA.debugLineNum = 5242906;BA.debugLine="Log(id)";
anywheresoftware.b4a.keywords.Common.Log(_id);
RDebugUtils.currentLine=5242907;
 //BA.debugLineNum = 5242907;BA.debugLine="ExecuteRemoteQuery(\"SELECT*FROM souvenir whe";
_executeremotequery("SELECT*FROM souvenir where id='"+_id+"'  ","tujuan");
 }else 
{RDebugUtils.currentLine=5242909;
 //BA.debugLineNum = 5242909;BA.debugLine="Else If status == 2 Then";
if ((_status).equals(BA.NumberToString(2))) { 
RDebugUtils.currentLine=5242910;
 //BA.debugLineNum = 5242910;BA.debugLine="id=m.Get(\"id_workship_place\")";
_id = BA.ObjectToString(_m.Get((Object)("id_workship_place")));
RDebugUtils.currentLine=5242911;
 //BA.debugLineNum = 5242911;BA.debugLine="Log(id)";
anywheresoftware.b4a.keywords.Common.Log(_id);
RDebugUtils.currentLine=5242912;
 //BA.debugLineNum = 5242912;BA.debugLine="ExecuteRemoteQuery(\"SELECT*FROM workship_pla";
_executeremotequery("SELECT*FROM workship_place where id='"+_id+"' ","tujuan");
 }else 
{RDebugUtils.currentLine=5242914;
 //BA.debugLineNum = 5242914;BA.debugLine="Else If status == 3 Then";
if ((_status).equals(BA.NumberToString(3))) { 
RDebugUtils.currentLine=5242915;
 //BA.debugLineNum = 5242915;BA.debugLine="id=m.Get(\"id_restaurant\")";
_id = BA.ObjectToString(_m.Get((Object)("id_restaurant")));
RDebugUtils.currentLine=5242916;
 //BA.debugLineNum = 5242916;BA.debugLine="Log(id)";
anywheresoftware.b4a.keywords.Common.Log(_id);
RDebugUtils.currentLine=5242917;
 //BA.debugLineNum = 5242917;BA.debugLine="ExecuteRemoteQuery(\"SELECT*FROM restaurant w";
_executeremotequery("SELECT*FROM restaurant where id='"+_id+"' ","tujuan");
 }else 
{RDebugUtils.currentLine=5242919;
 //BA.debugLineNum = 5242919;BA.debugLine="Else If status == 4 Then";
if ((_status).equals(BA.NumberToString(4))) { 
RDebugUtils.currentLine=5242920;
 //BA.debugLineNum = 5242920;BA.debugLine="id=m.Get(\"id_tourism\")";
_id = BA.ObjectToString(_m.Get((Object)("id_tourism")));
RDebugUtils.currentLine=5242921;
 //BA.debugLineNum = 5242921;BA.debugLine="Log(id)";
anywheresoftware.b4a.keywords.Common.Log(_id);
RDebugUtils.currentLine=5242922;
 //BA.debugLineNum = 5242922;BA.debugLine="ExecuteRemoteQuery(\"SELECT*FROM tourism wher";
_executeremotequery("SELECT*FROM tourism where id='"+_id+"' ","tujuan");
 }else 
{RDebugUtils.currentLine=5242924;
 //BA.debugLineNum = 5242924;BA.debugLine="Else If status == 5 Then";
if ((_status).equals(BA.NumberToString(5))) { 
RDebugUtils.currentLine=5242925;
 //BA.debugLineNum = 5242925;BA.debugLine="id=m.Get(\"id_hotel\")";
_id = BA.ObjectToString(_m.Get((Object)("id_hotel")));
RDebugUtils.currentLine=5242926;
 //BA.debugLineNum = 5242926;BA.debugLine="Log(id)";
anywheresoftware.b4a.keywords.Common.Log(_id);
RDebugUtils.currentLine=5242927;
 //BA.debugLineNum = 5242927;BA.debugLine="ExecuteRemoteQuery(\"SELECT*FROM hotel where";
_executeremotequery("SELECT*FROM hotel where id='"+_id+"' ","tujuan");
 }}}}};
 }
};
 break; }
case 1: {
RDebugUtils.currentLine=5242937;
 //BA.debugLineNum = 5242937;BA.debugLine="Dim mes_array As List";
_mes_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5242938;
 //BA.debugLineNum = 5242938;BA.debugLine="mes_array = parser.NextArray";
_mes_array = _parser.NextArray();
RDebugUtils.currentLine=5242939;
 //BA.debugLineNum = 5242939;BA.debugLine="If (mes_array.Size>0) Then";
if ((_mes_array.getSize()>0)) { 
RDebugUtils.currentLine=5242940;
 //BA.debugLineNum = 5242940;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5242942;
 //BA.debugLineNum = 5242942;BA.debugLine="m= mes_array.Get(0)";
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_mes_array.Get((int) (0))));
RDebugUtils.currentLine=5242943;
 //BA.debugLineNum = 5242943;BA.debugLine="Dim name As String";
_name = "";
RDebugUtils.currentLine=5242944;
 //BA.debugLineNum = 5242944;BA.debugLine="name=m.Get(\"name\")";
_name = BA.ObjectToString(_m.Get((Object)("name")));
RDebugUtils.currentLine=5242945;
 //BA.debugLineNum = 5242945;BA.debugLine="ListView1.AddSingleLine(name)";
mostCurrent._listview1.AddSingleLine(_name);
 }else {
RDebugUtils.currentLine=5242947;
 //BA.debugLineNum = 5242947;BA.debugLine="Msgbox(\"No Data\",\"Info\")";
anywheresoftware.b4a.keywords.Common.Msgbox("No Data","Info",mostCurrent.activityBA);
 };
 break; }
case 2: {
RDebugUtils.currentLine=5242950;
 //BA.debugLineNum = 5242950;BA.debugLine="ListView1.Clear()";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=5242951;
 //BA.debugLineNum = 5242951;BA.debugLine="ListView2.Clear()";
mostCurrent._listview2.Clear();
RDebugUtils.currentLine=5242952;
 //BA.debugLineNum = 5242952;BA.debugLine="ListView3.Clear()";
mostCurrent._listview3.Clear();
RDebugUtils.currentLine=5242953;
 //BA.debugLineNum = 5242953;BA.debugLine="Dim mes_array As List";
_mes_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5242954;
 //BA.debugLineNum = 5242954;BA.debugLine="mes_array = parser.NextArray";
_mes_array = _parser.NextArray();
RDebugUtils.currentLine=5242955;
 //BA.debugLineNum = 5242955;BA.debugLine="For i=0 To mes_array.Size -1";
{
final int step62 = 1;
final int limit62 = (int) (_mes_array.getSize()-1);
for (_i = (int) (0) ; (step62 > 0 && _i <= limit62) || (step62 < 0 && _i >= limit62); _i = ((int)(0 + _i + step62)) ) {
RDebugUtils.currentLine=5242956;
 //BA.debugLineNum = 5242956;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5242958;
 //BA.debugLineNum = 5242958;BA.debugLine="m= mes_array.Get(i)";
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_mes_array.Get(_i)));
RDebugUtils.currentLine=5242959;
 //BA.debugLineNum = 5242959;BA.debugLine="ListView1.AddSingleLine(m.Get(\"n1\"))";
mostCurrent._listview1.AddSingleLine(BA.ObjectToString(_m.Get((Object)("n1"))));
RDebugUtils.currentLine=5242960;
 //BA.debugLineNum = 5242960;BA.debugLine="ListView2.AddSingleLine(m.Get(\"n3\"))";
mostCurrent._listview2.AddSingleLine(BA.ObjectToString(_m.Get((Object)("n3"))));
RDebugUtils.currentLine=5242961;
 //BA.debugLineNum = 5242961;BA.debugLine="ListView3.AddSingleLine(m.Get(\"n4\"))";
mostCurrent._listview3.AddSingleLine(BA.ObjectToString(_m.Get((Object)("n4"))));
 }
};
 break; }
}
;
 };
RDebugUtils.currentLine=5242965;
 //BA.debugLineNum = 5242965;BA.debugLine="End Sub";
return "";
}
}