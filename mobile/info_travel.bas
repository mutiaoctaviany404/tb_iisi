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
	Private TRAV="TRAV" As String
	Dim id, lat, lng As String

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private Label3 As Label
	Private Label7 As Label
	Private Label8 As Label
	Private Label4 As Label
	Private Button7 As Button
	Private Button6 As Button
	Private Button5 As Button
	Private Button1 As Button
	Private Button2 As Button
	Private Button3 As Button
	Private Button4 As Button
	Private ListView2 As ListView
	Private ListView3 As ListView
	'Dim idmes As String
	Private ListView1 As ListView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("informasi_utama")
	Label7.Text=pencarian_travel.name
	Label8.Text=pencarian_travel.price
	ListView2.SingleLineLayout.Label.TextColor=Colors.White
	ListView2.SingleLineLayout.Label.TextSize=16
	ListView2.SingleLineLayout.Label.Left=2%y
	ListView3.SingleLineLayout.Label.TextColor=Colors.White
	ListView3.SingleLineLayout.Label.TextSize=16
	ListView3.SingleLineLayout.Label.Left=2%y
	Dim Job As HttpJob
	Job.Initialize("Jobcaritrav", Me)
	Job.PostString("http://192.168.100.13/wisatasolsel/mobile/info_detail.php?id="&pencarian_travel.id,"")
End Sub

Sub Activity_Resume
'detailNama
Dim Job As HttpJob
	Job.Initialize("Jobcaritrav", Me)
	Job.PostString("http://192.168.100.13/wisatasolsel/mobile/info_detail.php?id="&pencarian_travel.id,"")
	Log(pencarian_travel.id_travel)
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub ExecuteRemoteQuery(Query As String, JobName As String)
	Dim Job As HttpJob
	Job.Initialize(JobName, Me)
	Job.PostString(""&Main.server&"json.php", Query)
End Sub

Sub detailNama
	ProgressDialogShow("Loading ....")
	ExecuteRemoteQuery("SELECT*FROM object_point where id_package='"&pencarian_travel.id&"' ORDER BY object_point.no_urut ASC ","object")
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
			Case "object"
			Dim mes_array As List
			mes_array = parser.NextArray
				For i=0 To mes_array.Size -1
					Dim m As Map
					'meletakkan data detail industri kerajinan pada setiap text
					m= mes_array.Get(i)
					Dim id As String
					Dim status As String
					status=m.Get("status")
					Log(status)
					ListView2.AddSingleLine(m.Get("time"))
					ListView3.AddSingleLine(m.Get("estimated_hour"))
					
					If status == 1 Then
						id=m.Get("id_souvenir")
						Log(id)
						ExecuteRemoteQuery("SELECT*FROM souvenir where id='"&id&"'  ","tujuan")						
					Else If status == 2 Then
						id=m.Get("id_workship_place")
						Log(id)
						ExecuteRemoteQuery("SELECT*FROM workship_place where id='"&id&"' ","tujuan")
					Else If status == 3 Then
						id=m.Get("id_restaurant")
						Log(id)
						ExecuteRemoteQuery("SELECT*FROM restaurant where id='"&id&"' ","tujuan")
					Else If status == 4 Then
						id=m.Get("id_tourism")
						Log(id)
						ExecuteRemoteQuery("SELECT*FROM tourism where id='"&id&"' ","tujuan")
					Else If status == 5 Then
						id=m.Get("id_hotel")
						Log(id)
						ExecuteRemoteQuery("SELECT*FROM hotel where id='"&id&"' ","tujuan")
					End If
					'1 souvenir
					'2 mesjid
					'3 rm 
					'4 tw
					'5 htl
					Next	
			Case "tujuan"
			Dim mes_array As List
			mes_array = parser.NextArray
				If (mes_array.Size>0) Then
					Dim m As Map
					'meletakkan data detail industri kerajinan pada setiap text
					m= mes_array.Get(0)
					Dim name As String
					name=m.Get("name")
					ListView1.AddSingleLine(name)					
				Else
					Msgbox("No Data","Info")
				End If	
				Case "Jobcaritrav"
				ListView1.Clear()
				ListView2.Clear()
			Dim mes_array As List
			mes_array = parser.NextArray
				For i=0 To mes_array.Size -1
					Dim m As Map
					'meletakkan data detail industri kerajinan pada setiap text
					m= mes_array.Get(i)
					ListView1.AddSingleLine(m.Get("n1"))
					ListView2.AddSingleLine(m.Get("n3"))
					ListView3.AddSingleLine(m.Get("n4"))
		Next
		End Select
	End If	
End Sub


Sub Button6_Click
	'StartActivity(pariwisata_sekitar)
End Sub

Sub Button7_Click
	StartActivity(galeri_ut)
End Sub

Sub Button5_Click
	'lokasi.latTujuan=lat
	'lokasi.lngTujuan=lng
	StartActivity(lokasi_travel)
End Sub

Sub Button1_Click
	StartActivity(Main)
End Sub

Sub Button2_Click
	StartActivity(pencarian_travel)
End Sub

Sub Button3_Click
	StartActivity(pencarian_nama)
End Sub

Sub Button4_Click
	StartActivity(pencarian_des)
End Sub