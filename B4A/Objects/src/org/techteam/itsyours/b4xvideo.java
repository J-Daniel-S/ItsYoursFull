package org.techteam.itsyours;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xvideo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "org.techteam.itsyours.b4xvideo");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", org.techteam.itsyours.b4xvideo.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.audio.AudioRecordApp.VideoRecordApp _videorecorder = null;
public String _videofilename = "";
public anywheresoftware.b4a.objects.PanelWrapper _progresspanel = null;
public anywheresoftware.b4a.objects.LabelWrapper _progresslabel = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _progressbar1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _mprogresspanel = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _mprogressbar = null;
public anywheresoftware.b4a.objects.LabelWrapper _mprogresslabel = null;
public anywheresoftware.b4a.objects.PanelWrapper _backpanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnstart = null;
public anywheresoftware.b4a.objects.PanelWrapper _recordpanel = null;
public org.techteam.itsyours.main _main = null;
public org.techteam.itsyours.dropbox _dropbox = null;
public org.techteam.itsyours.starter _starter = null;
public org.techteam.itsyours.b4xpages _b4xpages = null;
public org.techteam.itsyours.b4xcollections _b4xcollections = null;
public Object  _initialize(org.techteam.itsyours.b4xvideo __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xvideo";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="End Sub";
return null;
}
public String  _setprogressbarcommon(org.techteam.itsyours.b4xvideo __ref,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xvideo";
if (Debug.shouldDelegate(ba, "setprogressbarcommon", false))
	 {return ((String) Debug.delegate(ba, "setprogressbarcommon", new Object[] {_filename}));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub SetProgressBarCommon(filename As String)";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="If mProgressPanel.Visible = False Then";
if (__ref._mprogresspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible()==__c.False) { 
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="mProgressPanel.Visible = True";
__ref._mprogresspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="mProgressPanel.BringToFront";
__ref._mprogresspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .BringToFront();
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="mProgressLabel.Text = \"Uploading \" & filename.Su";
__ref._mprogresslabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Uploading "+_filename.substring((int) (_filename.length()-4))));
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="mProgressBar.Progress = 0";
__ref._mprogressbar /*anywheresoftware.b4a.objects.ProgressBarWrapper*/ .setProgress((int) (0));
 };
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(org.techteam.itsyours.b4xvideo __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xvideo";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="Root.LoadLayout(\"videorecord\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("videorecord",ba);
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="DropBox.InitializeDropBox";
_dropbox._initializedropbox /*String*/ (ba);
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="End Sub";
return "";
}
public String  _backpanel_click(org.techteam.itsyours.b4xvideo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xvideo";
if (Debug.shouldDelegate(ba, "backpanel_click", false))
	 {return ((String) Debug.delegate(ba, "backpanel_click", null));}
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Private Sub backPanel_Click";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(org.techteam.itsyours.b4xvideo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xvideo";
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="Dim videoRecorder As VideoRecordApp";
_videorecorder = new anywheresoftware.b4a.audio.AudioRecordApp.VideoRecordApp();
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="Dim VideoFilename As String";
_videofilename = "";
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="Private progressPanel As Panel";
_progresspanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="Private progresslabel As Label";
_progresslabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="Private ProgressBar1 As ProgressBar";
_progressbar1 = new anywheresoftware.b4a.objects.ProgressBarWrapper();
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="Public mProgressPanel As Panel";
_mprogresspanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="Public mProgressBar As ProgressBar";
_mprogressbar = new anywheresoftware.b4a.objects.ProgressBarWrapper();
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="Public mProgressLabel As Label";
_mprogresslabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="Private backPanel As Panel";
_backpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="Private btnStart As Button";
_btnstart = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="Private recordPanel As Panel";
_recordpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="End Sub";
return "";
}
public String  _dbxfiles_uploadfinished(org.techteam.itsyours.b4xvideo __ref,boolean _success,Object _metaobj,String _sessionid) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xvideo";
if (Debug.shouldDelegate(ba, "dbxfiles_uploadfinished", false))
	 {return ((String) Debug.delegate(ba, "dbxfiles_uploadfinished", new Object[] {_success,_metaobj,_sessionid}));}
anywheresoftware.b4a.phone.Phone.PhoneWakeState _nowake = null;
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub dbxFiles_UploadFinished(success As Boolean, me";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Log(sessionId)";
__c.LogImpl("53670017",_sessionid,0);
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="If success = True Then";
if (_success==__c.True) { 
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="MsgboxAsync(\"File uploaded successfully\", \"Uploa";
__c.MsgboxAsync(BA.ObjectToCharSequence("File uploaded successfully"),BA.ObjectToCharSequence("Upload"),ba);
 }else {
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="MsgboxAsync(\"Error uploading file\", \"Upload\")";
__c.MsgboxAsync(BA.ObjectToCharSequence("Error uploading file"),BA.ObjectToCharSequence("Upload"),ba);
 };
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="mProgressPanel.Visible = False";
__ref._mprogresspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="Dim nowake As PhoneWakeState";
_nowake = new anywheresoftware.b4a.phone.Phone.PhoneWakeState();
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="nowake.ReleasePartialLock";
_nowake.ReleasePartialLock();
RDebugUtils.currentLine=3670026;
 //BA.debugLineNum = 3670026;BA.debugLine="File.Delete(DropBox.CurrentPath, DropBox.CurrentF";
__c.File.Delete(_dropbox._currentpath /*String*/ ,_dropbox._currentfilename /*String*/ );
RDebugUtils.currentLine=3670027;
 //BA.debugLineNum = 3670027;BA.debugLine="End Sub";
return "";
}
public String  _dbxfiles_uploadprogress(org.techteam.itsyours.b4xvideo __ref,String _sessionid,String _path,String _filename,long _uploaded,long _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xvideo";
if (Debug.shouldDelegate(ba, "dbxfiles_uploadprogress", false))
	 {return ((String) Debug.delegate(ba, "dbxfiles_uploadprogress", new Object[] {_sessionid,_path,_filename,_uploaded,_size}));}
int _pct = 0;
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub dbxFiles_UploadProgress(sessionId As String, p";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim Pct As Int";
_pct = 0;
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Log(\"Upload Progress\")";
__c.LogImpl("53735554","Upload Progress",0);
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="If uploaded < size Then";
if (_uploaded<_size) { 
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="Pct = uploaded / size * 100";
_pct = (int) (_uploaded/(double)_size*100);
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="mProgressLabel.Text = \"Uploading \" & filename.Su";
__ref._mprogresslabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Uploading "+_filename.substring((int) (_filename.length()-4))+" "+BA.NumberToString(_pct)+"%"));
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="mProgressBar.Progress = Pct";
__ref._mprogressbar /*anywheresoftware.b4a.objects.ProgressBarWrapper*/ .setProgress(_pct);
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="Log(uploaded & \" out of \" & size)";
__c.LogImpl("53735559",BA.NumberToString(_uploaded)+" out of "+BA.NumberToString(_size),0);
 };
RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="End Sub";
return "";
}
public String  _recordpanel_click(org.techteam.itsyours.b4xvideo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xvideo";
if (Debug.shouldDelegate(ba, "recordpanel_click", false))
	 {return ((String) Debug.delegate(ba, "recordpanel_click", null));}
String _folder = "";
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Private Sub recordPanel_Click";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="Dim folder As String = Starter.Provider.SharedFol";
_folder = _starter._provider /*org.techteam.itsyours.fileprovider*/ ._sharedfolder /*String*/ ;
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="videoRecorder.Initialize(\"videoRecorder\")";
__ref._videorecorder /*anywheresoftware.b4a.audio.AudioRecordApp.VideoRecordApp*/ .Initialize("videoRecorder");
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="VideoFilename = DateTime.Now & \".mp4\"";
__ref._videofilename /*String*/  = BA.NumberToString(__c.DateTime.getNow())+".mp4";
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="videoRecorder.Record3(folder, VideoFilename, 10 *";
__ref._videorecorder /*anywheresoftware.b4a.audio.AudioRecordApp.VideoRecordApp*/ .Record3(ba,_folder,__ref._videofilename /*String*/ ,(int) (10*60),(android.net.Uri)(_starter._provider /*org.techteam.itsyours.fileprovider*/ ._getfileuri /*Object*/ (null,__ref._videofilename /*String*/ )));
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="End Sub";
return "";
}
public String  _setprogressbar(org.techteam.itsyours.b4xvideo __ref,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xvideo";
if (Debug.shouldDelegate(ba, "setprogressbar", false))
	 {return ((String) Debug.delegate(ba, "setprogressbar", new Object[] {_filename}));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub SetProgressBar(filename As String)";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="mProgressBar = ProgressBar1";
__ref._mprogressbar /*anywheresoftware.b4a.objects.ProgressBarWrapper*/  = __ref._progressbar1 /*anywheresoftware.b4a.objects.ProgressBarWrapper*/ ;
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="mProgressPanel = progressPanel";
__ref._mprogresspanel /*anywheresoftware.b4a.objects.PanelWrapper*/  = __ref._progresspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="mProgressLabel = progresslabel";
__ref._mprogresslabel /*anywheresoftware.b4a.objects.LabelWrapper*/  = __ref._progresslabel /*anywheresoftware.b4a.objects.LabelWrapper*/ ;
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="SetProgressBarCommon(filename)";
__ref._setprogressbarcommon /*String*/ (null,_filename);
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="End Sub";
return "";
}
public String  _videorecorder_recordcomplete(org.techteam.itsyours.b4xvideo __ref,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xvideo";
if (Debug.shouldDelegate(ba, "videorecorder_recordcomplete", false))
	 {return ((String) Debug.delegate(ba, "videorecorder_recordcomplete", new Object[] {_success}));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub videoRecorder_RecordComplete (Success As Boole";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Log(Success)";
__c.LogImpl("53473409",BA.ObjectToString(_success),0);
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="DropBox.UploadFile(Starter.Provider.SharedFolder";
_dropbox._uploadfile /*String*/ (ba,_starter._provider /*org.techteam.itsyours.fileprovider*/ ._sharedfolder /*String*/ ,__ref._videofilename /*String*/ ,"VideoRecording");
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="SetProgressBar(VideoFilename)";
__ref._setprogressbar /*String*/ (null,__ref._videofilename /*String*/ );
 };
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="End Sub";
return "";
}
}