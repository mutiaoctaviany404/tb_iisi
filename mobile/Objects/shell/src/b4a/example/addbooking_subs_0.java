package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class addbooking_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (addbooking) ","addbooking",13,addbooking.mostCurrent.activityBA,addbooking.mostCurrent,37);
if (RapidSub.canDelegate("activity_create")) return addbooking.remoteMe.runUserSub(false, "addbooking","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 40;BA.debugLine="Activity.LoadLayout(addbooking)";
Debug.ShouldStop(128);
addbooking.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(addbooking.mostCurrent._addbooking),addbooking.mostCurrent.activityBA);
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (addbooking) ","addbooking",13,addbooking.mostCurrent.activityBA,addbooking.mostCurrent,67);
if (RapidSub.canDelegate("activity_pause")) return addbooking.remoteMe.runUserSub(false, "addbooking","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 67;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Resume (addbooking) ","addbooking",13,addbooking.mostCurrent.activityBA,addbooking.mostCurrent,63);
if (RapidSub.canDelegate("activity_resume")) return addbooking.remoteMe.runUserSub(false, "addbooking","activity_resume");
 BA.debugLineNum = 63;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="End Sub";
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
public static RemoteObject  _add_booking() throws Exception{
try {
		Debug.PushSubsStack("add_booking (addbooking) ","addbooking",13,addbooking.mostCurrent.activityBA,addbooking.mostCurrent,44);
if (RapidSub.canDelegate("add_booking")) return addbooking.remoteMe.runUserSub(false, "addbooking","add_booking");
 BA.debugLineNum = 44;BA.debugLine="Sub add_booking";
Debug.ShouldStop(2048);
 BA.debugLineNum = 45;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(4096);
addbooking.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",addbooking.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Loading...")));
 BA.debugLineNum = 47;BA.debugLine="text_numberofpeople=EditText1.Text";
Debug.ShouldStop(16384);
addbooking._text_numberofpeople = BA.numberCast(int.class, addbooking.mostCurrent._edittext1.runMethod(true,"getText"));
 BA.debugLineNum = 48;BA.debugLine="text_date=EditText2.Text";
Debug.ShouldStop(32768);
addbooking._text_date = BA.numberCast(int.class, addbooking.mostCurrent._edittext2.runMethod(true,"getText"));
 BA.debugLineNum = 49;BA.debugLine="text_username=EditText3.Text";
Debug.ShouldStop(65536);
addbooking.mostCurrent._text_username = addbooking.mostCurrent._edittext3.runMethod(true,"getText");
 BA.debugLineNum = 50;BA.debugLine="text_id_package=EditText4.Text";
Debug.ShouldStop(131072);
addbooking.mostCurrent._text_id_package = addbooking.mostCurrent._edittext4.runMethod(true,"getText");
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Button1_Click (addbooking) ","addbooking",13,addbooking.mostCurrent.activityBA,addbooking.mostCurrent,80);
if (RapidSub.canDelegate("button1_click")) return addbooking.remoteMe.runUserSub(false, "addbooking","button1_click");
 BA.debugLineNum = 80;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("EditText1_EnterPressed (addbooking) ","addbooking",13,addbooking.mostCurrent.activityBA,addbooking.mostCurrent,72);
if (RapidSub.canDelegate("edittext1_enterpressed")) return addbooking.remoteMe.runUserSub(false, "addbooking","edittext1_enterpressed");
 BA.debugLineNum = 72;BA.debugLine="Sub EditText1_EnterPressed";
Debug.ShouldStop(128);
 BA.debugLineNum = 74;BA.debugLine="End Sub";
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
public static RemoteObject  _edittext2_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("EditText2_EnterPressed (addbooking) ","addbooking",13,addbooking.mostCurrent.activityBA,addbooking.mostCurrent,76);
if (RapidSub.canDelegate("edittext2_enterpressed")) return addbooking.remoteMe.runUserSub(false, "addbooking","edittext2_enterpressed");
 BA.debugLineNum = 76;BA.debugLine="Sub EditText2_EnterPressed";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="End Sub";
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
public static RemoteObject  _edittext3_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("EditText3_EnterPressed (addbooking) ","addbooking",13,addbooking.mostCurrent.activityBA,addbooking.mostCurrent,84);
if (RapidSub.canDelegate("edittext3_enterpressed")) return addbooking.remoteMe.runUserSub(false, "addbooking","edittext3_enterpressed");
 BA.debugLineNum = 84;BA.debugLine="Sub EditText3_EnterPressed";
Debug.ShouldStop(524288);
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittext4_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("EditText4_EnterPressed (addbooking) ","addbooking",13,addbooking.mostCurrent.activityBA,addbooking.mostCurrent,88);
if (RapidSub.canDelegate("edittext4_enterpressed")) return addbooking.remoteMe.runUserSub(false, "addbooking","edittext4_enterpressed");
 BA.debugLineNum = 88;BA.debugLine="Sub EditText4_EnterPressed";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 90;BA.debugLine="End Sub";
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
public static RemoteObject  _executeremotequery(RemoteObject _query,RemoteObject _jobname) throws Exception{
try {
		Debug.PushSubsStack("ExecuteRemoteQuery (addbooking) ","addbooking",13,addbooking.mostCurrent.activityBA,addbooking.mostCurrent,55);
if (RapidSub.canDelegate("executeremotequery")) return addbooking.remoteMe.runUserSub(false, "addbooking","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 55;BA.debugLine="Sub ExecuteRemoteQuery (Query As String, JobName A";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(8388608);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 57;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(16777216);
_job.runVoidMethod ("_initialize",addbooking.processBA,(Object)(_jobname),(Object)(addbooking.getObject()));
 BA.debugLineNum = 59;BA.debugLine="Job.PostString(\"\"&Server&\"bookingmobile.php\", Que";
Debug.ShouldStop(67108864);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),addbooking._server,RemoteObject.createImmutable("bookingmobile.php"))),(Object)(_query));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 18;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 21;BA.debugLine="Private addbooking=\"addbooking\" As String";
addbooking.mostCurrent._addbooking = BA.ObjectToString("addbooking");
 //BA.debugLineNum = 23;BA.debugLine="Private EditText1 As EditText";
addbooking.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private EditText2 As EditText";
addbooking.mostCurrent._edittext2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private Button1 As Button";
addbooking.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private text_numberofpeople As Int";
addbooking._text_numberofpeople = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 28;BA.debugLine="Private text_date As Int";
addbooking._text_date = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 29;BA.debugLine="Private text_username As String";
addbooking.mostCurrent._text_username = RemoteObject.createImmutable("");
 //BA.debugLineNum = 30;BA.debugLine="Private text_id_package As String";
addbooking.mostCurrent._text_id_package = RemoteObject.createImmutable("");
 //BA.debugLineNum = 33;BA.debugLine="Private EditText3 As EditText";
addbooking.mostCurrent._edittext3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private EditText4 As EditText";
addbooking.mostCurrent._edittext4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Dim Server=\"http://192.168.100.13/wisatasolsel/mob";
addbooking._server = BA.ObjectToString("http://192.168.100.13/wisatasolsel/mobile/");
 //BA.debugLineNum = 11;BA.debugLine="Dim number_of_people As Int";
addbooking._number_of_people = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 12;BA.debugLine="Dim date As Int";
addbooking._date = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 13;BA.debugLine="Dim username As String";
addbooking._username = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Dim id_package As String";
addbooking._id_package = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}