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
	Private inputnama2 = "inputnama2" As String
	Dim nama_paket As String
	Dim nama_travel As String
	Dim id_package As String
	Dim id_travel As String
	Dim id As String
	Dim name As String
	Dim price As Int
	Type daftartravel_lines (isitrav2 As String, id As String, nama As String, price As Int) 
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private EditText1 As EditText
	Private ListView1 As ListView
	Private ListView2 As ListView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("pencarian_travel")
	ListView1.SingleLineLayout.Label.TextColor=Colors.RGB(72, 39, 39)
	ListView1.SingleLineLayout.Label.TextSize=16
	ListView1.SingleLineLayout.Label.Left=2%y
	ListView2.SingleLineLayout.Label.TextColor=Colors.RGB(72, 39, 39)
	ListView2.SingleLineLayout.Label.TextSize=16
	ListView2.SingleLineLayout.Label.Left=2%y

	EditText1.Color=Colors.RGB(252, 206, 84)
End Sub

Sub Activity_Resume
	ListView1.Clear
	EditText1.Text=""
End Sub

Sub	travelnama
	ProgressDialogShow("Loading...")	
	ExecuteRemoteQuery("SELECT id,name from travel where lower(name) like lower('%"&inputnama2&"%')","travel_nama")
End Sub

Sub	paketnama
	ProgressDialogShow("Loading...")	
		ExecuteRemoteQuery("SELECT id,name,price from package where id_travel ='"&id_travel&"'","paket_nama")
	Log("SELECT id,name,price from package where id_travel ='"&id_travel&"'")
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub ExecuteRemoteQuery(Query As String, JobName As String)
	Dim Job As HttpJob
	Job.Initialize(JobName, Me)
	Job.PostString(""&Main.Server&"json.php",Query)
End Sub

Sub JobDone(Job As HttpJob)
	ProgressDialogHide
	If Job.Success Then
		Dim res As String
		res = Job.GetString
		Log("Response jobdone carinama :"& res)
		Dim parser As JSONParser
		parser.Initialize(res)
		Select Job.JobName
			Case "travel_nama"
				Dim travel_nama_array As List
				travel_nama_array = parser.NextArray
				ListView1.Clear
				For i=0 To travel_nama_array.Size -1
				Dim m As Map
				m = travel_nama_array.Get(i)
				Dim b As daftartravel_lines
				b.Initialize
				b.id = m.Get("id")
				b.nama= m.Get("name")
				ListView1.AddSingleLine2(b.nama,b.id)
			Next
			Case "paket_nama"
				Dim travel_nama_array As List
				travel_nama_array = parser.NextArray
				ListView2.Clear
				For i=0 To travel_nama_array.Size -1
				Dim m As Map
				m = travel_nama_array.Get(i)
				Dim b As daftartravel_lines
				b.Initialize
				b.id = m.Get("id")
				b.nama = m.Get("name")
				b.price = m.Get("price")
				ListView2.AddSingleLine2(b.nama,b)
			Next
		End Select
	End If
End Sub


Sub EditText1_EnterPressed
	ListView1.Clear
	inputnama2 = EditText1.Text
	
	Log(inputnama2)
	travelnama
	
End Sub


Sub ListView1_ItemClick (Position As Int, Value As Object)
	id_travel=Value
	paketnama
End Sub

Sub ListView2_ItemClick (Position As Int, Value As Object)
	Dim b As daftartravel_lines
	b=Value
	id =b.id
	name = b.nama
	price = b.price
	StartActivity(info_travel)
End Sub

Sub Button1_Click
	StartActivity(Main)
End Sub

Sub Button2_Click
	'StartActivity(pencarian_travel)
End Sub

Sub Button3_Click
	StartActivity(pencarian_nama)
End Sub

Sub Button4_Click
	StartActivity(pencarian_des)
End Sub