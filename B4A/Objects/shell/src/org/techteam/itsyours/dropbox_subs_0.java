package org.techteam.itsyours;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dropbox_subs_0 {


public static RemoteObject  _initializedropbox(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("InitializeDropBox (dropbox) ","dropbox",2,_ba,dropbox.mostCurrent,20);
if (RapidSub.canDelegate("initializedropbox")) { return org.techteam.itsyours.dropbox.remoteMe.runUserSub(false, "dropbox","initializedropbox", _ba);}
RemoteObject _dbxhost = RemoteObject.declareNull("de.donmanfred.dbxv2.DbxHostWrapper");
;
 BA.debugLineNum = 20;BA.debugLine="Sub InitializeDropBox";
Debug.ShouldStop(524288);
 BA.debugLineNum = 25;BA.debugLine="token = \"bWdkSSkJD7UAAAAAAAAAAZhSaWCAx9nSIzP-Wyme";
Debug.ShouldStop(16777216);
dropbox._token = BA.ObjectToString("bWdkSSkJD7UAAAAAAAAAAZhSaWCAx9nSIzP-WymeVZDLAST8Vgg4PRan3KOuUjwG");
 BA.debugLineNum = 26;BA.debugLine="Log(\"Token available. Dropbox enabled\")";
Debug.ShouldStop(33554432);
dropbox.mostCurrent.__c.runVoidMethod ("LogImpl","51769478",RemoteObject.createImmutable("Token available. Dropbox enabled"),0);
 BA.debugLineNum = 27;BA.debugLine="config.Initialize(\"\",token,\"\",\"us-us\",5)";
Debug.ShouldStop(67108864);
dropbox._config.runVoidMethod ("Initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(dropbox._token),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("us-us")),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 28;BA.debugLine="Dim dbxhost As DbxHost";
Debug.ShouldStop(134217728);
_dbxhost = RemoteObject.createNew ("de.donmanfred.dbxv2.DbxHostWrapper");Debug.locals.put("dbxhost", _dbxhost);
 BA.debugLineNum = 29;BA.debugLine="dbxhost.Initialize";
Debug.ShouldStop(268435456);
_dbxhost.runVoidMethod ("Initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 30;BA.debugLine="client.Initialize(\"Dropbox\",config,token,dbxhost)";
Debug.ShouldStop(536870912);
dropbox._client.runVoidMethod ("Initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("Dropbox")),(Object)((dropbox._config.getObject())),(Object)(dropbox._token),(Object)((_dbxhost.getObject())));
 BA.debugLineNum = 31;BA.debugLine="dbxFiles = client.files";
Debug.ShouldStop(1073741824);
dropbox._dbxfiles = dropbox._client.runMethod(false,"files");
 BA.debugLineNum = 32;BA.debugLine="dbxFiles.setEventname(\"dbxFiles\")";
Debug.ShouldStop(-2147483648);
dropbox._dbxfiles.runVoidMethod ("setEventname",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(RemoteObject.createImmutable("dbxFiles")));
 BA.debugLineNum = 33;BA.debugLine="dbxSharing = client.sharing";
Debug.ShouldStop(1);
dropbox._dbxsharing = dropbox._client.runMethod(false,"sharing");
 BA.debugLineNum = 34;BA.debugLine="dbxSharing.setEventname(\"dbxSharing\")";
Debug.ShouldStop(2);
dropbox._dbxsharing.runVoidMethod ("setEventname",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(RemoteObject.createImmutable("dbxSharing")));
 BA.debugLineNum = 35;BA.debugLine="dbxUsers = client.users";
Debug.ShouldStop(4);
dropbox._dbxusers = dropbox._client.runMethod(false,"users");
 BA.debugLineNum = 36;BA.debugLine="dbxUsers.setEventname(\"dbxUsers\")";
Debug.ShouldStop(8);
dropbox._dbxusers.runVoidMethod ("setEventname",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(RemoteObject.createImmutable("dbxUsers")));
 BA.debugLineNum = 37;BA.debugLine="DropboxEnabled = True";
Debug.ShouldStop(16);
dropbox._dropboxenabled = dropbox.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim client As DbxClientV2";
dropbox._client = RemoteObject.createNew ("de.donmanfred.dbxv2.DbxClientV2Wrapper");
 //BA.debugLineNum = 10;BA.debugLine="Dim config As DbxRequestConfig";
dropbox._config = RemoteObject.createNew ("de.donmanfred.dbxv2.DbxRequestConfigWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Dim dbxFiles As DbxUserFilesRequests";
dropbox._dbxfiles = RemoteObject.createNew ("de.donmanfred.dbxv2.files.DbxUserFilesRequestsWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Dim dbxSharing As DbxUserSharingRequests";
dropbox._dbxsharing = RemoteObject.createNew ("de.donmanfred.dbxv2.sharing.DbxUserSharingRequestsWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Dim dbxUsers As DbxUserUsersRequests";
dropbox._dbxusers = RemoteObject.createNew ("de.donmanfred.dbxv2.users.DbxUserUsersRequestsWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Dim token As String";
dropbox._token = RemoteObject.createImmutable("");
 //BA.debugLineNum = 15;BA.debugLine="Dim DropboxEnabled As Boolean";
dropbox._dropboxenabled = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 16;BA.debugLine="Dim CurrentPath As String";
dropbox._currentpath = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="Dim CurrentFilename As String";
dropbox._currentfilename = RemoteObject.createImmutable("");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _uploadfile(RemoteObject _ba,RemoteObject _path,RemoteObject _filename,RemoteObject _dropboxfolder) throws Exception{
try {
		Debug.PushSubsStack("UploadFile (dropbox) ","dropbox",2,_ba,dropbox.mostCurrent,40);
if (RapidSub.canDelegate("uploadfile")) { return org.techteam.itsyours.dropbox.remoteMe.runUserSub(false, "dropbox","uploadfile", _ba, _path, _filename, _dropboxfolder);}
RemoteObject _size = RemoteObject.createImmutable(0);
RemoteObject _nowake = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneWakeState");
;
Debug.locals.put("path", _path);
Debug.locals.put("filename", _filename);
Debug.locals.put("DropboxFolder", _dropboxfolder);
 BA.debugLineNum = 40;BA.debugLine="Sub UploadFile(path As String, filename As String,";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="Dim size As Int";
Debug.ShouldStop(256);
_size = RemoteObject.createImmutable(0);Debug.locals.put("size", _size);
 BA.debugLineNum = 43;BA.debugLine="size = File.Size(path, filename)";
Debug.ShouldStop(1024);
_size = BA.numberCast(int.class, dropbox.mostCurrent.__c.getField(false,"File").runMethod(true,"Size",(Object)(_path),(Object)(_filename)));Debug.locals.put("size", _size);
 BA.debugLineNum = 44;BA.debugLine="Log(filename & \" - size: \" & size)";
Debug.ShouldStop(2048);
dropbox.mostCurrent.__c.runVoidMethod ("LogImpl","51835012",RemoteObject.concat(_filename,RemoteObject.createImmutable(" - size: "),_size),0);
 BA.debugLineNum = 45;BA.debugLine="CurrentFilename = filename";
Debug.ShouldStop(4096);
dropbox._currentfilename = _filename;
 BA.debugLineNum = 46;BA.debugLine="CurrentPath = path";
Debug.ShouldStop(8192);
dropbox._currentpath = _path;
 BA.debugLineNum = 47;BA.debugLine="If DropboxEnabled = True Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",dropbox._dropboxenabled,dropbox.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 48;BA.debugLine="If size > 14000000 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",_size,BA.numberCast(double.class, 14000000))) { 
 BA.debugLineNum = 49;BA.debugLine="dbxFiles.uploadsession(path, filename, size, 0,";
Debug.ShouldStop(65536);
dropbox._dbxfiles.runVoidMethod ("uploadsession",(Object)(_path),(Object)(_filename),(Object)(BA.numberCast(long.class, _size)),(Object)(BA.numberCast(long.class, 0)),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),_dropboxfolder,RemoteObject.createImmutable("/"))),(Object)(dropbox._dbxfiles.runMethod(false,"getWriteModeADD")));
 }else {
 BA.debugLineNum = 51;BA.debugLine="dbxFiles.upload(path, filename, \"/\" & DropboxFo";
Debug.ShouldStop(262144);
dropbox._dbxfiles.runVoidMethod ("upload",(Object)(_path),(Object)(_filename),(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),_dropboxfolder,RemoteObject.createImmutable("/"),_filename)),(Object)(dropbox.mostCurrent.__c.getField(true,"False")),(Object)(dropbox.mostCurrent.__c.getField(true,"False")));
 };
 }else {
 BA.debugLineNum = 54;BA.debugLine="MsgboxAsync(\"Dropbox has not been properly initi";
Debug.ShouldStop(2097152);
dropbox.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Dropbox has not been properly initialized")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 };
 BA.debugLineNum = 56;BA.debugLine="Dim nowake As PhoneWakeState";
Debug.ShouldStop(8388608);
_nowake = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneWakeState");Debug.locals.put("nowake", _nowake);
 BA.debugLineNum = 57;BA.debugLine="nowake.PartialLock";
Debug.ShouldStop(16777216);
_nowake.runVoidMethod ("PartialLock",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}