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
	Dim id,fasilitas, lat, lng As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private Button1 As Button
	Private Button2 As Button
	Private Button3 As Button
	Private Button4 As Button
	
	Private Button6 As Button

	
	Private Label2 As Label
	Private Label3 As Label
	Private Label4 As Label
	Private Label5 As Label
	Private Label6 As Label
	Private Label11 As Label
	
	Private Label7 As Label
	Private Label8 As Label
	Private Label9 As Label
	Private Label10 As Label
	Private Label12 As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("informasi_sekitar_2")
	Label3.Text = "Address:"
	Label4.Text = "Time:"
	Label5.Text = "Ticket:"
	Label6.Text = "Tourism Type:"
	Label11.Text = "Fasility:"
	
End Sub

Sub Activity_Resume
	fasilitas = ""
	ProgressDialogShow("Loading ....")
	ExecuteRemoteQuery("SELECT tourism.id, tourism.name, tourism.address, tourism.open, tourism.close, tourism.ticket, tourism_type.name as tourism_type, st_x(st_centroid(tourism.geom)) as lon, st_y(st_centroid(tourism.geom)) as lat from tourism left join tourism_type on tourism_type.id=tourism.id_type where tourism.id ='"&pariwisata_sekitar.id&"'","DATA")
	ExecuteRemoteQuery("SELECT facility_tourism.id, facility_tourism.name FROM facility_tourism left join detail_facility_tourism on detail_facility_tourism.id_facility = facility_tourism.id left join tourism on tourism.id = detail_facility_tourism.id_tourism where tourism.id = '"&pariwisata_sekitar.id&"'","FASILITAS")

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Button1_Click	'home
	StartActivity(Main)   
End Sub
Sub Button2_Click	'posisi saat ini
	StartActivity(current_pos)		
End Sub
Sub Button3_Click	'pencarian nama
	StartActivity(pencarian_nama)
End Sub
Sub Button4_Click	'radius
	StartActivity(radius)		
End Sub
Sub Button6_Click	'map
	StartActivity(lokasi_sek_ow)
	lokasi_sek_ow.latTujuan=lat
	lokasi_sek_ow.lngTujuan=lng
End Sub
Sub Button7_Click	'gallery

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
			Case "DATA"
				Dim produkik_array As List 
				produkik_array = parser.NextArray
				If produkik_array.Size - 1 < 0 Then
					Msgbox("Data Not Found", "Warning")
				Else
					For i=0 To produkik_array.Size -1
						Dim a As Map
						a = produkik_array.Get(i)
						id = a.Get("id")
						lat = a.Get("lat")
						lng = a.Get("lon")
						Log(lat)
						Log(lng)
						
						Label2.Text=a.Get("name")						'nama 
						Label7.Text=a.Get("address")					'alamat
						Label8.Text=a.Get("open")&" - "&a.Get("close")	'time
						Label9.Text=a.Get("ticket")						'ticket
						Label10.Text=a.Get("tourism_type")				'tipe
						
					Next
				End If		
			Case "FASILITAS"
				Dim produkik_array As List 
				produkik_array = parser.NextArray
				If produkik_array.Size - 1 < 0 Then
					fasilitas = "-"
				Else
					Dim stat = 0 As Int				
					For i=0 To produkik_array.Size -1
						Dim a As Map
						a = produkik_array.Get(i)		
						If i = produkik_array.Size Then
							fasilitas = fasilitas & a.Get("name")
						Else
							fasilitas = fasilitas & a.Get("name") & ", "
						End If							
						stat = stat + 1
					Next
					If stat > 1 Then
						Dim fas As String
			            fas = fasilitas.SubString2(0, fasilitas.Length -2)  
						Log(fas)
					End If
					Label12.Text= fasilitas
				End If		
				ProgressDialogHide				
		End Select
	End If	
	Job.Release
End Sub