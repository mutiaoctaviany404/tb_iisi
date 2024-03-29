﻿Type=Activity
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
	
	Private Label7 As Label
	Private Label8 As Label
	Private Label9 As Label
	Private Label10 As Label
	Private Label12 As Label
		
	Private Button1 As Button
	Private Button2 As Button
	Private Button3 As Button
	Private Button4 As Button
	
	Private Button6 As Button

End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("informasi_sekitar_2")
	Label3.Text = "Owner:"
	Label4.Text = "Cp:"
	Label5.Text = "Address:"
	Label6.Text = "Employee:"
	Label11.Text = "Type:"

End Sub

Sub Activity_Resume
	ProgressDialogShow("Loading ....")
	ExecuteRemoteQuery("SELECT small_industry.id, small_industry.name, small_industry.owner, small_industry.cp, small_industry.address, small_industry.employee, industry_type.name as type_industry, st_x(st_centroid(small_industry.geom)) as lon,st_y(st_centroid(small_industry.geom)) as lat  from small_industry left join industry_type on industry_type.id = small_industry.id_industry_type where small_industry.id='"&pariwisata_sekitar.id&"'","DATA")

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
	StartActivity(lokasi_sek_industri)
	lokasi_sek_industri.latTujuan=lat
	lokasi_sek_industri.lngTujuan=lng
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
						Label7.Text=a.Get("owner")
						Label8.Text=a.Get("cp")		
						Label9.Text=a.Get("address")	
						Label10.Text = a.Get("employee")
						Label10.Text = a.Get("type_industry")	
						
					Next
				End If		
				ProgressDialogHide				
		End Select
	End If	
	Job.Release
End Sub