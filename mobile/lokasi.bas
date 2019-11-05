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
	Dim PETA="PETA" As String	

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private WebView1 As WebView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("lokasi")
	Log("http://192.168.100.13/wisatasolsel/mobile/all_mark.php?id="&pencarian_nama.id)
	WebView1.LoadUrl("http://192.168.100.13/wisatasolsel/mobile/all_mark.php?id="&pencarian_nama.id)
	

End Sub

Sub Activity_Resume
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Button1_Click
	StartActivity(home)
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
