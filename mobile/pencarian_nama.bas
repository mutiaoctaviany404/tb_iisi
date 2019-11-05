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
	Private inputnama1 = "inputnama1" As String
	Private paket_nama = "paket_nama" As String
	Dim id As String
	Dim name As String
	Dim price As Int
	Type daftarpaket_lines (id As String, name As String, price As String) 
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private EditText1 As EditText
	Private ListView1 As ListView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("pencarian_nama")
	ListView1.SingleLineLayout.Label.TextColor=Colors.RGB(72, 39, 39)
	ListView1.SingleLineLayout.Label.TextSize=16
	ListView1.SingleLineLayout.Label.Left=2%y
	'ListView1.Color=Colors.RGB(255,255,255)
	EditText1.Color=Colors.RGB(252, 206, 84)
End Sub

Sub Activity_Resume
	ListView1.Clear
	EditText1.Text=""
End Sub

Sub	paketnama
	ProgressDialogShow("Loading...")	
	ExecuteRemoteQuery("SELECT id, name, price from package where lower(name) like lower('%"&inputnama1&"%')","paket_nama")
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
			Case paket_nama
				Dim paket_nama_array As List
				paket_nama_array = parser.NextArray
				ListView1.Clear
				For i=0 To paket_nama_array.Size -1
				Dim m As Map
				m = paket_nama_array.Get(i)
				Dim b As daftarpaket_lines
				b.Initialize
				b.id = m.Get("id")
				b.name = m.Get("name")
				b.price = m.Get("price")
				ListView1.AddSingleLine2(b.name,b)
			Next
		End Select
	End If
End Sub


Sub EditText1_EnterPressed
	ListView1.Clear
	inputnama1 = EditText1.Text
	
	Log(inputnama1)
	paketnama
	
End Sub

Sub ListView1_ItemClick (Position As Int, Value As Object)
	Dim b As daftarpaket_lines
	b=Value
	id=b.id
	name=b.name
	price=b.price
StartActivity(info_utama)
End Sub

Sub Button1_Click
	StartActivity(Main)
End Sub

Sub Button2_Click
	StartActivity(pencarian_travel)
End Sub

Sub Button3_Click
	'StartActivity(pencarian_nama)
End Sub

Sub Button4_Click
	StartActivity(pencarian_des)
End Sub