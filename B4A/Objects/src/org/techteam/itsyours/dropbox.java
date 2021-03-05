package org.techteam.itsyours;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dropbox {
private static dropbox mostCurrent = new dropbox();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static de.donmanfred.dbxv2.DbxClientV2Wrapper _client = null;
public static de.donmanfred.dbxv2.DbxRequestConfigWrapper _config = null;
public static de.donmanfred.dbxv2.files.DbxUserFilesRequestsWrapper _dbxfiles = null;
public static de.donmanfred.dbxv2.sharing.DbxUserSharingRequestsWrapper _dbxsharing = null;
public static de.donmanfred.dbxv2.users.DbxUserUsersRequestsWrapper _dbxusers = null;
public static String _token = "";
public static boolean _dropboxenabled = false;
public static String _currentpath = "";
public static String _currentfilename = "";
public org.techteam.itsyours.main _main = null;
public org.techteam.itsyours.starter _starter = null;
public org.techteam.itsyours.b4xpages _b4xpages = null;
public org.techteam.itsyours.b4xcollections _b4xcollections = null;
public static String  _initializedropbox(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="dropbox";
if (Debug.shouldDelegate(null, "initializedropbox", false))
	 {return ((String) Debug.delegate(null, "initializedropbox", new Object[] {_ba}));}
de.donmanfred.dbxv2.DbxHostWrapper _dbxhost = null;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub InitializeDropBox";
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="token = \"bWdkSSkJD7UAAAAAAAAAAZhSaWCAx9nSIzP-Wyme";
_token = "bWdkSSkJD7UAAAAAAAAAAZhSaWCAx9nSIzP-WymeVZDLAST8Vgg4PRan3KOuUjwG";
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="Log(\"Token available. Dropbox enabled\")";
anywheresoftware.b4a.keywords.Common.LogImpl("51769478","Token available. Dropbox enabled",0);
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="config.Initialize(\"\",token,\"\",\"us-us\",5)";
_config.Initialize((_ba.processBA == null ? _ba : _ba.processBA),"",_token,"","us-us",(int) (5));
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="Dim dbxhost As DbxHost";
_dbxhost = new de.donmanfred.dbxv2.DbxHostWrapper();
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="dbxhost.Initialize";
_dbxhost.Initialize((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="client.Initialize(\"Dropbox\",config,token,dbxhost)";
_client.Initialize((_ba.processBA == null ? _ba : _ba.processBA),"Dropbox",(com.dropbox.core.DbxRequestConfig)(_config.getObject()),_token,(com.dropbox.core.DbxHost)(_dbxhost.getObject()));
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="dbxFiles = client.files";
_dbxfiles = _client.files();
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="dbxFiles.setEventname(\"dbxFiles\")";
_dbxfiles.setEventname((_ba.processBA == null ? _ba : _ba.processBA),"dbxFiles");
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="dbxSharing = client.sharing";
_dbxsharing = _client.sharing();
RDebugUtils.currentLine=1769486;
 //BA.debugLineNum = 1769486;BA.debugLine="dbxSharing.setEventname(\"dbxSharing\")";
_dbxsharing.setEventname((_ba.processBA == null ? _ba : _ba.processBA),"dbxSharing");
RDebugUtils.currentLine=1769487;
 //BA.debugLineNum = 1769487;BA.debugLine="dbxUsers = client.users";
_dbxusers = _client.users();
RDebugUtils.currentLine=1769488;
 //BA.debugLineNum = 1769488;BA.debugLine="dbxUsers.setEventname(\"dbxUsers\")";
_dbxusers.setEventname((_ba.processBA == null ? _ba : _ba.processBA),"dbxUsers");
RDebugUtils.currentLine=1769489;
 //BA.debugLineNum = 1769489;BA.debugLine="DropboxEnabled = True";
_dropboxenabled = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1769490;
 //BA.debugLineNum = 1769490;BA.debugLine="End Sub";
return "";
}
public static String  _uploadfile(anywheresoftware.b4a.BA _ba,String _path,String _filename,String _dropboxfolder) throws Exception{
RDebugUtils.currentModule="dropbox";
if (Debug.shouldDelegate(null, "uploadfile", false))
	 {return ((String) Debug.delegate(null, "uploadfile", new Object[] {_ba,_path,_filename,_dropboxfolder}));}
int _size = 0;
anywheresoftware.b4a.phone.Phone.PhoneWakeState _nowake = null;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub UploadFile(path As String, filename As String,";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim size As Int";
_size = 0;
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="size = File.Size(path, filename)";
_size = (int) (anywheresoftware.b4a.keywords.Common.File.Size(_path,_filename));
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Log(filename & \" - size: \" & size)";
anywheresoftware.b4a.keywords.Common.LogImpl("51835012",_filename+" - size: "+BA.NumberToString(_size),0);
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="CurrentFilename = filename";
_currentfilename = _filename;
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="CurrentPath = path";
_currentpath = _path;
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="If DropboxEnabled = True Then";
if (_dropboxenabled==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="If size > 14000000 Then";
if (_size>14000000) { 
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="dbxFiles.uploadsession(path, filename, size, 0,";
_dbxfiles.uploadsession(_path,_filename,(long) (_size),(long) (0),"","/"+_dropboxfolder+"/",_dbxfiles.getWriteModeADD());
 }else {
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="dbxFiles.upload(path, filename, \"/\" & DropboxFo";
_dbxfiles.upload(_path,_filename,"/"+_dropboxfolder+"/"+_filename,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
 };
 }else {
RDebugUtils.currentLine=1835022;
 //BA.debugLineNum = 1835022;BA.debugLine="MsgboxAsync(\"Dropbox has not been properly initi";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Dropbox has not been properly initialized"),BA.ObjectToCharSequence(""),(_ba.processBA == null ? _ba : _ba.processBA));
 };
RDebugUtils.currentLine=1835024;
 //BA.debugLineNum = 1835024;BA.debugLine="Dim nowake As PhoneWakeState";
_nowake = new anywheresoftware.b4a.phone.Phone.PhoneWakeState();
RDebugUtils.currentLine=1835025;
 //BA.debugLineNum = 1835025;BA.debugLine="nowake.PartialLock";
_nowake.PartialLock((_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=1835026;
 //BA.debugLineNum = 1835026;BA.debugLine="End Sub";
return "";
}
}