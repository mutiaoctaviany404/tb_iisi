package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class info_travel_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (info_travel) ","info_travel",5,info_travel.mostCurrent.activityBA,info_travel.mostCurrent,35);
if (RapidSub.canDelegate("activity_create")) return info_travel.remoteMe.runUserSub(false, "info_travel","activity_create", _firsttime);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Activity.LoadLayout(\"informasi_utama\")";
Debug.ShouldStop(8);
info_travel.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("informasi_utama")),info_travel.mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="Label7.Text=pencarian_travel.name";
Debug.ShouldStop(16);
info_travel.mostCurrent._label7.runMethod(true,"setText",(info_travel.mostCurrent._pencarian_travel._name));
 BA.debugLineNum = 38;BA.debugLine="Label8.Text=pencarian_travel.price";
Debug.ShouldStop(32);
info_travel.mostCurrent._label8.runMethod(true,"setText",(info_travel.mostCurrent._pencarian_travel._price));
 BA.debugLineNum = 39;BA.debugLine="ListView2.SingleLineLayout.Label.TextColor=Colors";
Debug.ShouldStop(64);
info_travel.mostCurrent._listview2.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",info_travel.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 40;BA.debugLine="ListView2.SingleLineLayout.Label.TextSize=16";
Debug.ShouldStop(128);
info_travel.mostCurrent._listview2.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 41;BA.debugLine="ListView2.SingleLineLayout.Label.Left=2%y";
Debug.ShouldStop(256);
info_travel.mostCurrent._listview2.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setLeft",info_travel.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),info_travel.mostCurrent.activityBA));
 BA.debugLineNum = 42;BA.debugLine="ListView3.SingleLineLayout.Label.TextColor=Colors";
Debug.ShouldStop(512);
info_travel.mostCurrent._listview3.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",info_travel.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 43;BA.debugLine="ListView3.SingleLineLayout.Label.TextSize=16";
Debug.ShouldStop(1024);
info_travel.mostCurrent._listview3.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 44;BA.debugLine="ListView3.SingleLineLayout.Label.Left=2%y";
Debug.ShouldStop(2048);
info_travel.mostCurrent._listview3.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setLeft",info_travel.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),info_travel.mostCurrent.activityBA));
 BA.debugLineNum = 45;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(4096);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 46;BA.debugLine="Job.Initialize(\"Jobcaritrav\", Me)";
Debug.ShouldStop(8192);
_job.runVoidMethod ("_initialize",info_travel.processBA,(Object)(BA.ObjectToString("Jobcaritrav")),(Object)(info_travel.getObject()));
 BA.debugLineNum = 47;BA.debugLine="Job.PostString(\"http://192.168.100.13/wisatasolse";
Debug.ShouldStop(16384);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://192.168.100.13/wisatasolsel/mobile/info_detail.php?id="),info_travel.mostCurrent._pencarian_travel._id)),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Activity_Pause (info_travel) ","info_travel",5,info_travel.mostCurrent.activityBA,info_travel.mostCurrent,58);
if (RapidSub.canDelegate("activity_pause")) return info_travel.remoteMe.runUserSub(false, "info_travel","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 58;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (info_travel) ","info_travel",5,info_travel.mostCurrent.activityBA,info_travel.mostCurrent,50);
if (RapidSub.canDelegate("activity_resume")) return info_travel.remoteMe.runUserSub(false, "info_travel","activity_resume");
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(524288);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 53;BA.debugLine="Job.Initialize(\"Jobcaritrav\", Me)";
Debug.ShouldStop(1048576);
_job.runVoidMethod ("_initialize",info_travel.processBA,(Object)(BA.ObjectToString("Jobcaritrav")),(Object)(info_travel.getObject()));
 BA.debugLineNum = 54;BA.debugLine="Job.PostString(\"http://192.168.100.13/wisatasolse";
Debug.ShouldStop(2097152);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://192.168.100.13/wisatasolsel/mobile/info_detail.php?id="),info_travel.mostCurrent._pencarian_travel._id)),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 55;BA.debugLine="Log(pencarian_travel.id_travel)";
Debug.ShouldStop(4194304);
info_travel.mostCurrent.__c.runVoidMethod ("Log",(Object)(info_travel.mostCurrent._pencarian_travel._id_travel));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
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
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (info_travel) ","info_travel",5,info_travel.mostCurrent.activityBA,info_travel.mostCurrent,168);
if (RapidSub.canDelegate("button1_click")) return info_travel.remoteMe.runUserSub(false, "info_travel","button1_click");
 BA.debugLineNum = 168;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 169;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(256);
info_travel.mostCurrent.__c.runVoidMethod ("StartActivity",info_travel.mostCurrent.activityBA,(Object)((info_travel.mostCurrent._main.getObject())));
 BA.debugLineNum = 170;BA.debugLine="End Sub";
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
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (info_travel) ","info_travel",5,info_travel.mostCurrent.activityBA,info_travel.mostCurrent,172);
if (RapidSub.canDelegate("button2_click")) return info_travel.remoteMe.runUserSub(false, "info_travel","button2_click");
 BA.debugLineNum = 172;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 173;BA.debugLine="StartActivity(pencarian_travel)";
Debug.ShouldStop(4096);
info_travel.mostCurrent.__c.runVoidMethod ("StartActivity",info_travel.mostCurrent.activityBA,(Object)((info_travel.mostCurrent._pencarian_travel.getObject())));
 BA.debugLineNum = 174;BA.debugLine="End Sub";
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
public static RemoteObject  _button3_click() throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (info_travel) ","info_travel",5,info_travel.mostCurrent.activityBA,info_travel.mostCurrent,176);
if (RapidSub.canDelegate("button3_click")) return info_travel.remoteMe.runUserSub(false, "info_travel","button3_click");
 BA.debugLineNum = 176;BA.debugLine="Sub Button3_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="StartActivity(pencarian_nama)";
Debug.ShouldStop(65536);
info_travel.mostCurrent.__c.runVoidMethod ("StartActivity",info_travel.mostCurrent.activityBA,(Object)((info_travel.mostCurrent._pencarian_nama.getObject())));
 BA.debugLineNum = 178;BA.debugLine="End Sub";
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
public static RemoteObject  _button4_click() throws Exception{
try {
		Debug.PushSubsStack("Button4_Click (info_travel) ","info_travel",5,info_travel.mostCurrent.activityBA,info_travel.mostCurrent,180);
if (RapidSub.canDelegate("button4_click")) return info_travel.remoteMe.runUserSub(false, "info_travel","button4_click");
 BA.debugLineNum = 180;BA.debugLine="Sub Button4_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 181;BA.debugLine="StartActivity(pencarian_des)";
Debug.ShouldStop(1048576);
info_travel.mostCurrent.__c.runVoidMethod ("StartActivity",info_travel.mostCurrent.activityBA,(Object)((info_travel.mostCurrent._pencarian_des.getObject())));
 BA.debugLineNum = 182;BA.debugLine="End Sub";
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
public static RemoteObject  _button5_click() throws Exception{
try {
		Debug.PushSubsStack("Button5_Click (info_travel) ","info_travel",5,info_travel.mostCurrent.activityBA,info_travel.mostCurrent,162);
if (RapidSub.canDelegate("button5_click")) return info_travel.remoteMe.runUserSub(false, "info_travel","button5_click");
 BA.debugLineNum = 162;BA.debugLine="Sub Button5_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 165;BA.debugLine="StartActivity(lokasi_travel)";
Debug.ShouldStop(16);
info_travel.mostCurrent.__c.runVoidMethod ("StartActivity",info_travel.mostCurrent.activityBA,(Object)((info_travel.mostCurrent._lokasi_travel.getObject())));
 BA.debugLineNum = 166;BA.debugLine="End Sub";
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
public static RemoteObject  _button6_click() throws Exception{
try {
		Debug.PushSubsStack("Button6_Click (info_travel) ","info_travel",5,info_travel.mostCurrent.activityBA,info_travel.mostCurrent,154);
if (RapidSub.canDelegate("button6_click")) return info_travel.remoteMe.runUserSub(false, "info_travel","button6_click");
 BA.debugLineNum = 154;BA.debugLine="Sub Button6_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 156;BA.debugLine="End Sub";
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
public static RemoteObject  _button7_click() throws Exception{
try {
		Debug.PushSubsStack("Button7_Click (info_travel) ","info_travel",5,info_travel.mostCurrent.activityBA,info_travel.mostCurrent,158);
if (RapidSub.canDelegate("button7_click")) return info_travel.remoteMe.runUserSub(false, "info_travel","button7_click");
 BA.debugLineNum = 158;BA.debugLine="Sub Button7_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="StartActivity(galeri_ut)";
Debug.ShouldStop(1073741824);
info_travel.mostCurrent.__c.runVoidMethod ("StartActivity",info_travel.mostCurrent.activityBA,(Object)((info_travel.mostCurrent._galeri_ut.getObject())));
 BA.debugLineNum = 160;BA.debugLine="End Sub";
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
public static RemoteObject  _detailnama() throws Exception{
try {
		Debug.PushSubsStack("detailNama (info_travel) ","info_travel",5,info_travel.mostCurrent.activityBA,info_travel.mostCurrent,68);
if (RapidSub.canDelegate("detailnama")) return info_travel.remoteMe.runUserSub(false, "info_travel","detailnama");
 BA.debugLineNum = 68;BA.debugLine="Sub detailNama";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
Debug.ShouldStop(16);
info_travel.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",info_travel.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Loading ....")));
 BA.debugLineNum = 70;BA.debugLine="ExecuteRemoteQuery(\"SELECT*FROM object_point wher";
Debug.ShouldStop(32);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT*FROM object_point where id_package='"),info_travel.mostCurrent._pencarian_travel._id,RemoteObject.createImmutable("' ORDER BY object_point.no_urut ASC ")),RemoteObject.createImmutable("object"));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
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
public static RemoteObject  _executeremotequery(RemoteObject _query,RemoteObject _jobname) throws Exception{
try {
		Debug.PushSubsStack("ExecuteRemoteQuery (info_travel) ","info_travel",5,info_travel.mostCurrent.activityBA,info_travel.mostCurrent,62);
if (RapidSub.canDelegate("executeremotequery")) return info_travel.remoteMe.runUserSub(false, "info_travel","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 62;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(1073741824);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 64;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(-2147483648);
_job.runVoidMethod ("_initialize",info_travel.processBA,(Object)(_jobname),(Object)(info_travel.getObject()));
 BA.debugLineNum = 65;BA.debugLine="Job.PostString(\"\"&Main.server&\"json.php\", Query)";
Debug.ShouldStop(1);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),info_travel.mostCurrent._main._server,RemoteObject.createImmutable("json.php"))),(Object)(_query));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private Label3 As Label";
info_travel.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Label7 As Label";
info_travel.mostCurrent._label7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Label8 As Label";
info_travel.mostCurrent._label8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Label4 As Label";
info_travel.mostCurrent._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Button7 As Button";
info_travel.mostCurrent._button7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Button6 As Button";
info_travel.mostCurrent._button6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Button5 As Button";
info_travel.mostCurrent._button5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private Button1 As Button";
info_travel.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Button2 As Button";
info_travel.mostCurrent._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Button3 As Button";
info_travel.mostCurrent._button3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private Button4 As Button";
info_travel.mostCurrent._button4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private ListView2 As ListView";
info_travel.mostCurrent._listview2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private ListView3 As ListView";
info_travel.mostCurrent._listview3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private ListView1 As ListView";
info_travel.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (info_travel) ","info_travel",5,info_travel.mostCurrent.activityBA,info_travel.mostCurrent,73);
if (RapidSub.canDelegate("jobdone")) return info_travel.remoteMe.runUserSub(false, "info_travel","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _mes_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _status = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 73;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(512);
info_travel.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 75;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(1024);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 76;BA.debugLine="Dim res As String";
Debug.ShouldStop(2048);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 77;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(4096);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 78;BA.debugLine="Log(\"Response from server :\"&res)";
Debug.ShouldStop(8192);
info_travel.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 79;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(16384);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 80;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(32768);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 81;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(65536);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("object"),BA.ObjectToString("tujuan"),BA.ObjectToString("Jobcaritrav"))) {
case 0: {
 BA.debugLineNum = 83;BA.debugLine="Dim mes_array As List";
Debug.ShouldStop(262144);
_mes_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("mes_array", _mes_array);
 BA.debugLineNum = 84;BA.debugLine="mes_array = parser.NextArray";
Debug.ShouldStop(524288);
_mes_array = _parser.runMethod(false,"NextArray");Debug.locals.put("mes_array", _mes_array);
 BA.debugLineNum = 85;BA.debugLine="For i=0 To mes_array.Size -1";
Debug.ShouldStop(1048576);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_mes_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12); _i = ((int)(0 + _i + step12)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 86;BA.debugLine="Dim m As Map";
Debug.ShouldStop(2097152);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 88;BA.debugLine="m= mes_array.Get(i)";
Debug.ShouldStop(8388608);
_m.setObject(_mes_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 89;BA.debugLine="Dim id As String";
Debug.ShouldStop(16777216);
info_travel._id = RemoteObject.createImmutable("");
 BA.debugLineNum = 90;BA.debugLine="Dim status As String";
Debug.ShouldStop(33554432);
_status = RemoteObject.createImmutable("");Debug.locals.put("status", _status);
 BA.debugLineNum = 91;BA.debugLine="status=m.Get(\"status\")";
Debug.ShouldStop(67108864);
_status = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);
 BA.debugLineNum = 92;BA.debugLine="Log(status)";
Debug.ShouldStop(134217728);
info_travel.mostCurrent.__c.runVoidMethod ("Log",(Object)(_status));
 BA.debugLineNum = 93;BA.debugLine="ListView2.AddSingleLine(m.Get(\"time\"))";
Debug.ShouldStop(268435456);
info_travel.mostCurrent._listview2.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time")))))));
 BA.debugLineNum = 94;BA.debugLine="ListView3.AddSingleLine(m.Get(\"estimated_hour";
Debug.ShouldStop(536870912);
info_travel.mostCurrent._listview3.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("estimated_hour")))))));
 BA.debugLineNum = 96;BA.debugLine="If status == 1 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_status,BA.NumberToString(1))) { 
 BA.debugLineNum = 97;BA.debugLine="id=m.Get(\"id_souvenir\")";
Debug.ShouldStop(1);
info_travel._id = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_souvenir")))));
 BA.debugLineNum = 98;BA.debugLine="Log(id)";
Debug.ShouldStop(2);
info_travel.mostCurrent.__c.runVoidMethod ("Log",(Object)(info_travel._id));
 BA.debugLineNum = 99;BA.debugLine="ExecuteRemoteQuery(\"SELECT*FROM souvenir whe";
Debug.ShouldStop(4);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT*FROM souvenir where id='"),info_travel._id,RemoteObject.createImmutable("'  ")),RemoteObject.createImmutable("tujuan"));
 }else 
{ BA.debugLineNum = 100;BA.debugLine="Else If status == 2 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_status,BA.NumberToString(2))) { 
 BA.debugLineNum = 101;BA.debugLine="id=m.Get(\"id_workship_place\")";
Debug.ShouldStop(16);
info_travel._id = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_workship_place")))));
 BA.debugLineNum = 102;BA.debugLine="Log(id)";
Debug.ShouldStop(32);
info_travel.mostCurrent.__c.runVoidMethod ("Log",(Object)(info_travel._id));
 BA.debugLineNum = 103;BA.debugLine="ExecuteRemoteQuery(\"SELECT*FROM workship_pla";
Debug.ShouldStop(64);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT*FROM workship_place where id='"),info_travel._id,RemoteObject.createImmutable("' ")),RemoteObject.createImmutable("tujuan"));
 }else 
{ BA.debugLineNum = 104;BA.debugLine="Else If status == 3 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_status,BA.NumberToString(3))) { 
 BA.debugLineNum = 105;BA.debugLine="id=m.Get(\"id_restaurant\")";
Debug.ShouldStop(256);
info_travel._id = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_restaurant")))));
 BA.debugLineNum = 106;BA.debugLine="Log(id)";
Debug.ShouldStop(512);
info_travel.mostCurrent.__c.runVoidMethod ("Log",(Object)(info_travel._id));
 BA.debugLineNum = 107;BA.debugLine="ExecuteRemoteQuery(\"SELECT*FROM restaurant w";
Debug.ShouldStop(1024);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT*FROM restaurant where id='"),info_travel._id,RemoteObject.createImmutable("' ")),RemoteObject.createImmutable("tujuan"));
 }else 
{ BA.debugLineNum = 108;BA.debugLine="Else If status == 4 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_status,BA.NumberToString(4))) { 
 BA.debugLineNum = 109;BA.debugLine="id=m.Get(\"id_tourism\")";
Debug.ShouldStop(4096);
info_travel._id = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_tourism")))));
 BA.debugLineNum = 110;BA.debugLine="Log(id)";
Debug.ShouldStop(8192);
info_travel.mostCurrent.__c.runVoidMethod ("Log",(Object)(info_travel._id));
 BA.debugLineNum = 111;BA.debugLine="ExecuteRemoteQuery(\"SELECT*FROM tourism wher";
Debug.ShouldStop(16384);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT*FROM tourism where id='"),info_travel._id,RemoteObject.createImmutable("' ")),RemoteObject.createImmutable("tujuan"));
 }else 
{ BA.debugLineNum = 112;BA.debugLine="Else If status == 5 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_status,BA.NumberToString(5))) { 
 BA.debugLineNum = 113;BA.debugLine="id=m.Get(\"id_hotel\")";
Debug.ShouldStop(65536);
info_travel._id = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_hotel")))));
 BA.debugLineNum = 114;BA.debugLine="Log(id)";
Debug.ShouldStop(131072);
info_travel.mostCurrent.__c.runVoidMethod ("Log",(Object)(info_travel._id));
 BA.debugLineNum = 115;BA.debugLine="ExecuteRemoteQuery(\"SELECT*FROM hotel where";
Debug.ShouldStop(262144);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT*FROM hotel where id='"),info_travel._id,RemoteObject.createImmutable("' ")),RemoteObject.createImmutable("tujuan"));
 }}}}};
 }
}Debug.locals.put("i", _i);
;
 break; }
case 1: {
 BA.debugLineNum = 124;BA.debugLine="Dim mes_array As List";
Debug.ShouldStop(134217728);
_mes_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("mes_array", _mes_array);
 BA.debugLineNum = 125;BA.debugLine="mes_array = parser.NextArray";
Debug.ShouldStop(268435456);
_mes_array = _parser.runMethod(false,"NextArray");Debug.locals.put("mes_array", _mes_array);
 BA.debugLineNum = 126;BA.debugLine="If (mes_array.Size>0) Then";
Debug.ShouldStop(536870912);
if ((RemoteObject.solveBoolean(">",_mes_array.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 127;BA.debugLine="Dim m As Map";
Debug.ShouldStop(1073741824);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 129;BA.debugLine="m= mes_array.Get(0)";
Debug.ShouldStop(1);
_m.setObject(_mes_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 130;BA.debugLine="Dim name As String";
Debug.ShouldStop(2);
_name = RemoteObject.createImmutable("");Debug.locals.put("name", _name);
 BA.debugLineNum = 131;BA.debugLine="name=m.Get(\"name\")";
Debug.ShouldStop(4);
_name = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);
 BA.debugLineNum = 132;BA.debugLine="ListView1.AddSingleLine(name)";
Debug.ShouldStop(8);
info_travel.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(_name));
 }else {
 BA.debugLineNum = 134;BA.debugLine="Msgbox(\"No Data\",\"Info\")";
Debug.ShouldStop(32);
info_travel.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("No Data")),(Object)(RemoteObject.createImmutable("Info")),info_travel.mostCurrent.activityBA);
 };
 break; }
case 2: {
 BA.debugLineNum = 137;BA.debugLine="ListView1.Clear()";
Debug.ShouldStop(256);
info_travel.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 138;BA.debugLine="ListView2.Clear()";
Debug.ShouldStop(512);
info_travel.mostCurrent._listview2.runVoidMethod ("Clear");
 BA.debugLineNum = 139;BA.debugLine="Dim mes_array As List";
Debug.ShouldStop(1024);
_mes_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("mes_array", _mes_array);
 BA.debugLineNum = 140;BA.debugLine="mes_array = parser.NextArray";
Debug.ShouldStop(2048);
_mes_array = _parser.runMethod(false,"NextArray");Debug.locals.put("mes_array", _mes_array);
 BA.debugLineNum = 141;BA.debugLine="For i=0 To mes_array.Size -1";
Debug.ShouldStop(4096);
{
final int step60 = 1;
final int limit60 = RemoteObject.solve(new RemoteObject[] {_mes_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step60 > 0 && _i <= limit60) || (step60 < 0 && _i >= limit60); _i = ((int)(0 + _i + step60)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 142;BA.debugLine="Dim m As Map";
Debug.ShouldStop(8192);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 144;BA.debugLine="m= mes_array.Get(i)";
Debug.ShouldStop(32768);
_m.setObject(_mes_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 145;BA.debugLine="ListView1.AddSingleLine(m.Get(\"n1\"))";
Debug.ShouldStop(65536);
info_travel.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("n1")))))));
 BA.debugLineNum = 146;BA.debugLine="ListView2.AddSingleLine(m.Get(\"n3\"))";
Debug.ShouldStop(131072);
info_travel.mostCurrent._listview2.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("n3")))))));
 BA.debugLineNum = 147;BA.debugLine="ListView3.AddSingleLine(m.Get(\"n4\"))";
Debug.ShouldStop(262144);
info_travel.mostCurrent._listview3.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("n4")))))));
 }
}Debug.locals.put("i", _i);
;
 break; }
}
;
 };
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private TRAV=\"TRAV\" As String";
info_travel._trav = BA.ObjectToString("TRAV");
 //BA.debugLineNum = 10;BA.debugLine="Dim id, lat, lng As String";
info_travel._id = RemoteObject.createImmutable("");
info_travel._lat = RemoteObject.createImmutable("");
info_travel._lng = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}