package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class home_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (home) ","home",12,home.mostCurrent.activityBA,home.mostCurrent,28);
if (RapidSub.canDelegate("activity_create")) return home.remoteMe.runUserSub(false, "home","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="If FirstTime Then 'jika aplikasi pertama diaktif";
Debug.ShouldStop(536870912);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 31;BA.debugLine="Activity.LoadLayout(\"splash\")";
Debug.ShouldStop(1073741824);
home.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("splash")),home.mostCurrent.activityBA);
 BA.debugLineNum = 32;BA.debugLine="AnimSplash 'Panggil function animasi splash scre";
Debug.ShouldStop(-2147483648);
_animsplash();
 BA.debugLineNum = 33;BA.debugLine="tmSplash.Initialize(\"tmSplash\",3500) 'panggil ev";
Debug.ShouldStop(1);
home._tmsplash.runVoidMethod ("Initialize",home.processBA,(Object)(BA.ObjectToString("tmSplash")),(Object)(BA.numberCast(long.class, 3500)));
 BA.debugLineNum = 34;BA.debugLine="tmSplash.Enabled = True 'aktifkan timer";
Debug.ShouldStop(2);
home._tmsplash.runMethod(true,"setEnabled",home.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 36;BA.debugLine="Activity.RemoveAllViews 'Hapus Design pada layou";
Debug.ShouldStop(8);
home.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 37;BA.debugLine="Activity.LoadLayout(\"home\") 'Set layout lyHome";
Debug.ShouldStop(16);
home.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("home")),home.mostCurrent.activityBA);
 };
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (home) ","home",12,home.mostCurrent.activityBA,home.mostCurrent,48);
if (RapidSub.canDelegate("activity_pause")) return home.remoteMe.runUserSub(false, "home","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (home) ","home",12,home.mostCurrent.activityBA,home.mostCurrent,44);
if (RapidSub.canDelegate("activity_resume")) return home.remoteMe.runUserSub(false, "home","activity_resume");
 BA.debugLineNum = 44;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2048);
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
public static RemoteObject  _animsplash() throws Exception{
try {
		Debug.PushSubsStack("AnimSplash (home) ","home",12,home.mostCurrent.activityBA,home.mostCurrent,58);
if (RapidSub.canDelegate("animsplash")) return home.remoteMe.runUserSub(false, "home","animsplash");
 BA.debugLineNum = 58;BA.debugLine="Sub AnimSplash()";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _button1_click() throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (home) ","home",12,home.mostCurrent.activityBA,home.mostCurrent,69);
if (RapidSub.canDelegate("button1_click")) return home.remoteMe.runUserSub(false, "home","button1_click");
 BA.debugLineNum = 69;BA.debugLine="Sub Button1_Click";
Debug.ShouldStop(16);
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
public static RemoteObject  _button2_click() throws Exception{
try {
		Debug.PushSubsStack("Button2_Click (home) ","home",12,home.mostCurrent.activityBA,home.mostCurrent,72);
if (RapidSub.canDelegate("button2_click")) return home.remoteMe.runUserSub(false, "home","button2_click");
 BA.debugLineNum = 72;BA.debugLine="Sub Button2_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="StartActivity(pencarian_travel)";
Debug.ShouldStop(256);
home.mostCurrent.__c.runVoidMethod ("StartActivity",home.mostCurrent.activityBA,(Object)((home.mostCurrent._pencarian_travel.getObject())));
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
public static RemoteObject  _button3_click() throws Exception{
try {
		Debug.PushSubsStack("Button3_Click (home) ","home",12,home.mostCurrent.activityBA,home.mostCurrent,75);
if (RapidSub.canDelegate("button3_click")) return home.remoteMe.runUserSub(false, "home","button3_click");
 BA.debugLineNum = 75;BA.debugLine="Sub Button3_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="StartActivity(pencarian_nama)";
Debug.ShouldStop(2048);
home.mostCurrent.__c.runVoidMethod ("StartActivity",home.mostCurrent.activityBA,(Object)((home.mostCurrent._pencarian_nama.getObject())));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
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
public static RemoteObject  _button4_click() throws Exception{
try {
		Debug.PushSubsStack("Button4_Click (home) ","home",12,home.mostCurrent.activityBA,home.mostCurrent,78);
if (RapidSub.canDelegate("button4_click")) return home.remoteMe.runUserSub(false, "home","button4_click");
 BA.debugLineNum = 78;BA.debugLine="Sub Button4_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="StartActivity(pencarian_des)";
Debug.ShouldStop(16384);
home.mostCurrent.__c.runVoidMethod ("StartActivity",home.mostCurrent.activityBA,(Object)((home.mostCurrent._pencarian_des.getObject())));
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
public static RemoteObject  _button5_click() throws Exception{
try {
		Debug.PushSubsStack("Button5_Click (home) ","home",12,home.mostCurrent.activityBA,home.mostCurrent,83);
if (RapidSub.canDelegate("button5_click")) return home.remoteMe.runUserSub(false, "home","button5_click");
 BA.debugLineNum = 83;BA.debugLine="Sub Button5_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
home.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 85;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 16;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private ImageView1 As ImageView";
home.mostCurrent._imageview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Button1 As Button";
home.mostCurrent._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Button2 As Button";
home.mostCurrent._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Button3 As Button";
home.mostCurrent._button3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Button4 As Button";
home.mostCurrent._button4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim Server=\"http://192.168.100.13/wisatasolsel/mo";
home._server = BA.ObjectToString("http://192.168.100.13/wisatasolsel/mobile/");
 //BA.debugLineNum = 12;BA.debugLine="Dim tmSplash As Timer 'timer untuk animasi splash";
home._tmsplash = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _tmsplash_tick() throws Exception{
try {
		Debug.PushSubsStack("tmSplash_Tick (home) ","home",12,home.mostCurrent.activityBA,home.mostCurrent,52);
if (RapidSub.canDelegate("tmsplash_tick")) return home.remoteMe.runUserSub(false, "home","tmsplash_tick");
 BA.debugLineNum = 52;BA.debugLine="Sub tmSplash_Tick";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="tmSplash.Enabled = False 'disable timer";
Debug.ShouldStop(1048576);
home._tmsplash.runMethod(true,"setEnabled",home.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 54;BA.debugLine="Activity.RemoveAllViews 'Hapus Design pada layout";
Debug.ShouldStop(2097152);
home.mostCurrent._activity.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 55;BA.debugLine="Activity.LoadLayout(\"home\") 'load layout lyHome";
Debug.ShouldStop(4194304);
home.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("home")),home.mostCurrent.activityBA);
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
}