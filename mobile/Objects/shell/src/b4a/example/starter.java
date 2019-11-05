
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class starter implements IRemote{
	public static starter mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public starter() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("starter"), "b4a.example.starter");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("b4a.example.starter");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, starter.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _cache = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _tasks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _ongoingtasks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.info_utama _info_utama = null;
public static b4a.example.galeri_ut _galeri_ut = null;
public static b4a.example.pencarian_travel _pencarian_travel = null;
public static b4a.example.lokasi _lokasi = null;
public static b4a.example.info_travel _info_travel = null;
public static b4a.example.info_des _info_des = null;
public static b4a.example.pencarian_des _pencarian_des = null;
public static b4a.example.pencarian_nama _pencarian_nama = null;
public static b4a.example.lokasi_des _lokasi_des = null;
public static b4a.example.lokasi_travel _lokasi_travel = null;
public static b4a.example.lokasi_trav _lokasi_trav = null;
public static b4a.example.home _home = null;
public static b4a.example.addbooking _addbooking = null;
public static b4a.example.booking _booking = null;
public static b4a.example.login _login = null;
  public Object[] GetGlobals() {
		return new Object[] {"addbooking",Debug.moduleToString(b4a.example.addbooking.class),"booking",Debug.moduleToString(b4a.example.booking.class),"cache",starter._cache,"DateUtils",starter.mostCurrent._dateutils,"galeri_ut",Debug.moduleToString(b4a.example.galeri_ut.class),"home",Debug.moduleToString(b4a.example.home.class),"HttpUtils2Service",starter.mostCurrent._httputils2service,"info_des",Debug.moduleToString(b4a.example.info_des.class),"info_travel",Debug.moduleToString(b4a.example.info_travel.class),"info_utama",Debug.moduleToString(b4a.example.info_utama.class),"login",Debug.moduleToString(b4a.example.login.class),"lokasi",Debug.moduleToString(b4a.example.lokasi.class),"lokasi_des",Debug.moduleToString(b4a.example.lokasi_des.class),"lokasi_trav",Debug.moduleToString(b4a.example.lokasi_trav.class),"lokasi_travel",Debug.moduleToString(b4a.example.lokasi_travel.class),"Main",Debug.moduleToString(b4a.example.main.class),"ongoingTasks",starter._ongoingtasks,"pencarian_des",Debug.moduleToString(b4a.example.pencarian_des.class),"pencarian_nama",Debug.moduleToString(b4a.example.pencarian_nama.class),"pencarian_travel",Debug.moduleToString(b4a.example.pencarian_travel.class),"Service",starter.mostCurrent._service,"tasks",starter._tasks};
}
}