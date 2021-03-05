B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.6
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Dim videoRecorder As VideoRecordApp
	Dim VideoFilename As String
	Private progressPanel As Panel
	Private progresslabel As Label
	Private ProgressBar1 As ProgressBar
	Public mProgressPanel As Panel
	Public mProgressBar As ProgressBar
	Public mProgressLabel As Label
	Private backPanel As Panel
	Private btnStart As Button
	Private recordPanel As Panel
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("videorecord")
	DropBox.InitializeDropBox
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

'Sub btnBack_Click
'	B4XPages.ShowPage("MainPage")
'End Sub
'
'Sub btnStart_Click
'
'	Dim folder As String = Starter.Provider.SharedFolder
'	
'	videoRecorder.Initialize("videoRecorder")
'	VideoFilename = DateTime.Now & ".mp4"
'	videoRecorder.Record3(folder, VideoFilename, 10 * 60, Starter.Provider.GetFileUri(VideoFilename))
'
'End Sub

Sub videoRecorder_RecordComplete (Success As Boolean)
	Log(Success)
	If Success Then
		DropBox.UploadFile(Starter.Provider.SharedFolder, VideoFilename, "VideoRecording")
		SetProgressBar(VideoFilename)
	End If
End Sub

Sub SetProgressBar(filename As String)
	mProgressBar = ProgressBar1
	mProgressPanel = progressPanel
	mProgressLabel = progresslabel
	SetProgressBarCommon(filename)
End Sub

Sub SetProgressBarCommon(filename As String)
	If mProgressPanel.Visible = False Then
		mProgressPanel.Visible = True
		mProgressPanel.BringToFront
		mProgressLabel.Text = "Uploading " & filename.SubString(filename.Length - 4)
		mProgressBar.Progress = 0
	End If
End Sub

Sub dbxFiles_UploadFinished(success As Boolean, metaObj As Object, sessionId As String)
	Log(sessionId)
	If success = True Then
		MsgboxAsync("File uploaded successfully", "Upload")
	Else
		MsgboxAsync("Error uploading file", "Upload")
	End If
	mProgressPanel.Visible = False
	Dim nowake As PhoneWakeState
	nowake.ReleasePartialLock
	File.Delete(DropBox.CurrentPath, DropBox.CurrentFilename)
End Sub

Sub dbxFiles_UploadProgress(sessionId As String, path As String, filename As String, uploaded As Long, size As Long)
	Dim Pct As Int
	Log("Upload Progress")
	If uploaded < size Then
		Pct = uploaded / size * 100
		mProgressLabel.Text = "Uploading " & filename.SubString(filename.Length - 4) & " " & Pct & "%"
		mProgressBar.Progress = Pct
		Log(uploaded & " out of " & size)
	End If
End Sub


Private Sub backPanel_Click
	B4XPages.ShowPage("MainPage")
End Sub

Private Sub recordPanel_Click
	Dim folder As String = Starter.Provider.SharedFolder
	
	videoRecorder.Initialize("videoRecorder")
	VideoFilename = DateTime.Now & ".mp4"
	videoRecorder.Record3(folder, VideoFilename, 10 * 60, Starter.Provider.GetFileUri(VideoFilename))
End Sub