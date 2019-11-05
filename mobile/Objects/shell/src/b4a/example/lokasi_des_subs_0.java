package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class lokasi_des_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (lokasi_des) ","lokasi_des",9,lokasi_des.mostCurrent.activityBA,lokasi_des.mostCurrent,20);
if (RapidSub.canDelegate("activity_create")) return lokasi_des.remoteMe.runUserSub(false, "lokasi_des","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 20;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"lokasi\")";
Debug.ShouldStop(2097152);
lokasi_des.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("lokasi")),lokasi_des.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="Log(\"http://192.168.100.13/wisatasolsel/mobile/al";
Debug.ShouldStop(4194304);
lokasi_des.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://192.168.100.13/wisatasolsel/mobile/all_mark.php?id="),lokasi_des.mostCurrent._pencarian_des._id)));
 BA.debugLineNum = 24;BA.debugLine="WebView1.LoadUrl(\"http://192.168.100.13/wisatasol";
Debug.ShouldStop(8388608);
lokasi_des.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://192.168.100.13/wisatasolsel/mobile/all_mark.php?id="),lokasi_des.mostCurrent._pencarian_des._id)));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Activity_Pause (lokasi_des) ","lokasi_des",9,lokasi_des.mostCurrent.activityBA,lokasi_des.mostCurrent,32);
if (RapidSub.canDelegate("activity_pause")) return lokasi_des.remoteMe.runUserSub(false, "lokasi_des","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Activity_Resume (lokasi_des) ","lokasi_des",9,lokasi_des.mostCurrent.activityBA,lokasi_des.mostCurrent,28);
if (RapidSub.canDelegate("activity_resume")) return lokasi_des.remoteMe.runUserSub(false, "lokasi_des","activity_resume");
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private WebView1 As WebView";
lokasi_des.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim PETA=\"PETA\" As String";
lokasi_des._peta = BA.ObjectToString("PETA");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}