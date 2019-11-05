Type=Activity
Version=5.8
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim latAsal, lngAsal, latAsal1, lngAsal1,latTujuan, lngTujuan, latHenti, lngHenti, idow As String
	Dim id, lat, lng, id_angkot, destination, route_color As String
	Type sekitarangkotow_lines (isi1 As String,isi2 As String,isi3 As String)
	Dim ANGKOTRM="ANGKOTRM" As String	

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private WebView1 As WebView
	Private ListView1 As ListView
	Private Button5 As Button
	Private Button6 As Button
	Private Button1 As Button
	Private Button2 As Button
	Private Button3 As Button
	Private Button4 As Button
	Private Button7 As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("lokasi_sekitar")
	posisi1
	latAsal = current_pos.latUser
	lngAsal = current_pos.lngUser
	latAsal1 = info_utama.lat
	lngAsal1 = info_utama.lng
	idow = info_ow_sek.id
	
End Sub

Sub Activity_Resume
	latAsal = current_pos.latUser
	lngAsal = current_pos.lngUser
	latAsal1 = info_utama.lat
	lngAsal1 = info_utama.lng

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub ExecuteRemoteQuery(Query As String, JobName As String)
	Dim Job As HttpJob
	Job.Initialize(JobName, Me)
	Job.PostString(""&Main.server&"json.php", Query)
End Sub

Sub JobDone(Job As HttpJob)
ProgressDialogHide
	If Job.Success Then
		Dim res As String
		res = Job.GetString
		Log("Response from server :"&res)
		Dim parser As JSONParser
		parser.Initialize(res)
		Select Job.JobName	
				Case ANGKOTRM
			Dim angkotrm_array As List
			angkotrm_array = parser.NextArray
				For i=0 To angkotrm_array.Size -1
					Dim a As Map
					a = angkotrm_array.Get(i)
					Dim b As sekitarangkotow_lines
					b.Initialize
					b.isi1 = a.Get("id_angkot")
					b.isi2 = a.Get("destination")
					b.isi3 = a.Get("route_color")
					latHenti = a.Get("lat")
					lngHenti = a.Get("lng")
					ListView1.AddTwoLines2(b.isi1, b.isi2,b)
					Next
		End Select
	End If	
End Sub

Sub posisi1
	WebView1.LoadUrl(""&Main.Server&"petaow.php?lat="&latTujuan&"&lng="&lngTujuan)
	Log("lat posisi 1: "&latTujuan&" Long : "&lngTujuan)
End Sub

Sub lihatrute(a1 As Float,a2 As Float, b1 As Float, b2 As Float)
	WebView1.LoadUrl(""&Main.Server&"route.php?a1="&latAsal&"&a2="&lngAsal&"&b1="&latTujuan&"&b2="&lngTujuan)
	Log(""&Main.Server&"route.php?a1="&latAsal&"&a2="&lngAsal&"&b1="&latTujuan&"&b2="&lngTujuan)
End Sub

Sub lihatrute1(a3 As Float,a4 As Float, b3 As Float, b4 As Float)
	WebView1.LoadUrl(""&Main.Server&"routemes.php?a3="&latAsal1&"&a4="&lngAsal1&"&b3="&latTujuan&"&b4="&lngTujuan)
	Log(""&Main.Server&"routemes.php?a3="&latAsal1&"&a4="&lngAsal1&"&b3="&latTujuan&"&b4="&lngTujuan)
End Sub

Sub Button5_Click
		If current_pos.latUser=0 And current_pos.lngUser=0 Then
		Log("posisi saat ini belum ada")
		ToastMessageShow("Click Button Current Position First !", True)
		StartActivity(current_pos)
	Else
		lihatrute(latAsal,lngAsal,latTujuan,lngTujuan)
		Log(latTujuan)
		Log(lngTujuan)
		Log(latAsal)
	End If
End Sub

Sub Button6_Click
	ListView1.Clear
	Log("haiii")
	ProgressDialogShow("Loading ....")	
	ExecuteRemoteQuery("SELECT detail_tourism.id_tourism,angkot.destination, angkot.route_color, detail_tourism.id_angkot,tourism.name, ST_X(ST_Centroid(tourism.geom)) AS longitude, ST_Y(ST_CENTROID(tourism.geom)) As latitude, lat, lng, description FROM detail_tourism left join angkot on detail_tourism.id_angkot=angkot.id left join tourism on detail_tourism.id_tourism=tourism.id where detail_tourism.id_tourism='"&idow&"'","ANGKOTRM")
End Sub

Sub ListView1_ItemClick (Position As Int, Value As Object)
	Dim b As sekitarangkotow_lines
	b=Value
	id_angkot=b.isi1
	destination=b.isi2
	route_color=b.isi3
	Log(idow)
	Log(lngHenti)
	Log(latHenti)
	WebView1.LoadUrl(Main.Server&"petaow.php?lat="&latTujuan&"&lng="&lngTujuan&"&route_color="&route_color&"&id_angkot="&id_angkot&"&lathenti="&latHenti&"&lnghenti="&lngHenti)
End Sub

Sub Button1_Click
	StartActivity(Main)
End Sub

Sub Button2_Click
	StartActivity(current_pos)
End Sub

Sub Button3_Click
	StartActivity(pencarian_nama)
End Sub

Sub Button4_Click
	StartActivity(radius)
End Sub

Sub Button7_Click
	lihatrute1(latAsal1,lngAsal1,latTujuan,lngTujuan)
End Sub