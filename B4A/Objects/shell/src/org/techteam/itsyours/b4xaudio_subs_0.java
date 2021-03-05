package org.techteam.itsyours;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xaudio_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xaudio) ","b4xaudio",5,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xaudio","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Root = Root1";
Debug.ShouldStop(1048576);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 23;BA.debugLine="Root.LoadLayout(\"audiorecord\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("audiorecord")),__ref.getField(false, "ba"));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("backPanel_Click (b4xaudio) ","b4xaudio",5,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("backpanel_click")) { return __ref.runUserSub(false, "b4xaudio","backpanel_click", __ref);}
 BA.debugLineNum = 101;BA.debugLine="Private Sub backPanel_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
Debug.ShouldStop(32);
b4xaudio._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MainPage")));
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
b4xaudio._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xaudio._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xaudio._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xaudio._xui);
 //BA.debugLineNum = 5;BA.debugLine="Dim ion As Object";
b4xaudio._ion = RemoteObject.createNew ("Object");__ref.setField("_ion",b4xaudio._ion);
 //BA.debugLineNum = 6;BA.debugLine="Private progressPanel As Panel";
b4xaudio._progresspanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_progresspanel",b4xaudio._progresspanel);
 //BA.debugLineNum = 7;BA.debugLine="Private progresslabel As Label";
b4xaudio._progresslabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_progresslabel",b4xaudio._progresslabel);
 //BA.debugLineNum = 8;BA.debugLine="Private ProgressBar1 As ProgressBar";
b4xaudio._progressbar1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");__ref.setField("_progressbar1",b4xaudio._progressbar1);
 //BA.debugLineNum = 9;BA.debugLine="Private backPanel As Panel";
b4xaudio._backpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_backpanel",b4xaudio._backpanel);
 //BA.debugLineNum = 10;BA.debugLine="Private recordPanel As Panel";
b4xaudio._recordpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_recordpanel",b4xaudio._recordpanel);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getba(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBA (b4xaudio) ","b4xaudio",5,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("getba")) { return __ref.runUserSub(false, "b4xaudio","getba", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 63;BA.debugLine="Sub GetBA As Object";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="Dim jo As JavaObject = Me";
Debug.ShouldStop(-2147483648);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 65;BA.debugLine="Return jo.RunMethod(\"getBA\", Null)";
Debug.ShouldStop(1);
if (true) return _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getBA")),(Object)((b4xaudio.__c.getField(false,"Null"))));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xaudio) ","b4xaudio",5,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xaudio","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="DropBox.InitializeDropBox";
Debug.ShouldStop(16384);
b4xaudio._dropbox.runVoidMethod ("_initializedropbox" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 16;BA.debugLine="Return Me";
Debug.ShouldStop(32768);
if (true) return __ref;
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ion_event(RemoteObject __ref,RemoteObject _pion,RemoteObject _pi) throws Exception{
try {
		Debug.PushSubsStack("ion_event (b4xaudio) ","b4xaudio",5,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("ion_event")) { return __ref.runUserSub(false, "b4xaudio","ion_event", __ref, _pion, _pi);}
Debug.locals.put("pIon", _pion);
Debug.locals.put("pI", _pi);
 BA.debugLineNum = 68;BA.debugLine="Sub ion_event(pIon As Object, pI As Object)";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="Log(\"In ion_event\")";
Debug.ShouldStop(32);
b4xaudio.__c.runVoidMethod ("LogImpl","53014658",RemoteObject.createImmutable("In ion_event"),0);
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _recordpanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("recordPanel_Click (b4xaudio) ","b4xaudio",5,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("recordpanel_click")) { __ref.runUserSub(false, "b4xaudio","recordpanel_click", __ref); return;}
ResumableSub_recordPanel_Click rsub = new ResumableSub_recordPanel_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_recordPanel_Click extends BA.ResumableSub {
public ResumableSub_recordPanel_Click(org.techteam.itsyours.b4xaudio parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
org.techteam.itsyours.b4xaudio parent;
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _stamp = RemoteObject.createImmutable("");
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _args = null;
RemoteObject _resultcode = RemoteObject.createImmutable(0);
RemoteObject _uri = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("recordPanel_Click (b4xaudio) ","b4xaudio",5,__ref.getField(false, "ba"),__ref,105);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 106;BA.debugLine="Dim in As Intent";
Debug.ShouldStop(512);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("in", _in);
 BA.debugLineNum = 107;BA.debugLine="Dim stamp As String";
Debug.ShouldStop(1024);
_stamp = RemoteObject.createImmutable("");Debug.locals.put("stamp", _stamp);
 BA.debugLineNum = 109;BA.debugLine="in.Initialize(\"android.provider.MediaStore.RECORD";
Debug.ShouldStop(4096);
_in.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("android.provider.MediaStore.RECORD_SOUND")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 110;BA.debugLine="StartActivityForResult(in)";
Debug.ShouldStop(8192);
__ref.runClassMethod (org.techteam.itsyours.b4xaudio.class, "_startactivityforresult" /*RemoteObject*/ ,(Object)(_in));
 BA.debugLineNum = 111;BA.debugLine="Wait For ion_event (MethodName As String, Args()";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","ion_event", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xaudio", "recordpanel_click"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_methodname = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("MethodName", _methodname);
_args = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Args", _args);
;
 BA.debugLineNum = 112;BA.debugLine="Log(\"#2 \" & MethodName)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","511272199",RemoteObject.concat(RemoteObject.createImmutable("#2 "),_methodname),0);
 BA.debugLineNum = 113;BA.debugLine="Log(\"#3 \" & Args(0))";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","511272200",RemoteObject.concat(RemoteObject.createImmutable("#3 "),_args.getArrayElement(false,BA.numberCast(int.class, 0))),0);
 BA.debugLineNum = 114;BA.debugLine="Dim resultCode As Int = Args(0)";
Debug.ShouldStop(131072);
_resultcode = BA.numberCast(int.class, _args.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("resultCode", _resultcode);Debug.locals.put("resultCode", _resultcode);
 BA.debugLineNum = 115;BA.debugLine="If resultCode = -1 Then ' Ok";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_resultcode,BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 116;BA.debugLine="Dim in As Intent = Args(1)";
Debug.ShouldStop(524288);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");
_in = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.IntentWrapper"), _args.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("in", _in);
 BA.debugLineNum = 117;BA.debugLine="Log(\"#5 \" & in.GetData)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","511272204",RemoteObject.concat(RemoteObject.createImmutable("#5 "),_in.runMethod(true,"GetData")),0);
 BA.debugLineNum = 118;BA.debugLine="Dim uri As String = in.GetData";
Debug.ShouldStop(2097152);
_uri = _in.runMethod(true,"GetData");Debug.locals.put("uri", _uri);Debug.locals.put("uri", _uri);
 BA.debugLineNum = 119;BA.debugLine="stamp = DateTime.Now & \".mp3\"";
Debug.ShouldStop(4194304);
_stamp = RemoteObject.concat(parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(".mp3"));Debug.locals.put("stamp", _stamp);
 BA.debugLineNum = 120;BA.debugLine="File.Copy(\"ContentDir\", uri, File.DirInternal, s";
Debug.ShouldStop(8388608);
parent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(BA.ObjectToString("ContentDir")),(Object)(_uri),(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_stamp));
 BA.debugLineNum = 121;BA.debugLine="DropBox.UploadFile(File.DirInternal, stamp, \"Aud";
Debug.ShouldStop(16777216);
parent._dropbox.runVoidMethod ("_uploadfile" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_stamp),(Object)(RemoteObject.createImmutable("AudioRecording")));
 BA.debugLineNum = 122;BA.debugLine="SetProgressBar(stamp)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (org.techteam.itsyours.b4xaudio.class, "_setprogressbar" /*RemoteObject*/ ,(Object)(_stamp));
 if (true) break;

case 5:
//C
this.state = 6;
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _setprogressbar(RemoteObject __ref,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("SetProgressBar (b4xaudio) ","b4xaudio",5,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("setprogressbar")) { return __ref.runUserSub(false, "b4xaudio","setprogressbar", __ref, _filename);}
RemoteObject _videopage = RemoteObject.declareNull("org.techteam.itsyours.b4xvideo");
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 73;BA.debugLine="Sub SetProgressBar(filename As String)";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="Dim VideoPage As B4XVideo = B4XPages.GetPage(\"Vid";
Debug.ShouldStop(512);
_videopage = (b4xaudio._b4xpages.runMethod(false,"_getpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Video"))));Debug.locals.put("VideoPage", _videopage);Debug.locals.put("VideoPage", _videopage);
 BA.debugLineNum = 75;BA.debugLine="VideoPage.mProgressBar = ProgressBar1";
Debug.ShouldStop(1024);
_videopage.setField ("_mprogressbar" /*RemoteObject*/ ,__ref.getField(false,"_progressbar1" /*RemoteObject*/ ));
 BA.debugLineNum = 76;BA.debugLine="VideoPage.mProgressPanel = progressPanel";
Debug.ShouldStop(2048);
_videopage.setField ("_mprogresspanel" /*RemoteObject*/ ,__ref.getField(false,"_progresspanel" /*RemoteObject*/ ));
 BA.debugLineNum = 77;BA.debugLine="VideoPage.mProgressLabel = progresslabel";
Debug.ShouldStop(4096);
_videopage.setField ("_mprogresslabel" /*RemoteObject*/ ,__ref.getField(false,"_progresslabel" /*RemoteObject*/ ));
 BA.debugLineNum = 78;BA.debugLine="VideoPage.SetProgressBarCommon(filename)";
Debug.ShouldStop(8192);
_videopage.runClassMethod (org.techteam.itsyours.b4xvideo.class, "_setprogressbarcommon" /*RemoteObject*/ ,(Object)(_filename));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startactivityforresult(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("StartActivityForResult (b4xaudio) ","b4xaudio",5,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("startactivityforresult")) { return __ref.runUserSub(false, "b4xaudio","startactivityforresult", __ref, _i);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("i", _i);
 BA.debugLineNum = 56;BA.debugLine="Sub StartActivityForResult(i As Intent)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Dim jo As JavaObject = GetBA";
Debug.ShouldStop(16777216);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.runClassMethod (org.techteam.itsyours.b4xaudio.class, "_getba" /*RemoteObject*/ ));Debug.locals.put("jo", _jo);
 BA.debugLineNum = 59;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
Debug.ShouldStop(67108864);
__ref.setField ("_ion" /*RemoteObject*/ ,_jo.runMethod(false,"CreateEvent",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("anywheresoftware.b4a.IOnActivityResult")),(Object)(BA.ObjectToString("ion")),(Object)(b4xaudio.__c.getField(false,"Null"))));
 BA.debugLineNum = 60;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array As O";
Debug.ShouldStop(134217728);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("startActivityForResult")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {__ref.getField(false,"_ion" /*RemoteObject*/ ),(_i.getObject())})));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}