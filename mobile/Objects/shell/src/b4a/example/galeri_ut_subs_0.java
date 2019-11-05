package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class galeri_ut_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (galeri_ut) ","galeri_ut",2,galeri_ut.mostCurrent.activityBA,galeri_ut.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) return galeri_ut.remoteMe.runUserSub(false, "galeri_ut","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 28;BA.debugLine="Activity.LoadLayout(\"gallery\")";
Debug.ShouldStop(134217728);
galeri_ut.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("gallery")),galeri_ut.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="fotoquery";
Debug.ShouldStop(268435456);
_fotoquery();
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (galeri_ut) ","galeri_ut",2,galeri_ut.mostCurrent.activityBA,galeri_ut.mostCurrent,244);
if (RapidSub.canDelegate("activity_pause")) return galeri_ut.remoteMe.runUserSub(false, "galeri_ut","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 244;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 246;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (galeri_ut) ","galeri_ut",2,galeri_ut.mostCurrent.activityBA,galeri_ut.mostCurrent,240);
if (RapidSub.canDelegate("activity_resume")) return galeri_ut.remoteMe.runUserSub(false, "galeri_ut","activity_resume");
 BA.debugLineNum = 240;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32768);
 BA.debugLineNum = 242;BA.debugLine="End Sub";
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
public static RemoteObject  _executeremotequery(RemoteObject _query,RemoteObject _jobname) throws Exception{
try {
		Debug.PushSubsStack("ExecuteRemoteQuery (galeri_ut) ","galeri_ut",2,galeri_ut.mostCurrent.activityBA,galeri_ut.mostCurrent,42);
if (RapidSub.canDelegate("executeremotequery")) return galeri_ut.remoteMe.runUserSub(false, "galeri_ut","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 42;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(1024);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 44;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(2048);
_job.runVoidMethod ("_initialize",galeri_ut.processBA,(Object)(_jobname),(Object)(galeri_ut.getObject()));
 BA.debugLineNum = 45;BA.debugLine="Job.PostString(\"\"&Main.server&\"json.php\", Query)";
Debug.ShouldStop(4096);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),galeri_ut.mostCurrent._main._server,RemoteObject.createImmutable("json.php"))),(Object)(_query));
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
public static RemoteObject  _executeremotequery2(RemoteObject _query,RemoteObject _jobname) throws Exception{
try {
		Debug.PushSubsStack("ExecuteRemoteQuery2 (galeri_ut) ","galeri_ut",2,galeri_ut.mostCurrent.activityBA,galeri_ut.mostCurrent,48);
if (RapidSub.canDelegate("executeremotequery2")) return galeri_ut.remoteMe.runUserSub(false, "galeri_ut","executeremotequery2", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 48;BA.debugLine="Sub ExecuteRemoteQuery2(Query As String, JobName A";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(65536);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 50;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(131072);
_job.runVoidMethod ("_initialize",galeri_ut.processBA,(Object)(_jobname),(Object)(galeri_ut.getObject()));
 BA.debugLineNum = 51;BA.debugLine="Job.PostString(\"\"&Main.server&\"json.php\", Query)";
Debug.ShouldStop(262144);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),galeri_ut.mostCurrent._main._server,RemoteObject.createImmutable("json.php"))),(Object)(_query));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
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
public static RemoteObject  _fotoquery() throws Exception{
try {
		Debug.PushSubsStack("fotoquery (galeri_ut) ","galeri_ut",2,galeri_ut.mostCurrent.activityBA,galeri_ut.mostCurrent,32);
if (RapidSub.canDelegate("fotoquery")) return galeri_ut.remoteMe.runUserSub(false, "galeri_ut","fotoquery");
 BA.debugLineNum = 32;BA.debugLine="Sub fotoquery";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="ProgressDialogShow(\"Loading\")";
Debug.ShouldStop(1);
galeri_ut.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",galeri_ut.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Loading")));
 BA.debugLineNum = 36;BA.debugLine="ExecuteRemoteQuery(\"SELECT * from object_point wh";
Debug.ShouldStop(8);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT * from object_point where id_package='"),galeri_ut.mostCurrent._pencarian_des._id,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("ViewFoto1"));
 BA.debugLineNum = 37;BA.debugLine="ExecuteRemoteQuery(\"SELECT * from object_point wh";
Debug.ShouldStop(16);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT * from object_point where id_package='"),galeri_ut.mostCurrent._pencarian_nama._id,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("ViewFoto1"));
 BA.debugLineNum = 38;BA.debugLine="ExecuteRemoteQuery(\"SELECT * from object_point wh";
Debug.ShouldStop(32);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT * from object_point where id_package='"),galeri_ut.mostCurrent._pencarian_travel._id,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("ViewFoto1"));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private Panel4 As Panel";
galeri_ut.mostCurrent._panel4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Dim ScrollView1 As ScrollView";
galeri_ut.mostCurrent._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Dim lstChecks As List";
galeri_ut.mostCurrent._lstchecks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 21;BA.debugLine="Dim height As Int";
galeri_ut._height = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 22;BA.debugLine="height = 150dip";
galeri_ut._height = galeri_ut.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)));
 //BA.debugLineNum = 23;BA.debugLine="Private ListView1 As ListView";
galeri_ut.mostCurrent._listview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("Jobdone (galeri_ut) ","galeri_ut",2,galeri_ut.mostCurrent.activityBA,galeri_ut.mostCurrent,54);
if (RapidSub.canDelegate("jobdone")) return galeri_ut.remoteMe.runUserSub(false, "galeri_ut","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _mes_array = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable("");
RemoteObject _agn = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _serverimage = RemoteObject.createImmutable("");
RemoteObject _w = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _image = RemoteObject.createImmutable("");
RemoteObject _gambar = RemoteObject.createImmutable("");
RemoteObject _link = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 54;BA.debugLine="Sub Jobdone (Job As HttpJob)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8388608);
galeri_ut.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 57;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(16777216);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 58;BA.debugLine="Dim res As String";
Debug.ShouldStop(33554432);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 59;BA.debugLine="res= Job.GetString";
Debug.ShouldStop(67108864);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 60;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(134217728);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 61;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(268435456);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 62;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),galeri_ut._viewfoto1,BA.ObjectToString("tujuan_a"),BA.ObjectToString("tujuan_b"),BA.ObjectToString("tujuan_c"),BA.ObjectToString("tujuan_d"),BA.ObjectToString("tujuan_e"))) {
case 0: {
 BA.debugLineNum = 64;BA.debugLine="Dim mes_array As List";
Debug.ShouldStop(-2147483648);
_mes_array = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("mes_array", _mes_array);
 BA.debugLineNum = 65;BA.debugLine="mes_array = parser.NextArray";
Debug.ShouldStop(1);
_mes_array = _parser.runMethod(false,"NextArray");Debug.locals.put("mes_array", _mes_array);
 BA.debugLineNum = 67;BA.debugLine="For i=0 To mes_array.Size -1";
Debug.ShouldStop(4);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {_mes_array.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11); _i = ((int)(0 + _i + step11)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 68;BA.debugLine="Dim m As Map";
Debug.ShouldStop(8);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 70;BA.debugLine="m= mes_array.Get(i)";
Debug.ShouldStop(32);
_m.setObject(_mes_array.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 71;BA.debugLine="Dim id As String";
Debug.ShouldStop(64);
_id = RemoteObject.createImmutable("");Debug.locals.put("id", _id);
 BA.debugLineNum = 72;BA.debugLine="Dim status As String";
Debug.ShouldStop(128);
_status = RemoteObject.createImmutable("");Debug.locals.put("status", _status);
 BA.debugLineNum = 73;BA.debugLine="status=m.Get(\"status\")";
Debug.ShouldStop(256);
_status = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);
 BA.debugLineNum = 74;BA.debugLine="Log(status)";
Debug.ShouldStop(512);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(_status));
 BA.debugLineNum = 76;BA.debugLine="If status == 1 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_status,BA.NumberToString(1))) { 
 BA.debugLineNum = 77;BA.debugLine="id=m.Get(\"id_souvenir\")";
Debug.ShouldStop(4096);
_id = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_souvenir")))));Debug.locals.put("id", _id);
 BA.debugLineNum = 78;BA.debugLine="Log(id)";
Debug.ShouldStop(8192);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(_id));
 BA.debugLineNum = 79;BA.debugLine="ExecuteRemoteQuery2(\"SELECT*FROM souvenir_ga";
Debug.ShouldStop(16384);
_executeremotequery2(RemoteObject.concat(RemoteObject.createImmutable("SELECT*FROM souvenir_gallery where id_souvenir='"),_id,RemoteObject.createImmutable("'  ")),RemoteObject.createImmutable("tujuan_a"));
 }else 
{ BA.debugLineNum = 81;BA.debugLine="Else If status == 2 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_status,BA.NumberToString(2))) { 
 BA.debugLineNum = 82;BA.debugLine="Log(id)";
Debug.ShouldStop(131072);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(_id));
 BA.debugLineNum = 83;BA.debugLine="id=m.Get(\"id_workship_place\")";
Debug.ShouldStop(262144);
_id = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_workship_place")))));Debug.locals.put("id", _id);
 BA.debugLineNum = 84;BA.debugLine="ExecuteRemoteQuery2(\"SELECT*FROM workship_pl";
Debug.ShouldStop(524288);
_executeremotequery2(RemoteObject.concat(RemoteObject.createImmutable("SELECT*FROM workship_place_gallery where id_workship_place='"),_id,RemoteObject.createImmutable("' ")),RemoteObject.createImmutable("tujuan_b"));
 }else 
{ BA.debugLineNum = 86;BA.debugLine="Else If status == 3 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_status,BA.NumberToString(3))) { 
 BA.debugLineNum = 87;BA.debugLine="id=m.Get(\"id_restaurant\")";
Debug.ShouldStop(4194304);
_id = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_restaurant")))));Debug.locals.put("id", _id);
 BA.debugLineNum = 88;BA.debugLine="Log(id)";
Debug.ShouldStop(8388608);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(_id));
 BA.debugLineNum = 89;BA.debugLine="ExecuteRemoteQuery2(\"SELECT*FROM restaurant_";
Debug.ShouldStop(16777216);
_executeremotequery2(RemoteObject.concat(RemoteObject.createImmutable("SELECT*FROM restaurant_gallery where id_restaurant='"),_id,RemoteObject.createImmutable("' ")),RemoteObject.createImmutable("tujuan_c"));
 }else 
{ BA.debugLineNum = 91;BA.debugLine="Else If status == 4 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_status,BA.NumberToString(4))) { 
 BA.debugLineNum = 92;BA.debugLine="id=m.Get(\"id_tourism\")";
Debug.ShouldStop(134217728);
_id = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_tourism")))));Debug.locals.put("id", _id);
 BA.debugLineNum = 93;BA.debugLine="Log(id)";
Debug.ShouldStop(268435456);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(_id));
 BA.debugLineNum = 94;BA.debugLine="ExecuteRemoteQuery2(\"SELECT*FROM tourism_gal";
Debug.ShouldStop(536870912);
_executeremotequery2(RemoteObject.concat(RemoteObject.createImmutable("SELECT*FROM tourism_gallery where id_tourism='"),_id,RemoteObject.createImmutable("' ")),RemoteObject.createImmutable("tujuan_d"));
 }else 
{ BA.debugLineNum = 96;BA.debugLine="Else If status == 5 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_status,BA.NumberToString(5))) { 
 BA.debugLineNum = 97;BA.debugLine="id=m.Get(\"id_hotel\")";
Debug.ShouldStop(1);
_id = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id_hotel")))));Debug.locals.put("id", _id);
 BA.debugLineNum = 98;BA.debugLine="Log(id)";
Debug.ShouldStop(2);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(_id));
 BA.debugLineNum = 99;BA.debugLine="ExecuteRemoteQuery2(\"SELECT*FROM hotel_galle";
Debug.ShouldStop(4);
_executeremotequery2(RemoteObject.concat(RemoteObject.createImmutable("SELECT*FROM hotel_gallery where id_hotel='"),_id,RemoteObject.createImmutable("' ")),RemoteObject.createImmutable("tujuan_e"));
 }}}}};
 }
}Debug.locals.put("i", _i);
;
 break; }
case 1: {
 BA.debugLineNum = 111;BA.debugLine="Dim agn As List";
Debug.ShouldStop(16384);
_agn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 112;BA.debugLine="agn=parser.NextArray";
Debug.ShouldStop(32768);
_agn = _parser.runMethod(false,"NextArray");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 113;BA.debugLine="If agn.Size - 1 < 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 114;BA.debugLine="Log(agn.Size)";
Debug.ShouldStop(131072);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_agn.runMethod(true,"getSize"))));
 }else {
 BA.debugLineNum = 117;BA.debugLine="Dim serverimage = \"http://192.168.100.13/wisata";
Debug.ShouldStop(1048576);
_serverimage = BA.ObjectToString("http://192.168.100.13/wisatasolsel/foto/");Debug.locals.put("serverimage", _serverimage);Debug.locals.put("serverimage", _serverimage);
 BA.debugLineNum = 118;BA.debugLine="For i=0 To agn.Size-1";
Debug.ShouldStop(2097152);
{
final int step47 = 1;
final int limit47 = RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step47 > 0 && _i <= limit47) || (step47 < 0 && _i >= limit47); _i = ((int)(0 + _i + step47)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 119;BA.debugLine="Dim w As Map";
Debug.ShouldStop(4194304);
_w = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("w", _w);
 BA.debugLineNum = 120;BA.debugLine="w=agn.Get(i)";
Debug.ShouldStop(8388608);
_w.setObject(_agn.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 121;BA.debugLine="Log(\"haha\")";
Debug.ShouldStop(16777216);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("haha")));
 BA.debugLineNum = 122;BA.debugLine="Dim image = w.Get(\"gallery_souvenir\") As Stri";
Debug.ShouldStop(33554432);
_image = BA.ObjectToString(_w.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("gallery_souvenir")))));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 123;BA.debugLine="Dim gambar = \"\"&serverimage&\"\"&image As Strin";
Debug.ShouldStop(67108864);
_gambar = RemoteObject.concat(RemoteObject.createImmutable(""),_serverimage,RemoteObject.createImmutable(""),_image);Debug.locals.put("gambar", _gambar);Debug.locals.put("gambar", _gambar);
 BA.debugLineNum = 124;BA.debugLine="Log(gambar)";
Debug.ShouldStop(134217728);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(_gambar));
 BA.debugLineNum = 125;BA.debugLine="Dim link As Map";
Debug.ShouldStop(268435456);
_link = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("link", _link);
 BA.debugLineNum = 126;BA.debugLine="link.Initialize";
Debug.ShouldStop(536870912);
_link.runVoidMethod ("Initialize");
 BA.debugLineNum = 128;BA.debugLine="link.Put(ListView1, gambar)";
Debug.ShouldStop(-2147483648);
_link.runVoidMethod ("Put",(Object)((galeri_ut.mostCurrent._listview1.getObject())),(Object)((_gambar)));
 BA.debugLineNum = 130;BA.debugLine="CallSubDelayed2(Starter, \"Download\" , link)";
Debug.ShouldStop(2);
galeri_ut.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",galeri_ut.mostCurrent.activityBA,(Object)((galeri_ut.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_link)));
 }
}Debug.locals.put("i", _i);
;
 };
 break; }
case 2: {
 BA.debugLineNum = 136;BA.debugLine="Dim agn As List";
Debug.ShouldStop(128);
_agn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 137;BA.debugLine="agn=parser.NextArray";
Debug.ShouldStop(256);
_agn = _parser.runMethod(false,"NextArray");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 138;BA.debugLine="If agn.Size - 1 < 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 139;BA.debugLine="Log(agn.Size)";
Debug.ShouldStop(1024);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_agn.runMethod(true,"getSize"))));
 }else {
 BA.debugLineNum = 142;BA.debugLine="Dim serverimage = \"http://192.168.100.13/wisata";
Debug.ShouldStop(8192);
_serverimage = BA.ObjectToString("http://192.168.100.13/wisatasolsel/foto/");Debug.locals.put("serverimage", _serverimage);Debug.locals.put("serverimage", _serverimage);
 BA.debugLineNum = 143;BA.debugLine="For i=0 To agn.Size-1";
Debug.ShouldStop(16384);
{
final int step67 = 1;
final int limit67 = RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step67 > 0 && _i <= limit67) || (step67 < 0 && _i >= limit67); _i = ((int)(0 + _i + step67)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 144;BA.debugLine="Dim w As Map";
Debug.ShouldStop(32768);
_w = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("w", _w);
 BA.debugLineNum = 145;BA.debugLine="w=agn.Get(i)";
Debug.ShouldStop(65536);
_w.setObject(_agn.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 146;BA.debugLine="Log(\"haha\")";
Debug.ShouldStop(131072);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("haha")));
 BA.debugLineNum = 147;BA.debugLine="Dim image = w.Get(\"gallery_workship_place\") A";
Debug.ShouldStop(262144);
_image = BA.ObjectToString(_w.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("gallery_workship_place")))));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 148;BA.debugLine="Dim gambar = \"\"&serverimage&\"\"&image As Strin";
Debug.ShouldStop(524288);
_gambar = RemoteObject.concat(RemoteObject.createImmutable(""),_serverimage,RemoteObject.createImmutable(""),_image);Debug.locals.put("gambar", _gambar);Debug.locals.put("gambar", _gambar);
 BA.debugLineNum = 149;BA.debugLine="Log(gambar)";
Debug.ShouldStop(1048576);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(_gambar));
 BA.debugLineNum = 150;BA.debugLine="Dim link As Map";
Debug.ShouldStop(2097152);
_link = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("link", _link);
 BA.debugLineNum = 151;BA.debugLine="link.Initialize";
Debug.ShouldStop(4194304);
_link.runVoidMethod ("Initialize");
 BA.debugLineNum = 153;BA.debugLine="link.Put(ListView1, gambar)";
Debug.ShouldStop(16777216);
_link.runVoidMethod ("Put",(Object)((galeri_ut.mostCurrent._listview1.getObject())),(Object)((_gambar)));
 BA.debugLineNum = 155;BA.debugLine="CallSubDelayed2(Starter, \"Download\" , link)";
Debug.ShouldStop(67108864);
galeri_ut.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",galeri_ut.mostCurrent.activityBA,(Object)((galeri_ut.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_link)));
 }
}Debug.locals.put("i", _i);
;
 };
 break; }
case 3: {
 BA.debugLineNum = 161;BA.debugLine="Dim agn As List";
Debug.ShouldStop(1);
_agn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 162;BA.debugLine="agn=parser.NextArray";
Debug.ShouldStop(2);
_agn = _parser.runMethod(false,"NextArray");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 163;BA.debugLine="If agn.Size - 1 < 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 164;BA.debugLine="Log(agn.Size)";
Debug.ShouldStop(8);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_agn.runMethod(true,"getSize"))));
 }else {
 BA.debugLineNum = 167;BA.debugLine="Dim serverimage = \"http://192.168.100.13/wisata";
Debug.ShouldStop(64);
_serverimage = BA.ObjectToString("http://192.168.100.13/wisatasolsel/foto/");Debug.locals.put("serverimage", _serverimage);Debug.locals.put("serverimage", _serverimage);
 BA.debugLineNum = 168;BA.debugLine="For i=0 To agn.Size-1";
Debug.ShouldStop(128);
{
final int step87 = 1;
final int limit87 = RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step87 > 0 && _i <= limit87) || (step87 < 0 && _i >= limit87); _i = ((int)(0 + _i + step87)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 169;BA.debugLine="Dim w As Map";
Debug.ShouldStop(256);
_w = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("w", _w);
 BA.debugLineNum = 170;BA.debugLine="w=agn.Get(i)";
Debug.ShouldStop(512);
_w.setObject(_agn.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 171;BA.debugLine="Log(\"haha\")";
Debug.ShouldStop(1024);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("haha")));
 BA.debugLineNum = 172;BA.debugLine="Dim image = w.Get(\"gallery_restaurant\") As St";
Debug.ShouldStop(2048);
_image = BA.ObjectToString(_w.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("gallery_restaurant")))));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 173;BA.debugLine="Dim gambar = \"\"&serverimage&\"\"&image As Strin";
Debug.ShouldStop(4096);
_gambar = RemoteObject.concat(RemoteObject.createImmutable(""),_serverimage,RemoteObject.createImmutable(""),_image);Debug.locals.put("gambar", _gambar);Debug.locals.put("gambar", _gambar);
 BA.debugLineNum = 174;BA.debugLine="Log(gambar)";
Debug.ShouldStop(8192);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(_gambar));
 BA.debugLineNum = 175;BA.debugLine="Dim link As Map";
Debug.ShouldStop(16384);
_link = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("link", _link);
 BA.debugLineNum = 176;BA.debugLine="link.Initialize";
Debug.ShouldStop(32768);
_link.runVoidMethod ("Initialize");
 BA.debugLineNum = 178;BA.debugLine="link.Put(ListView1, gambar)";
Debug.ShouldStop(131072);
_link.runVoidMethod ("Put",(Object)((galeri_ut.mostCurrent._listview1.getObject())),(Object)((_gambar)));
 BA.debugLineNum = 180;BA.debugLine="CallSubDelayed2(Starter, \"Download\", link)";
Debug.ShouldStop(524288);
galeri_ut.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",galeri_ut.mostCurrent.activityBA,(Object)((galeri_ut.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_link)));
 }
}Debug.locals.put("i", _i);
;
 };
 break; }
case 4: {
 BA.debugLineNum = 186;BA.debugLine="Dim agn As List";
Debug.ShouldStop(33554432);
_agn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 187;BA.debugLine="agn=parser.NextArray";
Debug.ShouldStop(67108864);
_agn = _parser.runMethod(false,"NextArray");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 188;BA.debugLine="If agn.Size - 1 < 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 189;BA.debugLine="Log(agn.Size)";
Debug.ShouldStop(268435456);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_agn.runMethod(true,"getSize"))));
 }else {
 BA.debugLineNum = 192;BA.debugLine="Dim serverimage = \"http://192.168.100.13/wisata";
Debug.ShouldStop(-2147483648);
_serverimage = BA.ObjectToString("http://192.168.100.13/wisatasolsel/foto/");Debug.locals.put("serverimage", _serverimage);Debug.locals.put("serverimage", _serverimage);
 BA.debugLineNum = 193;BA.debugLine="For i=0 To agn.Size-1";
Debug.ShouldStop(1);
{
final int step107 = 1;
final int limit107 = RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step107 > 0 && _i <= limit107) || (step107 < 0 && _i >= limit107); _i = ((int)(0 + _i + step107)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 194;BA.debugLine="Dim w As Map";
Debug.ShouldStop(2);
_w = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("w", _w);
 BA.debugLineNum = 195;BA.debugLine="w=agn.Get(i)";
Debug.ShouldStop(4);
_w.setObject(_agn.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 196;BA.debugLine="Log(\"haha\")";
Debug.ShouldStop(8);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("haha")));
 BA.debugLineNum = 197;BA.debugLine="Dim image = w.Get(\"gallery_tourism\") As Strin";
Debug.ShouldStop(16);
_image = BA.ObjectToString(_w.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("gallery_tourism")))));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 198;BA.debugLine="Dim gambar = \"\"&serverimage&\"\"&image As Strin";
Debug.ShouldStop(32);
_gambar = RemoteObject.concat(RemoteObject.createImmutable(""),_serverimage,RemoteObject.createImmutable(""),_image);Debug.locals.put("gambar", _gambar);Debug.locals.put("gambar", _gambar);
 BA.debugLineNum = 199;BA.debugLine="Log(gambar)";
Debug.ShouldStop(64);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(_gambar));
 BA.debugLineNum = 200;BA.debugLine="Dim link As Map";
Debug.ShouldStop(128);
_link = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("link", _link);
 BA.debugLineNum = 201;BA.debugLine="link.Initialize";
Debug.ShouldStop(256);
_link.runVoidMethod ("Initialize");
 BA.debugLineNum = 203;BA.debugLine="link.Put(ListView1, gambar)";
Debug.ShouldStop(1024);
_link.runVoidMethod ("Put",(Object)((galeri_ut.mostCurrent._listview1.getObject())),(Object)((_gambar)));
 BA.debugLineNum = 205;BA.debugLine="CallSubDelayed2(Starter, \"Download\" , link)";
Debug.ShouldStop(4096);
galeri_ut.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",galeri_ut.mostCurrent.activityBA,(Object)((galeri_ut.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_link)));
 }
}Debug.locals.put("i", _i);
;
 };
 break; }
case 5: {
 BA.debugLineNum = 210;BA.debugLine="Dim agn As List";
Debug.ShouldStop(131072);
_agn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 211;BA.debugLine="agn=parser.NextArray";
Debug.ShouldStop(262144);
_agn = _parser.runMethod(false,"NextArray");Debug.locals.put("agn", _agn);
 BA.debugLineNum = 212;BA.debugLine="If agn.Size - 1 < 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 213;BA.debugLine="Log(agn.Size)";
Debug.ShouldStop(1048576);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(_agn.runMethod(true,"getSize"))));
 }else {
 BA.debugLineNum = 216;BA.debugLine="Dim serverimage = \"http://192.168.100.13/wisata";
Debug.ShouldStop(8388608);
_serverimage = BA.ObjectToString("http://192.168.100.13/wisatasolsel/foto/");Debug.locals.put("serverimage", _serverimage);Debug.locals.put("serverimage", _serverimage);
 BA.debugLineNum = 217;BA.debugLine="For i=0 To agn.Size-1";
Debug.ShouldStop(16777216);
{
final int step127 = 1;
final int limit127 = RemoteObject.solve(new RemoteObject[] {_agn.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
for (_i = 0 ; (step127 > 0 && _i <= limit127) || (step127 < 0 && _i >= limit127); _i = ((int)(0 + _i + step127)) ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 218;BA.debugLine="Dim w As Map";
Debug.ShouldStop(33554432);
_w = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("w", _w);
 BA.debugLineNum = 219;BA.debugLine="w=agn.Get(i)";
Debug.ShouldStop(67108864);
_w.setObject(_agn.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 220;BA.debugLine="Log(\"haha\")";
Debug.ShouldStop(134217728);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("haha")));
 BA.debugLineNum = 221;BA.debugLine="Dim image = w.Get(\"gallery_hotel\") As String";
Debug.ShouldStop(268435456);
_image = BA.ObjectToString(_w.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("gallery_hotel")))));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 222;BA.debugLine="Dim gambar = \"\"&serverimage&\"\"&image As Strin";
Debug.ShouldStop(536870912);
_gambar = RemoteObject.concat(RemoteObject.createImmutable(""),_serverimage,RemoteObject.createImmutable(""),_image);Debug.locals.put("gambar", _gambar);Debug.locals.put("gambar", _gambar);
 BA.debugLineNum = 223;BA.debugLine="Log(gambar)";
Debug.ShouldStop(1073741824);
galeri_ut.mostCurrent.__c.runVoidMethod ("Log",(Object)(_gambar));
 BA.debugLineNum = 224;BA.debugLine="Dim link As Map";
Debug.ShouldStop(-2147483648);
_link = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("link", _link);
 BA.debugLineNum = 225;BA.debugLine="link.Initialize";
Debug.ShouldStop(1);
_link.runVoidMethod ("Initialize");
 BA.debugLineNum = 227;BA.debugLine="link.Put(ListView1, gambar)";
Debug.ShouldStop(4);
_link.runVoidMethod ("Put",(Object)((galeri_ut.mostCurrent._listview1.getObject())),(Object)((_gambar)));
 BA.debugLineNum = 229;BA.debugLine="CallSubDelayed2(Starter, \"Download\", link)";
Debug.ShouldStop(16);
galeri_ut.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",galeri_ut.mostCurrent.activityBA,(Object)((galeri_ut.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_link)));
 }
}Debug.locals.put("i", _i);
;
 };
 break; }
}
;
 };
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim ViewFoto1=\"ViewFoto1\" As String";
galeri_ut._viewfoto1 = BA.ObjectToString("ViewFoto1");
 //BA.debugLineNum = 10;BA.debugLine="Dim ViewFotos=\"ViewFotos\" As List";
galeri_ut._viewfotos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
galeri_ut._viewfotos.setObject(RemoteObject.createImmutable("ViewFotos"));
 //BA.debugLineNum = 11;BA.debugLine="Dim id_gallery As String";
galeri_ut._id_gallery = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}