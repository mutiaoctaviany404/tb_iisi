package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class info_utama_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (info_utama) ","info_utama",1,info_utama.mostCurrent.activityBA,info_utama.mostCurrent,37);
if (RapidSub.canDelegate("activity_create")) return info_utama.remoteMe.runUserSub(false, "info_utama","activity_create", _firsttime);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 39;BA.debugLine="Activity.LoadLayout(\"informasi_utama\")";
Debug.ShouldStop(64);
info_utama.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("informasi_utama")),info_utama.mostCurrent.activityBA);
 BA.debugLineNum = 40;BA.debugLine="ListView1.SingleLineLayout.Label.TextColor=Colors";
Debug.ShouldStop(128);
info_utama.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",info_utama.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 41;BA.debugLine="ListView1.SingleLineLayout.Label.TextSize=16";
Debug.ShouldStop(256);
info_utama.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 42;BA.debugLine="ListView1.SingleLineLayout.Label.Left=2%y";
Debug.ShouldStop(512);
info_utama.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setLeft",info_utama.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),info_utama.mostCurrent.activityBA));
 BA.debugLineNum = 43;BA.debugLine="ListView2.SingleLineLayout.Label.TextColor=Colors";
Debug.ShouldStop(1024);
info_utama.mostCurrent._listview2.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",info_utama.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 44;BA.debugLine="ListView2.SingleLineLayout.Label.TextSize=16";
Debug.ShouldStop(2048);
info_utama.mostCurrent._listview2.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 45;BA.debugLine="ListView2.SingleLineLayout.Label.Left=2%y";
Debug.ShouldStop(4096);
info_utama.mostCurrent._listview2.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setLeft",info_utama.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),info_utama.mostCurrent.activityBA));
 BA.debugLineNum = 46;BA.debugLine="ListView3.SingleLineLayout.Label.TextColor=Colors";
Debug.ShouldStop(8192);
info_utama.mostCurrent._listview3.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",info_utama.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 47;BA.debugLine="ListView3.SingleLineLayout.Label.TextSize=16";
Debug.ShouldStop(16384);
info_utama.mostCurrent._listview3.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 48;BA.debugLine="ListView3.SingleLineLayout.Label.Left=2%y";
Debug.ShouldStop(32768);
info_utama.mostCurrent._listview3.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setLeft",info_utama.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),info_utama.mostCurrent.activityBA));
 BA.debugLineNum = 49;BA.debugLine="Label7.Text=pencarian_nama.name";
Debug.ShouldStop(65536);
info_utama.mostCurrent._label7.runMethod(true,"setText",(info_utama.mostCurrent._pencarian_nama._name));
 BA.debugLineNum = 50;BA.debugLine="Label8.Text=pencarian_nama.price";
Debug.ShouldStop(131072);
info_utama.mostCurrent._label8.runMethod(true,"setText",(info_utama.mostCurrent._pencarian_nama._price));
 BA.debugLineNum = 51;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(262144);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 52;BA.debugLine="Job.Initialize(\"Jobcarinama\", Me)";
Debug.ShouldStop(524288);
_job.runVoidMethod ("_initialize",info_utama.processBA,(Object)(BA.ObjectToString("Jobcarinama")),(Object)(info_utama.getObject()));
 BA.debugLineNum = 53;BA.debugLine="Job.PostString(\"http://192.168.100.13/wisatasolse";
Debug.ShouldStop(1048576);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://192.168.100.13/wisatasolsel/mobile/info_detail.php?id="),info_utama.mostCurrent._pencarian_nama._id)),(Object)(RemoteObject.createImmutable("")));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (info_utama) ","info_utama",1,info_utama.mostCurrent.activityBA,info_utama.mostCurrent,66);
if (RapidSub.canDelegate("activity_pause")) return info_utama.remoteMe.runUserSub(false, "info_utama","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 66;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 68;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (info_utama) ","info_utama",1,info_utama.mostCurrent.activityBA,info_utama.mostCurrent,56);
if (RapidSub.canDelegate("activity_resume")) return info_utama.remoteMe.runUserSub(false, "info_utama","activity_resume");
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
 BA.debugLineNum = 56;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 59;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(67108864);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 60;BA.debugLine="Job.Initialize(\"Jobcarinama\", Me)";
Debug.ShouldStop(134217728);
_job.runVoidMethod ("_initialize",info_utama.processBA,(Object)(BA.ObjectToString("Jobcarinama")),(Object)(info_utama.getObject()));
 BA.debugLineNum = 61;BA.debugLine="Job.PostString(\"http://192.168.100.13/wisatasolse";
Debug.ShouldStop(268435456);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable("http://192.168.100.13/wisatasolsel/mobile/info_detail.php?id="),info_utama.mostCurrent._pencarian_nama._id)),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 62;BA.debugLine="Log(pencarian_nama.id)";
Debug.ShouldStop(536870912);
info_utama.mostCurrent.__c.runVoidMethod ("Log",(Object)(info_utama.mostCurrent._pencarian_nama._id));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Button1_Click (info_utama) ","info_utama",1,info_utama.mostCurrent.activityBA,info_utama.mostCurrent,177);
if (RapidSub.canDelegate("button1_click")) return info_utama.remoteMe.runUserSub(false, "info_utama","button1_click");
 BA.debugLineNum = 177;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(131072);
info_utama.mostCurrent.__c.runVoidMethod ("StartActivity",info_utama.mostCurrent.activityBA,(Object)((info_utama.mostCurrent._main.getObject())));
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Button2_Click (info_utama) ","info_utama",1,info_utama.mostCurrent.activityBA,info_utama.mostCurrent,181);
if (RapidSub.canDelegate("button2_click")) return info_utama.remoteMe.runUserSub(false, "info_utama","button2_click");
 BA.debugLineNum = 181;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 182;BA.debugLine="StartActivity(pencarian_travel)";
Debug.ShouldStop(2097152);
info_utama.mostCurrent.__c.runVoidMethod ("StartActivity",info_utama.mostCurrent.activityBA,(Object)((info_utama.mostCurrent._pencarian_travel.getObject())));
 BA.debugLineNum = 183;BA.debugLine="End Sub";
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
public static RemoteObject  _button3_click() throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (info_utama) ","info_utama",1,info_utama.mostCurrent.activityBA,info_utama.mostCurrent,185);
if (RapidSub.canDelegate("button3_click")) return info_utama.remoteMe.runUserSub(false, "info_utama","button3_click");
 BA.debugLineNum = 185;BA.debugLine="Sub Button3_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 186;BA.debugLine="StartActivity(pencarian_nama)";
Debug.ShouldStop(33554432);
info_utama.mostCurrent.__c.runVoidMethod ("StartActivity",info_utama.mostCurrent.activityBA,(Object)((info_utama.mostCurrent._pencarian_nama.getObject())));
 BA.debugLineNum = 187;BA.debugLine="End Sub";
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
public static RemoteObject  _button4_click() throws Exception{
try {
		Debug.PushSubsStack("Button4_Click (info_utama) ","info_utama",1,info_utama.mostCurrent.activityBA,info_utama.mostCurrent,189);
if (RapidSub.canDelegate("button4_click")) return info_utama.remoteMe.runUserSub(false, "info_utama","button4_click");
 BA.debugLineNum = 189;BA.debugLine="Sub Button4_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 190;BA.debugLine="StartActivity(pencarian_des)";
Debug.ShouldStop(536870912);
info_utama.mostCurrent.__c.runVoidMethod ("StartActivity",info_utama.mostCurrent.activityBA,(Object)((info_utama.mostCurrent._pencarian_des.getObject())));
 BA.debugLineNum = 191;BA.debugLine="End Sub";
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
public static RemoteObject  _button5_click() throws Exception{
try {
		Debug.PushSubsStack("Button5_Click (info_utama) ","info_utama",1,info_utama.mostCurrent.activityBA,info_utama.mostCurrent,173);
if (RapidSub.canDelegate("button5_click")) return info_utama.remoteMe.runUserSub(false, "info_utama","button5_click");
 BA.debugLineNum = 173;BA.debugLine="Sub Button5_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 174;BA.debugLine="StartActivity(lokasi)";
Debug.ShouldStop(8192);
info_utama.mostCurrent.__c.runVoidMethod ("StartActivity",info_utama.mostCurrent.activityBA,(Object)((info_utama.mostCurrent._lokasi.getObject())));
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Button7_Click (info_utama) ","info_utama",1,info_utama.mostCurrent.activityBA,info_utama.mostCurrent,169);
if (RapidSub.canDelegate("button7_click")) return info_utama.remoteMe.runUserSub(false, "info_utama","button7_click");
 BA.debugLineNum = 169;BA.debugLine="Sub Button7_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="StartActivity(galeri_ut)";
Debug.ShouldStop(512);
info_utama.mostCurrent.__c.runVoidMethod ("StartActivity",info_utama.mostCurrent.activityBA,(Object)((info_utama.mostCurrent._galeri_ut.getObject())));
 BA.debugLineNum = 171;BA.debugLine="End Sub";
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
public static RemoteObject  _detailnama() throws Exception{
try {
		Debug.PushSubsStack("detailNama (info_utama) ","info_utama",1,info_utama.mostCurrent.activityBA,info_utama.mostCurrent,76);
if (RapidSub.canDelegate("detailnama")) return info_utama.remoteMe.runUserSub(false, "info_utama","detailnama");
 BA.debugLineNum = 76;BA.debugLine="Sub detailNama";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
Debug.ShouldStop(4096);
info_utama.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",info_utama.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Loading ....")));
 BA.debugLineNum = 78;BA.debugLine="ExecuteRemoteQuery(\"SELECT*FROM object_point wher";
Debug.ShouldStop(8192);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT*FROM object_point where id_package='"),info_utama.mostCurrent._pencarian_nama._id,RemoteObject.createImmutable("' ORDER BY object_point.no_urut ASC ")),RemoteObject.createImmutable("object"));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
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
public static RemoteObject  _executeremotequery(RemoteObject _query,RemoteObject _jobname) throws Exception{
try {
		Debug.PushSubsStack("ExecuteRemoteQuery (info_utama) ","info_utama",1,info_utama.mostCurrent.activityBA,info_utama.mostCurrent,70);
if (RapidSub.canDelegate("executeremotequery")) return info_utama.remoteMe.runUserSub(false, "info_utama","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 70;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(64);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 72;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(128);
_job.runVoidMethod ("_initialize",info_utama.processBA,(Object)(_jobname),(Object)(info_utama.getObject()));
 BA.debugLineNum = 73;BA.debugLine="Job.PostString(\"\"&Main.server&\"json.php\", Query)";
Debug.ShouldStop(256);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),info_utama.mostCurrent._main._server,RemoteObject.createImmutable("json.php"))),(Object)(_query));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private Label3 As Label";
info_utama.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Label7 As Label";
info_utama.mostCurrent._label7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Label8 As Label";
info_utama.mostCurrent._label8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Label4 As Label";
info_utama.mostCurrent._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Button7 As Button";
info_utama.mostCurrent._button7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Button5 As Button";
info_utama.mostCurrent._button5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private Button1 As Button";
info_utama.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Button2 As Button";
info_utama.mostCurrent._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private Button3 As Button";
info_utama.mostCurrent._button3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private Button4 As Button";
info_utama.mostCurrent._button4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Dim idmes As String";
info_utama.mostCurrent._idmes = RemoteObject.createImmutable("");
 //BA.debugLineNum = 31;BA.debugLine="Private ListView1 As ListView";
info_utama.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private ListView2 As ListView";
info_utama.mostCurrent._listview2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private ListView3 As ListView";
info_utama.mostCurrent._listview3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (info_utama) ","info_utama",1,info_utama.mostCurrent.activityBA,info_utama.mostCurrent,82);
if (RapidSub.canDelegate("jobdone")) return info_utama.remoteMe.runUserSub(false, "info_utama","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _mes_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _status = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 82;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(262144);
info_utama.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 84;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(524288);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 85;BA.debugLine="Dim res As String";
Debug.ShouldStop(1048576);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 86;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(2097152);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 87;BA.debugLine="Log(\"Response from server :\"&res)";
Debug.ShouldStop(4194304);
info_utama.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res)));
 BA.debugLineNum = 88;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8388608);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 89;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(16777216);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 90;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("object"),BA.ObjectToString("tujuan"),BA.ObjectToString("Jobcarinama"))) {
case 0: {
 BA.debugLineNum = 92;BA.debugLine="Dim mes_array As List";
Debug.ShouldStop(134217728);
_mes_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("mes_array", _mes_array);
 BA.debugLineNum = 93;BA.debugLine="mes_array = parser.NextArray";
Debug.ShouldStop(268435456);
_mes_array = _parser.runMethod(false,"NextArray");Debug.locals.put("mes_array", _mes_array);
 BA.debugLineNum = 94;BA.debugLine="For i=0 To mes_array.Size -1";
Debug.ShouldStop(536870912);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_mes_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12); _i = ((int)(0 + _i + step12)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 95;BA.debugLine="Dim m As Map";
Debug.ShouldStop(1073741824);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 97;BA.debugLine="m= mes_array.Get(i)";
Debug.ShouldStop(1);
_m.setObject(_mes_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 98;BA.debugLine="Dim id As String";
Debug.ShouldStop(2);
info_utama._id = RemoteObject.createImmutable("");
 BA.debugLineNum = 99;BA.debugLine="Dim status As String";
Debug.ShouldStop(4);
_status = RemoteObject.createImmutable("");Debug.locals.put("status", _status);
 BA.debugLineNum = 100;BA.debugLine="status=m.Get(\"status\")";
Debug.ShouldStop(8);
_status = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);
 BA.debugLineNum = 101;BA.debugLine="Log(status)";
Debug.ShouldStop(16);
info_utama.mostCurrent.__c.runVoidMethod ("Log",(Object)(_status));
 BA.debugLineNum = 102;BA.debugLine="ListView2.AddSingleLine(m.Get(\"time\"))";
Debug.ShouldStop(32);
info_utama.mostCurrent._listview2.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("time")))))));
 BA.debugLineNum = 103;BA.debugLine="ListView3.AddSingleLine(m.Get(\"estimated_hour";
Debug.ShouldStop(64);
info_utama.mostCurrent._listview3.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("estimated_hour")))))));
 BA.debugLineNum = 105;BA.debugLine="If status == 1 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_status,BA.NumberToString(1))) { 
 BA.debugLineNum = 106;BA.debugLine="id=m.Get(\"id_souvenir\")";
Debug.ShouldStop(512);
info_utama._id = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_souvenir")))));
 BA.debugLineNum = 107;BA.debugLine="Log(id)";
Debug.ShouldStop(1024);
info_utama.mostCurrent.__c.runVoidMethod ("Log",(Object)(info_utama._id));
 BA.debugLineNum = 108;BA.debugLine="ExecuteRemoteQuery(\"SELECT*FROM souvenir whe";
Debug.ShouldStop(2048);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT*FROM souvenir where id='"),info_utama._id,RemoteObject.createImmutable("'  ")),RemoteObject.createImmutable("tujuan"));
 }else 
{ BA.debugLineNum = 109;BA.debugLine="Else If status == 2 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_status,BA.NumberToString(2))) { 
 BA.debugLineNum = 110;BA.debugLine="id=m.Get(\"id_workship_place\")";
Debug.ShouldStop(8192);
info_utama._id = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_workship_place")))));
 BA.debugLineNum = 111;BA.debugLine="Log(id)";
Debug.ShouldStop(16384);
info_utama.mostCurrent.__c.runVoidMethod ("Log",(Object)(info_utama._id));
 BA.debugLineNum = 112;BA.debugLine="ExecuteRemoteQuery(\"SELECT*FROM workship_pla";
Debug.ShouldStop(32768);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT*FROM workship_place where id='"),info_utama._id,RemoteObject.createImmutable("' ")),RemoteObject.createImmutable("tujuan"));
 }else 
{ BA.debugLineNum = 113;BA.debugLine="Else If status == 3 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_status,BA.NumberToString(3))) { 
 BA.debugLineNum = 114;BA.debugLine="id=m.Get(\"id_restaurant\")";
Debug.ShouldStop(131072);
info_utama._id = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_restaurant")))));
 BA.debugLineNum = 115;BA.debugLine="Log(id)";
Debug.ShouldStop(262144);
info_utama.mostCurrent.__c.runVoidMethod ("Log",(Object)(info_utama._id));
 BA.debugLineNum = 116;BA.debugLine="ExecuteRemoteQuery(\"SELECT*FROM restaurant w";
Debug.ShouldStop(524288);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT*FROM restaurant where id='"),info_utama._id,RemoteObject.createImmutable("' ")),RemoteObject.createImmutable("tujuan"));
 }else 
{ BA.debugLineNum = 117;BA.debugLine="Else If status == 4 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_status,BA.NumberToString(4))) { 
 BA.debugLineNum = 118;BA.debugLine="id=m.Get(\"id_tourism\")";
Debug.ShouldStop(2097152);
info_utama._id = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_tourism")))));
 BA.debugLineNum = 119;BA.debugLine="Log(id)";
Debug.ShouldStop(4194304);
info_utama.mostCurrent.__c.runVoidMethod ("Log",(Object)(info_utama._id));
 BA.debugLineNum = 120;BA.debugLine="ExecuteRemoteQuery(\"SELECT*FROM tourism wher";
Debug.ShouldStop(8388608);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT*FROM tourism where id='"),info_utama._id,RemoteObject.createImmutable("' ")),RemoteObject.createImmutable("tujuan"));
 }else 
{ BA.debugLineNum = 122;BA.debugLine="Else If status == 5 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_status,BA.NumberToString(5))) { 
 BA.debugLineNum = 123;BA.debugLine="id=m.Get(\"id_hotel\")";
Debug.ShouldStop(67108864);
info_utama._id = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_hotel")))));
 BA.debugLineNum = 124;BA.debugLine="Log(id)";
Debug.ShouldStop(134217728);
info_utama.mostCurrent.__c.runVoidMethod ("Log",(Object)(info_utama._id));
 BA.debugLineNum = 125;BA.debugLine="ExecuteRemoteQuery(\"SELECT*FROM hotel where";
Debug.ShouldStop(268435456);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT*FROM hotel where id='"),info_utama._id,RemoteObject.createImmutable("' ")),RemoteObject.createImmutable("tujuan"));
 }}}}};
 }
}Debug.locals.put("i", _i);
;
 break; }
case 1: {
 BA.debugLineNum = 136;BA.debugLine="Dim mes_array As List";
Debug.ShouldStop(128);
_mes_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("mes_array", _mes_array);
 BA.debugLineNum = 137;BA.debugLine="mes_array = parser.NextArray";
Debug.ShouldStop(256);
_mes_array = _parser.runMethod(false,"NextArray");Debug.locals.put("mes_array", _mes_array);
 BA.debugLineNum = 138;BA.debugLine="If (mes_array.Size>0) Then";
Debug.ShouldStop(512);
if ((RemoteObject.solveBoolean(">",_mes_array.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 139;BA.debugLine="Dim m As Map";
Debug.ShouldStop(1024);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 141;BA.debugLine="m= mes_array.Get(0)";
Debug.ShouldStop(4096);
_m.setObject(_mes_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 142;BA.debugLine="ListView1.AddSingleLine(m.Get(\"name\"))";
Debug.ShouldStop(8192);
info_utama.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))))));
 BA.debugLineNum = 143;BA.debugLine="Log(\"mulaiii\")";
Debug.ShouldStop(16384);
info_utama.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("mulaiii")));
 }else {
 BA.debugLineNum = 146;BA.debugLine="Msgbox(\"No Data\",\"Info\")";
Debug.ShouldStop(131072);
info_utama.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("No Data")),(Object)(RemoteObject.createImmutable("Info")),info_utama.mostCurrent.activityBA);
 };
 break; }
case 2: {
 BA.debugLineNum = 150;BA.debugLine="ListView1.Clear()";
Debug.ShouldStop(2097152);
info_utama.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 151;BA.debugLine="ListView2.Clear()";
Debug.ShouldStop(4194304);
info_utama.mostCurrent._listview2.runVoidMethod ("Clear");
 BA.debugLineNum = 152;BA.debugLine="ListView3.Clear()";
Debug.ShouldStop(8388608);
info_utama.mostCurrent._listview3.runVoidMethod ("Clear");
 BA.debugLineNum = 154;BA.debugLine="Dim mes_array As List";
Debug.ShouldStop(33554432);
_mes_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("mes_array", _mes_array);
 BA.debugLineNum = 155;BA.debugLine="mes_array = parser.NextArray";
Debug.ShouldStop(67108864);
_mes_array = _parser.runMethod(false,"NextArray");Debug.locals.put("mes_array", _mes_array);
 BA.debugLineNum = 156;BA.debugLine="For i=0 To mes_array.Size -1";
Debug.ShouldStop(134217728);
{
final int step60 = 1;
final int limit60 = RemoteObject.solve(new RemoteObject[] {_mes_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step60 > 0 && _i <= limit60) || (step60 < 0 && _i >= limit60); _i = ((int)(0 + _i + step60)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 157;BA.debugLine="Dim m As Map";
Debug.ShouldStop(268435456);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 159;BA.debugLine="m= mes_array.Get(i)";
Debug.ShouldStop(1073741824);
_m.setObject(_mes_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 160;BA.debugLine="ListView1.AddSingleLine(m.Get(\"n1\"))";
Debug.ShouldStop(-2147483648);
info_utama.mostCurrent._listview1.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("n1")))))));
 BA.debugLineNum = 161;BA.debugLine="ListView2.AddSingleLine(m.Get(\"n3\"))";
Debug.ShouldStop(1);
info_utama.mostCurrent._listview2.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("n3")))))));
 BA.debugLineNum = 162;BA.debugLine="ListView3.AddSingleLine(m.Get(\"n4\"))";
Debug.ShouldStop(2);
info_utama.mostCurrent._listview3.runVoidMethod ("AddSingleLine",(Object)(BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("n4")))))));
 }
}Debug.locals.put("i", _i);
;
 break; }
}
;
 };
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private NAMA=\"NAMA\" As String";
info_utama._nama = BA.ObjectToString("NAMA");
 //BA.debugLineNum = 10;BA.debugLine="Dim id, lat, lng As String";
info_utama._id = RemoteObject.createImmutable("");
info_utama._lat = RemoteObject.createImmutable("");
info_utama._lng = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}