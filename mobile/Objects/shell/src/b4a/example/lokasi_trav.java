
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

public class lokasi_trav implements IRemote{
	public static lokasi_trav mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public lokasi_trav() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("lokasi_trav"), "b4a.example.lokasi_trav");
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
		pcBA = new PCBA(this, lokasi_trav.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _latasal = RemoteObject.createImmutable("");
public static RemoteObject _lngasal = RemoteObject.createImmutable("");
public static RemoteObject _lattujuan = RemoteObject.createImmutable("");
public static RemoteObject _lngtujuan = RemoteObject.createImmutable("");
public static RemoteObject _lathenti = RemoteObject.createImmutable("");
public static RemoteObject _lnghenti = RemoteObject.createImmutable("");
public static RemoteObject _idmes = RemoteObject.createImmutable("");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _lat = RemoteObject.createImmutable("");
public static RemoteObject _lng = RemoteObject.createImmutable("");
public static RemoteObject _id_angkot = RemoteObject.createImmutable("");
public static RemoteObject _destination = RemoteObject.createImmutable("");
public static RemoteObject _route_color = RemoteObject.createImmutable("");
public static RemoteObject _peta = RemoteObject.createImmutable("");
public static RemoteObject _webview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _listview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _button5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _button6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _button2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _button3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _button4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
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
public static b4a.example.home _home = null;
public static b4a.example.addbooking _addbooking = null;
public static b4a.example.starter _starter = null;
public static b4a.example.booking _booking = null;
public static b4a.example.login _login = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",lokasi_trav.mostCurrent._activity,"addbooking",Debug.moduleToString(b4a.example.addbooking.class),"booking",Debug.moduleToString(b4a.example.booking.class),"Button1",lokasi_trav.mostCurrent._button1,"Button2",lokasi_trav.mostCurrent._button2,"Button3",lokasi_trav.mostCurrent._button3,"Button4",lokasi_trav.mostCurrent._button4,"Button5",lokasi_trav.mostCurrent._button5,"Button6",lokasi_trav.mostCurrent._button6,"DateUtils",lokasi_trav.mostCurrent._dateutils,"destination",lokasi_trav._destination,"galeri_ut",Debug.moduleToString(b4a.example.galeri_ut.class),"home",Debug.moduleToString(b4a.example.home.class),"HttpUtils2Service",lokasi_trav.mostCurrent._httputils2service,"id",lokasi_trav._id,"id_angkot",lokasi_trav._id_angkot,"idmes",lokasi_trav._idmes,"info_des",Debug.moduleToString(b4a.example.info_des.class),"info_travel",Debug.moduleToString(b4a.example.info_travel.class),"info_utama",Debug.moduleToString(b4a.example.info_utama.class),"lat",lokasi_trav._lat,"latAsal",lokasi_trav._latasal,"latHenti",lokasi_trav._lathenti,"latTujuan",lokasi_trav._lattujuan,"ListView1",lokasi_trav.mostCurrent._listview1,"lng",lokasi_trav._lng,"lngAsal",lokasi_trav._lngasal,"lngHenti",lokasi_trav._lnghenti,"lngTujuan",lokasi_trav._lngtujuan,"login",Debug.moduleToString(b4a.example.login.class),"lokasi",Debug.moduleToString(b4a.example.lokasi.class),"lokasi_des",Debug.moduleToString(b4a.example.lokasi_des.class),"lokasi_travel",Debug.moduleToString(b4a.example.lokasi_travel.class),"Main",Debug.moduleToString(b4a.example.main.class),"pencarian_des",Debug.moduleToString(b4a.example.pencarian_des.class),"pencarian_nama",Debug.moduleToString(b4a.example.pencarian_nama.class),"pencarian_travel",Debug.moduleToString(b4a.example.pencarian_travel.class),"PETA",lokasi_trav._peta,"route_color",lokasi_trav._route_color,"Starter",Debug.moduleToString(b4a.example.starter.class),"WebView1",lokasi_trav.mostCurrent._webview1};
}
}