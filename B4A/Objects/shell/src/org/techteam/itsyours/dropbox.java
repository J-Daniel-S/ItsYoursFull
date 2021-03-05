
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

public class dropbox implements IRemote{
	public static dropbox mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public dropbox() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, dropbox.class);
    static {
		mostCurrent = new dropbox();
        remoteMe = RemoteObject.declareNull("org.techteam.itsyours.dropbox");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("dropbox"), "org.techteam.itsyours.dropbox");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("org.techteam.itsyours.dropbox"), new java.lang.ref.WeakReference<PCBA> (pcBA));
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
public static RemoteObject _client = RemoteObject.declareNull("de.donmanfred.dbxv2.DbxClientV2Wrapper");
public static RemoteObject _config = RemoteObject.declareNull("de.donmanfred.dbxv2.DbxRequestConfigWrapper");
public static RemoteObject _dbxfiles = RemoteObject.declareNull("de.donmanfred.dbxv2.files.DbxUserFilesRequestsWrapper");
public static RemoteObject _dbxsharing = RemoteObject.declareNull("de.donmanfred.dbxv2.sharing.DbxUserSharingRequestsWrapper");
public static RemoteObject _dbxusers = RemoteObject.declareNull("de.donmanfred.dbxv2.users.DbxUserUsersRequestsWrapper");
public static RemoteObject _token = RemoteObject.createImmutable("");
public static RemoteObject _dropboxenabled = RemoteObject.createImmutable(false);
public static RemoteObject _currentpath = RemoteObject.createImmutable("");
public static RemoteObject _currentfilename = RemoteObject.createImmutable("");
public static org.techteam.itsyours.main _main = null;
public static org.techteam.itsyours.starter _starter = null;
public static org.techteam.itsyours.b4xpages _b4xpages = null;
public static org.techteam.itsyours.b4xcollections _b4xcollections = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4XCollections",Debug.moduleToString(org.techteam.itsyours.b4xcollections.class),"B4XPages",Debug.moduleToString(org.techteam.itsyours.b4xpages.class),"client",dropbox._client,"config",dropbox._config,"CurrentFilename",dropbox._currentfilename,"CurrentPath",dropbox._currentpath,"dbxFiles",dropbox._dbxfiles,"dbxSharing",dropbox._dbxsharing,"dbxUsers",dropbox._dbxusers,"DropboxEnabled",dropbox._dropboxenabled,"Main",Debug.moduleToString(org.techteam.itsyours.main.class),"Starter",Debug.moduleToString(org.techteam.itsyours.starter.class),"token",dropbox._token};
}
}