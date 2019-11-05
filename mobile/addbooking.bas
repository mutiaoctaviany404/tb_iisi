Type=Activity
Version=6
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	
Dim Server="http://192.168.100.13/wisatasolsel/mobile/" As String 'variable untuk koneksi ke database
Dim number_of_people As Int
Dim date As Int
Dim username As String
Dim id_package As String

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private addbooking="addbooking" As String
	
	Private EditText1 As EditText
	Private EditText2 As EditText
	Private Button1 As Button
	
	Private text_numberofpeople As Int
	Private text_date As Int
	Private text_username As String
Private text_id_package As String
	'Dim fd As File
	
	Private EditText3 As EditText
	Private EditText4 As EditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout(addbooking)
	

End Sub
Sub add_booking
	ProgressDialogShow("Loading...")
	
	text_numberofpeople=EditText1.Text
	text_date=EditText2.Text
	text_username=EditText3.Text
	text_id_package=EditText4.Text
	''ExecuteRemoteQuery ("INSERT INTO booking VALUES('"&text_numberofpeople.Text&"','"&text_date.Text&"','"&text_username.Text&"','"& text_id_package.Text &"')")

	
End Sub
Sub ExecuteRemoteQuery (Query As String, JobName As String)
	Dim Job As HttpJob
	Job.Initialize(JobName, Me)
	
	Job.PostString(""&Server&"bookingmobile.php", Query)
End Sub


Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub EditText1_EnterPressed
	
End Sub

Sub EditText2_EnterPressed
	
End Sub

Sub Button1_Click
	
End Sub

Sub EditText3_EnterPressed
	
End Sub

Sub EditText4_EnterPressed
	
End Sub