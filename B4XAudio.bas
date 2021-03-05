B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.6
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	
	Dim ion As Object
	Private progressPanel As Panel
	Private progresslabel As Label
	Private ProgressBar1 As ProgressBar
	Private backPanel As Panel
	Private recordPanel As Panel
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	DropBox.InitializeDropBox
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("audiorecord")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.


'Sub btnBack_Click
'	B4XPages.ShowPage("MainPage")
'End Sub
'
'Sub btnStart_Click
'	Dim in As Intent
'	Dim stamp As String
'	
'	in.Initialize("android.provider.MediaStore.RECORD_SOUND", "")
'	StartActivityForResult(in)
'	Wait For ion_event (MethodName As String, Args() As Object)
'	Log("#2 " & MethodName)
'	Log("#3 " & Args(0))
'	Dim resultCode As Int = Args(0)
'	If resultCode = -1 Then ' Ok
'		Dim in As Intent = Args(1)
'		Log("#5 " & in.GetData)
'		Dim uri As String = in.GetData
'		stamp = DateTime.Now & ".mp3"
'		File.Copy("ContentDir", uri, File.DirInternal, stamp)
'		DropBox.UploadFile(File.DirInternal, stamp, "AudioRecording")
'		SetProgressBar(stamp)
'	Else
'		'MsgboxAsync("You may not have a default audio recorder for this device. A suggested app from Google Play is the Samsung Voice Recorder.", "")
'	End If
'End Sub

Sub StartActivityForResult(i As Intent)
	Dim jo As JavaObject = GetBA

	ion = jo.CreateEvent("anywheresoftware.b4a.IOnActivityResult", "ion", Null)
	jo.RunMethod("startActivityForResult", Array As Object(ion, i))
End Sub

Sub GetBA As Object
	Dim jo As JavaObject = Me
	Return jo.RunMethod("getBA", Null)
End Sub

Sub ion_event(pIon As Object, pI As Object)
	'MsgboxAsync("You may not have a default audio recorder for this device. A suggested app from Google Play is the Samsung Voice Recorder.", "")
	Log("In ion_event")
End Sub

Sub SetProgressBar(filename As String)
	Dim VideoPage As B4XVideo = B4XPages.GetPage("Video")
	VideoPage.mProgressBar = ProgressBar1
	VideoPage.mProgressPanel = progressPanel
	VideoPage.mProgressLabel = progresslabel
	VideoPage.SetProgressBarCommon(filename)
End Sub

'Sub dbxFiles_UploadFinished(success As Boolean, metaObj As Object, sessionId As String)
'	MsgboxAsync("File uploaded successfully", "Upload")
'	progressPanel.Visible = False
'	Dim nowake As PhoneWakeState
'	nowake.ReleasePartialLock
'	File.Delete(DropBox.CurrentPath, DropBox.CurrentFilename)
'End Sub
'
'Sub dbxFiles_UploadProgress(sessionId As String, path As String, filename As String, uploaded As Long, size As Long)
'	Dim Pct As Int
'	
'	If uploaded < size Then
'		Pct = uploaded / size * 100
'		progresslabel.Text = "Uploading " & filename.SubString(filename.Length - 4) & " " & Pct & "%"
'		ProgressBar1.Progress = Pct
'		Log(uploaded & " out of " & size)
'	End If
'End Sub


Private Sub backPanel_Click
	B4XPages.ShowPage("MainPage")
End Sub

Private Sub recordPanel_Click
	Dim in As Intent
	Dim stamp As String
	
	in.Initialize("android.provider.MediaStore.RECORD_SOUND", "")
	StartActivityForResult(in)
	Wait For ion_event (MethodName As String, Args() As Object)
	Log("#2 " & MethodName)
	Log("#3 " & Args(0))
	Dim resultCode As Int = Args(0)
	If resultCode = -1 Then ' Ok
		Dim in As Intent = Args(1)
		Log("#5 " & in.GetData)
		Dim uri As String = in.GetData
		stamp = DateTime.Now & ".mp3"
		File.Copy("ContentDir", uri, File.DirInternal, stamp)
		DropBox.UploadFile(File.DirInternal, stamp, "AudioRecording")
		SetProgressBar(stamp)
	Else
		'MsgboxAsync("You may not have a default audio recorder for this device. A suggested app from Google Play is the Samsung Voice Recorder.", "")
	End If
End Sub