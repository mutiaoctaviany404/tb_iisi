
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

public class galeri_ut implements IRemote{
	public static galeri_ut mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public galeri_ut() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("galeri_ut"), "b4a.example.galeri_ut");
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
		pcBA = new PCBA(this, galeri_ut.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _viewfoto1 = RemoteObject.createImmutable("");
public static RemoteObject _viewfotos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _id_gallery = RemoteObject.createImmutable("");
public static RemoteObject _panel4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _scrollview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _lstchecks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _height = RemoteObject.createImmutable(0);
public static RemoteObject _listview1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _httputils2service = RemoteObject.declareNull("anywheresoftware.b4a.samples.httputils2.httputils2service");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.info_utama _info_utama = null;
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
public static b4a.example.starter _starter = null;
public static b4a.example.booking _booking = null;
public static b4a.example.login _login = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",galeri_ut.mostCurrent._activity,"addbooking",Debug.moduleToString(b4a.example.addbooking.class),"booking",Debug.moduleToString(b4a.example.booking.class),"DateUtils",galeri_ut.mostCurrent._dateutils,"height",galeri_ut._height,"home",Debug.moduleToString(b4a.example.home.class),"HttpUtils2Service",galeri_ut.mostCurrent._httputils2service,"id_gallery",galeri_ut._id_gallery,"info_des",Debug.moduleToString(b4a.example.info_des.class),"info_travel",Debug.moduleToString(b4a.example.info_travel.class),"info_utama",Debug.moduleToString(b4a.example.info_utama.class),"ListView1",galeri_ut.mostCurrent._listview1,"login",Debug.moduleToString(b4a.example.login.class),"lokasi",Debug.moduleToString(b4a.example.lokasi.class),"lokasi_des",Debug.moduleToString(b4a.example.lokasi_des.class),"lokasi_trav",Debug.moduleToString(b4a.example.lokasi_trav.class),"lokasi_travel",Debug.moduleToString(b4a.example.lokasi_travel.class),"lstChecks",galeri_ut.mostCurrent._lstchecks,"Main",Debug.moduleToString(b4a.example.main.class),"Panel4",galeri_ut.mostCurrent._panel4,"pencarian_des",Debug.moduleToString(b4a.example.pencarian_des.class),"pencarian_nama",Debug.moduleToString(b4a.example.pencarian_nama.class),"pencarian_travel",Debug.moduleToString(b4a.example.pencarian_travel.class),"ScrollView1",galeri_ut.mostCurrent._scrollview1,"Starter",Debug.moduleToString(b4a.example.starter.class),"ViewFoto1",galeri_ut._viewfoto1,"ViewFotos",galeri_ut._viewfotos};
}
}