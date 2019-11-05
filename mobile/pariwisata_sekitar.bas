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
	Dim id, name, lat, lng, description As String
	Dim tipe As Int

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private WebView1 As WebView
	Private ListView1 As ListView
	Private ScrollView1 As ScrollView
	Private Button1 As Button
	Private Button2 As Button
	Private Button3 As Button
	Private Button4 As Button
	Private CheckBox1 As CheckBox 'hotel
	Private CheckBox2 As CheckBox 'tourism
	Private CheckBox3 As CheckBox 'worship
	Private CheckBox4 As CheckBox 'souvenir
	Private CheckBox5 As CheckBox 'culinary
	Private CheckBox6 As CheckBox 'industry
	Private CheckBox7 As CheckBox 'restaurant	
	Private Panel4 As Panel
	Private SeekBar1 As SeekBar
	Dim radius2 As Int
	Private Button5 As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("sekitar")
	
	CheckBox1.RemoveView
	CheckBox2.RemoveView
	CheckBox3.RemoveView
	CheckBox4.RemoveView
	CheckBox5.RemoveView
	CheckBox6.RemoveView
	CheckBox7.RemoveView
	
	ListView1.SingleLineLayout.Label.TextSize=16
	ListView1.SingleLineLayout.Label.Left=2%y
	ListView1.SingleLineLayout.Label.TextColor=Colors.RGB(0,0,0)
	
	ScrollView1.Panel.AddView(CheckBox1, 0, 0, ScrollView1.Width, 30dip)
	ScrollView1.Panel.AddView(CheckBox2, 0, 30dip, ScrollView1.Width, 30dip)
	ScrollView1.Panel.AddView(CheckBox3, 0, 60dip, ScrollView1.Width, 30dip)
	ScrollView1.Panel.AddView(CheckBox4, 0, 90dip, ScrollView1.Width, 30dip)
	ScrollView1.Panel.AddView(CheckBox5, 0, 120dip, ScrollView1.Width, 30dip)
	ScrollView1.Panel.AddView(CheckBox6, 0, 150dip, ScrollView1.Width, 30dip)
	ScrollView1.Panel.AddView(CheckBox7, 0, 180dip, ScrollView1.Width, 30dip)
	
End Sub

Sub Activity_Resume
	WebView1.LoadUrl(""&Main.Server&"peta1.html")
	ListView1.Clear
	CheckBox1.Checked=False
	CheckBox2.Checked=False
	CheckBox3.Checked=False
	CheckBox4.Checked=False
	CheckBox5.Checked=False
	CheckBox6.Checked=False
	CheckBox7.Checked=False
	SeekBar1.Value=0
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub ListView1_ItemClick (Position As Int, Value As Object)
	Dim b As objek_sekitar
	b=Value
	id = b.id
	name = b.name
	tipe = b.tipe
	lat = b.lat
	lng = b.lng
	
	Log(tipe)
	If tipe == 1 Then
		StartActivity(info_hotel_sek)	
	Else If tipe == 2 Then
		StartActivity(info_ow_sek)		
	Else If tipe == 3 Then
		StartActivity(info_culiner_sek)			
	Else If tipe == 4 Then
		StartActivity(info_souvenir_sek)				
	Else If tipe == 5 Then
		StartActivity(info_utama)				
	Else If tipe == 6 Then
		StartActivity(info_industri_sek)					
	Else If tipe == 7 Then
		StartActivity(info_res_sek)						
	End If
	'StartActivity(m2a_detail)	'activity melihat detail angkutan kota	
End Sub

Sub ExecuteRemoteQuery(Query As String, JobName As String)
	Dim Job As HttpJob
	Job.Initialize(JobName, Me)
	Job.PostString(""&Main.Server&"json.php", Query)
End Sub

Sub JobDone(Job As HttpJob)
	If Job.Success Then
		Dim res As String
		res = Job.GetString 'menyimpan json dalam bentuk string
		Log("Response from server :"& res) 
		Dim parser As JSONParser 'mengambil data dalam bentuk json menjadi array
		parser.Initialize(res)
		Select Job.JobName
			Case "Sekitar"
				Dim produkik_array As List 
				produkik_array = parser.NextArray
				If produkik_array.Size - 1 < 0 Then
					Msgbox("Data Not Found", "Warning")
				Else
					For i=0 To produkik_array.Size -1
						Dim a As Map
						a = produkik_array.Get(i)
						Dim b As objek_sekitar
						b.Initialize					
						b.id = a.Get("id")
						b.name = a.Get("name")
						b.lat = a.Get("lat")						
						b.lng = a.Get("lng")															
						' 1hotel
						' 2tourism
						' 3worship
						' 4souvenir
						' 5culinary
						' 6industry
						' 7restaurant
						If b.id.Contains("H") Then
							Log("Tipe Hotel")
							b.tipe = 1
						Else If b.id.Contains("tw") Then
							Log("Tipe Tourism")
							b.tipe = 2
						Else If b.id.Contains("RM") Then
							Log("Tipe Culinary")
							b.tipe = 3
						Else If b.id.Contains("SO") Then
							Log("Tipe Souvenir")
							b.tipe = 4
						Else If b.id.Contains("M") Then
							Log("Tipe Worship")
							b.tipe = 5
						Else If b.id.Contains("IK") Then
							Log("Tipe Industry")
							b.tipe = 6
						Else If b.id.Contains("R") Then
							Log("Tipe Restaurant")
							b.tipe = 7
						End If
								
'						http://192.168.1.249/_ta2/_mobile/_all_marker_angkot.php?hotel=1&tourism=1&worship=1&souvenir=1&culinary=1&industry=1&restaurant=1&id_angkot=13								
						ListView1.AddSingleLine2(b.name,b) 'memasukkan jurusan ke dalam listview
					Next
				End If
		End Select
	End If	
	Job.Release
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

Sub Button1_Click
	StartActivity(Main)
End Sub

Sub SeekBar1_ValueChanged (Value As Int, UserChanged As Boolean)
	radius2=Value*100
	Log("radius jalan"&radius2)
					
End Sub

Sub Button5_Click
	Dim hotel = 0 , tourism = 0 , worship = 0 , souvenir = 0 , culinary = 0 , industry = 0 , restaurant = 0 As Int	
	ListView1.Clear

	ProgressDialogShow("Loading ....")
	If CheckBox1.Checked Then 'hotel
		hotel = 1
		ExecuteRemoteQuery("SELECT id, name, address, cp, ktp, marriage_book, mushalla, star, id_type, st_x(st_centroid(geom)) as lng, st_y(st_centroid(geom)) as lat, st_distance_sphere(ST_GeomFromText('POINT("&info_utama.lng&" "&info_utama.lat&")',-1), geom) as jarak FROM hotel where st_distance_sphere(ST_GeomFromText('POINT("&info_utama.lng&" "&info_utama.lat&")',-1), geom) <= "&radius2&"","Sekitar")
	End If
	
	If CheckBox2.Checked Then 'tourism
		tourism = 1
		ExecuteRemoteQuery("SELECT id, name, address, open, close, ticket, id_type, st_x(st_centroid(geom)) as lng, st_y(st_centroid(geom)) as lat, st_distance_sphere(ST_GeomFromText('POINT("&info_utama.lng&" "&info_utama.lat&")',-1), geom) as jarak FROM tourism where st_distance_sphere(ST_GeomFromText('POINT("&info_utama.lng&" "&info_utama.lat&")',-1), geom) <= "&radius2&"","Sekitar")		
	End If

	If CheckBox3.Checked Then 'worship
		worship = 1
		ExecuteRemoteQuery("SELECT id, name, address, land_size, building_size, park_area_size, capacity, est, last_renovation, imam, jamaah, teenager, st_x(st_centroid(geom)) as lng, st_y(st_centroid(geom)) as lat, st_distance_sphere(ST_GeomFromText('POINT("&info_utama.lng&" "&info_utama.lat&")',-1), geom) as jarak FROM worship_place where st_distance_sphere(ST_GeomFromText('POINT("&info_utama.lng&" "&info_utama.lat&")',-1), geom) <= "&radius2&"","Sekitar")			
	End If

	If CheckBox4.Checked Then 'souvenir
		souvenir = 1
		ExecuteRemoteQuery("SELECT id, name, owner, cp, address, id_souvenir_type, employee, st_x(st_centroid(geom)) as lng, st_y(st_centroid(geom)) as lat, st_distance_sphere(ST_GeomFromText('POINT("&info_utama.lng&" "&info_utama.lat&")',-1), geom) as jarak FROM souvenir where st_distance_sphere(ST_GeomFromText('POINT("&info_utama.lng&" "&info_utama.lat&")',-1), geom) <= "&radius2&"","Sekitar")						
	End If

	If CheckBox5.Checked Then 'culinary
		culinary = 1
		ExecuteRemoteQuery("SELECT id, name, address, cp, capacity, open, close, employee, st_x(st_centroid(geom)) as lng, st_y(st_centroid(geom)) as lat, st_distance_sphere(ST_GeomFromText('POINT("&info_utama.lng&" "&info_utama.lat&")',-1), geom) as jarak FROM culinary_place where st_distance_sphere(ST_GeomFromText('POINT("&info_utama.lng&" "&info_utama.lat&")',-1), geom) <= "&radius2&"","Sekitar")			
	End If

	If CheckBox6.Checked Then 'industry
		industry = 1
		ExecuteRemoteQuery("SELECT id, name, owner, cp, address, id_industry_type, employee, st_x(st_centroid(geom)) as lng, st_y(st_centroid(geom)) as lat, st_distance_sphere(ST_GeomFromText('POINT("&info_utama.lng&" "&info_utama.lat&")',-1), geom) as jarak FROM small_industry where st_distance_sphere(ST_GeomFromText('POINT("&info_utama.lng&" "&info_utama.lat&")',-1), geom) <= "&radius2&"","Sekitar")						
	End If

	If CheckBox7.Checked Then 'restaurant
		restaurant = 1
		ExecuteRemoteQuery("SELECT id, name, address, cp, open, close, capacity, employee, mushalla, park_area, bathroom, id_category, st_x(st_centroid(geom)) as lng, st_y(st_centroid(geom)) as lat, st_distance_sphere(ST_GeomFromText('POINT("&info_utama.lng&" "&info_utama.lat&")',-1), geom) as jarak FROM restaurant where st_distance_sphere(ST_GeomFromText('POINT("&info_utama.lng&" "&info_utama.lat&")',-1), geom) <= "&radius2&"","Sekitar")					
	End If	
	
	WebView1.LoadUrl(""&Main.Server&"all_mark_sek.php?hotel="&hotel&"&tourism="&tourism&"&worship="&worship&"&souvenir="&souvenir&"&culinary="&culinary&"&industry="&industry&"&restaurant="&restaurant&"&latitude="&info_utama.lat&"&longitude="&info_utama.lng&"&rad="&radius2)
		
				ProgressDialogHide
End Sub