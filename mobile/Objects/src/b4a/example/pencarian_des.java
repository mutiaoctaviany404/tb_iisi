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

public class pencarian_des extends Activity implements B4AActivity{
	public static pencarian_des mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.pencarian_des");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (pencarian_des).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.pencarian_des");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.pencarian_des", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (pencarian_des) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (pencarian_des) Resume **");
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
		return pencarian_des.class;
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
        BA.LogInfo("** Activity (pencarian_des) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (pencarian_des) Resume **");
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
public static class _kec_lines{
public boolean IsInitialized;
public String isi1;
public String isi2;
public String isi3;
public String isi4;
public String isi5;
public void Initialize() {
IsInitialized = true;
isi1 = "";
isi2 = "";
isi3 = "";
isi4 = "";
isi5 = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _kec = "";
public static anywheresoftware.b4a.objects.collections.Map _kategori_daftar = null;
public static anywheresoftware.b4a.objects.collections.Map _id_tempat_list = null;
public static String _id_kec = "";
public static String _nama_kec = "";
public static String _id_objek = "";
public static String _nama_objek = "";
public static String _id_tempat = "";
public static String _nama_tempat = "";
public static String _id = "";
public static String _name = "";
public static int _price = 0;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinner1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinner2 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinner3 = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.info_utama _info_utama = null;
public b4a.example.galeri_ut _galeri_ut = null;
public b4a.example.pencarian_travel _pencarian_travel = null;
public b4a.example.lokasi _lokasi = null;
public b4a.example.info_travel _info_travel = null;
public b4a.example.info_des _info_des = null;
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
RDebugUtils.currentModule="pencarian_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="Activity.LoadLayout(\"pencarian_des\")";
mostCurrent._activity.LoadLayout("pencarian_des",mostCurrent.activityBA);
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="kategori_daftar.Initialize";
_kategori_daftar.Initialize();
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="id_tempat_list.Initialize";
_id_tempat_list.Initialize();
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="daftarkec";
_daftarkec();
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="Spinner1.Color=Colors.RGB(255, 250, 240)";
mostCurrent._spinner1.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (250),(int) (240)));
RDebugUtils.currentLine=5898247;
 //BA.debugLineNum = 5898247;BA.debugLine="Spinner1.DropdownBackgroundColor=Colors.RGB(72, 3";
mostCurrent._spinner1.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (72),(int) (39),(int) (39)));
RDebugUtils.currentLine=5898248;
 //BA.debugLineNum = 5898248;BA.debugLine="ListView1.SingleLineLayout.Label.TextColor=Colors";
mostCurrent._listview1.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (72),(int) (39),(int) (39)));
RDebugUtils.currentLine=5898249;
 //BA.debugLineNum = 5898249;BA.debugLine="ListView1.SingleLineLayout.Label.TextSize=16";
mostCurrent._listview1.getSingleLineLayout().Label.setTextSize((float) (16));
RDebugUtils.currentLine=5898250;
 //BA.debugLineNum = 5898250;BA.debugLine="ListView1.SingleLineLayout.Label.Left=2%y";
mostCurrent._listview1.getSingleLineLayout().Label.setLeft(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA));
RDebugUtils.currentLine=5898252;
 //BA.debugLineNum = 5898252;BA.debugLine="Spinner1.Color=Colors.RGB(252, 206, 84)";
mostCurrent._spinner1.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (252),(int) (206),(int) (84)));
RDebugUtils.currentLine=5898253;
 //BA.debugLineNum = 5898253;BA.debugLine="Spinner2.Color=Colors.RGB(252, 206, 84)";
mostCurrent._spinner2.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (252),(int) (206),(int) (84)));
RDebugUtils.currentLine=5898254;
 //BA.debugLineNum = 5898254;BA.debugLine="Spinner3.Color=Colors.RGB(252, 206, 84)";
mostCurrent._spinner3.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (252),(int) (206),(int) (84)));
RDebugUtils.currentLine=5898255;
 //BA.debugLineNum = 5898255;BA.debugLine="Spinner1.DropdownBackgroundColor=Colors.RGB(252,";
mostCurrent._spinner1.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (252),(int) (206),(int) (84)));
RDebugUtils.currentLine=5898256;
 //BA.debugLineNum = 5898256;BA.debugLine="Spinner2.DropdownBackgroundColor=Colors.RGB(252,";
mostCurrent._spinner2.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (252),(int) (206),(int) (84)));
RDebugUtils.currentLine=5898257;
 //BA.debugLineNum = 5898257;BA.debugLine="Spinner3.DropdownBackgroundColor=Colors.RGB(252,";
mostCurrent._spinner3.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (252),(int) (206),(int) (84)));
RDebugUtils.currentLine=5898258;
 //BA.debugLineNum = 5898258;BA.debugLine="End Sub";
return "";
}
public static String  _daftarkec() throws Exception{
RDebugUtils.currentModule="pencarian_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "daftarkec"))
	return (String) Debug.delegate(mostCurrent.activityBA, "daftarkec", null);
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub daftarkec";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Spinner1.Add(\"--Choose district--\")";
mostCurrent._spinner1.Add("--Choose district--");
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"Loading ....");
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="ExecuteRemoteQuery(\"select * from district\",\"KEC\"";
_executeremotequery("select * from district","KEC");
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="pencarian_des";
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="pencarian_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="End Sub";
return "";
}
public static String  _button2_click() throws Exception{
RDebugUtils.currentModule="pencarian_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button2_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button2_click", null);
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub Button2_Click";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="StartActivity(pencarian_travel)";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._pencarian_travel.getObject()));
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="End Sub";
return "";
}
public static String  _button3_click() throws Exception{
RDebugUtils.currentModule="pencarian_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button3_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button3_click", null);
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub Button3_Click";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="StartActivity(pencarian_nama)";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._pencarian_nama.getObject()));
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="End Sub";
return "";
}
public static String  _button4_click() throws Exception{
RDebugUtils.currentModule="pencarian_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button4_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button4_click", null);
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub Button4_Click";
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery(String _query,String _jobname) throws Exception{
RDebugUtils.currentModule="pencarian_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "executeremotequery"))
	return (String) Debug.delegate(mostCurrent.activityBA, "executeremotequery", new Object[] {_query,_jobname});
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,pencarian_des.getObject());
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Job.PostString(\"\"&Main.server&\"json.php\", Query)";
_job._poststring(""+mostCurrent._main._server+"json.php",_query);
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="pencarian_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _jenis_array = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _a = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
b4a.example.pencarian_nama._daftarpaket_lines _b = null;
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="res = Job.GetString";
_res = _job._getstring();
RDebugUtils.currentLine=6225926;
 //BA.debugLineNum = 6225926;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=6225927;
 //BA.debugLineNum = 6225927;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=6225928;
 //BA.debugLineNum = 6225928;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,_kec,"objek","paket")) {
case 0: {
RDebugUtils.currentLine=6225930;
 //BA.debugLineNum = 6225930;BA.debugLine="Dim jenis_array As List";
_jenis_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6225931;
 //BA.debugLineNum = 6225931;BA.debugLine="jenis_array = parser.NextArray";
_jenis_array = _parser.NextArray();
RDebugUtils.currentLine=6225932;
 //BA.debugLineNum = 6225932;BA.debugLine="If(jenis_array.Size>0) Then";
if ((_jenis_array.getSize()>0)) { 
RDebugUtils.currentLine=6225933;
 //BA.debugLineNum = 6225933;BA.debugLine="For i=0 To jenis_array.Size -1";
{
final int step12 = 1;
final int limit12 = (int) (_jenis_array.getSize()-1);
for (_i = (int) (0) ; (step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12); _i = ((int)(0 + _i + step12)) ) {
RDebugUtils.currentLine=6225934;
 //BA.debugLineNum = 6225934;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6225935;
 //BA.debugLineNum = 6225935;BA.debugLine="a = jenis_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_jenis_array.Get(_i)));
RDebugUtils.currentLine=6225936;
 //BA.debugLineNum = 6225936;BA.debugLine="id_kec=a.Get(\"id\")";
_id_kec = BA.ObjectToString(_a.Get((Object)("id")));
RDebugUtils.currentLine=6225937;
 //BA.debugLineNum = 6225937;BA.debugLine="nama_kec=a.Get(\"name\")";
_nama_kec = BA.ObjectToString(_a.Get((Object)("name")));
RDebugUtils.currentLine=6225938;
 //BA.debugLineNum = 6225938;BA.debugLine="Spinner1.Add(nama_kec) 'meninputkan nama pro";
mostCurrent._spinner1.Add(_nama_kec);
RDebugUtils.currentLine=6225939;
 //BA.debugLineNum = 6225939;BA.debugLine="kategori_daftar.Put(nama_kec, id_kec)";
_kategori_daftar.Put((Object)(_nama_kec),(Object)(_id_kec));
 }
};
 };
 break; }
case 1: {
RDebugUtils.currentLine=6225945;
 //BA.debugLineNum = 6225945;BA.debugLine="Spinner3.Clear";
mostCurrent._spinner3.Clear();
RDebugUtils.currentLine=6225946;
 //BA.debugLineNum = 6225946;BA.debugLine="Dim jenis_array As List";
_jenis_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6225947;
 //BA.debugLineNum = 6225947;BA.debugLine="jenis_array = parser.NextArray";
_jenis_array = _parser.NextArray();
RDebugUtils.currentLine=6225948;
 //BA.debugLineNum = 6225948;BA.debugLine="If(jenis_array.Size>0) Then";
if ((_jenis_array.getSize()>0)) { 
RDebugUtils.currentLine=6225949;
 //BA.debugLineNum = 6225949;BA.debugLine="For i=0 To jenis_array.Size -1";
{
final int step26 = 1;
final int limit26 = (int) (_jenis_array.getSize()-1);
for (_i = (int) (0) ; (step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26); _i = ((int)(0 + _i + step26)) ) {
RDebugUtils.currentLine=6225950;
 //BA.debugLineNum = 6225950;BA.debugLine="Dim a As Map";
_a = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6225951;
 //BA.debugLineNum = 6225951;BA.debugLine="a = jenis_array.Get(i)";
_a.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_jenis_array.Get(_i)));
RDebugUtils.currentLine=6225952;
 //BA.debugLineNum = 6225952;BA.debugLine="id_tempat=a.Get(\"id\")";
_id_tempat = BA.ObjectToString(_a.Get((Object)("id")));
RDebugUtils.currentLine=6225953;
 //BA.debugLineNum = 6225953;BA.debugLine="nama_tempat=a.Get(\"name\")";
_nama_tempat = BA.ObjectToString(_a.Get((Object)("name")));
RDebugUtils.currentLine=6225954;
 //BA.debugLineNum = 6225954;BA.debugLine="Spinner3.Add(nama_tempat) 'meninputkan nama";
mostCurrent._spinner3.Add(_nama_tempat);
RDebugUtils.currentLine=6225955;
 //BA.debugLineNum = 6225955;BA.debugLine="id_tempat_list.Put(nama_tempat, id_tempat)";
_id_tempat_list.Put((Object)(_nama_tempat),(Object)(_id_tempat));
 }
};
 };
 break; }
case 2: {
RDebugUtils.currentLine=6225960;
 //BA.debugLineNum = 6225960;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=6225961;
 //BA.debugLineNum = 6225961;BA.debugLine="Dim jenis_array As List";
_jenis_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6225962;
 //BA.debugLineNum = 6225962;BA.debugLine="jenis_array = parser.NextArray";
_jenis_array = _parser.NextArray();
RDebugUtils.currentLine=6225963;
 //BA.debugLineNum = 6225963;BA.debugLine="If(jenis_array.Size>0) Then";
if ((_jenis_array.getSize()>0)) { 
RDebugUtils.currentLine=6225965;
 //BA.debugLineNum = 6225965;BA.debugLine="For i=0 To jenis_array.Size -1";
{
final int step40 = 1;
final int limit40 = (int) (_jenis_array.getSize()-1);
for (_i = (int) (0) ; (step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40); _i = ((int)(0 + _i + step40)) ) {
RDebugUtils.currentLine=6225966;
 //BA.debugLineNum = 6225966;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6225967;
 //BA.debugLineNum = 6225967;BA.debugLine="m = jenis_array.Get(i)";
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_jenis_array.Get(_i)));
RDebugUtils.currentLine=6225968;
 //BA.debugLineNum = 6225968;BA.debugLine="Dim b As daftarpaket_lines";
_b = new b4a.example.pencarian_nama._daftarpaket_lines();
RDebugUtils.currentLine=6225969;
 //BA.debugLineNum = 6225969;BA.debugLine="b.Initialize";
_b.Initialize();
RDebugUtils.currentLine=6225970;
 //BA.debugLineNum = 6225970;BA.debugLine="b.id = m.Get(\"id\")";
_b.id = BA.ObjectToString(_m.Get((Object)("id")));
RDebugUtils.currentLine=6225971;
 //BA.debugLineNum = 6225971;BA.debugLine="b.name = m.Get(\"name\")";
_b.name = BA.ObjectToString(_m.Get((Object)("name")));
RDebugUtils.currentLine=6225972;
 //BA.debugLineNum = 6225972;BA.debugLine="b.price= m.Get(\"price\")";
_b.price = BA.ObjectToString(_m.Get((Object)("price")));
RDebugUtils.currentLine=6225973;
 //BA.debugLineNum = 6225973;BA.debugLine="ListView1.AddSingleLine2(b.name,b)";
mostCurrent._listview1.AddSingleLine2(_b.name,(Object)(_b));
 }
};
 };
 break; }
}
;
 };
RDebugUtils.currentLine=6225979;
 //BA.debugLineNum = 6225979;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=6225980;
 //BA.debugLineNum = 6225980;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="pencarian_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "listview1_itemclick", new Object[] {_position,_value});
b4a.example.pencarian_nama._daftarpaket_lines _b = null;
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Dim b As daftarpaket_lines";
_b = new b4a.example.pencarian_nama._daftarpaket_lines();
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="b=Value";
_b = (b4a.example.pencarian_nama._daftarpaket_lines)(_value);
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="id =b.id";
_id = _b.id;
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="name = b.name";
_name = _b.name;
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="price = b.price";
_price = (int)(Double.parseDouble(_b.price));
RDebugUtils.currentLine=6291462;
 //BA.debugLineNum = 6291462;BA.debugLine="StartActivity(info_des)";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._info_des.getObject()));
RDebugUtils.currentLine=6291465;
 //BA.debugLineNum = 6291465;BA.debugLine="End Sub";
return "";
}
public static String  _spinner1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="pencarian_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinner1_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "spinner1_itemclick", new Object[] {_position,_value});
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub Spinner1_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="id_kec= kategori_daftar.Get(Value) 'mendapatkan i";
_id_kec = BA.ObjectToString(_kategori_daftar.Get(_value));
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="Log(id_kec)";
anywheresoftware.b4a.keywords.Common.Log(_id_kec);
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="Spinner2.Clear";
mostCurrent._spinner2.Clear();
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="Spinner2.Add(\"Souvenir\")";
mostCurrent._spinner2.Add("Souvenir");
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="Spinner2.Add(\"Tourism\")";
mostCurrent._spinner2.Add("Tourism");
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="Spinner2.Add(\"Restaurant\")";
mostCurrent._spinner2.Add("Restaurant");
RDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="Spinner2.Add(\"Mosque\")";
mostCurrent._spinner2.Add("Mosque");
RDebugUtils.currentLine=6357002;
 //BA.debugLineNum = 6357002;BA.debugLine="Spinner2.Add(\"Hotel\")";
mostCurrent._spinner2.Add("Hotel");
RDebugUtils.currentLine=6357003;
 //BA.debugLineNum = 6357003;BA.debugLine="kategori_daftar.Put(\"Souvenir\",1)";
_kategori_daftar.Put((Object)("Souvenir"),(Object)(1));
RDebugUtils.currentLine=6357004;
 //BA.debugLineNum = 6357004;BA.debugLine="kategori_daftar.Put(\"Tourism\",2)";
_kategori_daftar.Put((Object)("Tourism"),(Object)(2));
RDebugUtils.currentLine=6357005;
 //BA.debugLineNum = 6357005;BA.debugLine="kategori_daftar.Put(\"Restaurant\",3)";
_kategori_daftar.Put((Object)("Restaurant"),(Object)(3));
RDebugUtils.currentLine=6357006;
 //BA.debugLineNum = 6357006;BA.debugLine="kategori_daftar.Put(\"Mosque\",4)";
_kategori_daftar.Put((Object)("Mosque"),(Object)(4));
RDebugUtils.currentLine=6357007;
 //BA.debugLineNum = 6357007;BA.debugLine="kategori_daftar.Put(\"Hotel\",5)";
_kategori_daftar.Put((Object)("Hotel"),(Object)(5));
RDebugUtils.currentLine=6357009;
 //BA.debugLineNum = 6357009;BA.debugLine="End Sub";
return "";
}
public static String  _spinner2_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="pencarian_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinner2_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "spinner2_itemclick", new Object[] {_position,_value});
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub Spinner2_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="id_objek= kategori_daftar.Get(Value)";
_id_objek = BA.ObjectToString(_kategori_daftar.Get(_value));
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="Log(id_objek)";
anywheresoftware.b4a.keywords.Common.Log(_id_objek);
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="If id_objek ==1 Then";
if ((_id_objek).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"Loading ....");
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="ExecuteRemoteQuery(\"Select souvenir.id, souvenir.";
_executeremotequery("Select souvenir.id, souvenir.name, district.id as id_kec from souvenir, district where st_contains(district.geom1, souvenir.geom) and district.id='"+_id_kec+"'","objek");
 }else 
{RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="Else if id_objek ==2 Then";
if ((_id_objek).equals(BA.NumberToString(2))) { 
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"Loading ....");
RDebugUtils.currentLine=6422537;
 //BA.debugLineNum = 6422537;BA.debugLine="ExecuteRemoteQuery(\"Select tourism.id, tourism.na";
_executeremotequery("Select tourism.id, tourism.name, district.id as id_kec from tourism, district where st_contains(district.geom1, tourism.geom) and district.id='"+_id_kec+"'","objek");
 }else 
{RDebugUtils.currentLine=6422539;
 //BA.debugLineNum = 6422539;BA.debugLine="Else if id_objek ==3 Then";
if ((_id_objek).equals(BA.NumberToString(3))) { 
RDebugUtils.currentLine=6422540;
 //BA.debugLineNum = 6422540;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"Loading ....");
RDebugUtils.currentLine=6422541;
 //BA.debugLineNum = 6422541;BA.debugLine="ExecuteRemoteQuery(\"Select restaurant.id, restaur";
_executeremotequery("Select restaurant.id, restaurant.name, district.id as id_kec from restaurant, district where st_contains(district.geom1, restaurant.geom) and district.id='"+_id_kec+"'","objek");
 }else 
{RDebugUtils.currentLine=6422543;
 //BA.debugLineNum = 6422543;BA.debugLine="Else If id_objek ==4 Then";
if ((_id_objek).equals(BA.NumberToString(4))) { 
RDebugUtils.currentLine=6422544;
 //BA.debugLineNum = 6422544;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"Loading ....");
RDebugUtils.currentLine=6422545;
 //BA.debugLineNum = 6422545;BA.debugLine="ExecuteRemoteQuery(\"Select workship_place.id, wor";
_executeremotequery("Select workship_place.id, workship_place.name, district.id as id_kec from workship_place, district where st_contains(district.geom1, workship_place.geom) and district.id='"+_id_kec+"'","objek");
 }else 
{RDebugUtils.currentLine=6422547;
 //BA.debugLineNum = 6422547;BA.debugLine="Else If id_objek ==5 Then";
if ((_id_objek).equals(BA.NumberToString(5))) { 
RDebugUtils.currentLine=6422548;
 //BA.debugLineNum = 6422548;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"Loading ....");
RDebugUtils.currentLine=6422549;
 //BA.debugLineNum = 6422549;BA.debugLine="ExecuteRemoteQuery(\"Select hotel.id, hotel.name,";
_executeremotequery("Select hotel.id, hotel.name, district.id as id_kec from hotel, district where st_contains(district.geom1, hotel.geom) and district.id='"+_id_kec+"'","objek");
 }}}}};
RDebugUtils.currentLine=6422552;
 //BA.debugLineNum = 6422552;BA.debugLine="End Sub";
return "";
}
public static String  _spinner3_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="pencarian_des";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinner3_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "spinner3_itemclick", new Object[] {_position,_value});
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub Spinner3_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="id_tempat= id_tempat_list.Get(Value)";
_id_tempat = BA.ObjectToString(_id_tempat_list.Get(_value));
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="Log(id_tempat)";
anywheresoftware.b4a.keywords.Common.Log(_id_tempat);
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="Log(\"select package.id,package.name from package";
anywheresoftware.b4a.keywords.Common.Log("select package.id,package.name from package left join  object_point on object_point.id_package = package.id where object_point.id_souvenir='"+_id_tempat+"'");
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="If id_objek ==1 Then";
if ((_id_objek).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"Loading ....");
RDebugUtils.currentLine=6488071;
 //BA.debugLineNum = 6488071;BA.debugLine="ExecuteRemoteQuery(\"select package.id,package.nam";
_executeremotequery("select package.id,package.name, package.price from package left join  object_point on object_point.id_package = package.id where object_point.id_souvenir='"+_id_tempat+"'","paket");
 }else 
{RDebugUtils.currentLine=6488073;
 //BA.debugLineNum = 6488073;BA.debugLine="Else if id_objek ==2 Then";
if ((_id_objek).equals(BA.NumberToString(2))) { 
RDebugUtils.currentLine=6488074;
 //BA.debugLineNum = 6488074;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"Loading ....");
RDebugUtils.currentLine=6488075;
 //BA.debugLineNum = 6488075;BA.debugLine="ExecuteRemoteQuery(\"select package.id,package.nam";
_executeremotequery("select package.id,package.name, package.price from package left join  object_point on object_point.id_package = package.id where object_point.id_tourism='"+_id_tempat+"'","paket");
 }else 
{RDebugUtils.currentLine=6488077;
 //BA.debugLineNum = 6488077;BA.debugLine="Else if id_objek ==3 Then";
if ((_id_objek).equals(BA.NumberToString(3))) { 
RDebugUtils.currentLine=6488078;
 //BA.debugLineNum = 6488078;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"Loading ....");
RDebugUtils.currentLine=6488079;
 //BA.debugLineNum = 6488079;BA.debugLine="ExecuteRemoteQuery(\"select package.id,package.nam";
_executeremotequery("select package.id,package.name, package.price from package left join  object_point on object_point.id_package = package.id where object_point.id_restaurant='"+_id_tempat+"'","paket");
 }else 
{RDebugUtils.currentLine=6488081;
 //BA.debugLineNum = 6488081;BA.debugLine="Else If id_objek ==4 Then";
if ((_id_objek).equals(BA.NumberToString(4))) { 
RDebugUtils.currentLine=6488082;
 //BA.debugLineNum = 6488082;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"Loading ....");
RDebugUtils.currentLine=6488083;
 //BA.debugLineNum = 6488083;BA.debugLine="ExecuteRemoteQuery(\"select package.id,package.nam";
_executeremotequery("select package.id,package.name, package.price from package left join  object_point on object_point.id_package = package.id where object_point.id_worship_place='"+_id_tempat+"'","paket");
 }else 
{RDebugUtils.currentLine=6488085;
 //BA.debugLineNum = 6488085;BA.debugLine="Else If id_objek ==5 Then";
if ((_id_objek).equals(BA.NumberToString(5))) { 
RDebugUtils.currentLine=6488086;
 //BA.debugLineNum = 6488086;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"Loading ....");
RDebugUtils.currentLine=6488087;
 //BA.debugLineNum = 6488087;BA.debugLine="ExecuteRemoteQuery(\"select package.id,package.nam";
_executeremotequery("select package.id,package.name, package.price from package left join  object_point on object_point.id_package = package.id where object_point.id_hotel='"+_id_tempat+"'","paket");
 }}}}};
RDebugUtils.currentLine=6488090;
 //BA.debugLineNum = 6488090;BA.debugLine="End Sub";
return "";
}
}