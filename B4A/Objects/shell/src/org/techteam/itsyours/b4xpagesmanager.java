
package org.techteam.itsyours;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xpagesmanager {
    public static RemoteObject myClass;
	public b4xpagesmanager() {
	}
    public static PCBA staticBA = new PCBA(null, b4xpagesmanager.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _idtob4xpage = RemoteObject.declareNull("org.techteam.itsyours.b4xorderedmap");
public static RemoteObject _rootb4xtopage = RemoteObject.declareNull("org.techteam.itsyours.b4xorderedmap");
public static RemoteObject _context = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _mstackofpageids = RemoteObject.declareNull("org.techteam.itsyours.b4xset");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mmainform = RemoteObject.declareNull("anywheresoftware.b4a.objects.ActivityWrapper");
public static RemoteObject _showupindicator = RemoteObject.createImmutable(false);
public static RemoteObject _actionbar = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _isforeground = RemoteObject.createImmutable(false);
public static RemoteObject _transitionanimationduration = RemoteObject.createImmutable(0);
public static RemoteObject _mainpage = RemoteObject.declareNull("org.techteam.itsyours.b4xmainpage");
public static RemoteObject _stackstring = RemoteObject.createImmutable("");
public static RemoteObject _logevents = RemoteObject.createImmutable(false);
public static org.techteam.itsyours.main _main = null;
public static org.techteam.itsyours.dropbox _dropbox = null;
public static org.techteam.itsyours.starter _starter = null;
public static org.techteam.itsyours.b4xpages _b4xpages = null;
public static org.techteam.itsyours.b4xcollections _b4xcollections = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ActionBar",_ref.getField(false, "_actionbar"),"Context",_ref.getField(false, "_context"),"IdToB4XPage",_ref.getField(false, "_idtob4xpage"),"IsForeground",_ref.getField(false, "_isforeground"),"LogEvents",_ref.getField(false, "_logevents"),"MainPage",_ref.getField(false, "_mainpage"),"mMainForm",_ref.getField(false, "_mmainform"),"mStackOfPageIds",_ref.getField(false, "_mstackofpageids"),"RootB4XToPage",_ref.getField(false, "_rootb4xtopage"),"ShowUpIndicator",_ref.getField(false, "_showupindicator"),"StackString",_ref.getField(false, "_stackstring"),"TransitionAnimationDuration",_ref.getField(false, "_transitionanimationduration"),"xui",_ref.getField(false, "_xui")};
}
}