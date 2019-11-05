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
	Dim ViewFoto1="ViewFoto1" As String
	Dim ViewFotos="ViewFotos" As List
	Dim id_gallery As String

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private Panel4 As Panel
	Dim ScrollView1 As ScrollView
	Dim lstChecks As List
	Dim height As Int
	height = 150dip 
	Private ListView1 As ListView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("gallery")
	fotoquery
End Sub

Sub fotoquery
	ProgressDialogShow("Loading")
	'eksekusi query mengambil data foto industri kerajinan berdasarkan id ik yang dipilih
	'Msgbox(pencarian_des.id,"id")
	ExecuteRemoteQuery("SELECT * from object_point where id_package='"&pencarian_des.id&"'","ViewFoto1")
	ExecuteRemoteQuery("SELECT * from object_point where id_package='"&pencarian_nama.id&"'","ViewFoto1")
	ExecuteRemoteQuery("SELECT * from object_point where id_package='"&pencarian_travel.id&"'","ViewFoto1")
End Sub


Sub ExecuteRemoteQuery(Query As String, JobName As String)
	Dim Job As HttpJob
	Job.Initialize(JobName, Me)
	Job.PostString(""&Main.server&"json.php", Query)
End Sub

Sub ExecuteRemoteQuery2(Query As String, JobName As String)
	Dim Job As HttpJob
	Job.Initialize(JobName, Me)
	Job.PostString(""&Main.server&"json.php", Query)
End Sub

Sub Jobdone (Job As HttpJob)

	ProgressDialogHide
	If Job.Success Then
	Dim res As String
	res= Job.GetString
	Dim parser As JSONParser
	parser.Initialize(res)
	Select Job.JobName
		Case ViewFoto1
		Dim mes_array As List
			mes_array = parser.NextArray
			'Msgbox(mes_array.size,"title")
				For i=0 To mes_array.Size -1
					Dim m As Map
					'meletakkan data detail industri kerajinan pada setiap text
					m= mes_array.Get(i)
					Dim id As String
					Dim status As String
					status=m.Get("status")
					Log(status)
					
					If status == 1 Then
						id=m.Get("id_souvenir")
						Log(id)
						ExecuteRemoteQuery2("SELECT*FROM souvenir_gallery where id_souvenir='"&id&"'  ","tujuan_a")	
											
					Else If status == 2 Then
						Log(id)
						id=m.Get("id_workship_place")
						ExecuteRemoteQuery2("SELECT*FROM workship_place_gallery where id_workship_place='"&id&"' ","tujuan_b")
						
					Else If status == 3 Then
						id=m.Get("id_restaurant")
						Log(id)
						ExecuteRemoteQuery2("SELECT*FROM restaurant_gallery where id_restaurant='"&id&"' ","tujuan_c")
						
					Else If status == 4 Then
						id=m.Get("id_tourism")
						Log(id)
						ExecuteRemoteQuery2("SELECT*FROM tourism_gallery where id_tourism='"&id&"' ","tujuan_d")
						
					Else If status == 5 Then
						id=m.Get("id_hotel")
						Log(id)
						ExecuteRemoteQuery2("SELECT*FROM hotel_gallery where id_hotel='"&id&"' ","tujuan_e")
						
					End If
					'1 souvenir
					'2 mesjid
					'3 rm 
					'4 tw
					' 5 htl
					Next	
'			ResetImagesBackground

		Case "tujuan_a"
			Dim agn As List
			agn=parser.NextArray
			If agn.Size - 1 < 0 Then
			Log(agn.Size)
				'Msgbox("Galery Foto tidak ditemukan", "Peringatan")
			Else
			Dim serverimage = "http://192.168.100.13/wisatasolsel/foto/" As String
				For i=0 To agn.Size-1
				Dim w As Map
					w=agn.Get(i)	
					Log("haha")		
					Dim image = w.Get("gallery_souvenir") As String
					Dim gambar = ""&serverimage&""&image As String
					Log(gambar)
						Dim link As Map
						link.Initialize
						'meletakkan foto pada imageview
						link.Put(ListView1, gambar)
						
						CallSubDelayed2(Starter, "Download" , link)
				Next
			End If
			
			
		Case "tujuan_b"
			Dim agn As List
			agn=parser.NextArray
			If agn.Size - 1 < 0 Then
			Log(agn.Size)
				'Msgbox("Galery Foto tidak ditemukan", "Peringatan")
			Else
			Dim serverimage = "http://192.168.100.13/wisatasolsel/foto/" As String
				For i=0 To agn.Size-1
				Dim w As Map
					w=agn.Get(i)	
					Log("haha")		
					Dim image = w.Get("gallery_workship_place") As String
					Dim gambar = ""&serverimage&""&image As String
					Log(gambar)
						Dim link As Map
						link.Initialize
						'meletakkan foto pada imageview
						link.Put(ListView1, gambar)
						
						CallSubDelayed2(Starter, "Download" , link)
				Next
			End If


		Case "tujuan_c"
			Dim agn As List
			agn=parser.NextArray
			If agn.Size - 1 < 0 Then
			Log(agn.Size)
				'Msgbox("Galery Foto tidak ditemukan", "Peringatan")
			Else
			Dim serverimage = "http://192.168.100.13/wisatasolsel/foto/" As String
				For i=0 To agn.Size-1
				Dim w As Map
					w=agn.Get(i)	
					Log("haha")		
					Dim image = w.Get("gallery_restaurant") As String
					Dim gambar = ""&serverimage&""&image As String
					Log(gambar)
						Dim link As Map
						link.Initialize
						'meletakkan foto pada imageview
						link.Put(ListView1, gambar)
						
						CallSubDelayed2(Starter, "Download", link)
				Next
			End If


		Case "tujuan_d"
			Dim agn As List
			agn=parser.NextArray
			If agn.Size - 1 < 0 Then
			Log(agn.Size)
				'Msgbox("Galery Foto tidak ditemukan", "Peringatan")
			Else
			Dim serverimage = "http://192.168.100.13/wisatasolsel/foto/" As String
				For i=0 To agn.Size-1
				Dim w As Map
					w=agn.Get(i)	
					Log("haha")		
					Dim image = w.Get("gallery_tourism") As String
					Dim gambar = ""&serverimage&""&image As String
					Log(gambar)
						Dim link As Map
						link.Initialize
						'meletakkan foto pada imageview
						link.Put(ListView1, gambar)
						
						CallSubDelayed2(Starter, "Download" , link)
				Next
			End If
			
	Case "tujuan_e"
			Dim agn As List
			agn=parser.NextArray
			If agn.Size - 1 < 0 Then
			Log(agn.Size)
				'Msgbox("Galery Foto tidak ditemukan", "Peringatan")
			Else
			Dim serverimage = "http://192.168.100.13/wisatasolsel/foto/" As String
				For i=0 To agn.Size-1
				Dim w As Map
					w=agn.Get(i)	
					Log("haha")		
					Dim image = w.Get("gallery_hotel") As String
					Dim gambar = ""&serverimage&""&image As String
					Log(gambar)
						Dim link As Map
						link.Initialize
						'meletakkan foto pada imageview
						link.Put(ListView1, gambar)
						
						CallSubDelayed2(Starter, "Download", link)
				Next
			End If

	End Select
	End If


End Sub


Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

