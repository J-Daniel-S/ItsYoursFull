
package org.techteam.itsyours;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xaudio {
    public static RemoteObject myClass;
	public b4xaudio() {
	}
    public static PCBA staticBA = new PCBA(null, b4xaudio.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _ion = RemoteObject.declareNull("Object");
public static RemoteObject _progresspanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _progresslabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _progressbar1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _backpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _recordpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static org.techteam.itsyours.main _main = null;
public static org.techteam.itsyours.dropbox _dropbox = null;
public static org.techteam.itsyours.starter _starter = null;
public static org.techteam.itsyours.b4xpages _b4xpages = null;
public static org.techteam.itsyours.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"backPanel",_ref.getField(false, "_backpanel"),"ion",_ref.getField(false, "_ion"),"ProgressBar1",_ref.getField(false, "_progressbar1"),"progresslabel",_ref.getField(false, "_progresslabel"),"progressPanel",_ref.getField(false, "_progresspanel"),"recordPanel",_ref.getField(false, "_recordpanel"),"Root",_ref.getField(false, "_root"),"xui",_ref.getField(false, "_xui")};
}
}