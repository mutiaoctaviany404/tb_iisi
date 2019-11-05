package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,45);
if (RapidSub.canDelegate("activity_create")) return main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="StartActivity(\"Main\")";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("Main"))));
 BA.debugLineNum = 47;BA.debugLine="If FirstTime Then 'jika aplikasi pertama diaktif";
Debug.ShouldStop(16384);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 48;BA.debugLine="Activity.LoadLayout(\"splash\")";
Debug.ShouldStop(32768);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("splash")),main.mostCurrent.activityBA);
 BA.debugLineNum = 49;BA.debugLine="AnimSplash 'Panggil function animasi splash scre";
Debug.ShouldStop(65536);
_animsplash();
 BA.debugLineNum = 50;BA.debugLine="tmSplash.Initialize(\"tmSplash\",3500) 'panggil ev";
Debug.ShouldStop(131072);
main._tmsplash.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("tmSplash")),(Object)(BA.numberCast(long.class, 3500)));
 BA.debugLineNum = 51;BA.debugLine="tmSplash.Enabled = True 'aktifkan timer";
Debug.ShouldStop(262144);
main._tmsplash.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 53;BA.debugLine="Activity.RemoveAllViews 'Hapus Design pada layou";
Debug.ShouldStop(1048576);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 54;BA.debugLine="Activity.LoadLayout(\"login\") 'Set layout lyHome";
Debug.ShouldStop(2097152);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("login")),main.mostCurrent.activityBA);
 BA.debugLineNum = 55;BA.debugLine="DoEvents 'membuat proses terlihat";
Debug.ShouldStop(4194304);
main.mostCurrent.__c.runVoidMethodAndSync ("DoEvents");
 };
 BA.debugLineNum = 58;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,64);
if (RapidSub.canDelegate("activity_pause")) return main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 64;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,60);
if (RapidSub.canDelegate("activity_resume")) return main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 60;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
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
public static RemoteObject  _animsplash() throws Exception{
try {
		Debug.PushSubsStack("AnimSplash (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,74);
if (RapidSub.canDelegate("animsplash")) return main.remoteMe.runUserSub(false, "main","animsplash");
 BA.debugLineNum = 74;BA.debugLine="Sub AnimSplash()";
Debug.ShouldStop(512);
 BA.debugLineNum = 76;BA.debugLine="End Sub";
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
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,119);
if (RapidSub.canDelegate("button1_click")) return main.remoteMe.runUserSub(false, "main","button1_click");
 BA.debugLineNum = 119;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="cek_login";
Debug.ShouldStop(8388608);
_cek_login();
 BA.debugLineNum = 122;BA.debugLine="End Sub";
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
public static RemoteObject  _cek_login() throws Exception{
try {
		Debug.PushSubsStack("cek_login (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,78);
if (RapidSub.canDelegate("cek_login")) return main.remoteMe.runUserSub(false, "main","cek_login");
 BA.debugLineNum = 78;BA.debugLine="Sub cek_login";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Loading...")));
 BA.debugLineNum = 80;BA.debugLine="text_Username = EditText1.Text";
Debug.ShouldStop(32768);
main.mostCurrent._text_username = main.mostCurrent._edittext1.runMethod(true,"getText");
 BA.debugLineNum = 81;BA.debugLine="text_Password = EditText2.Text";
Debug.ShouldStop(65536);
main.mostCurrent._text_password = main.mostCurrent._edittext2.runMethod(true,"getText");
 BA.debugLineNum = 83;BA.debugLine="ExecuteRemoteQuery(\"SELECT * FROM users WHERE upp";
Debug.ShouldStop(262144);
_executeremotequery(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM users WHERE upper(user_id)=upper('"),main.mostCurrent._text_username,RemoteObject.createImmutable("') and password='"),main.mostCurrent._text_password,RemoteObject.createImmutable("'")),RemoteObject.createImmutable("Login_Case"));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
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
public static RemoteObject  _executeremotequery(RemoteObject _query,RemoteObject _jobname) throws Exception{
try {
		Debug.PushSubsStack("ExecuteRemoteQuery (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,86);
if (RapidSub.canDelegate("executeremotequery")) return main.remoteMe.runUserSub(false, "main","executeremotequery", _query, _jobname);
RemoteObject _job = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httpjob");
Debug.locals.put("Query", _query);
Debug.locals.put("JobName", _jobname);
 BA.debugLineNum = 86;BA.debugLine="Sub ExecuteRemoteQuery(Query As String, JobName As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(4194304);
_job = RemoteObject.createNew ("anywheresoftware.b4a.samples.httputils2.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 88;BA.debugLine="Job.Initialize(JobName, Me)";
Debug.ShouldStop(8388608);
_job.runVoidMethod ("_initialize",main.processBA,(Object)(_jobname),(Object)(main.getObject()));
 BA.debugLineNum = 89;BA.debugLine="Job.PostString(\"\"&Server&\"json2.php\",Query)";
Debug.ShouldStop(16777216);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(RemoteObject.createImmutable(""),main._server,RemoteObject.createImmutable("json2.php"))),(Object)(_query));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 28;BA.debugLine="Private Login_Case = \"Login_Case\" As String";
main.mostCurrent._login_case = BA.ObjectToString("Login_Case");
 //BA.debugLineNum = 30;BA.debugLine="Private Label2 As Label";
main.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private Label3 As Label";
main.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private EditText1 As EditText";
main.mostCurrent._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private EditText2 As EditText";
main.mostCurrent._edittext2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private text_Username As String";
main.mostCurrent._text_username = RemoteObject.createImmutable("");
 //BA.debugLineNum = 36;BA.debugLine="Private text_Password As String";
main.mostCurrent._text_password = RemoteObject.createImmutable("");
 //BA.debugLineNum = 38;BA.debugLine="Private ImageView1 As ImageView";
main.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private Label1 As Label";
main.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private Button1 As Button";
main.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,92);
if (RapidSub.canDelegate("jobdone")) return main.remoteMe.runUserSub(false, "main","jobdone", _job);
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 92;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 94;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(536870912);
if (_job.getField(true,"_success").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 95;BA.debugLine="Dim res As String";
Debug.ShouldStop(1073741824);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 96;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(-2147483648);
_res = _job.runMethod(true,"_getstring");Debug.locals.put("res", _res);
 BA.debugLineNum = 97;BA.debugLine="Log(\"Response :\"& res)";
Debug.ShouldStop(1);
main.mostCurrent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Response :"),_res)));
 BA.debugLineNum = 98;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 99;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(4);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 100;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname"),main.mostCurrent._login_case)) {
case 0: {
 BA.debugLineNum = 102;BA.debugLine="Dim m As Map";
Debug.ShouldStop(32);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 103;BA.debugLine="m = parser.NextObject";
Debug.ShouldStop(64);
_m = _parser.runMethod(false,"NextObject");Debug.locals.put("m", _m);
 BA.debugLineNum = 104;BA.debugLine="role_login = m.Get(\"role\")";
Debug.ShouldStop(128);
main._role_login = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("role")))));
 BA.debugLineNum = 105;BA.debugLine="username_login = m.Get(\"user_id\")";
Debug.ShouldStop(256);
main._username_login = BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_id")))));
 BA.debugLineNum = 107;BA.debugLine="If role_login == 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",main._role_login,BA.NumberToString(0))) { 
 BA.debugLineNum = 108;BA.debugLine="Msgbox(\"Username dan Password salah \", \"Logi";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToString("Username dan Password salah ")),(Object)(RemoteObject.createImmutable("Login gagal")),main.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 110;BA.debugLine="Msgbox(\"Anda login sebagai \" & EditText1.Tex";
Debug.ShouldStop(8192);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Anda login sebagai "),main.mostCurrent._edittext1.runMethod(true,"getText"),main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Selamat Datang! "))),(Object)(RemoteObject.createImmutable("Login Sukses")),main.mostCurrent.activityBA);
 BA.debugLineNum = 111;BA.debugLine="StartActivity(\"home\")";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.mostCurrent.activityBA,(Object)((RemoteObject.createImmutable("home"))));
 };
 break; }
}
;
 };
 BA.debugLineNum = 116;BA.debugLine="End Sub";
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

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
info_utama_subs_0._process_globals();
galeri_ut_subs_0._process_globals();
pencarian_travel_subs_0._process_globals();
lokasi_subs_0._process_globals();
info_travel_subs_0._process_globals();
info_des_subs_0._process_globals();
pencarian_des_subs_0._process_globals();
pencarian_nama_subs_0._process_globals();
lokasi_des_subs_0._process_globals();
lokasi_travel_subs_0._process_globals();
lokasi_trav_subs_0._process_globals();
home_subs_0._process_globals();
addbooking_subs_0._process_globals();
starter_subs_0._process_globals();
booking_subs_0._process_globals();
login_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
info_utama.myClass = BA.getDeviceClass ("b4a.example.info_utama");
galeri_ut.myClass = BA.getDeviceClass ("b4a.example.galeri_ut");
pencarian_travel.myClass = BA.getDeviceClass ("b4a.example.pencarian_travel");
lokasi.myClass = BA.getDeviceClass ("b4a.example.lokasi");
info_travel.myClass = BA.getDeviceClass ("b4a.example.info_travel");
info_des.myClass = BA.getDeviceClass ("b4a.example.info_des");
pencarian_des.myClass = BA.getDeviceClass ("b4a.example.pencarian_des");
pencarian_nama.myClass = BA.getDeviceClass ("b4a.example.pencarian_nama");
lokasi_des.myClass = BA.getDeviceClass ("b4a.example.lokasi_des");
lokasi_travel.myClass = BA.getDeviceClass ("b4a.example.lokasi_travel");
lokasi_trav.myClass = BA.getDeviceClass ("b4a.example.lokasi_trav");
home.myClass = BA.getDeviceClass ("b4a.example.home");
addbooking.myClass = BA.getDeviceClass ("b4a.example.addbooking");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
booking.myClass = BA.getDeviceClass ("b4a.example.booking");
login.myClass = BA.getDeviceClass ("b4a.example.login");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 17;BA.debugLine="Dim Server=\"http://192.168.100.13/wisatasolsel/mo";
main._server = BA.ObjectToString("http://192.168.100.13/wisatasolsel/mobile/");
 //BA.debugLineNum = 19;BA.debugLine="Dim username_login As String";
main._username_login = RemoteObject.createImmutable("");
 //BA.debugLineNum = 20;BA.debugLine="Dim role_login As String";
main._role_login = RemoteObject.createImmutable("");
 //BA.debugLineNum = 22;BA.debugLine="Dim tmSplash As Timer 'timer untuk animasi splash";
main._tmsplash = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tmsplash_tick() throws Exception{
try {
		Debug.PushSubsStack("tmSplash_Tick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,68);
if (RapidSub.canDelegate("tmsplash_tick")) return main.remoteMe.runUserSub(false, "main","tmsplash_tick");
 BA.debugLineNum = 68;BA.debugLine="Sub tmSplash_Tick";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="tmSplash.Enabled = False 'disable timer";
Debug.ShouldStop(16);
main._tmsplash.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 70;BA.debugLine="Activity.RemoveAllViews 'Hapus Design pada layout";
Debug.ShouldStop(32);
main.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 71;BA.debugLine="Activity.LoadLayout(\"login\") 'load layout lyHome";
Debug.ShouldStop(64);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("login")),main.mostCurrent.activityBA);
 BA.debugLineNum = 72;BA.debugLine="End Sub";
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
}