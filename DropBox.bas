B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=10.6
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

	'Dim auth As DbxAuth
	'Dim Dropbox1 As DropboxV2
	Dim client As DbxClientV2
	Dim config As DbxRequestConfig
	Dim dbxFiles As DbxUserFilesRequests
	Dim dbxSharing As DbxUserSharingRequests
	Dim dbxUsers As DbxUserUsersRequests
	Dim token As String
	Dim DropboxEnabled As Boolean
	Dim CurrentPath As String
	Dim CurrentFilename As String
End Sub

Sub InitializeDropBox
	' Token for Dan Harding's dropbox
	'token = "RhcZzAHJeEAAAAAAAAACtYsCvqF5cVZXXL5kCHyef-vwkAxZQ9gBl5oIB2wknwAu"
	' Token for Its Yours dropbox
	'token = "sl.Ar6jr6i3EKTjyTw6Pn3oCNXR84vNdt3JRKA23b4-kwKutG0xmPJNN8_HGRq1bQbriiYUWbVHLnb51UQV4EslV3IvKEiBeLCqRA4vvf5VCxuiFT7MrsV_wnnM83gChdILTKkJpZE"
	token = "bWdkSSkJD7UAAAAAAAAAAZhSaWCAx9nSIzP-WymeVZDLAST8Vgg4PRan3KOuUjwG"
	Log("Token available. Dropbox enabled")
	config.Initialize("",token,"","us-us",5)
	Dim dbxhost As DbxHost
	dbxhost.Initialize
	client.Initialize("Dropbox",config,token,dbxhost)
	dbxFiles = client.files
	dbxFiles.setEventname("dbxFiles")
	dbxSharing = client.sharing
	dbxSharing.setEventname("dbxSharing")
	dbxUsers = client.users
	dbxUsers.setEventname("dbxUsers")
	DropboxEnabled = True
End Sub

Sub UploadFile(path As String, filename As String, DropboxFolder As String)
	Dim size As Int
	
	size = File.Size(path, filename)
	Log(filename & " - size: " & size)
	CurrentFilename = filename
	CurrentPath = path
	If DropboxEnabled = True Then
		If size > 14000000 Then
			dbxFiles.uploadsession(path, filename, size, 0, "", "/" & DropboxFolder & "/", dbxFiles.WriteModeADD)
		Else
			dbxFiles.upload(path, filename, "/" & DropboxFolder & "/" & filename, False, False)
		End If
	Else
		MsgboxAsync("Dropbox has not been properly initialized", "")
	End If
	Dim nowake As PhoneWakeState
	nowake.PartialLock
End Sub
