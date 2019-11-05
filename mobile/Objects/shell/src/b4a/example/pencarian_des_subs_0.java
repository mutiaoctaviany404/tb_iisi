package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pencarian_des_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (pencarian_des) ","pencarian_des",7,pencarian_des.mostCurrent.activityBA,pencarian_des.mostCurrent,35);
if (RapidSub.canDelegate("activity_create")) return pencarian_des.remoteMe.runUserSub(false, "pencarian_des","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="Activity.LoadLayout(\"pencarian_des\")";
Debug.ShouldStop(16);
pencarian_des.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("pencarian_des")),pencarian_des.mostCurrent.activityBA);
 BA.debugLineNum = 38;BA.debugLine="kategori_daftar.Initialize";
Debug.ShouldStop(32);
pencarian_des._kategori_daftar.runVoidMethod ("Initialize");
 BA.debugLineNum = 39;BA.debugLine="id_tempat_list.Initialize";
Debug.ShouldStop(64);
pencarian_des._id_tempat_list.runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="daftarkec";
Debug.ShouldStop(128);
_daftarkec();
 BA.debugLineNum = 41;BA.debugLine="Spinner1.Color=Colors.RGB(255, 250, 240)";
Debug.ShouldStop(256);
pencarian_des.mostCurrent._spinner1.runVoidMethod ("setColor",pencarian_des.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 250)),(Object)(BA.numberCast(int.class, 240))));
 BA.debugLineNum = 42;BA.debugLine="Spinner1.DropdownBackgroundColor=Colors.RGB(72, 3";
Debug.ShouldStop(512);
pencarian_des.mostCurrent._spinner1.runMethod(true,"setDropdownBackgroundColor",pencarian_des.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 39)),(Object)(BA.numberCast(int.class, 39))));
 BA.debugLineNum = 43;BA.debugLine="ListView1.SingleLineLayout.Label.TextColor=Colors";
Debug.ShouldStop(1024);
pencarian_des.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",pencarian_des.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 39)),(Object)(BA.numberCast(int.class, 39))));
 BA.debugLineNum = 44;BA.debugLine="ListView1.SingleLineLayout.Label.TextSize=16";
Debug.ShouldStop(2048);
pencarian_des.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 45;BA.debugLine="ListView1.SingleLineLayout.Label.Left=2%y";
Debug.ShouldStop(4096);
pencarian_des.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setLeft",pencarian_des.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),pencarian_des.mostCurrent.activityBA));
 BA.debugLineNum = 47;BA.debugLine="Spinner1.Color=Colors.RGB(252, 206, 84)";
Debug.ShouldStop(16384);
pencarian_des.mostCurrent._spinner1.runVoidMethod ("setColor",pencarian_des.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 252)),(Object)(BA.numberCast(int.class, 206)),(Object)(BA.numberCast(int.class, 84))));
 BA.debugLineNum = 48;BA.debugLine="Spinner2.Color=Colors.RGB(252, 206, 84)";
Debug.ShouldStop(32768);
pencarian_des.mostCurrent._spinner2.runVoidMethod ("setColor",pencarian_des.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 252)),(Object)(BA.numberCast(int.class, 206)),(Object)(BA.numberCast(int.class, 84))));
 BA.debugLineNum = 49;BA.debugLine="Spinner3.Color=Colors.RGB(252, 206, 84)";
Debug.ShouldStop(65536);
pencarian_des.mostCurrent._spinner3.runVoidMethod ("setColor",pencarian_des.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 252)),(Object)(BA.numberCast(int.class, 206)),(Object)(BA.numberCast(int.class, 84))));
 BA.debugLineNum = 50;BA.debugLine="Spinner1.DropdownBackgroundColor=Colors.RGB(252,";
Debug.ShouldStop(131072);
pencarian_des.mostCurrent._spinner1.runMethod(true,"setDropdownBackgroundColor",pencarian_des.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 252)),(Object)(BA.numberCast(int.class, 206)),(Object)(BA.numberCast(int.class, 84))));
 BA.debugLineNum = 51;BA.debugLine="Spinner2.DropdownBackgroundColor=Colors.RGB(252,";
Debug.ShouldStop(262144);
pencarian_des.mostCurrent._spinner2.runMethod(true,"setDropdownBackgroundColor",pencarian_des.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 252)),(Object)(BA.numberCast(int.class, 206)),(Object)(BA.numberCast(int.class, 84))));
 BA.debugLineNum = 52;BA.debugLine="Spinner3.DropdownBackgroundColor=Colors.RGB(252,";
Debug.ShouldStop(524288);
pencarian_des.mostCurrent._spinner3.runMethod(true,"setDropdownBackgroundColor",pencarian_des.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 252)),(Object)(BA.numberCast(int.class, 206)),(Object)(BA.numberCast(int.class, 84))));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Activity_Pause (pencarian_des) ","pencarian_des",7,pencarian_des.mostCurrent.activityBA,pencarian_des.mostCurrent,59);
if (RapidSub.canDelegate("activity_pause")) return pencarian_des.remoteMe.runUserSub(false, "pencarian_des","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 59;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 61;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (pencarian_des) ","pencarian_des",7,pencarian_des.mostCurrent.activityBA,pencarian_des.mostCurrent,55);
if (RapidSub.canDelegate("activity_resume")) return pencarian_des.remoteMe.runUserSub(false, "pencarian_des","activity_resume");
 BA.debugLineNum = 55;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="End Sub";
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
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (pencarian_des) ","pencarian_des",7,pencarian_des.mostCurrent.activityBA,pencarian_des.mostCurrent,223);
if (RapidSub.canDelegate("button2_click")) return pencarian_des.remoteMe.runUserSub(false, "pencarian_des","button2_click");
 BA.debugLineNum = 223;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 224;BA.debugLine="StartActivity(pencarian_travel)";
Debug.ShouldStop(-2147483648);
pencarian_des.mostCurrent.__c.runVoidMethod ("StartActivity",pencarian_des.mostCurrent.activityBA,(Object)((pencarian_des.mostCurrent._pencarian_travel.getObject())));
 BA.debugLineNum = 225;BA.debugLine="End Sub";
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
public static RemoteObject  _button3_click() throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (pencarian_des) ","pencarian_des",7,pencarian_des.mostCurrent.activityBA,pencarian_des.mostCurrent,227);
if (RapidSub.canDelegate("button3_click")) return pencarian_des.remoteMe.runUserSub(false, "pencarian_des","button3_click");
 BA.debugLineNum = 227;BA.debugLine="Sub Button3_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 228;BA.debugLine="StartActivity(pencarian_nama)";
Debug.ShouldStop(8);
pencarian_des.mostCurrent.__c.runVoidMethod ("StartActivity",pencarian_des.mostCurrent.activityBA,(Object)((pencarian_des.mostCurrent._pencarian_nama.getObject())));
 BA.debugLineNum = 229;BA.debugLine="End Sub";
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
public static RemoteObject  _button4_click() throws Exception{
try {
		Debug.PushSubsStack("Button4_Click (pencarian_des) ","pencarian_des",7,pencarian_des.mostCurrent.activityBA,pencarian_des.mostCurrent,231);
if (RapidSub.canDelegate("button4_click")) return pencarian_des.remoteMe.runUserSub(false, "pencarian_des","button4_click");
 BA.debugLineNum = 231;BA.debugLine="Sub Button4_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			Debug.ErrorCaught(e);
			throw e;
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _daftarkec() throws Exception{
try {
		Debug.PushSubsStack("daftarkec (pencarian_des) ","pencarian_des",7,pencarian_des.mostCurrent.activityBA,pencarian_des.mostCurrent,69);
if (RapidSub.canDelegate("daftarkec")) return pencarian_des.remoteMe.runUserSub(false, "pencarian_des","daftarkec");
 BA.debugLineNum = 69;BA.debugLine="Sub daftarkec";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Spinner1.Add(\"--Choose district--\")";
Debug.ShouldStop(32);
pencarian_des.mostCurrent._spinner1.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("--Choose district--")));
 BA.debugLineNum = 71;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
Debug.ShouldStop(64);
pencarian_des.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",pencarian_des.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Loading ....")));
 BA.debugLineNum = 72;BA.debugLine="ExecuteRemoteQuery(\"select * from district\",\"KEC\"";
Debug.ShouldStop(128);
_executeremotequery(BA.ObjectToString("select * from district"),RemoteObject.createImmutable("KEC"));
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
public static RemoteObject  _executeremotequery(RemoteObject _query,RemoteObject _jobname) throws Exception{
try {
		Debug.PushSubsStack("ExecuteRemoteQuery (pencarian_des) ","pencarian_des",7,pencarian_des.mostCurrent.activityBA,pencarian_des.mostCurrent,63);
if (RapidSub.canDelegate("executeremotequery")) return pencarian_des.remoteMe.runUserSub(false, "pencarian_des","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 63;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(-2147483648);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 65;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(1);
_job.runVoidMethod ("_initialize",pencarian_des.processBA,(Object)(_jobname),(Object)(pencarian_des.getObject()));
 BA.debugLineNum = 66;BA.debugLine="Job.PostString(\"\"&Main.server&\"json.php\", Query)";
Debug.ShouldStop(2);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),pencarian_des.mostCurrent._main._server,RemoteObject.createImmutable("json.php"))),(Object)(_query));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 27;BA.debugLine="Private Spinner1 As Spinner";
pencarian_des.mostCurrent._spinner1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private Button1 As Button";
pencarian_des.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private ListView1 As ListView";
pencarian_des.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private Spinner2 As Spinner";
pencarian_des.mostCurrent._spinner2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private Spinner3 As Spinner";
pencarian_des.mostCurrent._spinner3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (pencarian_des) ","pencarian_des",7,pencarian_des.mostCurrent.activityBA,pencarian_des.mostCurrent,76);
if (RapidSub.canDelegate("jobdone")) return pencarian_des.remoteMe.runUserSub(false, "pencarian_des","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _jenis_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _b = RemoteObject.declareNull("b4a.example.pencarian_nama._daftarpaket_lines");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 76;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4096);
pencarian_des.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 78;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(8192);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 79;BA.debugLine="Dim res As String";
Debug.ShouldStop(16384);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 80;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(32768);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 82;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(131072);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 83;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(262144);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 84;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(524288);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),pencarian_des._kec,BA.ObjectToString("objek"),BA.ObjectToString("paket"))) {
case 0: {
 BA.debugLineNum = 86;BA.debugLine="Dim jenis_array As List";
Debug.ShouldStop(2097152);
_jenis_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("jenis_array", _jenis_array);
 BA.debugLineNum = 87;BA.debugLine="jenis_array = parser.NextArray";
Debug.ShouldStop(4194304);
_jenis_array = _parser.runMethod(false,"NextArray");Debug.locals.put("jenis_array", _jenis_array);
 BA.debugLineNum = 88;BA.debugLine="If(jenis_array.Size>0) Then";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean(">",_jenis_array.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 89;BA.debugLine="For i=0 To jenis_array.Size -1";
Debug.ShouldStop(16777216);
{
final int step12 = 1;
final int limit12 = RemoteObject.solve(new RemoteObject[] {_jenis_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12); _i = ((int)(0 + _i + step12)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 90;BA.debugLine="Dim a As Map";
Debug.ShouldStop(33554432);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 91;BA.debugLine="a = jenis_array.Get(i)";
Debug.ShouldStop(67108864);
_a.setObject(_jenis_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 92;BA.debugLine="id_kec=a.Get(\"id\")";
Debug.ShouldStop(134217728);
pencarian_des._id_kec = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));
 BA.debugLineNum = 93;BA.debugLine="nama_kec=a.Get(\"name\")";
Debug.ShouldStop(268435456);
pencarian_des._nama_kec = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));
 BA.debugLineNum = 94;BA.debugLine="Spinner1.Add(nama_kec) 'meninputkan nama pro";
Debug.ShouldStop(536870912);
pencarian_des.mostCurrent._spinner1.runVoidMethod ("Add",(Object)(pencarian_des._nama_kec));
 BA.debugLineNum = 95;BA.debugLine="kategori_daftar.Put(nama_kec, id_kec)";
Debug.ShouldStop(1073741824);
pencarian_des._kategori_daftar.runVoidMethod ("Put",(Object)((pencarian_des._nama_kec)),(Object)((pencarian_des._id_kec)));
 }
}Debug.locals.put("i", _i);
;
 };
 break; }
case 1: {
 BA.debugLineNum = 101;BA.debugLine="Spinner3.Clear";
Debug.ShouldStop(16);
pencarian_des.mostCurrent._spinner3.runVoidMethod ("Clear");
 BA.debugLineNum = 102;BA.debugLine="Dim jenis_array As List";
Debug.ShouldStop(32);
_jenis_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("jenis_array", _jenis_array);
 BA.debugLineNum = 103;BA.debugLine="jenis_array = parser.NextArray";
Debug.ShouldStop(64);
_jenis_array = _parser.runMethod(false,"NextArray");Debug.locals.put("jenis_array", _jenis_array);
 BA.debugLineNum = 104;BA.debugLine="If(jenis_array.Size>0) Then";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean(">",_jenis_array.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 105;BA.debugLine="For i=0 To jenis_array.Size -1";
Debug.ShouldStop(256);
{
final int step26 = 1;
final int limit26 = RemoteObject.solve(new RemoteObject[] {_jenis_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26); _i = ((int)(0 + _i + step26)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 106;BA.debugLine="Dim a As Map";
Debug.ShouldStop(512);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("a", _a);
 BA.debugLineNum = 107;BA.debugLine="a = jenis_array.Get(i)";
Debug.ShouldStop(1024);
_a.setObject(_jenis_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 108;BA.debugLine="id_tempat=a.Get(\"id\")";
Debug.ShouldStop(2048);
pencarian_des._id_tempat = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));
 BA.debugLineNum = 109;BA.debugLine="nama_tempat=a.Get(\"name\")";
Debug.ShouldStop(4096);
pencarian_des._nama_tempat = BA.ObjectToString(_a.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));
 BA.debugLineNum = 110;BA.debugLine="Spinner3.Add(nama_tempat) 'meninputkan nama";
Debug.ShouldStop(8192);
pencarian_des.mostCurrent._spinner3.runVoidMethod ("Add",(Object)(pencarian_des._nama_tempat));
 BA.debugLineNum = 111;BA.debugLine="id_tempat_list.Put(nama_tempat, id_tempat)";
Debug.ShouldStop(16384);
pencarian_des._id_tempat_list.runVoidMethod ("Put",(Object)((pencarian_des._nama_tempat)),(Object)((pencarian_des._id_tempat)));
 }
}Debug.locals.put("i", _i);
;
 };
 break; }
case 2: {
 BA.debugLineNum = 116;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(524288);
pencarian_des.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 117;BA.debugLine="Dim jenis_array As List";
Debug.ShouldStop(1048576);
_jenis_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("jenis_array", _jenis_array);
 BA.debugLineNum = 118;BA.debugLine="jenis_array = parser.NextArray";
Debug.ShouldStop(2097152);
_jenis_array = _parser.runMethod(false,"NextArray");Debug.locals.put("jenis_array", _jenis_array);
 BA.debugLineNum = 119;BA.debugLine="If(jenis_array.Size>0) Then";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean(">",_jenis_array.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 121;BA.debugLine="For i=0 To jenis_array.Size -1";
Debug.ShouldStop(16777216);
{
final int step40 = 1;
final int limit40 = RemoteObject.solve(new RemoteObject[] {_jenis_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40); _i = ((int)(0 + _i + step40)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 122;BA.debugLine="Dim m As Map";
Debug.ShouldStop(33554432);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 123;BA.debugLine="m = jenis_array.Get(i)";
Debug.ShouldStop(67108864);
_m.setObject(_jenis_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 124;BA.debugLine="Dim b As daftarpaket_lines";
Debug.ShouldStop(134217728);
_b = RemoteObject.createNew ("b4a.example.pencarian_nama._daftarpaket_lines");Debug.locals.put("b", _b);
 BA.debugLineNum = 125;BA.debugLine="b.Initialize";
Debug.ShouldStop(268435456);
_b.runVoidMethod ("Initialize");
 BA.debugLineNum = 126;BA.debugLine="b.id = m.Get(\"id\")";
Debug.ShouldStop(536870912);
_b.setField ("id",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 127;BA.debugLine="b.name = m.Get(\"name\")";
Debug.ShouldStop(1073741824);
_b.setField ("name",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 128;BA.debugLine="b.price= m.Get(\"price\")";
Debug.ShouldStop(-2147483648);
_b.setField ("price",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("price"))))));
 BA.debugLineNum = 129;BA.debugLine="ListView1.AddSingleLine2(b.name,b)";
Debug.ShouldStop(1);
pencarian_des.mostCurrent._listview1.runVoidMethod ("AddSingleLine2",(Object)(_b.getField(true,"name")),(Object)((_b)));
 }
}Debug.locals.put("i", _i);
;
 };
 break; }
}
;
 };
 BA.debugLineNum = 135;BA.debugLine="Job.Release";
Debug.ShouldStop(64);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 136;BA.debugLine="End Sub";
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
public static RemoteObject  _listview1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView1_ItemClick (pencarian_des) ","pencarian_des",7,pencarian_des.mostCurrent.activityBA,pencarian_des.mostCurrent,139);
if (RapidSub.canDelegate("listview1_itemclick")) return pencarian_des.remoteMe.runUserSub(false, "pencarian_des","listview1_itemclick", _position, _value);
RemoteObject _b = RemoteObject.declareNull("b4a.example.pencarian_nama._daftarpaket_lines");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 139;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 140;BA.debugLine="Dim b As daftarpaket_lines";
Debug.ShouldStop(2048);
_b = RemoteObject.createNew ("b4a.example.pencarian_nama._daftarpaket_lines");Debug.locals.put("b", _b);
 BA.debugLineNum = 141;BA.debugLine="b=Value";
Debug.ShouldStop(4096);
_b = (_value);Debug.locals.put("b", _b);
 BA.debugLineNum = 142;BA.debugLine="id =b.id";
Debug.ShouldStop(8192);
pencarian_des._id = _b.getField(true,"id");
 BA.debugLineNum = 143;BA.debugLine="name = b.name";
Debug.ShouldStop(16384);
pencarian_des._name = _b.getField(true,"name");
 BA.debugLineNum = 144;BA.debugLine="price = b.price";
Debug.ShouldStop(32768);
pencarian_des._price = BA.numberCast(int.class, _b.getField(true,"price"));
 BA.debugLineNum = 145;BA.debugLine="StartActivity(info_des)";
Debug.ShouldStop(65536);
pencarian_des.mostCurrent.__c.runVoidMethod ("StartActivity",pencarian_des.mostCurrent.activityBA,(Object)((pencarian_des.mostCurrent._info_des.getObject())));
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
 //BA.debugLineNum = 10;BA.debugLine="Dim KEC= \"KEC\" As String";
pencarian_des._kec = BA.ObjectToString("KEC");
 //BA.debugLineNum = 11;BA.debugLine="Dim kategori_daftar As Map";
pencarian_des._kategori_daftar = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 12;BA.debugLine="Dim id_tempat_list As Map";
pencarian_des._id_tempat_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 14;BA.debugLine="Dim id_kec, nama_kec As String";
pencarian_des._id_kec = RemoteObject.createImmutable("");
pencarian_des._nama_kec = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Dim id_objek, nama_objek As String";
pencarian_des._id_objek = RemoteObject.createImmutable("");
pencarian_des._nama_objek = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Dim id_tempat, nama_tempat As String";
pencarian_des._id_tempat = RemoteObject.createImmutable("");
pencarian_des._nama_tempat = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="Dim id As String";
pencarian_des._id = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="Dim name As String";
pencarian_des._name = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Dim price As Int";
pencarian_des._price = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 20;BA.debugLine="Type kec_lines (isi1 As String,isi2 As String,isi";
;
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _spinner1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner1_ItemClick (pencarian_des) ","pencarian_des",7,pencarian_des.mostCurrent.activityBA,pencarian_des.mostCurrent,150);
if (RapidSub.canDelegate("spinner1_itemclick")) return pencarian_des.remoteMe.runUserSub(false, "pencarian_des","spinner1_itemclick", _position, _value);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 150;BA.debugLine="Sub Spinner1_ItemClick (Position As Int, Value As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="id_kec= kategori_daftar.Get(Value) 'mendapatkan i";
Debug.ShouldStop(4194304);
pencarian_des._id_kec = BA.ObjectToString(pencarian_des._kategori_daftar.runMethod(false,"Get",(Object)(_value)));
 BA.debugLineNum = 152;BA.debugLine="Log(id_kec)";
Debug.ShouldStop(8388608);
pencarian_des.mostCurrent.__c.runVoidMethod ("Log",(Object)(pencarian_des._id_kec));
 BA.debugLineNum = 155;BA.debugLine="Spinner2.Clear";
Debug.ShouldStop(67108864);
pencarian_des.mostCurrent._spinner2.runVoidMethod ("Clear");
 BA.debugLineNum = 156;BA.debugLine="Spinner2.Add(\"Souvenir\")";
Debug.ShouldStop(134217728);
pencarian_des.mostCurrent._spinner2.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Souvenir")));
 BA.debugLineNum = 157;BA.debugLine="Spinner2.Add(\"Tourism\")";
Debug.ShouldStop(268435456);
pencarian_des.mostCurrent._spinner2.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Tourism")));
 BA.debugLineNum = 158;BA.debugLine="Spinner2.Add(\"Restaurant\")";
Debug.ShouldStop(536870912);
pencarian_des.mostCurrent._spinner2.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Restaurant")));
 BA.debugLineNum = 159;BA.debugLine="Spinner2.Add(\"Mosque\")";
Debug.ShouldStop(1073741824);
pencarian_des.mostCurrent._spinner2.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Mosque")));
 BA.debugLineNum = 160;BA.debugLine="Spinner2.Add(\"Hotel\")";
Debug.ShouldStop(-2147483648);
pencarian_des.mostCurrent._spinner2.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Hotel")));
 BA.debugLineNum = 161;BA.debugLine="kategori_daftar.Put(\"Souvenir\",1)";
Debug.ShouldStop(1);
pencarian_des._kategori_daftar.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Souvenir"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 162;BA.debugLine="kategori_daftar.Put(\"Tourism\",2)";
Debug.ShouldStop(2);
pencarian_des._kategori_daftar.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Tourism"))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 163;BA.debugLine="kategori_daftar.Put(\"Restaurant\",3)";
Debug.ShouldStop(4);
pencarian_des._kategori_daftar.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Restaurant"))),(Object)(RemoteObject.createImmutable((3))));
 BA.debugLineNum = 164;BA.debugLine="kategori_daftar.Put(\"Mosque\",4)";
Debug.ShouldStop(8);
pencarian_des._kategori_daftar.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Mosque"))),(Object)(RemoteObject.createImmutable((4))));
 BA.debugLineNum = 165;BA.debugLine="kategori_daftar.Put(\"Hotel\",5)";
Debug.ShouldStop(16);
pencarian_des._kategori_daftar.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Hotel"))),(Object)(RemoteObject.createImmutable((5))));
 BA.debugLineNum = 167;BA.debugLine="End Sub";
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
public static RemoteObject  _spinner2_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner2_ItemClick (pencarian_des) ","pencarian_des",7,pencarian_des.mostCurrent.activityBA,pencarian_des.mostCurrent,169);
if (RapidSub.canDelegate("spinner2_itemclick")) return pencarian_des.remoteMe.runUserSub(false, "pencarian_des","spinner2_itemclick", _position, _value);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 169;BA.debugLine="Sub Spinner2_ItemClick (Position As Int, Value As";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="id_objek= kategori_daftar.Get(Value)";
Debug.ShouldStop(512);
pencarian_des._id_objek = BA.ObjectToString(pencarian_des._kategori_daftar.runMethod(false,"Get",(Object)(_value)));
 BA.debugLineNum = 171;BA.debugLine="Log(id_objek)";
Debug.ShouldStop(1024);
pencarian_des.mostCurrent.__c.runVoidMethod ("Log",(Object)(pencarian_des._id_objek));
 BA.debugLineNum = 172;BA.debugLine="If id_objek ==1 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",pencarian_des._id_objek,BA.NumberToString(1))) { 
 BA.debugLineNum = 173;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
Debug.ShouldStop(4096);
pencarian_des.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",pencarian_des.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Loading ....")));
 BA.debugLineNum = 174;BA.debugLine="ExecuteRemoteQuery(\"Select souvenir.id, souvenir.";
Debug.ShouldStop(8192);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("Select souvenir.id, souvenir.name, district.id as id_kec from souvenir, district where st_contains(district.geom1, souvenir.geom) and district.id='"),pencarian_des._id_kec,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("objek"));
 }else 
{ BA.debugLineNum = 176;BA.debugLine="Else if id_objek ==2 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",pencarian_des._id_objek,BA.NumberToString(2))) { 
 BA.debugLineNum = 177;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
Debug.ShouldStop(65536);
pencarian_des.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",pencarian_des.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Loading ....")));
 BA.debugLineNum = 178;BA.debugLine="ExecuteRemoteQuery(\"Select tourism.id, tourism.na";
Debug.ShouldStop(131072);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("Select tourism.id, tourism.name, district.id as id_kec from tourism, district where st_contains(district.geom1, tourism.geom) and district.id='"),pencarian_des._id_kec,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("objek"));
 }else 
{ BA.debugLineNum = 180;BA.debugLine="Else if id_objek ==3 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",pencarian_des._id_objek,BA.NumberToString(3))) { 
 BA.debugLineNum = 181;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
Debug.ShouldStop(1048576);
pencarian_des.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",pencarian_des.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Loading ....")));
 BA.debugLineNum = 182;BA.debugLine="ExecuteRemoteQuery(\"Select restaurant.id, restaur";
Debug.ShouldStop(2097152);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("Select restaurant.id, restaurant.name, district.id as id_kec from restaurant, district where st_contains(district.geom1, restaurant.geom) and district.id='"),pencarian_des._id_kec,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("objek"));
 }else 
{ BA.debugLineNum = 184;BA.debugLine="Else If id_objek ==4 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",pencarian_des._id_objek,BA.NumberToString(4))) { 
 BA.debugLineNum = 185;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
Debug.ShouldStop(16777216);
pencarian_des.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",pencarian_des.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Loading ....")));
 BA.debugLineNum = 186;BA.debugLine="ExecuteRemoteQuery(\"Select workship_place.id, wor";
Debug.ShouldStop(33554432);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("Select workship_place.id, workship_place.name, district.id as id_kec from workship_place, district where st_contains(district.geom1, workship_place.geom) and district.id='"),pencarian_des._id_kec,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("objek"));
 }else 
{ BA.debugLineNum = 188;BA.debugLine="Else If id_objek ==5 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",pencarian_des._id_objek,BA.NumberToString(5))) { 
 BA.debugLineNum = 189;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
Debug.ShouldStop(268435456);
pencarian_des.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",pencarian_des.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Loading ....")));
 BA.debugLineNum = 190;BA.debugLine="ExecuteRemoteQuery(\"Select hotel.id, hotel.name,";
Debug.ShouldStop(536870912);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("Select hotel.id, hotel.name, district.id as id_kec from hotel, district where st_contains(district.geom1, hotel.geom) and district.id='"),pencarian_des._id_kec,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("objek"));
 }}}}};
 BA.debugLineNum = 193;BA.debugLine="End Sub";
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
public static RemoteObject  _spinner3_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner3_ItemClick (pencarian_des) ","pencarian_des",7,pencarian_des.mostCurrent.activityBA,pencarian_des.mostCurrent,195);
if (RapidSub.canDelegate("spinner3_itemclick")) return pencarian_des.remoteMe.runUserSub(false, "pencarian_des","spinner3_itemclick", _position, _value);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 195;BA.debugLine="Sub Spinner3_ItemClick (Position As Int, Value As";
Debug.ShouldStop(4);
 BA.debugLineNum = 196;BA.debugLine="id_tempat= id_tempat_list.Get(Value)";
Debug.ShouldStop(8);
pencarian_des._id_tempat = BA.ObjectToString(pencarian_des._id_tempat_list.runMethod(false,"Get",(Object)(_value)));
 BA.debugLineNum = 197;BA.debugLine="Log(id_tempat)";
Debug.ShouldStop(16);
pencarian_des.mostCurrent.__c.runVoidMethod ("Log",(Object)(pencarian_des._id_tempat));
 BA.debugLineNum = 199;BA.debugLine="Log(\"select package.id,package.name from package";
Debug.ShouldStop(64);
pencarian_des.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("select package.id,package.name from package left join  object_point on object_point.id_package = package.id where object_point.id_souvenir='"),pencarian_des._id_tempat,RemoteObject.createImmutable("'"))));
 BA.debugLineNum = 200;BA.debugLine="If id_objek ==1 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",pencarian_des._id_objek,BA.NumberToString(1))) { 
 BA.debugLineNum = 201;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
Debug.ShouldStop(256);
pencarian_des.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",pencarian_des.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Loading ....")));
 BA.debugLineNum = 202;BA.debugLine="ExecuteRemoteQuery(\"select package.id,package.nam";
Debug.ShouldStop(512);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("select package.id,package.name, package.price from package left join  object_point on object_point.id_package = package.id where object_point.id_souvenir='"),pencarian_des._id_tempat,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("paket"));
 }else 
{ BA.debugLineNum = 204;BA.debugLine="Else if id_objek ==2 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",pencarian_des._id_objek,BA.NumberToString(2))) { 
 BA.debugLineNum = 205;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
Debug.ShouldStop(4096);
pencarian_des.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",pencarian_des.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Loading ....")));
 BA.debugLineNum = 206;BA.debugLine="ExecuteRemoteQuery(\"select package.id,package.nam";
Debug.ShouldStop(8192);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("select package.id,package.name, package.price from package left join  object_point on object_point.id_package = package.id where object_point.id_tourism='"),pencarian_des._id_tempat,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("paket"));
 }else 
{ BA.debugLineNum = 208;BA.debugLine="Else if id_objek ==3 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",pencarian_des._id_objek,BA.NumberToString(3))) { 
 BA.debugLineNum = 209;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
Debug.ShouldStop(65536);
pencarian_des.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",pencarian_des.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Loading ....")));
 BA.debugLineNum = 210;BA.debugLine="ExecuteRemoteQuery(\"select package.id,package.nam";
Debug.ShouldStop(131072);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("select package.id,package.name, package.price from package left join  object_point on object_point.id_package = package.id where object_point.id_restaurant='"),pencarian_des._id_tempat,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("paket"));
 }else 
{ BA.debugLineNum = 212;BA.debugLine="Else If id_objek ==4 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",pencarian_des._id_objek,BA.NumberToString(4))) { 
 BA.debugLineNum = 213;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
Debug.ShouldStop(1048576);
pencarian_des.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",pencarian_des.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Loading ....")));
 BA.debugLineNum = 214;BA.debugLine="ExecuteRemoteQuery(\"select package.id,package.nam";
Debug.ShouldStop(2097152);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("select package.id,package.name, package.price from package left join  object_point on object_point.id_package = package.id where object_point.id_worship_place='"),pencarian_des._id_tempat,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("paket"));
 }else 
{ BA.debugLineNum = 216;BA.debugLine="Else If id_objek ==5 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",pencarian_des._id_objek,BA.NumberToString(5))) { 
 BA.debugLineNum = 217;BA.debugLine="ProgressDialogShow(\"Loading ....\")";
Debug.ShouldStop(16777216);
pencarian_des.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",pencarian_des.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Loading ....")));
 BA.debugLineNum = 218;BA.debugLine="ExecuteRemoteQuery(\"select package.id,package.nam";
Debug.ShouldStop(33554432);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("select package.id,package.name, package.price from package left join  object_point on object_point.id_package = package.id where object_point.id_hotel='"),pencarian_des._id_tempat,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("paket"));
 }}}}};
 BA.debugLineNum = 221;BA.debugLine="End Sub";
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
}