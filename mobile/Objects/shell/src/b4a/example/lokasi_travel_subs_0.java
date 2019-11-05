package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class lokasi_travel_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (lokasi_travel) ","lokasi_travel",10,lokasi_travel.mostCurrent.activityBA,lokasi_travel.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) return lokasi_travel.remoteMe.runUserSub(false, "lokasi_travel","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 21;BA.debugLine="Activity.LoadLayout(\"lokasi\")";
Debug.ShouldStop(1048576);
lokasi_travel.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("lokasi")),lokasi_travel.mostCurrent.activityBA);
 BA.debugLineNum = 22;BA.debugLine="Log(\"http://192.168.100.13/wisatasolsel/mobile/al";
Debug.ShouldStop(2097152);
lokasi_travel.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://192.168.100.13/wisatasolsel/mobile/all_mark.php?id="),lokasi_travel.mostCurrent._pencarian_travel._id)));
 BA.debugLineNum = 23;BA.debugLine="WebView1.LoadUrl(\"http://192.168.100.13/wisatasol";
Debug.ShouldStop(4194304);
lokasi_travel.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://192.168.100.13/wisatasolsel/mobile/all_mark.php?id="),lokasi_travel.mostCurrent._pencarian_travel._id)));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (lokasi_travel) ","lokasi_travel",10,lokasi_travel.mostCurrent.activityBA,lokasi_travel.mostCurrent,30);
if (RapidSub.canDelegate("activity_pause")) return lokasi_travel.remoteMe.runUserSub(false, "lokasi_travel","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (lokasi_travel) ","lokasi_travel",10,lokasi_travel.mostCurrent.activityBA,lokasi_travel.mostCurrent,26);
if (RapidSub.canDelegate("activity_resume")) return lokasi_travel.remoteMe.runUserSub(false, "lokasi_travel","activity_resume");
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private WebView1 As WebView";
lokasi_travel.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim PETATRAV=\"PETATRAV\" As String";
lokasi_travel._petatrav = BA.ObjectToString("PETATRAV");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}