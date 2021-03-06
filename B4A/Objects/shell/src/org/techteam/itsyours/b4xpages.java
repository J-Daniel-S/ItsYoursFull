
package org.techteam.itsyours;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class b4xpages implements IRemote{
	public static b4xpages mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public b4xpages() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, b4xpages.class);
    static {
		mostCurrent = new b4xpages();
        remoteMe = RemoteObject.declareNull("org.techteam.itsyours.b4xpages");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("b4xpages"), "org.techteam.itsyours.b4xpages");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("org.techteam.itsyours.b4xpages"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mpm = RemoteObject.declareNull("Object");
public static RemoteObject _delegate = RemoteObject.declareNull("org.techteam.itsyours.b4xpagesdelegator");
public static RemoteObject _globalcontext = RemoteObject.declareNull("Object");
public static org.techteam.itsyours.main _main = null;
public static org.techteam.itsyours.dropbox _dropbox = null;
public static org.techteam.itsyours.starter _starter = null;
public static org.techteam.itsyours.b4xcollections _b4xcollections = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4XCollections",Debug.moduleToString(org.techteam.itsyours.b4xcollections.class),"Delegate",b4xpages._delegate,"DropBox",Debug.moduleToString(org.techteam.itsyours.dropbox.class),"GlobalContext",b4xpages._globalcontext,"Main",Debug.moduleToString(org.techteam.itsyours.main.class),"mPM",b4xpages._mpm,"Starter",Debug.moduleToString(org.techteam.itsyours.starter.class)};
}
}