package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class lokasi_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (lokasi) ","lokasi",4,lokasi.mostCurrent.activityBA,lokasi.mostCurrent,20);
if (RapidSub.canDelegate("activity_create")) return lokasi.remoteMe.runUserSub(false, "lokasi","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 20;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Activity.LoadLayout(\"lokasi\")";
Debug.ShouldStop(2097152);
lokasi.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("lokasi")),lokasi.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="Log(\"http://192.168.100.13/wisatasolsel/mobile/al";
Debug.ShouldStop(4194304);
lokasi.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://192.168.100.13/wisatasolsel/mobile/all_mark.php?id="),lokasi.mostCurrent._pencarian_nama._id)));
 BA.debugLineNum = 24;BA.debugLine="WebView1.LoadUrl(\"http://192.168.100.13/wisatasol";
Debug.ShouldStop(8388608);
lokasi.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://192.168.100.13/wisatasolsel/mobile/all_mark.php?id="),lokasi.mostCurrent._pencarian_nama._id)));
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_Pause (lokasi) ","lokasi",4,lokasi.mostCurrent.activityBA,lokasi.mostCurrent,33);
if (RapidSub.canDelegate("activity_pause")) return lokasi.remoteMe.runUserSub(false, "lokasi","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Activity_Resume (lokasi) ","lokasi",4,lokasi.mostCurrent.activityBA,lokasi.mostCurrent,29);
if (RapidSub.canDelegate("activity_resume")) return lokasi.remoteMe.runUserSub(false, "lokasi","activity_resume");
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (lokasi) ","lokasi",4,lokasi.mostCurrent.activityBA,lokasi.mostCurrent,37);
if (RapidSub.canDelegate("button1_click")) return lokasi.remoteMe.runUserSub(false, "lokasi","button1_click");
 BA.debugLineNum = 37;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="StartActivity(home)";
Debug.ShouldStop(32);
lokasi.mostCurrent.__c.runVoidMethod ("StartActivity",lokasi.mostCurrent.activityBA,(Object)((lokasi.mostCurrent._home.getObject())));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (lokasi) ","lokasi",4,lokasi.mostCurrent.activityBA,lokasi.mostCurrent,41);
if (RapidSub.canDelegate("button2_click")) return lokasi.remoteMe.runUserSub(false, "lokasi","button2_click");
 BA.debugLineNum = 41;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="StartActivity(pencarian_travel)";
Debug.ShouldStop(512);
lokasi.mostCurrent.__c.runVoidMethod ("StartActivity",lokasi.mostCurrent.activityBA,(Object)((lokasi.mostCurrent._pencarian_travel.getObject())));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button3_click() throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (lokasi) ","lokasi",4,lokasi.mostCurrent.activityBA,lokasi.mostCurrent,44);
if (RapidSub.canDelegate("button3_click")) return lokasi.remoteMe.runUserSub(false, "lokasi","button3_click");
 BA.debugLineNum = 44;BA.debugLine="Sub Button3_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="StartActivity(pencarian_nama)";
Debug.ShouldStop(4096);
lokasi.mostCurrent.__c.runVoidMethod ("StartActivity",lokasi.mostCurrent.activityBA,(Object)((lokasi.mostCurrent._pencarian_nama.getObject())));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button4_click() throws Exception{
try {
		Debug.PushSubsStack("Button4_Click (lokasi) ","lokasi",4,lokasi.mostCurrent.activityBA,lokasi.mostCurrent,47);
if (RapidSub.canDelegate("button4_click")) return lokasi.remoteMe.runUserSub(false, "lokasi","button4_click");
 BA.debugLineNum = 47;BA.debugLine="Sub Button4_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="StartActivity(pencarian_des)";
Debug.ShouldStop(32768);
lokasi.mostCurrent.__c.runVoidMethod ("StartActivity",lokasi.mostCurrent.activityBA,(Object)((lokasi.mostCurrent._pencarian_des.getObject())));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
lokasi.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim PETA=\"PETA\" As String";
lokasi._peta = BA.ObjectToString("PETA");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}