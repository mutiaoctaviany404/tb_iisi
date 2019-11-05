package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pencarian_nama_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (pencarian_nama) ","pencarian_nama",8,pencarian_nama.mostCurrent.activityBA,pencarian_nama.mostCurrent,25);
if (RapidSub.canDelegate("activity_create")) return pencarian_nama.remoteMe.runUserSub(false, "pencarian_nama","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="Activity.LoadLayout(\"pencarian_nama\")";
Debug.ShouldStop(67108864);
pencarian_nama.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("pencarian_nama")),pencarian_nama.mostCurrent.activityBA);
 BA.debugLineNum = 28;BA.debugLine="ListView1.SingleLineLayout.Label.TextColor=Colors";
Debug.ShouldStop(134217728);
pencarian_nama.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",pencarian_nama.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 39)),(Object)(BA.numberCast(int.class, 39))));
 BA.debugLineNum = 29;BA.debugLine="ListView1.SingleLineLayout.Label.TextSize=16";
Debug.ShouldStop(268435456);
pencarian_nama.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 30;BA.debugLine="ListView1.SingleLineLayout.Label.Left=2%y";
Debug.ShouldStop(536870912);
pencarian_nama.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setLeft",pencarian_nama.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),pencarian_nama.mostCurrent.activityBA));
 BA.debugLineNum = 32;BA.debugLine="EditText1.Color=Colors.RGB(252, 206, 84)";
Debug.ShouldStop(-2147483648);
pencarian_nama.mostCurrent._edittext1.runVoidMethod ("setColor",pencarian_nama.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 252)),(Object)(BA.numberCast(int.class, 206)),(Object)(BA.numberCast(int.class, 84))));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (pencarian_nama) ","pencarian_nama",8,pencarian_nama.mostCurrent.activityBA,pencarian_nama.mostCurrent,45);
if (RapidSub.canDelegate("activity_pause")) return pencarian_nama.remoteMe.runUserSub(false, "pencarian_nama","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (pencarian_nama) ","pencarian_nama",8,pencarian_nama.mostCurrent.activityBA,pencarian_nama.mostCurrent,35);
if (RapidSub.canDelegate("activity_resume")) return pencarian_nama.remoteMe.runUserSub(false, "pencarian_nama","activity_resume");
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(8);
pencarian_nama.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 37;BA.debugLine="EditText1.Text=\"\"";
Debug.ShouldStop(16);
pencarian_nama.mostCurrent._edittext1.runMethodAndSync(true,"setText",RemoteObject.createImmutable(("")));
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
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (pencarian_nama) ","pencarian_nama",8,pencarian_nama.mostCurrent.activityBA,pencarian_nama.mostCurrent,101);
if (RapidSub.canDelegate("button1_click")) return pencarian_nama.remoteMe.runUserSub(false, "pencarian_nama","button1_click");
 BA.debugLineNum = 101;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(32);
pencarian_nama.mostCurrent.__c.runVoidMethod ("StartActivity",pencarian_nama.mostCurrent.activityBA,(Object)((pencarian_nama.mostCurrent._main.getObject())));
 BA.debugLineNum = 103;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Button2_Click (pencarian_nama) ","pencarian_nama",8,pencarian_nama.mostCurrent.activityBA,pencarian_nama.mostCurrent,105);
if (RapidSub.canDelegate("button2_click")) return pencarian_nama.remoteMe.runUserSub(false, "pencarian_nama","button2_click");
 BA.debugLineNum = 105;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="StartActivity(pencarian_travel)";
Debug.ShouldStop(512);
pencarian_nama.mostCurrent.__c.runVoidMethod ("StartActivity",pencarian_nama.mostCurrent.activityBA,(Object)((pencarian_nama.mostCurrent._pencarian_travel.getObject())));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Button3_Click (pencarian_nama) ","pencarian_nama",8,pencarian_nama.mostCurrent.activityBA,pencarian_nama.mostCurrent,109);
if (RapidSub.canDelegate("button3_click")) return pencarian_nama.remoteMe.runUserSub(false, "pencarian_nama","button3_click");
 BA.debugLineNum = 109;BA.debugLine="Sub Button3_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 111;BA.debugLine="End Sub";
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
public static RemoteObject  _button4_click() throws Exception{
try {
		Debug.PushSubsStack("Button4_Click (pencarian_nama) ","pencarian_nama",8,pencarian_nama.mostCurrent.activityBA,pencarian_nama.mostCurrent,113);
if (RapidSub.canDelegate("button4_click")) return pencarian_nama.remoteMe.runUserSub(false, "pencarian_nama","button4_click");
 BA.debugLineNum = 113;BA.debugLine="Sub Button4_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="StartActivity(pencarian_des)";
Debug.ShouldStop(131072);
pencarian_nama.mostCurrent.__c.runVoidMethod ("StartActivity",pencarian_nama.mostCurrent.activityBA,(Object)((pencarian_nama.mostCurrent._pencarian_des.getObject())));
 BA.debugLineNum = 115;BA.debugLine="End Sub";
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
public static RemoteObject  _edittext1_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("EditText1_EnterPressed (pencarian_nama) ","pencarian_nama",8,pencarian_nama.mostCurrent.activityBA,pencarian_nama.mostCurrent,83);
if (RapidSub.canDelegate("edittext1_enterpressed")) return pencarian_nama.remoteMe.runUserSub(false, "pencarian_nama","edittext1_enterpressed");
 BA.debugLineNum = 83;BA.debugLine="Sub EditText1_EnterPressed";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(524288);
pencarian_nama.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 85;BA.debugLine="inputnama1 = EditText1.Text";
Debug.ShouldStop(1048576);
pencarian_nama._inputnama1 = pencarian_nama.mostCurrent._edittext1.runMethod(true,"getText");
 BA.debugLineNum = 87;BA.debugLine="Log(inputnama1)";
Debug.ShouldStop(4194304);
pencarian_nama.mostCurrent.__c.runVoidMethod ("Log",(Object)(pencarian_nama._inputnama1));
 BA.debugLineNum = 88;BA.debugLine="paketnama";
Debug.ShouldStop(8388608);
_paketnama();
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
		Debug.PushSubsStack("ExecuteRemoteQuery (pencarian_nama) ","pencarian_nama",8,pencarian_nama.mostCurrent.activityBA,pencarian_nama.mostCurrent,49);
if (RapidSub.canDelegate("executeremotequery")) return pencarian_nama.remoteMe.runUserSub(false, "pencarian_nama","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 49;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(131072);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 51;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(262144);
_job.runVoidMethod ("_initialize",pencarian_nama.processBA,(Object)(_jobname),(Object)(pencarian_nama.getObject()));
 BA.debugLineNum = 52;BA.debugLine="Job.PostString(\"\"&Main.Server&\"json.php\",Query)";
Debug.ShouldStop(524288);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),pencarian_nama.mostCurrent._main._server,RemoteObject.createImmutable("json.php"))),(Object)(_query));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 21;BA.debugLine="Private EditText1 As EditText";
pencarian_nama.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ListView1 As ListView";
pencarian_nama.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (pencarian_nama) ","pencarian_nama",8,pencarian_nama.mostCurrent.activityBA,pencarian_nama.mostCurrent,55);
if (RapidSub.canDelegate("jobdone")) return pencarian_nama.remoteMe.runUserSub(false, "pencarian_nama","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _paket_nama_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _b = RemoteObject.declareNull("b4a.example.pencarian_nama._daftarpaket_lines");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 55;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8388608);
pencarian_nama.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 57;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(16777216);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 58;BA.debugLine="Dim res As String";
Debug.ShouldStop(33554432);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 59;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(67108864);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 60;BA.debugLine="Log(\"Response jobdone carinama :\"& res)";
Debug.ShouldStop(134217728);
pencarian_nama.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response jobdone carinama :"),_res)));
 BA.debugLineNum = 61;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(268435456);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 62;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(536870912);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 63;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(1073741824);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),pencarian_nama._paket_nama)) {
case 0: {
 BA.debugLineNum = 65;BA.debugLine="Dim paket_nama_array As List";
Debug.ShouldStop(1);
_paket_nama_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("paket_nama_array", _paket_nama_array);
 BA.debugLineNum = 66;BA.debugLine="paket_nama_array = parser.NextArray";
Debug.ShouldStop(2);
_paket_nama_array = _parser.runMethod(false,"NextArray");Debug.locals.put("paket_nama_array", _paket_nama_array);
 BA.debugLineNum = 67;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(4);
pencarian_nama.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 68;BA.debugLine="For i=0 To paket_nama_array.Size -1";
Debug.ShouldStop(8);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {_paket_nama_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13); _i = ((int)(0 + _i + step13)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 69;BA.debugLine="Dim m As Map";
Debug.ShouldStop(16);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 70;BA.debugLine="m = paket_nama_array.Get(i)";
Debug.ShouldStop(32);
_m.setObject(_paket_nama_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 71;BA.debugLine="Dim b As daftarpaket_lines";
Debug.ShouldStop(64);
_b = RemoteObject.createNew ("b4a.example.pencarian_nama._daftarpaket_lines");Debug.locals.put("b", _b);
 BA.debugLineNum = 72;BA.debugLine="b.Initialize";
Debug.ShouldStop(128);
_b.runVoidMethod ("Initialize");
 BA.debugLineNum = 73;BA.debugLine="b.id = m.Get(\"id\")";
Debug.ShouldStop(256);
_b.setField ("id",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 74;BA.debugLine="b.name = m.Get(\"name\")";
Debug.ShouldStop(512);
_b.setField ("name",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 75;BA.debugLine="b.price = m.Get(\"price\")";
Debug.ShouldStop(1024);
_b.setField ("price",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("price"))))));
 BA.debugLineNum = 76;BA.debugLine="ListView1.AddSingleLine2(b.name,b)";
Debug.ShouldStop(2048);
pencarian_nama.mostCurrent._listview1.runVoidMethod ("AddSingleLine2",(Object)(_b.getField(true,"name")),(Object)((_b)));
 }
}Debug.locals.put("i", _i);
;
 break; }
}
;
 };
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
public static RemoteObject  _listview1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView1_ItemClick (pencarian_nama) ","pencarian_nama",8,pencarian_nama.mostCurrent.activityBA,pencarian_nama.mostCurrent,92);
if (RapidSub.canDelegate("listview1_itemclick")) return pencarian_nama.remoteMe.runUserSub(false, "pencarian_nama","listview1_itemclick", _position, _value);
RemoteObject _b = RemoteObject.declareNull("b4a.example.pencarian_nama._daftarpaket_lines");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 92;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="Dim b As daftarpaket_lines";
Debug.ShouldStop(268435456);
_b = RemoteObject.createNew ("b4a.example.pencarian_nama._daftarpaket_lines");Debug.locals.put("b", _b);
 BA.debugLineNum = 94;BA.debugLine="b=Value";
Debug.ShouldStop(536870912);
_b = (_value);Debug.locals.put("b", _b);
 BA.debugLineNum = 95;BA.debugLine="id=b.id";
Debug.ShouldStop(1073741824);
pencarian_nama._id = _b.getField(true,"id");
 BA.debugLineNum = 96;BA.debugLine="name=b.name";
Debug.ShouldStop(-2147483648);
pencarian_nama._name = _b.getField(true,"name");
 BA.debugLineNum = 97;BA.debugLine="price=b.price";
Debug.ShouldStop(1);
pencarian_nama._price = BA.numberCast(int.class, _b.getField(true,"price"));
 BA.debugLineNum = 98;BA.debugLine="StartActivity(info_utama)";
Debug.ShouldStop(2);
pencarian_nama.mostCurrent.__c.runVoidMethod ("StartActivity",pencarian_nama.mostCurrent.activityBA,(Object)((pencarian_nama.mostCurrent._info_utama.getObject())));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
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
public static RemoteObject  _paketnama() throws Exception{
try {
		Debug.PushSubsStack("paketnama (pencarian_nama) ","pencarian_nama",8,pencarian_nama.mostCurrent.activityBA,pencarian_nama.mostCurrent,40);
if (RapidSub.canDelegate("paketnama")) return pencarian_nama.remoteMe.runUserSub(false, "pencarian_nama","paketnama");
 BA.debugLineNum = 40;BA.debugLine="Sub	paketnama";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(256);
pencarian_nama.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",pencarian_nama.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Loading...")));
 BA.debugLineNum = 42;BA.debugLine="ExecuteRemoteQuery(\"SELECT id, name, price from p";
Debug.ShouldStop(512);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT id, name, price from package where lower(name) like lower('%"),pencarian_nama._inputnama1,RemoteObject.createImmutable("%')")),RemoteObject.createImmutable("paket_nama"));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private inputnama1 = \"inputnama1\" As String";
pencarian_nama._inputnama1 = BA.ObjectToString("inputnama1");
 //BA.debugLineNum = 10;BA.debugLine="Private paket_nama = \"paket_nama\" As String";
pencarian_nama._paket_nama = BA.ObjectToString("paket_nama");
 //BA.debugLineNum = 11;BA.debugLine="Dim id As String";
pencarian_nama._id = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim name As String";
pencarian_nama._name = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim price As Int";
pencarian_nama._price = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 14;BA.debugLine="Type daftarpaket_lines (id As String, name As Str";
;
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}