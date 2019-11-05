package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pencarian_travel_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (pencarian_travel) ","pencarian_travel",3,pencarian_travel.mostCurrent.activityBA,pencarian_travel.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) return pencarian_travel.remoteMe.runUserSub(false, "pencarian_travel","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="Activity.LoadLayout(\"pencarian_travel\")";
Debug.ShouldStop(-2147483648);
pencarian_travel.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("pencarian_travel")),pencarian_travel.mostCurrent.activityBA);
 BA.debugLineNum = 33;BA.debugLine="ListView1.SingleLineLayout.Label.TextColor=Colors";
Debug.ShouldStop(1);
pencarian_travel.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",pencarian_travel.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 39)),(Object)(BA.numberCast(int.class, 39))));
 BA.debugLineNum = 34;BA.debugLine="ListView1.SingleLineLayout.Label.TextSize=16";
Debug.ShouldStop(2);
pencarian_travel.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 35;BA.debugLine="ListView1.SingleLineLayout.Label.Left=2%y";
Debug.ShouldStop(4);
pencarian_travel.mostCurrent._listview1.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setLeft",pencarian_travel.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),pencarian_travel.mostCurrent.activityBA));
 BA.debugLineNum = 36;BA.debugLine="ListView2.SingleLineLayout.Label.TextColor=Colors";
Debug.ShouldStop(8);
pencarian_travel.mostCurrent._listview2.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextColor",pencarian_travel.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 72)),(Object)(BA.numberCast(int.class, 39)),(Object)(BA.numberCast(int.class, 39))));
 BA.debugLineNum = 37;BA.debugLine="ListView2.SingleLineLayout.Label.TextSize=16";
Debug.ShouldStop(16);
pencarian_travel.mostCurrent._listview2.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 38;BA.debugLine="ListView2.SingleLineLayout.Label.Left=2%y";
Debug.ShouldStop(32);
pencarian_travel.mostCurrent._listview2.runMethod(false,"getSingleLineLayout").getField(false,"Label").runMethod(true,"setLeft",pencarian_travel.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),pencarian_travel.mostCurrent.activityBA));
 BA.debugLineNum = 40;BA.debugLine="EditText1.Color=Colors.RGB(252, 206, 84)";
Debug.ShouldStop(128);
pencarian_travel.mostCurrent._edittext1.runVoidMethod ("setColor",pencarian_travel.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 252)),(Object)(BA.numberCast(int.class, 206)),(Object)(BA.numberCast(int.class, 84))));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (pencarian_travel) ","pencarian_travel",3,pencarian_travel.mostCurrent.activityBA,pencarian_travel.mostCurrent,59);
if (RapidSub.canDelegate("activity_pause")) return pencarian_travel.remoteMe.runUserSub(false, "pencarian_travel","activity_pause", _userclosed);
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
		Debug.PushSubsStack("Activity_Resume (pencarian_travel) ","pencarian_travel",3,pencarian_travel.mostCurrent.activityBA,pencarian_travel.mostCurrent,43);
if (RapidSub.canDelegate("activity_resume")) return pencarian_travel.remoteMe.runUserSub(false, "pencarian_travel","activity_resume");
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(2048);
pencarian_travel.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 45;BA.debugLine="EditText1.Text=\"\"";
Debug.ShouldStop(4096);
pencarian_travel.mostCurrent._edittext1.runMethodAndSync(true,"setText",RemoteObject.createImmutable(("")));
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
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (pencarian_travel) ","pencarian_travel",3,pencarian_travel.mostCurrent.activityBA,pencarian_travel.mostCurrent,134);
if (RapidSub.canDelegate("button1_click")) return pencarian_travel.remoteMe.runUserSub(false, "pencarian_travel","button1_click");
 BA.debugLineNum = 134;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(64);
pencarian_travel.mostCurrent.__c.runVoidMethod ("StartActivity",pencarian_travel.mostCurrent.activityBA,(Object)((pencarian_travel.mostCurrent._main.getObject())));
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
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (pencarian_travel) ","pencarian_travel",3,pencarian_travel.mostCurrent.activityBA,pencarian_travel.mostCurrent,138);
if (RapidSub.canDelegate("button2_click")) return pencarian_travel.remoteMe.runUserSub(false, "pencarian_travel","button2_click");
 BA.debugLineNum = 138;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 140;BA.debugLine="End Sub";
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
public static RemoteObject  _button3_click() throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (pencarian_travel) ","pencarian_travel",3,pencarian_travel.mostCurrent.activityBA,pencarian_travel.mostCurrent,142);
if (RapidSub.canDelegate("button3_click")) return pencarian_travel.remoteMe.runUserSub(false, "pencarian_travel","button3_click");
 BA.debugLineNum = 142;BA.debugLine="Sub Button3_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="StartActivity(pencarian_nama)";
Debug.ShouldStop(16384);
pencarian_travel.mostCurrent.__c.runVoidMethod ("StartActivity",pencarian_travel.mostCurrent.activityBA,(Object)((pencarian_travel.mostCurrent._pencarian_nama.getObject())));
 BA.debugLineNum = 144;BA.debugLine="End Sub";
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
public static RemoteObject  _button4_click() throws Exception{
try {
		Debug.PushSubsStack("Button4_Click (pencarian_travel) ","pencarian_travel",3,pencarian_travel.mostCurrent.activityBA,pencarian_travel.mostCurrent,146);
if (RapidSub.canDelegate("button4_click")) return pencarian_travel.remoteMe.runUserSub(false, "pencarian_travel","button4_click");
 BA.debugLineNum = 146;BA.debugLine="Sub Button4_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="StartActivity(pencarian_des)";
Debug.ShouldStop(262144);
pencarian_travel.mostCurrent.__c.runVoidMethod ("StartActivity",pencarian_travel.mostCurrent.activityBA,(Object)((pencarian_travel.mostCurrent._pencarian_des.getObject())));
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
public static RemoteObject  _edittext1_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("EditText1_EnterPressed (pencarian_travel) ","pencarian_travel",3,pencarian_travel.mostCurrent.activityBA,pencarian_travel.mostCurrent,110);
if (RapidSub.canDelegate("edittext1_enterpressed")) return pencarian_travel.remoteMe.runUserSub(false, "pencarian_travel","edittext1_enterpressed");
 BA.debugLineNum = 110;BA.debugLine="Sub EditText1_EnterPressed";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(16384);
pencarian_travel.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 112;BA.debugLine="inputnama2 = EditText1.Text";
Debug.ShouldStop(32768);
pencarian_travel._inputnama2 = pencarian_travel.mostCurrent._edittext1.runMethod(true,"getText");
 BA.debugLineNum = 114;BA.debugLine="Log(inputnama2)";
Debug.ShouldStop(131072);
pencarian_travel.mostCurrent.__c.runVoidMethod ("Log",(Object)(pencarian_travel._inputnama2));
 BA.debugLineNum = 115;BA.debugLine="travelnama";
Debug.ShouldStop(262144);
_travelnama();
 BA.debugLineNum = 117;BA.debugLine="End Sub";
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
public static RemoteObject  _executeremotequery(RemoteObject _query,RemoteObject _jobname) throws Exception{
try {
		Debug.PushSubsStack("ExecuteRemoteQuery (pencarian_travel) ","pencarian_travel",3,pencarian_travel.mostCurrent.activityBA,pencarian_travel.mostCurrent,63);
if (RapidSub.canDelegate("executeremotequery")) return pencarian_travel.remoteMe.runUserSub(false, "pencarian_travel","executeremotequery", _query, _jobname);
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
_job.runVoidMethod ("_initialize",pencarian_travel.processBA,(Object)(_jobname),(Object)(pencarian_travel.getObject()));
 BA.debugLineNum = 66;BA.debugLine="Job.PostString(\"\"&Main.Server&\"json.php\",Query)";
Debug.ShouldStop(2);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),pencarian_travel.mostCurrent._main._server,RemoteObject.createImmutable("json.php"))),(Object)(_query));
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
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Private EditText1 As EditText";
pencarian_travel.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ListView1 As ListView";
pencarian_travel.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ListView2 As ListView";
pencarian_travel.mostCurrent._listview2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (pencarian_travel) ","pencarian_travel",3,pencarian_travel.mostCurrent.activityBA,pencarian_travel.mostCurrent,69);
if (RapidSub.canDelegate("jobdone")) return pencarian_travel.remoteMe.runUserSub(false, "pencarian_travel","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _travel_nama_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _b = RemoteObject.declareNull("b4a.example.pencarian_travel._daftartravel_lines");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 69;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(32);
pencarian_travel.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 71;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(64);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 72;BA.debugLine="Dim res As String";
Debug.ShouldStop(128);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 73;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(256);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 74;BA.debugLine="Log(\"Response jobdone carinama :\"& res)";
Debug.ShouldStop(512);
pencarian_travel.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response jobdone carinama :"),_res)));
 BA.debugLineNum = 75;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(1024);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 76;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(2048);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 77;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(4096);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),BA.ObjectToString("travel_nama"),BA.ObjectToString("paket_nama"))) {
case 0: {
 BA.debugLineNum = 79;BA.debugLine="Dim travel_nama_array As List";
Debug.ShouldStop(16384);
_travel_nama_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("travel_nama_array", _travel_nama_array);
 BA.debugLineNum = 80;BA.debugLine="travel_nama_array = parser.NextArray";
Debug.ShouldStop(32768);
_travel_nama_array = _parser.runMethod(false,"NextArray");Debug.locals.put("travel_nama_array", _travel_nama_array);
 BA.debugLineNum = 81;BA.debugLine="ListView1.Clear";
Debug.ShouldStop(65536);
pencarian_travel.mostCurrent._listview1.runVoidMethod ("Clear");
 BA.debugLineNum = 82;BA.debugLine="For i=0 To travel_nama_array.Size -1";
Debug.ShouldStop(131072);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {_travel_nama_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13); _i = ((int)(0 + _i + step13)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 83;BA.debugLine="Dim m As Map";
Debug.ShouldStop(262144);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 84;BA.debugLine="m = travel_nama_array.Get(i)";
Debug.ShouldStop(524288);
_m.setObject(_travel_nama_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 85;BA.debugLine="Dim b As daftartravel_lines";
Debug.ShouldStop(1048576);
_b = RemoteObject.createNew ("b4a.example.pencarian_travel._daftartravel_lines");Debug.locals.put("b", _b);
 BA.debugLineNum = 86;BA.debugLine="b.Initialize";
Debug.ShouldStop(2097152);
_b.runVoidMethod ("Initialize");
 BA.debugLineNum = 87;BA.debugLine="b.id = m.Get(\"id\")";
Debug.ShouldStop(4194304);
_b.setField ("id",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 88;BA.debugLine="b.nama= m.Get(\"name\")";
Debug.ShouldStop(8388608);
_b.setField ("nama",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 89;BA.debugLine="ListView1.AddSingleLine2(b.nama,b.id)";
Debug.ShouldStop(16777216);
pencarian_travel.mostCurrent._listview1.runVoidMethod ("AddSingleLine2",(Object)(_b.getField(true,"nama")),(Object)((_b.getField(true,"id"))));
 }
}Debug.locals.put("i", _i);
;
 break; }
case 1: {
 BA.debugLineNum = 92;BA.debugLine="Dim travel_nama_array As List";
Debug.ShouldStop(134217728);
_travel_nama_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("travel_nama_array", _travel_nama_array);
 BA.debugLineNum = 93;BA.debugLine="travel_nama_array = parser.NextArray";
Debug.ShouldStop(268435456);
_travel_nama_array = _parser.runMethod(false,"NextArray");Debug.locals.put("travel_nama_array", _travel_nama_array);
 BA.debugLineNum = 94;BA.debugLine="ListView2.Clear";
Debug.ShouldStop(536870912);
pencarian_travel.mostCurrent._listview2.runVoidMethod ("Clear");
 BA.debugLineNum = 95;BA.debugLine="For i=0 To travel_nama_array.Size -1";
Debug.ShouldStop(1073741824);
{
final int step26 = 1;
final int limit26 = RemoteObject.solve(new RemoteObject[] {_travel_nama_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26); _i = ((int)(0 + _i + step26)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 96;BA.debugLine="Dim m As Map";
Debug.ShouldStop(-2147483648);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 97;BA.debugLine="m = travel_nama_array.Get(i)";
Debug.ShouldStop(1);
_m.setObject(_travel_nama_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 98;BA.debugLine="Dim b As daftartravel_lines";
Debug.ShouldStop(2);
_b = RemoteObject.createNew ("b4a.example.pencarian_travel._daftartravel_lines");Debug.locals.put("b", _b);
 BA.debugLineNum = 99;BA.debugLine="b.Initialize";
Debug.ShouldStop(4);
_b.runVoidMethod ("Initialize");
 BA.debugLineNum = 100;BA.debugLine="b.id = m.Get(\"id\")";
Debug.ShouldStop(8);
_b.setField ("id",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 101;BA.debugLine="b.nama = m.Get(\"name\")";
Debug.ShouldStop(16);
_b.setField ("nama",BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 102;BA.debugLine="b.price = m.Get(\"price\")";
Debug.ShouldStop(32);
_b.setField ("price",BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("price"))))));
 BA.debugLineNum = 103;BA.debugLine="ListView2.AddSingleLine2(b.nama,b)";
Debug.ShouldStop(64);
pencarian_travel.mostCurrent._listview2.runVoidMethod ("AddSingleLine2",(Object)(_b.getField(true,"nama")),(Object)((_b)));
 }
}Debug.locals.put("i", _i);
;
 break; }
}
;
 };
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
public static RemoteObject  _listview1_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView1_ItemClick (pencarian_travel) ","pencarian_travel",3,pencarian_travel.mostCurrent.activityBA,pencarian_travel.mostCurrent,120);
if (RapidSub.canDelegate("listview1_itemclick")) return pencarian_travel.remoteMe.runUserSub(false, "pencarian_travel","listview1_itemclick", _position, _value);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 120;BA.debugLine="Sub ListView1_ItemClick (Position As Int, Value As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="id_travel=Value";
Debug.ShouldStop(16777216);
pencarian_travel._id_travel = BA.ObjectToString(_value);
 BA.debugLineNum = 122;BA.debugLine="paketnama";
Debug.ShouldStop(33554432);
_paketnama();
 BA.debugLineNum = 123;BA.debugLine="End Sub";
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
public static RemoteObject  _listview2_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListView2_ItemClick (pencarian_travel) ","pencarian_travel",3,pencarian_travel.mostCurrent.activityBA,pencarian_travel.mostCurrent,125);
if (RapidSub.canDelegate("listview2_itemclick")) return pencarian_travel.remoteMe.runUserSub(false, "pencarian_travel","listview2_itemclick", _position, _value);
RemoteObject _b = RemoteObject.declareNull("b4a.example.pencarian_travel._daftartravel_lines");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 125;BA.debugLine="Sub ListView2_ItemClick (Position As Int, Value As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="Dim b As daftartravel_lines";
Debug.ShouldStop(536870912);
_b = RemoteObject.createNew ("b4a.example.pencarian_travel._daftartravel_lines");Debug.locals.put("b", _b);
 BA.debugLineNum = 127;BA.debugLine="b=Value";
Debug.ShouldStop(1073741824);
_b = (_value);Debug.locals.put("b", _b);
 BA.debugLineNum = 128;BA.debugLine="id =b.id";
Debug.ShouldStop(-2147483648);
pencarian_travel._id = _b.getField(true,"id");
 BA.debugLineNum = 129;BA.debugLine="name = b.nama";
Debug.ShouldStop(1);
pencarian_travel._name = _b.getField(true,"nama");
 BA.debugLineNum = 130;BA.debugLine="price = b.price";
Debug.ShouldStop(2);
pencarian_travel._price = _b.getField(true,"price");
 BA.debugLineNum = 131;BA.debugLine="StartActivity(info_travel)";
Debug.ShouldStop(4);
pencarian_travel.mostCurrent.__c.runVoidMethod ("StartActivity",pencarian_travel.mostCurrent.activityBA,(Object)((pencarian_travel.mostCurrent._info_travel.getObject())));
 BA.debugLineNum = 132;BA.debugLine="End Sub";
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
public static RemoteObject  _paketnama() throws Exception{
try {
		Debug.PushSubsStack("paketnama (pencarian_travel) ","pencarian_travel",3,pencarian_travel.mostCurrent.activityBA,pencarian_travel.mostCurrent,53);
if (RapidSub.canDelegate("paketnama")) return pencarian_travel.remoteMe.runUserSub(false, "pencarian_travel","paketnama");
 BA.debugLineNum = 53;BA.debugLine="Sub	paketnama";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(2097152);
pencarian_travel.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",pencarian_travel.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Loading...")));
 BA.debugLineNum = 55;BA.debugLine="ExecuteRemoteQuery(\"SELECT id,name,price from pa";
Debug.ShouldStop(4194304);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT id,name,price from package where id_travel ='"),pencarian_travel._id_travel,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("paket_nama"));
 BA.debugLineNum = 56;BA.debugLine="Log(\"SELECT id,name,price from package where id_t";
Debug.ShouldStop(8388608);
pencarian_travel.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT id,name,price from package where id_travel ='"),pencarian_travel._id_travel,RemoteObject.createImmutable("'"))));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private inputnama2 = \"inputnama2\" As String";
pencarian_travel._inputnama2 = BA.ObjectToString("inputnama2");
 //BA.debugLineNum = 10;BA.debugLine="Dim nama_paket As String";
pencarian_travel._nama_paket = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim nama_travel As String";
pencarian_travel._nama_travel = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Dim id_package As String";
pencarian_travel._id_package = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim id_travel As String";
pencarian_travel._id_travel = RemoteObject.createImmutable("");
 //BA.debugLineNum = 14;BA.debugLine="Dim id As String";
pencarian_travel._id = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Dim name As String";
pencarian_travel._name = RemoteObject.createImmutable("");
 //BA.debugLineNum = 16;BA.debugLine="Dim price As Int";
pencarian_travel._price = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 17;BA.debugLine="Type daftartravel_lines (isitrav2 As String, id A";
;
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _travelnama() throws Exception{
try {
		Debug.PushSubsStack("travelnama (pencarian_travel) ","pencarian_travel",3,pencarian_travel.mostCurrent.activityBA,pencarian_travel.mostCurrent,48);
if (RapidSub.canDelegate("travelnama")) return pencarian_travel.remoteMe.runUserSub(false, "pencarian_travel","travelnama");
 BA.debugLineNum = 48;BA.debugLine="Sub	travelnama";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(65536);
pencarian_travel.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",pencarian_travel.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Loading...")));
 BA.debugLineNum = 50;BA.debugLine="ExecuteRemoteQuery(\"SELECT id,name from travel wh";
Debug.ShouldStop(131072);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT id,name from travel where lower(name) like lower('%"),pencarian_travel._inputnama2,RemoteObject.createImmutable("%')")),RemoteObject.createImmutable("travel_nama"));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
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
}