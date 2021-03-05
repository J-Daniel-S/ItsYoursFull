package org.techteam.itsyours;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xvideo_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xvideo) ","b4xvideo",6,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xvideo","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 23;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Root = Root1";
Debug.ShouldStop(8388608);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 26;BA.debugLine="Root.LoadLayout(\"videorecord\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("videorecord")),__ref.getField(false, "ba"));
 BA.debugLineNum = 27;BA.debugLine="DropBox.InitializeDropBox";
Debug.ShouldStop(67108864);
b4xvideo._dropbox.runVoidMethod ("_initializedropbox" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _backpanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("backPanel_Click (b4xvideo) ","b4xvideo",6,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("backpanel_click")) { return __ref.runUserSub(false, "b4xvideo","backpanel_click", __ref);}
 BA.debugLineNum = 95;BA.debugLine="Private Sub backPanel_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
Debug.ShouldStop(-2147483648);
b4xvideo._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MainPage")));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
b4xvideo._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xvideo._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xvideo._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xvideo._xui);
 //BA.debugLineNum = 4;BA.debugLine="Dim videoRecorder As VideoRecordApp";
b4xvideo._videorecorder = RemoteObject.createNew ("anywheresoftware.b4a.audio.AudioRecordApp.VideoRecordApp");__ref.setField("_videorecorder",b4xvideo._videorecorder);
 //BA.debugLineNum = 5;BA.debugLine="Dim VideoFilename As String";
b4xvideo._videofilename = RemoteObject.createImmutable("");__ref.setField("_videofilename",b4xvideo._videofilename);
 //BA.debugLineNum = 6;BA.debugLine="Private progressPanel As Panel";
b4xvideo._progresspanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_progresspanel",b4xvideo._progresspanel);
 //BA.debugLineNum = 7;BA.debugLine="Private progresslabel As Label";
b4xvideo._progresslabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_progresslabel",b4xvideo._progresslabel);
 //BA.debugLineNum = 8;BA.debugLine="Private ProgressBar1 As ProgressBar";
b4xvideo._progressbar1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");__ref.setField("_progressbar1",b4xvideo._progressbar1);
 //BA.debugLineNum = 9;BA.debugLine="Public mProgressPanel As Panel";
b4xvideo._mprogresspanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mprogresspanel",b4xvideo._mprogresspanel);
 //BA.debugLineNum = 10;BA.debugLine="Public mProgressBar As ProgressBar";
b4xvideo._mprogressbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");__ref.setField("_mprogressbar",b4xvideo._mprogressbar);
 //BA.debugLineNum = 11;BA.debugLine="Public mProgressLabel As Label";
b4xvideo._mprogresslabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_mprogresslabel",b4xvideo._mprogresslabel);
 //BA.debugLineNum = 12;BA.debugLine="Private backPanel As Panel";
b4xvideo._backpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_backpanel",b4xvideo._backpanel);
 //BA.debugLineNum = 13;BA.debugLine="Private btnStart As Button";
b4xvideo._btnstart = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_btnstart",b4xvideo._btnstart);
 //BA.debugLineNum = 14;BA.debugLine="Private recordPanel As Panel";
b4xvideo._recordpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_recordpanel",b4xvideo._recordpanel);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dbxfiles_uploadfinished(RemoteObject __ref,RemoteObject _success,RemoteObject _metaobj,RemoteObject _sessionid) throws Exception{
try {
		Debug.PushSubsStack("dbxFiles_UploadFinished (b4xvideo) ","b4xvideo",6,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("dbxfiles_uploadfinished")) { return __ref.runUserSub(false, "b4xvideo","dbxfiles_uploadfinished", __ref, _success, _metaobj, _sessionid);}
RemoteObject _nowake = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneWakeState");
Debug.locals.put("success", _success);
Debug.locals.put("metaObj", _metaobj);
Debug.locals.put("sessionId", _sessionid);
 BA.debugLineNum = 70;BA.debugLine="Sub dbxFiles_UploadFinished(success As Boolean, me";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Log(sessionId)";
Debug.ShouldStop(64);
b4xvideo.__c.runVoidMethod ("LogImpl","53670017",_sessionid,0);
 BA.debugLineNum = 72;BA.debugLine="If success = True Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_success,b4xvideo.__c.getField(true,"True"))) { 
 BA.debugLineNum = 73;BA.debugLine="MsgboxAsync(\"File uploaded successfully\", \"Uploa";
Debug.ShouldStop(256);
b4xvideo.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("File uploaded successfully")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Upload"))),__ref.getField(false, "ba"));
 }else {
 BA.debugLineNum = 75;BA.debugLine="MsgboxAsync(\"Error uploading file\", \"Upload\")";
Debug.ShouldStop(1024);
b4xvideo.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Error uploading file")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Upload"))),__ref.getField(false, "ba"));
 };
 BA.debugLineNum = 77;BA.debugLine="mProgressPanel.Visible = False";
Debug.ShouldStop(4096);
__ref.getField(false,"_mprogresspanel" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xvideo.__c.getField(true,"False"));
 BA.debugLineNum = 78;BA.debugLine="Dim nowake As PhoneWakeState";
Debug.ShouldStop(8192);
_nowake = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneWakeState");Debug.locals.put("nowake", _nowake);
 BA.debugLineNum = 79;BA.debugLine="nowake.ReleasePartialLock";
Debug.ShouldStop(16384);
_nowake.runVoidMethod ("ReleasePartialLock");
 BA.debugLineNum = 80;BA.debugLine="File.Delete(DropBox.CurrentPath, DropBox.CurrentF";
Debug.ShouldStop(32768);
b4xvideo.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(b4xvideo._dropbox._currentpath /*RemoteObject*/ ),(Object)(b4xvideo._dropbox._currentfilename /*RemoteObject*/ ));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dbxfiles_uploadprogress(RemoteObject __ref,RemoteObject _sessionid,RemoteObject _path,RemoteObject _filename,RemoteObject _uploaded,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("dbxFiles_UploadProgress (b4xvideo) ","b4xvideo",6,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("dbxfiles_uploadprogress")) { return __ref.runUserSub(false, "b4xvideo","dbxfiles_uploadprogress", __ref, _sessionid, _path, _filename, _uploaded, _size);}
RemoteObject _pct = RemoteObject.createImmutable(0);
Debug.locals.put("sessionId", _sessionid);
Debug.locals.put("path", _path);
Debug.locals.put("filename", _filename);
Debug.locals.put("uploaded", _uploaded);
Debug.locals.put("size", _size);
 BA.debugLineNum = 83;BA.debugLine="Sub dbxFiles_UploadProgress(sessionId As String, p";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Dim Pct As Int";
Debug.ShouldStop(524288);
_pct = RemoteObject.createImmutable(0);Debug.locals.put("Pct", _pct);
 BA.debugLineNum = 85;BA.debugLine="Log(\"Upload Progress\")";
Debug.ShouldStop(1048576);
b4xvideo.__c.runVoidMethod ("LogImpl","53735554",RemoteObject.createImmutable("Upload Progress"),0);
 BA.debugLineNum = 86;BA.debugLine="If uploaded < size Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("<",_uploaded,_size)) { 
 BA.debugLineNum = 87;BA.debugLine="Pct = uploaded / size * 100";
Debug.ShouldStop(4194304);
_pct = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_uploaded,_size,RemoteObject.createImmutable(100)}, "/*",0, 0));Debug.locals.put("Pct", _pct);
 BA.debugLineNum = 88;BA.debugLine="mProgressLabel.Text = \"Uploading \" & filename.Su";
Debug.ShouldStop(8388608);
__ref.getField(false,"_mprogresslabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Uploading "),_filename.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_filename.runMethod(true,"length"),RemoteObject.createImmutable(4)}, "-",1, 1))),RemoteObject.createImmutable(" "),_pct,RemoteObject.createImmutable("%"))));
 BA.debugLineNum = 89;BA.debugLine="mProgressBar.Progress = Pct";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mprogressbar" /*RemoteObject*/ ).runMethod(true,"setProgress",_pct);
 BA.debugLineNum = 90;BA.debugLine="Log(uploaded & \" out of \" & size)";
Debug.ShouldStop(33554432);
b4xvideo.__c.runVoidMethod ("LogImpl","53735559",RemoteObject.concat(_uploaded,RemoteObject.createImmutable(" out of "),_size),0);
 };
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xvideo) ","b4xvideo",6,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xvideo","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="Return Me";
Debug.ShouldStop(262144);
if (true) return __ref;
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _recordpanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("recordPanel_Click (b4xvideo) ","b4xvideo",6,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("recordpanel_click")) { return __ref.runUserSub(false, "b4xvideo","recordpanel_click", __ref);}
RemoteObject _folder = RemoteObject.createImmutable("");
 BA.debugLineNum = 99;BA.debugLine="Private Sub recordPanel_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="Dim folder As String = Starter.Provider.SharedFol";
Debug.ShouldStop(8);
_folder = b4xvideo._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ );Debug.locals.put("folder", _folder);Debug.locals.put("folder", _folder);
 BA.debugLineNum = 102;BA.debugLine="videoRecorder.Initialize(\"videoRecorder\")";
Debug.ShouldStop(32);
__ref.getField(false,"_videorecorder" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("videoRecorder")));
 BA.debugLineNum = 103;BA.debugLine="VideoFilename = DateTime.Now & \".mp4\"";
Debug.ShouldStop(64);
__ref.setField ("_videofilename" /*RemoteObject*/ ,RemoteObject.concat(b4xvideo.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(".mp4")));
 BA.debugLineNum = 104;BA.debugLine="videoRecorder.Record3(folder, VideoFilename, 10 *";
Debug.ShouldStop(128);
__ref.getField(false,"_videorecorder" /*RemoteObject*/ ).runVoidMethod ("Record3",__ref.getField(false, "ba"),(Object)(_folder),(Object)(__ref.getField(true,"_videofilename" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(10),RemoteObject.createImmutable(60)}, "*",0, 1)),(Object)((b4xvideo._starter._provider /*RemoteObject*/ .runClassMethod (org.techteam.itsyours.fileprovider.class, "_getfileuri" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_videofilename" /*RemoteObject*/ ))))));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprogressbar(RemoteObject __ref,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("SetProgressBar (b4xvideo) ","b4xvideo",6,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("setprogressbar")) { return __ref.runUserSub(false, "b4xvideo","setprogressbar", __ref, _filename);}
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 54;BA.debugLine="Sub SetProgressBar(filename As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="mProgressBar = ProgressBar1";
Debug.ShouldStop(4194304);
__ref.setField ("_mprogressbar" /*RemoteObject*/ ,__ref.getField(false,"_progressbar1" /*RemoteObject*/ ));
 BA.debugLineNum = 56;BA.debugLine="mProgressPanel = progressPanel";
Debug.ShouldStop(8388608);
__ref.setField ("_mprogresspanel" /*RemoteObject*/ ,__ref.getField(false,"_progresspanel" /*RemoteObject*/ ));
 BA.debugLineNum = 57;BA.debugLine="mProgressLabel = progresslabel";
Debug.ShouldStop(16777216);
__ref.setField ("_mprogresslabel" /*RemoteObject*/ ,__ref.getField(false,"_progresslabel" /*RemoteObject*/ ));
 BA.debugLineNum = 58;BA.debugLine="SetProgressBarCommon(filename)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (org.techteam.itsyours.b4xvideo.class, "_setprogressbarcommon" /*RemoteObject*/ ,(Object)(_filename));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprogressbarcommon(RemoteObject __ref,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("SetProgressBarCommon (b4xvideo) ","b4xvideo",6,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setprogressbarcommon")) { return __ref.runUserSub(false, "b4xvideo","setprogressbarcommon", __ref, _filename);}
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 61;BA.debugLine="Sub SetProgressBarCommon(filename As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="If mProgressPanel.Visible = False Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mprogresspanel" /*RemoteObject*/ ).runMethod(true,"getVisible"),b4xvideo.__c.getField(true,"False"))) { 
 BA.debugLineNum = 63;BA.debugLine="mProgressPanel.Visible = True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mprogresspanel" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xvideo.__c.getField(true,"True"));
 BA.debugLineNum = 64;BA.debugLine="mProgressPanel.BringToFront";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mprogresspanel" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 BA.debugLineNum = 65;BA.debugLine="mProgressLabel.Text = \"Uploading \" & filename.Su";
Debug.ShouldStop(1);
__ref.getField(false,"_mprogresslabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Uploading "),_filename.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_filename.runMethod(true,"length"),RemoteObject.createImmutable(4)}, "-",1, 1))))));
 BA.debugLineNum = 66;BA.debugLine="mProgressBar.Progress = 0";
Debug.ShouldStop(2);
__ref.getField(false,"_mprogressbar" /*RemoteObject*/ ).runMethod(true,"setProgress",BA.numberCast(int.class, 0));
 };
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _videorecorder_recordcomplete(RemoteObject __ref,RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("videoRecorder_RecordComplete (b4xvideo) ","b4xvideo",6,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("videorecorder_recordcomplete")) { return __ref.runUserSub(false, "b4xvideo","videorecorder_recordcomplete", __ref, _success);}
Debug.locals.put("Success", _success);
 BA.debugLineNum = 46;BA.debugLine="Sub videoRecorder_RecordComplete (Success As Boole";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Log(Success)";
Debug.ShouldStop(16384);
b4xvideo.__c.runVoidMethod ("LogImpl","53473409",BA.ObjectToString(_success),0);
 BA.debugLineNum = 48;BA.debugLine="If Success Then";
Debug.ShouldStop(32768);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 49;BA.debugLine="DropBox.UploadFile(Starter.Provider.SharedFolder";
Debug.ShouldStop(65536);
b4xvideo._dropbox.runVoidMethod ("_uploadfile" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(b4xvideo._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_videofilename" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("VideoRecording")));
 BA.debugLineNum = 50;BA.debugLine="SetProgressBar(VideoFilename)";
Debug.ShouldStop(131072);
__ref.runClassMethod (org.techteam.itsyours.b4xvideo.class, "_setprogressbar" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_videofilename" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}