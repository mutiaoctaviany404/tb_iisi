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

public class galeri_ut extends Activity implements B4AActivity{
	public static galeri_ut mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.galeri_ut");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (galeri_ut).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.galeri_ut");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.galeri_ut", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (galeri_ut) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (galeri_ut) Resume **");
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
		return galeri_ut.class;
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
        BA.LogInfo("** Activity (galeri_ut) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            BA.LogInfo("** Activity (galeri_ut) Resume **");
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
public static String _viewfoto1 = "";
public static anywheresoftware.b4a.objects.collections.List _viewfotos = null;
public static String _id_gallery = "";
public anywheresoftware.b4a.objects.PanelWrapper _panel4 = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.collections.List _lstchecks = null;
public static int _height = 0;
public anywheresoftware.b4a.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.info_utama _info_utama = null;
public b4a.example.pencarian_travel _pencarian_travel = null;
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
RDebugUtils.currentModule="galeri_ut";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Activity.LoadLayout(\"gallery\")";
mostCurrent._activity.LoadLayout("gallery",mostCurrent.activityBA);
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="fotoquery";
_fotoquery();
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="End Sub";
return "";
}
public static String  _fotoquery() throws Exception{
RDebugUtils.currentModule="galeri_ut";
if (Debug.shouldDelegate(mostCurrent.activityBA, "fotoquery"))
	return (String) Debug.delegate(mostCurrent.activityBA, "fotoquery", null);
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub fotoquery";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="ProgressDialogShow(\"Loading\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,"Loading");
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="ExecuteRemoteQuery(\"SELECT * from object_point wh";
_executeremotequery("SELECT * from object_point where id_package='"+mostCurrent._pencarian_des._id+"'","ViewFoto1");
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="ExecuteRemoteQuery(\"SELECT * from object_point wh";
_executeremotequery("SELECT * from object_point where id_package='"+mostCurrent._pencarian_nama._id+"'","ViewFoto1");
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="ExecuteRemoteQuery(\"SELECT * from object_point wh";
_executeremotequery("SELECT * from object_point where id_package='"+mostCurrent._pencarian_travel._id+"'","ViewFoto1");
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="galeri_ut";
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="galeri_ut";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery(String _query,String _jobname) throws Exception{
RDebugUtils.currentModule="galeri_ut";
if (Debug.shouldDelegate(mostCurrent.activityBA, "executeremotequery"))
	return (String) Debug.delegate(mostCurrent.activityBA, "executeremotequery", new Object[] {_query,_jobname});
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,galeri_ut.getObject());
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Job.PostString(\"\"&Main.server&\"json.php\", Query)";
_job._poststring(""+mostCurrent._main._server+"json.php",_query);
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="End Sub";
return "";
}
public static String  _executeremotequery2(String _query,String _jobname) throws Exception{
RDebugUtils.currentModule="galeri_ut";
if (Debug.shouldDelegate(mostCurrent.activityBA, "executeremotequery2"))
	return (String) Debug.delegate(mostCurrent.activityBA, "executeremotequery2", new Object[] {_query,_jobname});
anywheresoftware.b4a.samples.httputils2.httpjob _job = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub ExecuteRemoteQuery2(Query As String, JobName A";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim Job As HttpJob";
_job = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Job.Initialize(JobName, Me)";
_job._initialize(processBA,_jobname,galeri_ut.getObject());
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Job.PostString(\"\"&Main.server&\"json.php\", Query)";
_job._poststring(""+mostCurrent._main._server+"json.php",_query);
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="galeri_ut";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone"))
	return (String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job});
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _mes_array = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _id = "";
String _status = "";
anywheresoftware.b4a.objects.collections.List _agn = null;
String _serverimage = "";
anywheresoftware.b4a.objects.collections.Map _w = null;
String _image = "";
String _gambar = "";
anywheresoftware.b4a.objects.collections.Map _link = null;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub Jobdone (Job As HttpJob)";
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="res= Job.GetString";
_res = _job._getstring();
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname,_viewfoto1,"tujuan_a","tujuan_b","tujuan_c","tujuan_d","tujuan_e")) {
case 0: {
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="Dim mes_array As List";
_mes_array = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="mes_array = parser.NextArray";
_mes_array = _parser.NextArray();
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="For i=0 To mes_array.Size -1";
{
final int step11 = 1;
final int limit11 = (int) (_mes_array.getSize()-1);
for (_i = (int) (0) ; (step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11); _i = ((int)(0 + _i + step11)) ) {
RDebugUtils.currentLine=1966094;
 //BA.debugLineNum = 1966094;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1966096;
 //BA.debugLineNum = 1966096;BA.debugLine="m= mes_array.Get(i)";
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_mes_array.Get(_i)));
RDebugUtils.currentLine=1966097;
 //BA.debugLineNum = 1966097;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=1966098;
 //BA.debugLineNum = 1966098;BA.debugLine="Dim status As String";
_status = "";
RDebugUtils.currentLine=1966099;
 //BA.debugLineNum = 1966099;BA.debugLine="status=m.Get(\"status\")";
_status = BA.ObjectToString(_m.Get((Object)("status")));
RDebugUtils.currentLine=1966100;
 //BA.debugLineNum = 1966100;BA.debugLine="Log(status)";
anywheresoftware.b4a.keywords.Common.Log(_status);
RDebugUtils.currentLine=1966102;
 //BA.debugLineNum = 1966102;BA.debugLine="If status == 1 Then";
if ((_status).equals(BA.NumberToString(1))) { 
RDebugUtils.currentLine=1966103;
 //BA.debugLineNum = 1966103;BA.debugLine="id=m.Get(\"id_souvenir\")";
_id = BA.ObjectToString(_m.Get((Object)("id_souvenir")));
RDebugUtils.currentLine=1966104;
 //BA.debugLineNum = 1966104;BA.debugLine="Log(id)";
anywheresoftware.b4a.keywords.Common.Log(_id);
RDebugUtils.currentLine=1966105;
 //BA.debugLineNum = 1966105;BA.debugLine="ExecuteRemoteQuery2(\"SELECT*FROM souvenir_ga";
_executeremotequery2("SELECT*FROM souvenir_gallery where id_souvenir='"+_id+"'  ","tujuan_a");
 }else 
{RDebugUtils.currentLine=1966107;
 //BA.debugLineNum = 1966107;BA.debugLine="Else If status == 2 Then";
if ((_status).equals(BA.NumberToString(2))) { 
RDebugUtils.currentLine=1966108;
 //BA.debugLineNum = 1966108;BA.debugLine="Log(id)";
anywheresoftware.b4a.keywords.Common.Log(_id);
RDebugUtils.currentLine=1966109;
 //BA.debugLineNum = 1966109;BA.debugLine="id=m.Get(\"id_workship_place\")";
_id = BA.ObjectToString(_m.Get((Object)("id_workship_place")));
RDebugUtils.currentLine=1966110;
 //BA.debugLineNum = 1966110;BA.debugLine="ExecuteRemoteQuery2(\"SELECT*FROM workship_pl";
_executeremotequery2("SELECT*FROM workship_place_gallery where id_workship_place='"+_id+"' ","tujuan_b");
 }else 
{RDebugUtils.currentLine=1966112;
 //BA.debugLineNum = 1966112;BA.debugLine="Else If status == 3 Then";
if ((_status).equals(BA.NumberToString(3))) { 
RDebugUtils.currentLine=1966113;
 //BA.debugLineNum = 1966113;BA.debugLine="id=m.Get(\"id_restaurant\")";
_id = BA.ObjectToString(_m.Get((Object)("id_restaurant")));
RDebugUtils.currentLine=1966114;
 //BA.debugLineNum = 1966114;BA.debugLine="Log(id)";
anywheresoftware.b4a.keywords.Common.Log(_id);
RDebugUtils.currentLine=1966115;
 //BA.debugLineNum = 1966115;BA.debugLine="ExecuteRemoteQuery2(\"SELECT*FROM restaurant_";
_executeremotequery2("SELECT*FROM restaurant_gallery where id_restaurant='"+_id+"' ","tujuan_c");
 }else 
{RDebugUtils.currentLine=1966117;
 //BA.debugLineNum = 1966117;BA.debugLine="Else If status == 4 Then";
if ((_status).equals(BA.NumberToString(4))) { 
RDebugUtils.currentLine=1966118;
 //BA.debugLineNum = 1966118;BA.debugLine="id=m.Get(\"id_tourism\")";
_id = BA.ObjectToString(_m.Get((Object)("id_tourism")));
RDebugUtils.currentLine=1966119;
 //BA.debugLineNum = 1966119;BA.debugLine="Log(id)";
anywheresoftware.b4a.keywords.Common.Log(_id);
RDebugUtils.currentLine=1966120;
 //BA.debugLineNum = 1966120;BA.debugLine="ExecuteRemoteQuery2(\"SELECT*FROM tourism_gal";
_executeremotequery2("SELECT*FROM tourism_gallery where id_tourism='"+_id+"' ","tujuan_d");
 }else 
{RDebugUtils.currentLine=1966122;
 //BA.debugLineNum = 1966122;BA.debugLine="Else If status == 5 Then";
if ((_status).equals(BA.NumberToString(5))) { 
RDebugUtils.currentLine=1966123;
 //BA.debugLineNum = 1966123;BA.debugLine="id=m.Get(\"id_hotel\")";
_id = BA.ObjectToString(_m.Get((Object)("id_hotel")));
RDebugUtils.currentLine=1966124;
 //BA.debugLineNum = 1966124;BA.debugLine="Log(id)";
anywheresoftware.b4a.keywords.Common.Log(_id);
RDebugUtils.currentLine=1966125;
 //BA.debugLineNum = 1966125;BA.debugLine="ExecuteRemoteQuery2(\"SELECT*FROM hotel_galle";
_executeremotequery2("SELECT*FROM hotel_gallery where id_hotel='"+_id+"' ","tujuan_e");
 }}}}};
 }
};
 break; }
case 1: {
RDebugUtils.currentLine=1966137;
 //BA.debugLineNum = 1966137;BA.debugLine="Dim agn As List";
_agn = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1966138;
 //BA.debugLineNum = 1966138;BA.debugLine="agn=parser.NextArray";
_agn = _parser.NextArray();
RDebugUtils.currentLine=1966139;
 //BA.debugLineNum = 1966139;BA.debugLine="If agn.Size - 1 < 0 Then";
if (_agn.getSize()-1<0) { 
RDebugUtils.currentLine=1966140;
 //BA.debugLineNum = 1966140;BA.debugLine="Log(agn.Size)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_agn.getSize()));
 }else {
RDebugUtils.currentLine=1966143;
 //BA.debugLineNum = 1966143;BA.debugLine="Dim serverimage = \"http://192.168.100.13/wisata";
_serverimage = "http://192.168.100.13/wisatasolsel/foto/";
RDebugUtils.currentLine=1966144;
 //BA.debugLineNum = 1966144;BA.debugLine="For i=0 To agn.Size-1";
{
final int step47 = 1;
final int limit47 = (int) (_agn.getSize()-1);
for (_i = (int) (0) ; (step47 > 0 && _i <= limit47) || (step47 < 0 && _i >= limit47); _i = ((int)(0 + _i + step47)) ) {
RDebugUtils.currentLine=1966145;
 //BA.debugLineNum = 1966145;BA.debugLine="Dim w As Map";
_w = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1966146;
 //BA.debugLineNum = 1966146;BA.debugLine="w=agn.Get(i)";
_w.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_agn.Get(_i)));
RDebugUtils.currentLine=1966147;
 //BA.debugLineNum = 1966147;BA.debugLine="Log(\"haha\")";
anywheresoftware.b4a.keywords.Common.Log("haha");
RDebugUtils.currentLine=1966148;
 //BA.debugLineNum = 1966148;BA.debugLine="Dim image = w.Get(\"gallery_souvenir\") As Stri";
_image = BA.ObjectToString(_w.Get((Object)("gallery_souvenir")));
RDebugUtils.currentLine=1966149;
 //BA.debugLineNum = 1966149;BA.debugLine="Dim gambar = \"\"&serverimage&\"\"&image As Strin";
_gambar = ""+_serverimage+""+_image;
RDebugUtils.currentLine=1966150;
 //BA.debugLineNum = 1966150;BA.debugLine="Log(gambar)";
anywheresoftware.b4a.keywords.Common.Log(_gambar);
RDebugUtils.currentLine=1966151;
 //BA.debugLineNum = 1966151;BA.debugLine="Dim link As Map";
_link = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1966152;
 //BA.debugLineNum = 1966152;BA.debugLine="link.Initialize";
_link.Initialize();
RDebugUtils.currentLine=1966154;
 //BA.debugLineNum = 1966154;BA.debugLine="link.Put(ListView1, gambar)";
_link.Put((Object)(mostCurrent._listview1.getObject()),(Object)(_gambar));
RDebugUtils.currentLine=1966156;
 //BA.debugLineNum = 1966156;BA.debugLine="CallSubDelayed2(Starter, \"Download\" , link)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(mostCurrent.activityBA,(Object)(mostCurrent._starter.getObject()),"Download",(Object)(_link));
 }
};
 };
 break; }
case 2: {
RDebugUtils.currentLine=1966162;
 //BA.debugLineNum = 1966162;BA.debugLine="Dim agn As List";
_agn = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1966163;
 //BA.debugLineNum = 1966163;BA.debugLine="agn=parser.NextArray";
_agn = _parser.NextArray();
RDebugUtils.currentLine=1966164;
 //BA.debugLineNum = 1966164;BA.debugLine="If agn.Size - 1 < 0 Then";
if (_agn.getSize()-1<0) { 
RDebugUtils.currentLine=1966165;
 //BA.debugLineNum = 1966165;BA.debugLine="Log(agn.Size)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_agn.getSize()));
 }else {
RDebugUtils.currentLine=1966168;
 //BA.debugLineNum = 1966168;BA.debugLine="Dim serverimage = \"http://192.168.100.13/wisata";
_serverimage = "http://192.168.100.13/wisatasolsel/foto/";
RDebugUtils.currentLine=1966169;
 //BA.debugLineNum = 1966169;BA.debugLine="For i=0 To agn.Size-1";
{
final int step67 = 1;
final int limit67 = (int) (_agn.getSize()-1);
for (_i = (int) (0) ; (step67 > 0 && _i <= limit67) || (step67 < 0 && _i >= limit67); _i = ((int)(0 + _i + step67)) ) {
RDebugUtils.currentLine=1966170;
 //BA.debugLineNum = 1966170;BA.debugLine="Dim w As Map";
_w = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1966171;
 //BA.debugLineNum = 1966171;BA.debugLine="w=agn.Get(i)";
_w.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_agn.Get(_i)));
RDebugUtils.currentLine=1966172;
 //BA.debugLineNum = 1966172;BA.debugLine="Log(\"haha\")";
anywheresoftware.b4a.keywords.Common.Log("haha");
RDebugUtils.currentLine=1966173;
 //BA.debugLineNum = 1966173;BA.debugLine="Dim image = w.Get(\"gallery_workship_place\") A";
_image = BA.ObjectToString(_w.Get((Object)("gallery_workship_place")));
RDebugUtils.currentLine=1966174;
 //BA.debugLineNum = 1966174;BA.debugLine="Dim gambar = \"\"&serverimage&\"\"&image As Strin";
_gambar = ""+_serverimage+""+_image;
RDebugUtils.currentLine=1966175;
 //BA.debugLineNum = 1966175;BA.debugLine="Log(gambar)";
anywheresoftware.b4a.keywords.Common.Log(_gambar);
RDebugUtils.currentLine=1966176;
 //BA.debugLineNum = 1966176;BA.debugLine="Dim link As Map";
_link = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1966177;
 //BA.debugLineNum = 1966177;BA.debugLine="link.Initialize";
_link.Initialize();
RDebugUtils.currentLine=1966179;
 //BA.debugLineNum = 1966179;BA.debugLine="link.Put(ListView1, gambar)";
_link.Put((Object)(mostCurrent._listview1.getObject()),(Object)(_gambar));
RDebugUtils.currentLine=1966181;
 //BA.debugLineNum = 1966181;BA.debugLine="CallSubDelayed2(Starter, \"Download\" , link)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(mostCurrent.activityBA,(Object)(mostCurrent._starter.getObject()),"Download",(Object)(_link));
 }
};
 };
 break; }
case 3: {
RDebugUtils.currentLine=1966187;
 //BA.debugLineNum = 1966187;BA.debugLine="Dim agn As List";
_agn = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1966188;
 //BA.debugLineNum = 1966188;BA.debugLine="agn=parser.NextArray";
_agn = _parser.NextArray();
RDebugUtils.currentLine=1966189;
 //BA.debugLineNum = 1966189;BA.debugLine="If agn.Size - 1 < 0 Then";
if (_agn.getSize()-1<0) { 
RDebugUtils.currentLine=1966190;
 //BA.debugLineNum = 1966190;BA.debugLine="Log(agn.Size)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_agn.getSize()));
 }else {
RDebugUtils.currentLine=1966193;
 //BA.debugLineNum = 1966193;BA.debugLine="Dim serverimage = \"http://192.168.100.13/wisata";
_serverimage = "http://192.168.100.13/wisatasolsel/foto/";
RDebugUtils.currentLine=1966194;
 //BA.debugLineNum = 1966194;BA.debugLine="For i=0 To agn.Size-1";
{
final int step87 = 1;
final int limit87 = (int) (_agn.getSize()-1);
for (_i = (int) (0) ; (step87 > 0 && _i <= limit87) || (step87 < 0 && _i >= limit87); _i = ((int)(0 + _i + step87)) ) {
RDebugUtils.currentLine=1966195;
 //BA.debugLineNum = 1966195;BA.debugLine="Dim w As Map";
_w = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1966196;
 //BA.debugLineNum = 1966196;BA.debugLine="w=agn.Get(i)";
_w.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_agn.Get(_i)));
RDebugUtils.currentLine=1966197;
 //BA.debugLineNum = 1966197;BA.debugLine="Log(\"haha\")";
anywheresoftware.b4a.keywords.Common.Log("haha");
RDebugUtils.currentLine=1966198;
 //BA.debugLineNum = 1966198;BA.debugLine="Dim image = w.Get(\"gallery_restaurant\") As St";
_image = BA.ObjectToString(_w.Get((Object)("gallery_restaurant")));
RDebugUtils.currentLine=1966199;
 //BA.debugLineNum = 1966199;BA.debugLine="Dim gambar = \"\"&serverimage&\"\"&image As Strin";
_gambar = ""+_serverimage+""+_image;
RDebugUtils.currentLine=1966200;
 //BA.debugLineNum = 1966200;BA.debugLine="Log(gambar)";
anywheresoftware.b4a.keywords.Common.Log(_gambar);
RDebugUtils.currentLine=1966201;
 //BA.debugLineNum = 1966201;BA.debugLine="Dim link As Map";
_link = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1966202;
 //BA.debugLineNum = 1966202;BA.debugLine="link.Initialize";
_link.Initialize();
RDebugUtils.currentLine=1966204;
 //BA.debugLineNum = 1966204;BA.debugLine="link.Put(ListView1, gambar)";
_link.Put((Object)(mostCurrent._listview1.getObject()),(Object)(_gambar));
RDebugUtils.currentLine=1966206;
 //BA.debugLineNum = 1966206;BA.debugLine="CallSubDelayed2(Starter, \"Download\", link)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(mostCurrent.activityBA,(Object)(mostCurrent._starter.getObject()),"Download",(Object)(_link));
 }
};
 };
 break; }
case 4: {
RDebugUtils.currentLine=1966212;
 //BA.debugLineNum = 1966212;BA.debugLine="Dim agn As List";
_agn = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1966213;
 //BA.debugLineNum = 1966213;BA.debugLine="agn=parser.NextArray";
_agn = _parser.NextArray();
RDebugUtils.currentLine=1966214;
 //BA.debugLineNum = 1966214;BA.debugLine="If agn.Size - 1 < 0 Then";
if (_agn.getSize()-1<0) { 
RDebugUtils.currentLine=1966215;
 //BA.debugLineNum = 1966215;BA.debugLine="Log(agn.Size)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_agn.getSize()));
 }else {
RDebugUtils.currentLine=1966218;
 //BA.debugLineNum = 1966218;BA.debugLine="Dim serverimage = \"http://192.168.100.13/wisata";
_serverimage = "http://192.168.100.13/wisatasolsel/foto/";
RDebugUtils.currentLine=1966219;
 //BA.debugLineNum = 1966219;BA.debugLine="For i=0 To agn.Size-1";
{
final int step107 = 1;
final int limit107 = (int) (_agn.getSize()-1);
for (_i = (int) (0) ; (step107 > 0 && _i <= limit107) || (step107 < 0 && _i >= limit107); _i = ((int)(0 + _i + step107)) ) {
RDebugUtils.currentLine=1966220;
 //BA.debugLineNum = 1966220;BA.debugLine="Dim w As Map";
_w = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1966221;
 //BA.debugLineNum = 1966221;BA.debugLine="w=agn.Get(i)";
_w.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_agn.Get(_i)));
RDebugUtils.currentLine=1966222;
 //BA.debugLineNum = 1966222;BA.debugLine="Log(\"haha\")";
anywheresoftware.b4a.keywords.Common.Log("haha");
RDebugUtils.currentLine=1966223;
 //BA.debugLineNum = 1966223;BA.debugLine="Dim image = w.Get(\"gallery_tourism\") As Strin";
_image = BA.ObjectToString(_w.Get((Object)("gallery_tourism")));
RDebugUtils.currentLine=1966224;
 //BA.debugLineNum = 1966224;BA.debugLine="Dim gambar = \"\"&serverimage&\"\"&image As Strin";
_gambar = ""+_serverimage+""+_image;
RDebugUtils.currentLine=1966225;
 //BA.debugLineNum = 1966225;BA.debugLine="Log(gambar)";
anywheresoftware.b4a.keywords.Common.Log(_gambar);
RDebugUtils.currentLine=1966226;
 //BA.debugLineNum = 1966226;BA.debugLine="Dim link As Map";
_link = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1966227;
 //BA.debugLineNum = 1966227;BA.debugLine="link.Initialize";
_link.Initialize();
RDebugUtils.currentLine=1966229;
 //BA.debugLineNum = 1966229;BA.debugLine="link.Put(ListView1, gambar)";
_link.Put((Object)(mostCurrent._listview1.getObject()),(Object)(_gambar));
RDebugUtils.currentLine=1966231;
 //BA.debugLineNum = 1966231;BA.debugLine="CallSubDelayed2(Starter, \"Download\" , link)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(mostCurrent.activityBA,(Object)(mostCurrent._starter.getObject()),"Download",(Object)(_link));
 }
};
 };
 break; }
case 5: {
RDebugUtils.currentLine=1966236;
 //BA.debugLineNum = 1966236;BA.debugLine="Dim agn As List";
_agn = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1966237;
 //BA.debugLineNum = 1966237;BA.debugLine="agn=parser.NextArray";
_agn = _parser.NextArray();
RDebugUtils.currentLine=1966238;
 //BA.debugLineNum = 1966238;BA.debugLine="If agn.Size - 1 < 0 Then";
if (_agn.getSize()-1<0) { 
RDebugUtils.currentLine=1966239;
 //BA.debugLineNum = 1966239;BA.debugLine="Log(agn.Size)";
anywheresoftware.b4a.keywords.Common.Log(BA.NumberToString(_agn.getSize()));
 }else {
RDebugUtils.currentLine=1966242;
 //BA.debugLineNum = 1966242;BA.debugLine="Dim serverimage = \"http://192.168.100.13/wisata";
_serverimage = "http://192.168.100.13/wisatasolsel/foto/";
RDebugUtils.currentLine=1966243;
 //BA.debugLineNum = 1966243;BA.debugLine="For i=0 To agn.Size-1";
{
final int step127 = 1;
final int limit127 = (int) (_agn.getSize()-1);
for (_i = (int) (0) ; (step127 > 0 && _i <= limit127) || (step127 < 0 && _i >= limit127); _i = ((int)(0 + _i + step127)) ) {
RDebugUtils.currentLine=1966244;
 //BA.debugLineNum = 1966244;BA.debugLine="Dim w As Map";
_w = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1966245;
 //BA.debugLineNum = 1966245;BA.debugLine="w=agn.Get(i)";
_w.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_agn.Get(_i)));
RDebugUtils.currentLine=1966246;
 //BA.debugLineNum = 1966246;BA.debugLine="Log(\"haha\")";
anywheresoftware.b4a.keywords.Common.Log("haha");
RDebugUtils.currentLine=1966247;
 //BA.debugLineNum = 1966247;BA.debugLine="Dim image = w.Get(\"gallery_hotel\") As String";
_image = BA.ObjectToString(_w.Get((Object)("gallery_hotel")));
RDebugUtils.currentLine=1966248;
 //BA.debugLineNum = 1966248;BA.debugLine="Dim gambar = \"\"&serverimage&\"\"&image As Strin";
_gambar = ""+_serverimage+""+_image;
RDebugUtils.currentLine=1966249;
 //BA.debugLineNum = 1966249;BA.debugLine="Log(gambar)";
anywheresoftware.b4a.keywords.Common.Log(_gambar);
RDebugUtils.currentLine=1966250;
 //BA.debugLineNum = 1966250;BA.debugLine="Dim link As Map";
_link = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1966251;
 //BA.debugLineNum = 1966251;BA.debugLine="link.Initialize";
_link.Initialize();
RDebugUtils.currentLine=1966253;
 //BA.debugLineNum = 1966253;BA.debugLine="link.Put(ListView1, gambar)";
_link.Put((Object)(mostCurrent._listview1.getObject()),(Object)(_gambar));
RDebugUtils.currentLine=1966255;
 //BA.debugLineNum = 1966255;BA.debugLine="CallSubDelayed2(Starter, \"Download\", link)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(mostCurrent.activityBA,(Object)(mostCurrent._starter.getObject()),"Download",(Object)(_link));
 }
};
 };
 break; }
}
;
 };
RDebugUtils.currentLine=1966263;
 //BA.debugLineNum = 1966263;BA.debugLine="End Sub";
return "";
}
}