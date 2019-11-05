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

	Dim id, lat, lng As String
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private Label2 As Label
	Private Label3 As Label
	Private Label4 As Label
	Private Label5 As Label
	Private Label6 As Label
	Private Label11 As Label
	Private Label13 As Label
	
	Private Label7 As Label
	Private Label8 As Label
	Private Label9 As Label
	Private Label10 As Label
	Private Label12 As Label
	Private Label14 As Label
		
	Private Button1 As Button
	Private Button2 As Button
	Private Button3 As Button
	Private Button4 As Button
	
	Private Button6 As Button
	Private Button7 As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("informasi_sekitar_7")
	Label3.Text = "Cp:"
	Label4.Text = "Address:"
	Label5.Text = "Time:"
	Label6.Text = "Capacity:"
	Label11.Text = "Type:"
	Label13.Text = "Fasility:"

End Sub

Sub Activity_Resume
	ProgressDialogShow("Loading ....")
	ExecuteRemoteQuery("SELECT restaurant.id, restaurant.name, restaurant.cp, restaurant.address, restaurant.open, restaurant.close, restaurant.capacity, restaurant.employee, restaurant.mushalla, restaurant.park_area, restaurant.bathroom, restaurant_category.name as type_restaurant, st_x(st_centroid(restaurant.geom)) as lon,st_y(st_centroid(restaurant.geom)) as lat from restaurant left join restaurant_category on restaurant_category.id = restaurant.id_category where restaurant.id='"&pariwisata_sekitar.id&"'","DATA")

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
	StartActivity(lokasi_sek)
	lokasi_sek.latTujuan=lat
	lokasi_sek.lngTujuan=lng
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
						
						Label2.Text=a.Get("name")		
						Label7.Text=a.Get("cp")	
						Label8.Text=a.Get("address")		
						Label9.Text=a.Get("open")&" - "&a.Get("close")
						Label10.Text = a.Get("capacity")		
						
						Dim fas As String
						If a.Get("mushalla") = 1 Then
							fas = fas & "Mushalla "							
						End If
						If a.Get("park_area") = 1 Then
							fas = fas & "Park Area "													
						End If
						If a.Get("bathroom") = 1 Then
							fas = fas & "Bathroom "													
						End If
						Label12.Text = fas	
							
						Label14.Text = a.Get("type_restaurant")		
						
					Next
				End If		
				ProgressDialogHide				
		End Select
	End If	
	Job.Release
End Sub