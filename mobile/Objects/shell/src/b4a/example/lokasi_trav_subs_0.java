package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class lokasi_trav_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (lokasi_trav) ","lokasi_trav",11,lokasi_trav.mostCurrent.activityBA,lokasi_trav.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) return lokasi_trav.remoteMe.runUserSub(false, "lokasi_trav","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"lokasi\")";
Debug.ShouldStop(-2147483648);
lokasi_trav.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("lokasi")),lokasi_trav.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="Log(\"http://192.168.100.13/wisatasolsel/mobile/al";
Debug.ShouldStop(1);
lokasi_trav.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://192.168.100.13/wisatasolsel/mobile/all_mark.php?id="),lokasi_trav.mostCurrent._pencarian_travel._id)));
 BA.debugLineNum = 34;BA.debugLine="WebView1.LoadUrl(\"http://192.168.100.13/wisatasol";
Debug.ShouldStop(2);
lokasi_trav.mostCurrent._webview1.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://192.168.100.13/wisatasolsel/mobile/all_mark.php?id="),lokasi_trav.mostCurrent._pencarian_travel._id)));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Activity_Pause (lokasi_trav) ","lokasi_trav",11,lokasi_trav.mostCurrent.activityBA,lokasi_trav.mostCurrent,42);
if (RapidSub.canDelegate("activity_pause")) return lokasi_trav.remoteMe.runUserSub(false, "lokasi_trav","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Activity_Resume (lokasi_trav) ","lokasi_trav",11,lokasi_trav.mostCurrent.activityBA,lokasi_trav.mostCurrent,38);
if (RapidSub.canDelegate("activity_resume")) return lokasi_trav.remoteMe.runUserSub(false, "lokasi_trav","activity_resume");
 BA.debugLineNum = 38;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
 //BA.debugLineNum = 16;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private WebView1 As WebView";
lokasi_trav.mostCurrent._webview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private ListView1 As ListView";
lokasi_trav.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Button5 As Button";
lokasi_trav.mostCurrent._button5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Button6 As Button";
lokasi_trav.mostCurrent._button6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Button1 As Button";
lokasi_trav.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private Button2 As Button";
lokasi_trav.mostCurrent._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Button3 As Button";
lokasi_trav.mostCurrent._button3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Button4 As Button";
lokasi_trav.mostCurrent._button4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim latAsal, lngAsal, latTujuan, lngTujuan, latHe";
lokasi_trav._latasal = RemoteObject.createImmutable("");
lokasi_trav._lngasal = RemoteObject.createImmutable("");
lokasi_trav._lattujuan = RemoteObject.createImmutable("");
lokasi_trav._lngtujuan = RemoteObject.createImmutable("");
lokasi_trav._lathenti = RemoteObject.createImmutable("");
lokasi_trav._lnghenti = RemoteObject.createImmutable("");
lokasi_trav._idmes = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Dim id, lat, lng, id_angkot, destination, route_c";
lokasi_trav._id = RemoteObject.createImmutable("");
lokasi_trav._lat = RemoteObject.createImmutable("");
lokasi_trav._lng = RemoteObject.createImmutable("");
lokasi_trav._id_angkot = RemoteObject.createImmutable("");
lokasi_trav._destination = RemoteObject.createImmutable("");
lokasi_trav._route_color = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Type travel_lines (isi1 As String,isi2 As String,";
;
 //BA.debugLineNum = 12;BA.debugLine="Dim PETA=\"PETA\" As String";
lokasi_trav._peta = BA.ObjectToString("PETA");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}