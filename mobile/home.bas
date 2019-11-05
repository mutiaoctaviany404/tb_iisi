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
	Dim Server="http://192.168.100.13/wisatasolsel/mobile/" As String 'variable untuk koneksi ke database

	'SplasScreen
	Dim tmSplash As Timer 'timer untuk animasi splash screen

End Sub

Sub Globals

	Private ImageView1 As ImageView	
	'Public btAnim As AnimationPlus  'animasi object button view 
	Private Button1 As Button
	Private Button2 As Button
	Private Button3 As Button
	Private Button4 As Button
	
	'Private Button5 As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
		If FirstTime Then 'jika aplikasi pertama diaktifkan
		Activity.LoadLayout("splash")
		AnimSplash 'Panggil function animasi splash screen
		tmSplash.Initialize("tmSplash",3500) 'panggil event timer tpSplash dengan interval waktu 4s
		tmSplash.Enabled = True 'aktifkan timer
	Else		
		Activity.RemoveAllViews 'Hapus Design pada layout
		Activity.LoadLayout("home") 'Set layout lyHome
		'DoEvents 'membuat proses terlihat
	End If
'Activity.AddMenuItem("Logout","Logout")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub tmSplash_Tick
	tmSplash.Enabled = False 'disable timer
	Activity.RemoveAllViews 'Hapus Design pada layout
	Activity.LoadLayout("home") 'load layout lyHome
End Sub

Sub AnimSplash()
	'If btAnim.IsInitialized Then		
	'	btAnim.Stop(ImageView1)
	'	Activity.Invalidate	
	'End If
	'btAnim.InitializeTranslate( "AllFunction.btAnim",0,-Activity.Height,0dip,0dip) 'animasi geser
	'btAnim.SetInterpolator(btAnim.INTERPOLATOR_BOUNCE) 'Animasi melantuk setlah sampai di posisi target
	'btAnim.Duration = 1500
	'btAnim.Start(ImageView1)	'Jlaankan animasi pada object imgSplash
End Sub

Sub Button1_Click
	
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


Sub Button5_Click
	Activity.Finish
End Sub