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
	Dim latAsal, lngAsal, latTujuan, lngTujuan, latHenti, lngHenti, idmes As String
	Dim id, lat, lng, id_angkot, destination, route_color As String
	Type travel_lines (isi1 As String,isi2 As String,isi3 As String)
	Dim PETA="PETA" As String	

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private WebView1 As WebView
	Private ListView1 As ListView
	Private Button5 As Button
	Private Button6 As Button
	Private Button1 As Button
	Private Button2 As Button
	Private Button3 As Button
	Private Button4 As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("lokasi")
	Log("http://192.168.100.13/wisatasolsel/mobile/all_mark.php?id="&pencarian_travel.id)
	WebView1.LoadUrl("http://192.168.100.13/wisatasolsel/mobile/all_mark.php?id="&pencarian_travel.id)
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
