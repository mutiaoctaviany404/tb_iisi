package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class login_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (login) ","login",16,login.mostCurrent.activityBA,login.mostCurrent,21);
if (RapidSub.canDelegate("activity_create")) return login.remoteMe.runUserSub(false, "login","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 21;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Pause (login) ","login",16,login.mostCurrent.activityBA,login.mostCurrent,31);
if (RapidSub.canDelegate("activity_pause")) return login.remoteMe.runUserSub(false, "login","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Activity_Resume (login) ","login",16,login.mostCurrent.activityBA,login.mostCurrent,27);
if (RapidSub.canDelegate("activity_resume")) return login.remoteMe.runUserSub(false, "login","activity_resume");
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Button1_Click (login) ","login",16,login.mostCurrent.activityBA,login.mostCurrent,44);
if (RapidSub.canDelegate("button1_click")) return login.remoteMe.runUserSub(false, "login","button1_click");
 BA.debugLineNum = 44;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="StartActivity(\"home\")";
Debug.ShouldStop(4096);
login.mostCurrent.__c.runVoidMethod ("StartActivity",login.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("home"))));
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
public static RemoteObject  _edittext1_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("EditText1_EnterPressed (login) ","login",16,login.mostCurrent.activityBA,login.mostCurrent,36);
if (RapidSub.canDelegate("edittext1_enterpressed")) return login.remoteMe.runUserSub(false, "login","edittext1_enterpressed");
 BA.debugLineNum = 36;BA.debugLine="Sub EditText1_EnterPressed";
Debug.ShouldStop(8);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittext2_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("EditText2_EnterPressed (login) ","login",16,login.mostCurrent.activityBA,login.mostCurrent,40);
if (RapidSub.canDelegate("edittext2_enterpressed")) return login.remoteMe.runUserSub(false, "login","edittext2_enterpressed");
 BA.debugLineNum = 40;BA.debugLine="Sub EditText2_EnterPressed";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
 //BA.debugLineNum = 16;BA.debugLine="Private EditText1 As EditText";
login.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private EditText2 As EditText";
login.mostCurrent._edittext2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private Button1 As Button";
login.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}