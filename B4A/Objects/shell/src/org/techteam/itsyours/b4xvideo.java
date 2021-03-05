
package org.techteam.itsyours;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xvideo {
    public static RemoteObject myClass;
	public b4xvideo() {
	}
    public static PCBA staticBA = new PCBA(null, b4xvideo.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _videorecorder = RemoteObject.declareNull("anywheresoftware.b4a.audio.AudioRecordApp.VideoRecordApp");
public static RemoteObject _videofilename = RemoteObject.createImmutable("");
public static RemoteObject _progresspanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _progresslabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _progressbar1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _mprogresspanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mprogressbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _mprogresslabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _backpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnstart = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _recordpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static org.techteam.itsyours.main _main = null;
public static org.techteam.itsyours.dropbox _dropbox = null;
public static org.techteam.itsyours.starter _starter = null;
public static org.techteam.itsyours.b4xpages _b4xpages = null;
public static org.techteam.itsyours.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"backPanel",_ref.getField(false, "_backpanel"),"btnStart",_ref.getField(false, "_btnstart"),"mProgressBar",_ref.getField(false, "_mprogressbar"),"mProgressLabel",_ref.getField(false, "_mprogresslabel"),"mProgressPanel",_ref.getField(false, "_mprogresspanel"),"ProgressBar1",_ref.getField(false, "_progressbar1"),"progresslabel",_ref.getField(false, "_progresslabel"),"progressPanel",_ref.getField(false, "_progresspanel"),"recordPanel",_ref.getField(false, "_recordpanel"),"Root",_ref.getField(false, "_root"),"VideoFilename",_ref.getField(false, "_videofilename"),"videoRecorder",_ref.getField(false, "_videorecorder"),"xui",_ref.getField(false, "_xui")};
}
}