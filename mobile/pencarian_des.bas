Type=Activity
Version=6
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
	'Dim KATEGORI = "KATEGORIMES" As String
	Dim KEC= "KEC" As String
	Dim kategori_daftar As Map
	Dim id_tempat_list As Map
	
	Dim id_kec, nama_kec As String
	Dim id_objek, nama_objek As String
	Dim id_tempat, nama_tempat As String
	Dim id As String
	Dim name As String
	Dim price As Int
	Type kec_lines (isi1 As String,isi2 As String,isi3 As String,isi4 As String, isi5 As String)

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private Spinner1 As Spinner
	Private Button1 As Button
	Private ListView1 As ListView
	Private Spinner2 As Spinner
	Private Spinner3 As Spinner
End Sub


Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("pencarian_des")
	kategori_daftar.Initialize
	id_tempat_list.Initialize
	daftarkec
	Spinner1.Color=Colors.RGB(255, 250, 240)
	Spinner1.DropdownBackgroundColor=Colors.RGB(72, 39, 39)
	ListView1.SingleLineLayout.Label.TextColor=Colors.RGB(72, 39, 39)
	ListView1.SingleLineLayout.Label.TextSize=16
	ListView1.SingleLineLayout.Label.Left=2%y
	
	Spinner1.Color=Colors.RGB(252, 206, 84)
	Spinner2.Color=Colors.RGB(252, 206, 84)
	Spinner3.Color=Colors.RGB(252, 206, 84)
	Spinner1.DropdownBackgroundColor=Colors.RGB(252, 206, 84)
	Spinner2.DropdownBackgroundColor=Colors.RGB(252, 206, 84)
	Spinner3.DropdownBackgroundColor=Colors.RGB(252, 206, 84)
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub ExecuteRemoteQuery(Query As String, JobName As String)
	Dim Job As HttpJob
	Job.Initialize(JobName, Me)
	Job.PostString(""&Main.server&"json.php", Query)
End Sub

Sub daftarkec
	Spinner1.Add("--Choose district--")
	ProgressDialogShow("Loading ....")
	ExecuteRemoteQuery("select * from district","KEC") 'eksekusi query mencari produk industri kerajinan

End Sub

Sub JobDone(Job As HttpJob)
ProgressDialogHide
	If Job.Success Then
		Dim res As String
		res = Job.GetString
		'ToastMessageShow("execute dari "&Job.JobName&"Response from server :"& res,True)
		Dim parser As JSONParser
		parser.Initialize(res)
		Select Job.JobName
				Case KEC
				Dim jenis_array As List
				jenis_array = parser.NextArray	
				If(jenis_array.Size>0) Then
					For i=0 To jenis_array.Size -1
						Dim a As Map
						a = jenis_array.Get(i)
						id_kec=a.Get("id")
						nama_kec=a.Get("name")
						Spinner1.Add(nama_kec) 'meninputkan nama produk pada spinner
						kategori_daftar.Put(nama_kec, id_kec)
					Next

				End If	

				Case "objek"
				Spinner3.Clear
				Dim jenis_array As List
				jenis_array = parser.NextArray	
				If(jenis_array.Size>0) Then
					For i=0 To jenis_array.Size -1
						Dim a As Map
						a = jenis_array.Get(i)
						id_tempat=a.Get("id")
						nama_tempat=a.Get("name")
						Spinner3.Add(nama_tempat) 'meninputkan nama produk pada spinner
						id_tempat_list.Put(nama_tempat, id_tempat)
					Next
				End If	

				Case "paket"
				ListView1.Clear
				Dim jenis_array As List
				jenis_array = parser.NextArray	
				If(jenis_array.Size>0) Then

				For i=0 To jenis_array.Size -1
					Dim m As Map
					m = jenis_array.Get(i)
					Dim b As daftarpaket_lines
					b.Initialize
					b.id = m.Get("id")
					b.name = m.Get("name")
					b.price= m.Get("price")
					ListView1.AddSingleLine2(b.name,b)
				Next
				End If						
					
		End Select
	End If	
	Job.Release	
End Sub


Sub ListView1_ItemClick (Position As Int, Value As Object)
	Dim b As daftarpaket_lines
	b=Value
	id =b.id
	name = b.name
	price = b.price
	StartActivity(info_des)
	'StartActivity(info_travel)
	
End Sub

Sub Spinner1_ItemClick (Position As Int, Value As Object)
	id_kec= kategori_daftar.Get(Value) 'mendapatkan id kategori yang dipilih pada spinner
	Log(id_kec)
	'ToastMessageShow("anda memlikih kecamatan dengan ID="&id_kec,True)
				
	Spinner2.Clear	
	Spinner2.Add("Souvenir")
	Spinner2.Add("Tourism")
	Spinner2.Add("Restaurant")
	Spinner2.Add("Mosque")
	Spinner2.Add("Hotel")
	kategori_daftar.Put("Souvenir",1)
	kategori_daftar.Put("Tourism",2)
	kategori_daftar.Put("Restaurant",3)
	kategori_daftar.Put("Mosque",4)
	kategori_daftar.Put("Hotel",5)

End Sub

Sub Spinner2_ItemClick (Position As Int, Value As Object)
	id_objek= kategori_daftar.Get(Value)					
	Log(id_objek)
	If id_objek ==1 Then
	ProgressDialogShow("Loading ....")
	ExecuteRemoteQuery("Select souvenir.id, souvenir.name, district.id as id_kec from souvenir, district where st_contains(district.geom1, souvenir.geom) and district.id='"&id_kec&"'","objek") 
		
	Else if id_objek ==2 Then
	ProgressDialogShow("Loading ....")
	ExecuteRemoteQuery("Select tourism.id, tourism.name, district.id as id_kec from tourism, district where st_contains(district.geom1, tourism.geom) and district.id='"&id_kec&"'","objek") 
	
	Else if id_objek ==3 Then
	ProgressDialogShow("Loading ....")
	ExecuteRemoteQuery("Select restaurant.id, restaurant.name, district.id as id_kec from restaurant, district where st_contains(district.geom1, restaurant.geom) and district.id='"&id_kec&"'","objek") 
	
	Else If id_objek ==4 Then	
	ProgressDialogShow("Loading ....")
	ExecuteRemoteQuery("Select workship_place.id, workship_place.name, district.id as id_kec from workship_place, district where st_contains(district.geom1, workship_place.geom) and district.id='"&id_kec&"'","objek") 
		
	Else If id_objek ==5 Then	
	ProgressDialogShow("Loading ....")
	ExecuteRemoteQuery("Select hotel.id, hotel.name, district.id as id_kec from hotel, district where st_contains(district.geom1, hotel.geom) and district.id='"&id_kec&"'","objek") 

	End If
End Sub

Sub Spinner3_ItemClick (Position As Int, Value As Object)
	id_tempat= id_tempat_list.Get(Value)					
	Log(id_tempat)
	'ToastMessageShow("Id tempat yg terpilih : "&id_tempat,True)
	Log("select package.id,package.name from package left join  object_point on object_point.id_package = package.id where object_point.id_souvenir='"&id_tempat&"'")
	If id_objek ==1 Then
	ProgressDialogShow("Loading ....")
	ExecuteRemoteQuery("select package.id,package.name, package.price from package left join  object_point on object_point.id_package = package.id where object_point.id_souvenir='"&id_tempat&"'","paket") 
	
	Else if id_objek ==2 Then
	ProgressDialogShow("Loading ....")
	ExecuteRemoteQuery("select package.id,package.name, package.price from package left join  object_point on object_point.id_package = package.id where object_point.id_tourism='"&id_tempat&"'","paket") 
	
	Else if id_objek ==3 Then
	ProgressDialogShow("Loading ....")
	ExecuteRemoteQuery("select package.id,package.name, package.price from package left join  object_point on object_point.id_package = package.id where object_point.id_restaurant='"&id_tempat&"'","paket") 
	
	Else If id_objek ==4 Then	
	ProgressDialogShow("Loading ....")
	ExecuteRemoteQuery("select package.id,package.name, package.price from package left join  object_point on object_point.id_package = package.id where object_point.id_worship_place='"&id_tempat&"'","paket") 

	Else If id_objek ==5 Then	
	ProgressDialogShow("Loading ....")
	ExecuteRemoteQuery("select package.id,package.name, package.price from package left join  object_point on object_point.id_package = package.id where object_point.id_hotel='"&id_tempat&"'","paket") 	
	End If
	
End Sub

Sub Button2_Click
	StartActivity(pencarian_travel)
End Sub

Sub Button3_Click
	StartActivity(pencarian_nama)
End Sub

Sub Button4_Click
	'StartActivity(pencarian_des)
End Sub
