package org.techteam.itsyours;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xaudio extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "org.techteam.itsyours.b4xaudio");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", org.techteam.itsyours.b4xaudio.class).invoke(this, new Object[] {null});
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
public Object _ion = null;
public anywheresoftware.b4a.objects.PanelWrapper _progresspanel = null;
public anywheresoftware.b4a.objects.LabelWrapper _progresslabel = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _progressbar1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _backpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _recordpanel = null;
public org.techteam.itsyours.main _main = null;
public org.techteam.itsyours.dropbox _dropbox = null;
public org.techteam.itsyours.starter _starter = null;
public org.techteam.itsyours.b4xpages _b4xpages = null;
public org.techteam.itsyours.b4xcollections _b4xcollections = null;
public Object  _initialize(org.techteam.itsyours.b4xaudio __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xaudio";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="DropBox.InitializeDropBox";
_dropbox._initializedropbox /*String*/ (ba);
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(org.techteam.itsyours.b4xaudio __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xaudio";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Root.LoadLayout(\"audiorecord\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("audiorecord",ba);
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="End Sub";
return "";
}
public String  _backpanel_click(org.techteam.itsyours.b4xaudio __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xaudio";
if (Debug.shouldDelegate(ba, "backpanel_click", false))
	 {return ((String) Debug.delegate(ba, "backpanel_click", null));}
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Private Sub backPanel_Click";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="B4XPages.ShowPage(\"MainPage\")";
_b4xpages._showpage /*String*/ (ba,"MainPage");
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(org.techteam.itsyours.b4xaudio __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xaudio";
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Dim ion As Object";
_ion = new Object();
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="Private progressPanel As Panel";
_progresspanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="Private progresslabel As Label";
_progresslabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="Private ProgressBar1 As ProgressBar";
_progressbar1 = new anywheresoftware.b4a.objects.ProgressBarWrapper();
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="Private backPanel As Panel";
_backpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="Private recordPanel As Panel";
_recordpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="End Sub";
return "";
}
public Object  _getba(org.techteam.itsyours.b4xaudio __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xaudio";
if (Debug.shouldDelegate(ba, "getba", false))
	 {return ((Object) Debug.delegate(ba, "getba", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub GetBA As Object";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Return jo.RunMethod(\"getBA\", Null)";
if (true) return _jo.RunMethod("getBA",(Object[])(__c.Null));
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="End Sub";
return null;
}
public String  _ion_event(org.techteam.itsyours.b4xaudio __ref,Object _pion,Object _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xaudio";
if (Debug.shouldDelegate(ba, "ion_event", false))
	 {return ((String) Debug.delegate(ba, "ion_event", new Object[] {_pion,_pi}));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub ion_event(pIon As Object, pI As Object)";
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Log(\"In ion_event\")";
__c.LogImpl("53014658","In ion_event",0);
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="End Sub";
return "";
}
public void  _recordpanel_click(org.techteam.itsyours.b4xaudio __ref) throws Exception{
RDebugUtils.currentModule="b4xaudio";
if (Debug.shouldDelegate(ba, "recordpanel_click", false))
	 {Debug.delegate(ba, "recordpanel_click", null); return;}
ResumableSub_recordPanel_Click rsub = new ResumableSub_recordPanel_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_recordPanel_Click extends BA.ResumableSub {
public ResumableSub_recordPanel_Click(org.techteam.itsyours.b4xaudio parent,org.techteam.itsyours.b4xaudio __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
org.techteam.itsyours.b4xaudio __ref;
org.techteam.itsyours.b4xaudio parent;
anywheresoftware.b4a.objects.IntentWrapper _in = null;
String _stamp = "";
String _methodname = "";
Object[] _args = null;
int _resultcode = 0;
String _uri = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xaudio";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Dim in As Intent";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="Dim stamp As String";
_stamp = "";
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="in.Initialize(\"android.provider.MediaStore.RECORD";
_in.Initialize("android.provider.MediaStore.RECORD_SOUND","");
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="StartActivityForResult(in)";
__ref._startactivityforresult /*String*/ (null,_in);
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="Wait For ion_event (MethodName As String, Args()";
parent.__c.WaitFor("ion_event", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xaudio", "recordpanel_click"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_methodname = (String) result[1];
_args = (Object[]) result[2];
;
RDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="Log(\"#2 \" & MethodName)";
parent.__c.LogImpl("511272199","#2 "+_methodname,0);
RDebugUtils.currentLine=11272200;
 //BA.debugLineNum = 11272200;BA.debugLine="Log(\"#3 \" & Args(0))";
parent.__c.LogImpl("511272200","#3 "+BA.ObjectToString(_args[(int) (0)]),0);
RDebugUtils.currentLine=11272201;
 //BA.debugLineNum = 11272201;BA.debugLine="Dim resultCode As Int = Args(0)";
_resultcode = (int)(BA.ObjectToNumber(_args[(int) (0)]));
RDebugUtils.currentLine=11272202;
 //BA.debugLineNum = 11272202;BA.debugLine="If resultCode = -1 Then ' Ok";
if (true) break;

case 1:
//if
this.state = 6;
if (_resultcode==-1) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=11272203;
 //BA.debugLineNum = 11272203;BA.debugLine="Dim in As Intent = Args(1)";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
_in = (anywheresoftware.b4a.objects.IntentWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.IntentWrapper(), (android.content.Intent)(_args[(int) (1)]));
RDebugUtils.currentLine=11272204;
 //BA.debugLineNum = 11272204;BA.debugLine="Log(\"#5 \" & in.GetData)";
parent.__c.LogImpl("511272204","#5 "+_in.GetData(),0);
RDebugUtils.currentLine=11272205;
 //BA.debugLineNum = 11272205;BA.debugLine="Dim uri As String = in.GetData";
_uri = _in.GetData();
RDebugUtils.currentLine=11272206;
 //BA.debugLineNum = 11272206;BA.debugLine="stamp = DateTime.Now & \".mp3\"";
_stamp = BA.NumberToString(parent.__c.DateTime.getNow())+".mp3";
RDebugUtils.currentLine=11272207;
 //BA.debugLineNum = 11272207;BA.debugLine="File.Copy(\"ContentDir\", uri, File.DirInternal, s";
parent.__c.File.Copy("ContentDir",_uri,parent.__c.File.getDirInternal(),_stamp);
RDebugUtils.currentLine=11272208;
 //BA.debugLineNum = 11272208;BA.debugLine="DropBox.UploadFile(File.DirInternal, stamp, \"Aud";
parent._dropbox._uploadfile /*String*/ (ba,parent.__c.File.getDirInternal(),_stamp,"AudioRecording");
RDebugUtils.currentLine=11272209;
 //BA.debugLineNum = 11272209;BA.debugLine="SetProgressBar(stamp)";
__ref._setprogressbar /*String*/ (null,_stamp);
 if (true) break;

case 5:
//C
this.state = 6;
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=11272213;
 //BA.debugLineNum = 11272213;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _startactivityforresult(org.techteam.itsyours.b4xaudio __ref,anywheresoftware.b4a.objects.IntentWrapper _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xaudio";
if (Debug.shouldDelegate(ba, "startactivityforresult", false))
	 {return ((String) Debug.delegate(ba, "startactivityforresult", new Object[] {_i}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub StartActivityForResult(i As Intent)";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Dim jo As JavaObject = GetBA";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._getba /*Object*/ (null)));
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
__ref._ion /*Object*/  = _jo.CreateEvent(ba,"anywheresoftware.b4a.IOnActivityResult","ion",__c.Null);
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array As O";
_jo.RunMethod("startActivityForResult",new Object[]{__ref._ion /*Object*/ ,(Object)(_i.getObject())});
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="End Sub";
return "";
}
public String  _setprogressbar(org.techteam.itsyours.b4xaudio __ref,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xaudio";
if (Debug.shouldDelegate(ba, "setprogressbar", false))
	 {return ((String) Debug.delegate(ba, "setprogressbar", new Object[] {_filename}));}
org.techteam.itsyours.b4xvideo _videopage = null;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub SetProgressBar(filename As String)";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Dim VideoPage As B4XVideo = B4XPages.GetPage(\"Vid";
_videopage = (org.techteam.itsyours.b4xvideo)(_b4xpages._getpage /*Object*/ (ba,"Video"));
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="VideoPage.mProgressBar = ProgressBar1";
_videopage._mprogressbar /*anywheresoftware.b4a.objects.ProgressBarWrapper*/  = __ref._progressbar1 /*anywheresoftware.b4a.objects.ProgressBarWrapper*/ ;
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="VideoPage.mProgressPanel = progressPanel";
_videopage._mprogresspanel /*anywheresoftware.b4a.objects.PanelWrapper*/  = __ref._progresspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="VideoPage.mProgressLabel = progresslabel";
_videopage._mprogresslabel /*anywheresoftware.b4a.objects.LabelWrapper*/  = __ref._progresslabel /*anywheresoftware.b4a.objects.LabelWrapper*/ ;
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="VideoPage.SetProgressBarCommon(filename)";
_videopage._setprogressbarcommon /*String*/ (null,_filename);
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="End Sub";
return "";
}
}