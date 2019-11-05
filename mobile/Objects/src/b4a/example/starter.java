package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class starter extends android.app.Service {
	public static class starter_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
			android.content.Intent in = new android.content.Intent(context, starter.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
			context.startService(in);
		}

	}
    static starter mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return starter.class;
	}
	@Override
	public void onCreate() {
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "b4a.example", "b4a.example.starter");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.starter", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!true && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("** Service (starter) Create **");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (true) {
			if (ServiceHelper.StarterHelper.waitForLayout != null)
				BA.handler.post(ServiceHelper.StarterHelper.waitForLayout);
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA))
			handleStart(intent);
		else {
			ServiceHelper.StarterHelper.waitForLayout = new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (starter) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
				}
			};
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (starter) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = new anywheresoftware.b4a.objects.IntentWrapper();
    			if (intent != null) {
    				if (intent.hasExtra("b4a_internal_intent"))
    					iw.setObject((android.content.Intent) intent.getParcelableExtra("b4a_internal_intent"));
    				else
    					iw.setObject(intent);
    			}
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}
	@Override
	public void onDestroy() {
        BA.LogInfo("** Service (starter) Destroy **");
		processBA.raiseEvent(null, "service_destroy");
        processBA.service = null;
		mostCurrent = null;
		processBA.setActivityPaused(true);
        processBA.runHook("ondestroy", this, null);
	}

public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.Map _cache = null;
public static anywheresoftware.b4a.objects.collections.Map _tasks = null;
public static anywheresoftware.b4a.objects.collections.Map _ongoingtasks = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.info_utama _info_utama = null;
public b4a.example.galeri_ut _galeri_ut = null;
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
public b4a.example.booking _booking = null;
public b4a.example.login _login = null;
public static String  _activityispaused() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "activityispaused"))
	return (String) Debug.delegate(processBA, "activityispaused", null);
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Sub ActivityIsPaused";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="tasks.Clear";
_tasks.Clear();
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="End Sub";
return "";
}
public static String  _download(anywheresoftware.b4a.objects.collections.Map _imageviewsmap) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "download"))
	return (String) Debug.delegate(processBA, "download", new Object[] {_imageviewsmap});
int _i = 0;
String _link = "";
anywheresoftware.b4a.objects.ListViewWrapper _iv = null;
anywheresoftware.b4a.samples.httputils2.httpjob _j = null;
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Sub Download (ImageViewsMap As Map)";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="For i = 0 To ImageViewsMap.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_imageviewsmap.getSize()-1);
for (_i = (int) (0) ; (step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1); _i = ((int)(0 + _i + step1)) ) {
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="tasks.Put(ImageViewsMap.GetKeyAt(i), ImageViewsM";
_tasks.Put(_imageviewsmap.GetKeyAt(_i),_imageviewsmap.GetValueAt(_i));
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="Dim link As String = ImageViewsMap.GetValueAt(i)";
_link = BA.ObjectToString(_imageviewsmap.GetValueAt(_i));
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="If cache.ContainsKey(link) Then";
if (_cache.ContainsKey((Object)(_link))) { 
RDebugUtils.currentLine=10616837;
 //BA.debugLineNum = 10616837;BA.debugLine="Dim iv As ListView = ImageViewsMap.GetKeyAt(i)";
_iv = new anywheresoftware.b4a.objects.ListViewWrapper();
_iv.setObject((anywheresoftware.b4a.objects.ListViewWrapper.SimpleListView)(_imageviewsmap.GetKeyAt(_i)));
RDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="iv.SetBackgroundImage(cache.Get(link))";
_iv.SetBackgroundImage((android.graphics.Bitmap)(_cache.Get((Object)(_link))));
 }else 
{RDebugUtils.currentLine=10616839;
 //BA.debugLineNum = 10616839;BA.debugLine="Else If ongoingTasks.ContainsKey(link) = False T";
if (_ongoingtasks.ContainsKey((Object)(_link))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=10616840;
 //BA.debugLineNum = 10616840;BA.debugLine="ongoingTasks.Put(link, \"\")";
_ongoingtasks.Put((Object)(_link),(Object)(""));
RDebugUtils.currentLine=10616841;
 //BA.debugLineNum = 10616841;BA.debugLine="Dim j As HttpJob";
_j = new anywheresoftware.b4a.samples.httputils2.httpjob();
RDebugUtils.currentLine=10616842;
 //BA.debugLineNum = 10616842;BA.debugLine="j.Initialize(link, Me)";
_j._initialize(processBA,_link,starter.getObject());
RDebugUtils.currentLine=10616843;
 //BA.debugLineNum = 10616843;BA.debugLine="j.Download(link)";
_j._download(_link);
 }};
 }
};
RDebugUtils.currentLine=10616846;
 //BA.debugLineNum = 10616846;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "jobdone"))
	return (String) Debug.delegate(processBA, "jobdone", new Object[] {_job});
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
int _i = 0;
String _link = "";
anywheresoftware.b4a.objects.ListViewWrapper _iv = null;
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="ongoingTasks.Remove(Job.JobName)";
_ongoingtasks.Remove((Object)(_job._jobname));
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="If Job.Success Then";
if (_job._success) { 
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="Dim bmp As Bitmap = Job.GetBitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmp = _job._getbitmap();
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="cache.Put(Job.JobName, bmp)";
_cache.Put((Object)(_job._jobname),(Object)(_bmp.getObject()));
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="If tasks.IsInitialized Then";
if (_tasks.IsInitialized()) { 
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="For i = 0 To tasks.Size - 1";
{
final int step6 = 1;
final int limit6 = (int) (_tasks.getSize()-1);
for (_i = (int) (0) ; (step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6); _i = ((int)(0 + _i + step6)) ) {
RDebugUtils.currentLine=10682375;
 //BA.debugLineNum = 10682375;BA.debugLine="Dim link As String = tasks.GetValueAt(i)";
_link = BA.ObjectToString(_tasks.GetValueAt(_i));
RDebugUtils.currentLine=10682376;
 //BA.debugLineNum = 10682376;BA.debugLine="If link = Job.JobName Then";
if ((_link).equals(_job._jobname)) { 
RDebugUtils.currentLine=10682377;
 //BA.debugLineNum = 10682377;BA.debugLine="Dim iv As ListView = tasks.GetKeyAt(i)";
_iv = new anywheresoftware.b4a.objects.ListViewWrapper();
_iv.setObject((anywheresoftware.b4a.objects.ListViewWrapper.SimpleListView)(_tasks.GetKeyAt(_i)));
RDebugUtils.currentLine=10682378;
 //BA.debugLineNum = 10682378;BA.debugLine="iv.SetBackgroundImage(bmp)";
_iv.SetBackgroundImage((android.graphics.Bitmap)(_bmp.getObject()));
 };
 }
};
 };
 }else {
RDebugUtils.currentLine=10682383;
 //BA.debugLineNum = 10682383;BA.debugLine="Log(\"Error downloading image: \" & Job.JobName &";
anywheresoftware.b4a.keywords.Common.Log("Error downloading image: "+_job._jobname+anywheresoftware.b4a.keywords.Common.CRLF+_job._errormessage);
 };
RDebugUtils.currentLine=10682385;
 //BA.debugLineNum = 10682385;BA.debugLine="Job.Release";
_job._release();
RDebugUtils.currentLine=10682386;
 //BA.debugLineNum = 10682386;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_create"))
	return (String) Debug.delegate(processBA, "service_create", null);
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="tasks.Initialize";
_tasks.Initialize();
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="cache.Initialize";
_cache.Initialize();
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="ongoingTasks.Initialize";
_ongoingtasks.Initialize();
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_destroy"))
	return (String) Debug.delegate(processBA, "service_destroy", null);
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_start"))
	return (String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent});
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="End Sub";
return "";
}
}