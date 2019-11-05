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

public class pencarian_travel extends Activity implements B4AActivity{
	public static pencarian_travel mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.pencarian_travel");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (pencarian_travel).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.pencarian_travel");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.pencarian_travel", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (pencarian_travel) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (pencarian_travel) Resume **");
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
		return pencarian_travel.class;
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
        BA.LogInfo("** Activity (pencarian_travel) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (pencarian_travel) Resume **");
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
public static class _daftartravel_lines{
public boolean IsInitialized;
public String isitrav2;
public String id;
public String nama;
public int price;
public void Initialize() {
IsInitialized = true;
isitrav2 = "";
id = "";
nama = "";
price = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _inputnama2 = "";
public static String _nama_paket = "";
public static String _nama_travel = "";
public static String _id_package = "";
public static String _id_travel = "";
public static String _id = "";
public static String _name = "";
public static int _price = 0;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listview2 = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.info_utama _info_utama = null;
public b4a.example.galeri_ut _galeri_ut = null;
public b4a.example.lokasi _lokasi = null;
public b4a.example.info_travel _info_travel = null;
public b4a.example.info_des _info_des = null;
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
RDebugUtils.currentModule="pencarian_travel";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Activity.LoadLayout(\"pencarian_travel\")";
mostCurrent._activity.LoadLayout("pencarian_travel",mostCurrent.activityBA);
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="ListView1.SingleLineLayout.Label.TextColor=Colors";
mostCurrent._listview1.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (72),(int) (39),(int) (39)));
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="ListView1.SingleLineLayout.Label.TextSize=16";
mostCurrent._listview1.getSingleLineLayout().Label.setTextSize((float) (16));
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="ListView1.SingleLineLayout.Label.Left=2%y";
mostCurrent._listview1.getSingleLineLayout().Label.setLeft(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA));
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="ListView2.SingleLineLayout.Label.TextColor=Colors";
mostCurrent._listview2.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (72),(int) (39),(int) (39)));
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="ListView2.SingleLineLayout.Label.TextSize=16";
mostCurrent._listview2.getSingleLineLayout().Label.setTextSize((float) (16));
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="ListView2.SingleLineLayout.Label.Left=2%y";
mostCurrent._listview2.getSingleLineLayout().Label.setLeft(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA));
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="EditText1.Color=Colors.RGB(252, 206, 84)";
mostCurrent._edittext1.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (252),(int) (206),(int) (84)));
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="pencarian_travel";
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="pencarian_travel";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="EditText1.Text=\"\"";
mostCurrent._edittext1.setText((Object)(""));
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
RDebugUtils.currentModule="pencarian_travel";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button1_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button1_click", null);
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub Button1_Click";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._main.getObject()));
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return "";
}
public static String  _button2_click() throws Exception{
RDebugUtils.currentModule="pencarian_travel";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button2_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button2_click", null);
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub Button2_Click";
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="End Sub";
return "";
}
public static String  _button3_click() throws Exception{
RDebugUtils.currentModule="pencarian_travel";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button3_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button3_click", null);
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub Button3_Click";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="StartActivity(pencarian_nama)";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._pencarian_nama.getObject()));
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="End Sub";
return "";
}
public static String  _button4_click() throws Exception{
RDebugUtils.currentModule="pencarian_travel";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button4_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button4_click", null);
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub Button4_Click";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="StartActivity(pencarian_des)";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._pencarian_des.getObject()));
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="End Sub";
return "";
}
public static String  _edittext1_enterpressed() throws Exception{
RDebugUtils.currentModule="pencarian_travel";
if (Debug.shouldDelegate(mostCurrent.activityBA, "edittext1_enterpressed"))
	return (String) Debug.delegate(mostCurrent.activityBA, "edittext1_enterpressed", null);
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub EditText1_EnterPressed";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="inputnama2 = EditText1.Text";
_inputnama2 = mostCurrent._edittext1.getText();
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Log(inputnama2)";
anywheresoftware.b4a.keywords.Common.Log(_inputnama2);
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="travelnama";
_travelnama();
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="End Sub";
return "";
}
public static String  _travelnama() throws Exception{
RDebugUtils.currentModule="pencarian_travel";
if (Debug.shouldDelegate(mostCurrent.activityBA, "travelnama"))
	return (String) Debug.delegate(mostCurrent.activityBA, "travelnama", null);
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub	travelnama";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="ProgressDialogShow(\"Loading...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"Loading...");
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="ExecuteRemoteQuery(\"SELECT id,name from travel wh";
_executeremotequery("SELECT id,name from travel where lower(name) like lower('%"+_inputnama2+"%')","travel_nama");
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery(String _query,String _jobname) throws Exception{
RDebugUtils.currentModule="pencarian_travel";
if (Debug.shouldDelegate(mostCurrent.activityBA, "executeremotequery"))
	return (String) Debug.delegate(mostCurrent.activityBA, "executeremotequery", new Object[] {_query,_jobname});
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,pencarian_travel.getObject());
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Job.PostString(\"\"&Main.Server&\"json.php\",Query)";
_job._poststring(""+mostCurrent._main._server+"json.php",_query);
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="pencarian_travel";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _travel_nama_array = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
b4a.example.pencarian_travel._daftartravel_lines _b = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="res = Job.GetString";
_res = _job._getstring();
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="Log(\"Response jobdone carinama :\"& res)";
anywheresoftware.b4a.keywords.Common.Log("Response jobdone carinama :"+_res);
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,"travel_nama","paket_nama")) {
case 0: {
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="Dim travel_nama_array As List";
_travel_nama_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2686987;
 //BA.debugLineNum = 2686987;BA.debugLine="travel_nama_array = parser.NextArray";
_travel_nama_array = _parser.NextArray();
RDebugUtils.currentLine=2686988;
 //BA.debugLineNum = 2686988;BA.debugLine="ListView1.Clear";
mostCurrent._listview1.Clear();
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="For i=0 To travel_nama_array.Size -1";
{
final int step13 = 1;
final int limit13 = (int) (_travel_nama_array.getSize()-1);
for (_i = (int) (0) ; (step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13); _i = ((int)(0 + _i + step13)) ) {
RDebugUtils.currentLine=2686990;
 //BA.debugLineNum = 2686990;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2686991;
 //BA.debugLineNum = 2686991;BA.debugLine="m = travel_nama_array.Get(i)";
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_travel_nama_array.Get(_i)));
RDebugUtils.currentLine=2686992;
 //BA.debugLineNum = 2686992;BA.debugLine="Dim b As daftartravel_lines";
_b = new b4a.example.pencarian_travel._daftartravel_lines();
RDebugUtils.currentLine=2686993;
 //BA.debugLineNum = 2686993;BA.debugLine="b.Initialize";
_b.Initialize();
RDebugUtils.currentLine=2686994;
 //BA.debugLineNum = 2686994;BA.debugLine="b.id = m.Get(\"id\")";
_b.id = BA.ObjectToString(_m.Get((Object)("id")));
RDebugUtils.currentLine=2686995;
 //BA.debugLineNum = 2686995;BA.debugLine="b.nama= m.Get(\"name\")";
_b.nama = BA.ObjectToString(_m.Get((Object)("name")));
RDebugUtils.currentLine=2686996;
 //BA.debugLineNum = 2686996;BA.debugLine="ListView1.AddSingleLine2(b.nama,b.id)";
mostCurrent._listview1.AddSingleLine2(_b.nama,(Object)(_b.id));
 }
};
 break; }
case 1: {
RDebugUtils.currentLine=2686999;
 //BA.debugLineNum = 2686999;BA.debugLine="Dim travel_nama_array As List";
_travel_nama_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2687000;
 //BA.debugLineNum = 2687000;BA.debugLine="travel_nama_array = parser.NextArray";
_travel_nama_array = _parser.NextArray();
RDebugUtils.currentLine=2687001;
 //BA.debugLineNum = 2687001;BA.debugLine="ListView2.Clear";
mostCurrent._listview2.Clear();
RDebugUtils.currentLine=2687002;
 //BA.debugLineNum = 2687002;BA.debugLine="For i=0 To travel_nama_array.Size -1";
{
final int step26 = 1;
final int limit26 = (int) (_travel_nama_array.getSize()-1);
for (_i = (int) (0) ; (step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26); _i = ((int)(0 + _i + step26)) ) {
RDebugUtils.currentLine=2687003;
 //BA.debugLineNum = 2687003;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2687004;
 //BA.debugLineNum = 2687004;BA.debugLine="m = travel_nama_array.Get(i)";
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_travel_nama_array.Get(_i)));
RDebugUtils.currentLine=2687005;
 //BA.debugLineNum = 2687005;BA.debugLine="Dim b As daftartravel_lines";
_b = new b4a.example.pencarian_travel._daftartravel_lines();
RDebugUtils.currentLine=2687006;
 //BA.debugLineNum = 2687006;BA.debugLine="b.Initialize";
_b.Initialize();
RDebugUtils.currentLine=2687007;
 //BA.debugLineNum = 2687007;BA.debugLine="b.id = m.Get(\"id\")";
_b.id = BA.ObjectToString(_m.Get((Object)("id")));
RDebugUtils.currentLine=2687008;
 //BA.debugLineNum = 2687008;BA.debugLine="b.nama = m.Get(\"name\")";
_b.nama = BA.ObjectToString(_m.Get((Object)("name")));
RDebugUtils.currentLine=2687009;
 //BA.debugLineNum = 2687009;BA.debugLine="b.price = m.Get(\"price\")";
_b.price = (int)(BA.ObjectToNumber(_m.Get((Object)("price"))));
RDebugUtils.currentLine=2687010;
 //BA.debugLineNum = 2687010;BA.debugLine="ListView2.AddSingleLine2(b.nama,b)";
mostCurrent._listview2.AddSingleLine2(_b.nama,(Object)(_b));
 }
};
 break; }
}
;
 };
RDebugUtils.currentLine=2687014;
 //BA.debugLineNum = 2687014;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="pencarian_travel";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview1_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "listview1_itemclick", new Object[] {_position,_value});
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="id_travel=Value";
_id_travel = BA.ObjectToString(_value);
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="paketnama";
_paketnama();
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="End Sub";
return "";
}
public static String  _paketnama() throws Exception{
RDebugUtils.currentModule="pencarian_travel";
if (Debug.shouldDelegate(mostCurrent.activityBA, "paketnama"))
	return (String) Debug.delegate(mostCurrent.activityBA, "paketnama", null);
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub	paketnama";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="ProgressDialogShow(\"Loading...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"Loading...");
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="ExecuteRemoteQuery(\"SELECT id,name,price from pa";
_executeremotequery("SELECT id,name,price from package where id_travel ='"+_id_travel+"'","paket_nama");
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="Log(\"SELECT id,name,price from package where id_t";
anywheresoftware.b4a.keywords.Common.Log("SELECT id,name,price from package where id_travel ='"+_id_travel+"'");
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="End Sub";
return "";
}
public static String  _listview2_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="pencarian_travel";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listview2_itemclick"))
	return (String) Debug.delegate(mostCurrent.activityBA, "listview2_itemclick", new Object[] {_position,_value});
b4a.example.pencarian_travel._daftartravel_lines _b = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub ListView2_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Dim b As daftartravel_lines";
_b = new b4a.example.pencarian_travel._daftartravel_lines();
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="b=Value";
_b = (b4a.example.pencarian_travel._daftartravel_lines)(_value);
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="id =b.id";
_id = _b.id;
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="name = b.nama";
_name = _b.nama;
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="price = b.price";
_price = _b.price;
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="StartActivity(info_travel)";
anywheresoftware.b4a.keywords.Common.StartActivity(mostCurrent.activityBA,(Object)(mostCurrent._info_travel.getObject()));
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="End Sub";
return "";
}
}