
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

public class pencarian_nama implements IRemote{
	public static pencarian_nama mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public pencarian_nama() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("pencarian_nama"), "b4a.example.pencarian_nama");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, pencarian_nama.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _inputnama1 = RemoteObject.createImmutable("");
public static RemoteObject _paket_nama = RemoteObject.createImmutable("");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _name = RemoteObject.createImmutable("");
public static RemoteObject _price = RemoteObject.createImmutable(0);
public static RemoteObject _edittext1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _listview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
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
public static b4a.example.lokasi_des _lokasi_des = null;
public static b4a.example.lokasi_travel _lokasi_travel = null;
public static b4a.example.lokasi_trav _lokasi_trav = null;
public static b4a.example.home _home = null;
public static b4a.example.addbooking _addbooking = null;
public static b4a.example.starter _starter = null;
public static b4a.example.booking _booking = null;
public static b4a.example.login _login = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",pencarian_nama.mostCurrent._activity,"addbooking",Debug.moduleToString(b4a.example.addbooking.class),"booking",Debug.moduleToString(b4a.example.booking.class),"DateUtils",pencarian_nama.mostCurrent._dateutils,"EditText1",pencarian_nama.mostCurrent._edittext1,"galeri_ut",Debug.moduleToString(b4a.example.galeri_ut.class),"home",Debug.moduleToString(b4a.example.home.class),"HttpUtils2Service",pencarian_nama.mostCurrent._httputils2service,"id",pencarian_nama._id,"info_des",Debug.moduleToString(b4a.example.info_des.class),"info_travel",Debug.moduleToString(b4a.example.info_travel.class),"info_utama",Debug.moduleToString(b4a.example.info_utama.class),"inputnama1",pencarian_nama._inputnama1,"ListView1",pencarian_nama.mostCurrent._listview1,"login",Debug.moduleToString(b4a.example.login.class),"lokasi",Debug.moduleToString(b4a.example.lokasi.class),"lokasi_des",Debug.moduleToString(b4a.example.lokasi_des.class),"lokasi_trav",Debug.moduleToString(b4a.example.lokasi_trav.class),"lokasi_travel",Debug.moduleToString(b4a.example.lokasi_travel.class),"Main",Debug.moduleToString(b4a.example.main.class),"name",pencarian_nama._name,"paket_nama",pencarian_nama._paket_nama,"pencarian_des",Debug.moduleToString(b4a.example.pencarian_des.class),"pencarian_travel",Debug.moduleToString(b4a.example.pencarian_travel.class),"price",pencarian_nama._price,"Starter",Debug.moduleToString(b4a.example.starter.class)};
}
}