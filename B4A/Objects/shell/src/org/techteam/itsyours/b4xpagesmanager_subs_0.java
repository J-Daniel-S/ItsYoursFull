package org.techteam.itsyours;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xpagesmanager_subs_0 {


public static RemoteObject  _activity_actionbarhomeclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Activity_ActionBarHomeClick (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("activity_actionbarhomeclick")) { return __ref.runUserSub(false, "b4xpagesmanager","activity_actionbarhomeclick", __ref);}
RemoteObject _pi = RemoteObject.declareNull("org.techteam.itsyours.b4xpagesmanager._b4xpageinfo");
 BA.debugLineNum = 106;BA.debugLine="Public Sub Activity_ActionBarHomeClick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 107;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ );Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 108;BA.debugLine="If pi <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_pi)) { 
 BA.debugLineNum = 109;BA.debugLine="If CloseRequestExists (pi) Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_closerequestexists" /*RemoteObject*/ ,(Object)(_pi)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 110;BA.debugLine="HandleCloseRequest(pi)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_handlecloserequest" /*void*/ ,(Object)(_pi));
 }else {
 BA.debugLineNum = 112;BA.debugLine="ClosePage(pi.B4XPage)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_closepage" /*RemoteObject*/ ,(Object)(_pi.getField(false,"B4XPage" /*RemoteObject*/ )));
 };
 };
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject __ref,RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,441);
if (RapidSub.canDelegate("activity_keypress")) { return __ref.runUserSub(false, "b4xpagesmanager","activity_keypress", __ref, _keycode);}
RemoteObject _pi = RemoteObject.declareNull("org.techteam.itsyours.b4xpagesmanager._b4xpageinfo");
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 441;BA.debugLine="Public Sub Activity_KeyPress (KeyCode As Int) As B";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 442;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, b4xpagesmanager.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 443;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ );Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 444;BA.debugLine="If CloseRequestExists(pi) Then";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_closerequestexists" /*RemoteObject*/ ,(Object)(_pi)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 445;BA.debugLine="HandleCloseRequest(pi)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_handlecloserequest" /*void*/ ,(Object)(_pi));
 }else {
 BA.debugLineNum = 447;BA.debugLine="ClosePage(pi.B4XPage)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_closepage" /*RemoteObject*/ ,(Object)(_pi.getField(false,"B4XPage" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 449;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return b4xpagesmanager.__c.getField(true,"True");
 };
 BA.debugLineNum = 451;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return b4xpagesmanager.__c.getField(true,"False");
 BA.debugLineNum = 452;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,608);
if (RapidSub.canDelegate("activity_pause")) { return __ref.runUserSub(false, "b4xpagesmanager","activity_pause", __ref);}
 BA.debugLineNum = 608;BA.debugLine="Public Sub Activity_Pause";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 609;BA.debugLine="RaiseEventWithResult(GetTopPage, \"B4XPage_Disappe";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_raiseeventwithresult" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ )),(Object)(BA.ObjectToString("B4XPage_Disappear")),(Object)((b4xpagesmanager.__c.getField(false,"Null"))));
 BA.debugLineNum = 610;BA.debugLine="BackgroundStateChanged(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_backgroundstatechanged" /*RemoteObject*/ ,(Object)(b4xpagesmanager.__c.getField(true,"False")));
 BA.debugLineNum = 611;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,583);
if (RapidSub.canDelegate("activity_resume")) { return __ref.runUserSub(false, "b4xpagesmanager","activity_resume", __ref);}
RemoteObject _shouldraise = RemoteObject.createImmutable(false);
 BA.debugLineNum = 583;BA.debugLine="Public Sub Activity_Resume";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 584;BA.debugLine="Dim ShouldRaise As Boolean = IsForeground = False";
Debug.JustUpdateDeviceLine();
_shouldraise = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_isforeground" /*RemoteObject*/ ),b4xpagesmanager.__c.getField(true,"False")));Debug.locals.put("ShouldRaise", _shouldraise);Debug.locals.put("ShouldRaise", _shouldraise);
 BA.debugLineNum = 585;BA.debugLine="BackgroundStateChanged(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_backgroundstatechanged" /*RemoteObject*/ ,(Object)(b4xpagesmanager.__c.getField(true,"True")));
 BA.debugLineNum = 586;BA.debugLine="If ShouldRaise Then";
Debug.JustUpdateDeviceLine();
if (_shouldraise.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 587;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_raiseevent" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ )),(Object)(BA.ObjectToString("B4XPage_Appear")),(Object)((b4xpagesmanager.__c.getField(false,"Null"))));
 };
 BA.debugLineNum = 589;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addmenuitem(RemoteObject __ref,RemoteObject _b4xpage,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("AddMenuItem (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,454);
if (RapidSub.canDelegate("addmenuitem")) { return __ref.runUserSub(false, "b4xpagesmanager","addmenuitem", __ref, _b4xpage, _title);}
RemoteObject _mi = RemoteObject.declareNull("org.techteam.itsyours.b4xpagesmanager._b4amenuitem");
Debug.locals.put("B4XPage", _b4xpage);
Debug.locals.put("Title", _title);
 BA.debugLineNum = 454;BA.debugLine="Public Sub AddMenuItem (B4XPage As Object, Title A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 455;BA.debugLine="Dim mi As B4AMenuItem";
Debug.JustUpdateDeviceLine();
_mi = RemoteObject.createNew ("org.techteam.itsyours.b4xpagesmanager._b4amenuitem");Debug.locals.put("mi", _mi);
 BA.debugLineNum = 456;BA.debugLine="mi.Initialize";
Debug.JustUpdateDeviceLine();
_mi.runVoidMethod ("Initialize");
 BA.debugLineNum = 457;BA.debugLine="mi.Title = Title";
Debug.JustUpdateDeviceLine();
_mi.setField ("Title" /*RemoteObject*/ ,_title);
 BA.debugLineNum = 458;BA.debugLine="mi.Tag = Title";
Debug.JustUpdateDeviceLine();
_mi.setField ("Tag" /*RemoteObject*/ ,BA.ObjectToString(_title));
 BA.debugLineNum = 459;BA.debugLine="FindPIFromB4XPage(B4XPage).Parent.MenuItems.Add(m";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_findpifromb4xpage" /*RemoteObject*/ ,(Object)(_b4xpage)).getField(false,"Parent" /*RemoteObject*/ ).getField(false,"MenuItems" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_mi)));
 BA.debugLineNum = 460;BA.debugLine="Return mi";
Debug.JustUpdateDeviceLine();
if (true) return _mi;
 BA.debugLineNum = 461;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addpage(RemoteObject __ref,RemoteObject _id,RemoteObject _b4xpage) throws Exception{
try {
		Debug.PushSubsStack("AddPage (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("addpage")) { return __ref.runUserSub(false, "b4xpagesmanager","addpage", __ref, _id, _b4xpage);}
RemoteObject _idtolower = RemoteObject.createImmutable("");
Debug.locals.put("Id", _id);
Debug.locals.put("B4XPage", _b4xpage);
 BA.debugLineNum = 118;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="Dim IdToLower As String = Id.ToLowerCase";
Debug.JustUpdateDeviceLine();
_idtolower = _id.runMethod(true,"toLowerCase");Debug.locals.put("IdToLower", _idtolower);Debug.locals.put("IdToLower", _idtolower);
 BA.debugLineNum = 120;BA.debugLine="If IdToB4XPage.ContainsKey(IdToLower) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xorderedmap.class, "_containskey" /*RemoteObject*/ ,(Object)((_idtolower))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 121;BA.debugLine="Log($\"Page with this id already exists: ${IdToLo";
Debug.JustUpdateDeviceLine();
b4xpagesmanager.__c.runVoidMethod ("LogImpl","98847363",(RemoteObject.concat(RemoteObject.createImmutable("Page with this id already exists: "),b4xpagesmanager.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idtolower))),RemoteObject.createImmutable("!"))),0);
 BA.debugLineNum = 122;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 124;BA.debugLine="IdToB4XPage.Put(IdToLower, CreateB4XPageInfo(B4XP";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_idtolower)),(Object)((__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_createb4xpageinfo" /*RemoteObject*/ ,(Object)(_b4xpage),(Object)(_idtolower),(Object)(b4xpagesmanager.__c.getField(true,"False")),(Object)((_id))))));
 BA.debugLineNum = 125;BA.debugLine="If IdToB4XPage.Size = 1 Then ShowPage(IdToLower)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_showpage" /*RemoteObject*/ ,(Object)(_idtolower));};
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addpageandcreate(RemoteObject __ref,RemoteObject _id,RemoteObject _b4xpage) throws Exception{
try {
		Debug.PushSubsStack("AddPageAndCreate (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("addpageandcreate")) { return __ref.runUserSub(false, "b4xpagesmanager","addpageandcreate", __ref, _id, _b4xpage);}
Debug.locals.put("Id", _id);
Debug.locals.put("B4XPage", _b4xpage);
 BA.debugLineNum = 128;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 129;BA.debugLine="AddPage (Id, B4XPage)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_addpage" /*RemoteObject*/ ,(Object)(_id),(Object)(_b4xpage));
 BA.debugLineNum = 130;BA.debugLine="CreatePageIfNeeded(GetPageFromId(Id))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_createpageifneeded" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_getpagefromid" /*RemoteObject*/ ,(Object)(_id))));
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _backgroundstatechanged(RemoteObject __ref,RemoteObject _newstate) throws Exception{
try {
		Debug.PushSubsStack("BackgroundStateChanged (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,591);
if (RapidSub.canDelegate("backgroundstatechanged")) { return __ref.runUserSub(false, "b4xpagesmanager","backgroundstatechanged", __ref, _newstate);}
RemoteObject _ev = RemoteObject.createImmutable("");
RemoteObject _pi = RemoteObject.declareNull("org.techteam.itsyours.b4xpagesmanager._b4xpageinfo");
Debug.locals.put("NewState", _newstate);
 BA.debugLineNum = 591;BA.debugLine="Private Sub BackgroundStateChanged (NewState As Bo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 592;BA.debugLine="If IsForeground = NewState Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isforeground" /*RemoteObject*/ ),_newstate)) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 593;BA.debugLine="IsForeground = NewState";
Debug.JustUpdateDeviceLine();
__ref.setField ("_isforeground" /*RemoteObject*/ ,_newstate);
 BA.debugLineNum = 594;BA.debugLine="Dim ev As String";
Debug.JustUpdateDeviceLine();
_ev = RemoteObject.createImmutable("");Debug.locals.put("ev", _ev);
 BA.debugLineNum = 595;BA.debugLine="If IsForeground Then ev = \"B4XPage_Foreground\" El";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_isforeground" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_ev = BA.ObjectToString("B4XPage_Foreground");Debug.locals.put("ev", _ev);}
else {
_ev = BA.ObjectToString("B4XPage_Background");Debug.locals.put("ev", _ev);};
 BA.debugLineNum = 596;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group5 = __ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xorderedmap.class, "_getvalues" /*RemoteObject*/ );
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_pi = (group5.runMethod(false,"Get",index5));Debug.locals.put("pi", _pi);
Debug.locals.put("pi", _pi);
 BA.debugLineNum = 597;BA.debugLine="If xui.SubExists(pi.B4XPage, ev, 0) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_pi.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_ev),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 598;BA.debugLine="LogEvent(pi, ev)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_logevent" /*RemoteObject*/ ,(Object)(_pi),(Object)(_ev));
 BA.debugLineNum = 599;BA.debugLine="If IsForeground Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_isforeground" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 600;BA.debugLine="CallSubDelayed(pi.B4XPage, ev)";
Debug.JustUpdateDeviceLine();
b4xpagesmanager.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(_pi.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_ev));
 }else {
 BA.debugLineNum = 602;BA.debugLine="CallSub(pi.B4XPage, ev)";
Debug.JustUpdateDeviceLine();
b4xpagesmanager.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(_pi.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_ev));
 };
 };
 }
}Debug.locals.put("pi", _pi);
;
 BA.debugLineNum = 606;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkmainactivityorientations(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CheckMainActivityOrientations (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("checkmainactivityorientations")) { return __ref.runUserSub(false, "b4xpagesmanager","checkmainactivityorientations", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _pi = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _activities = null;
RemoteObject _act = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _screenorientation = RemoteObject.createImmutable(0);
 BA.debugLineNum = 88;BA.debugLine="Private Sub CheckMainActivityOrientations";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 90;BA.debugLine="Dim jo As JavaObject";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 91;BA.debugLine="jo.InitializeContext";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("InitializeContext",__ref.getField(false, "ba"));
 BA.debugLineNum = 92;BA.debugLine="ActionBar = jo.RunMethod(\"getActionBar\", Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_actionbar" /*RemoteObject*/ ).setObject (_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getActionBar")),(Object)((b4xpagesmanager.__c.getField(false,"Null")))));
 BA.debugLineNum = 93;BA.debugLine="Dim pi As JavaObject = jo.RunMethodJO(\"getPackage";
Debug.JustUpdateDeviceLine();
_pi = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_pi = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getPackageManager")),(Object)((b4xpagesmanager.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getPackageInfo")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(b4xpagesmanager.__c.getField(false,"Application").runMethod(true,"getPackageName")),RemoteObject.createImmutable((1))}))));Debug.locals.put("pi", _pi);
 BA.debugLineNum = 94;BA.debugLine="Dim activities() As Object = pi.GetField(\"activit";
Debug.JustUpdateDeviceLine();
_activities = (_pi.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("activities"))));Debug.locals.put("activities", _activities);Debug.locals.put("activities", _activities);
 BA.debugLineNum = 95;BA.debugLine="For Each Act As JavaObject In activities";
Debug.JustUpdateDeviceLine();
_act = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
{
final RemoteObject group6 = _activities;
final int groupLen6 = group6.getField(true,"length").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_act = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), group6.getArrayElement(false,RemoteObject.createImmutable(index6)));
Debug.locals.put("Act", _act);
 BA.debugLineNum = 96;BA.debugLine="Dim name As String = Act.GetField(\"name\")";
Debug.JustUpdateDeviceLine();
_name = BA.ObjectToString(_act.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("name"))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 97;BA.debugLine="If name.EndsWith(\".main\") Then";
Debug.JustUpdateDeviceLine();
if (_name.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".main"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 98;BA.debugLine="Dim screenOrientation As Int = Act.GetField(\"sc";
Debug.JustUpdateDeviceLine();
_screenorientation = BA.numberCast(int.class, _act.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("screenOrientation"))));Debug.locals.put("screenOrientation", _screenorientation);Debug.locals.put("screenOrientation", _screenorientation);
 BA.debugLineNum = 99;BA.debugLine="If screenOrientation = -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_screenorientation,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 100;BA.debugLine="LogColor(\"#SupportedOrientations attribute mus";
Debug.JustUpdateDeviceLine();
b4xpagesmanager.__c.runVoidMethod ("LogImpl","98716300",BA.ObjectToString("#SupportedOrientations attribute must be set to landscape or portrait."),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Red"));
 };
 };
 }
}Debug.locals.put("Act", _act);
;
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private IdToB4XPage As B4XOrderedMap";
b4xpagesmanager._idtob4xpage = RemoteObject.createNew ("org.techteam.itsyours.b4xorderedmap");__ref.setField("_idtob4xpage",b4xpagesmanager._idtob4xpage);
 //BA.debugLineNum = 24;BA.debugLine="Private RootB4XToPage As B4XOrderedMap";
b4xpagesmanager._rootb4xtopage = RemoteObject.createNew ("org.techteam.itsyours.b4xorderedmap");__ref.setField("_rootb4xtopage",b4xpagesmanager._rootb4xtopage);
 //BA.debugLineNum = 26;BA.debugLine="Private Context As JavaObject";
b4xpagesmanager._context = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_context",b4xpagesmanager._context);
 //BA.debugLineNum = 27;BA.debugLine="Type B4XPageParent (NativeType As Activity, MenuI";
;
 //BA.debugLineNum = 28;BA.debugLine="Type B4AMenuItem (Title As Object, Bitmap As B4XB";
;
 //BA.debugLineNum = 34;BA.debugLine="Type B4XPageInfo (B4XPage As Object, Id As String";
;
 //BA.debugLineNum = 38;BA.debugLine="Public mStackOfPageIds As B4XSet";
b4xpagesmanager._mstackofpageids = RemoteObject.createNew ("org.techteam.itsyours.b4xset");__ref.setField("_mstackofpageids",b4xpagesmanager._mstackofpageids);
 //BA.debugLineNum = 39;BA.debugLine="Private xui As XUI 'ignore";
b4xpagesmanager._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xpagesmanager._xui);
 //BA.debugLineNum = 43;BA.debugLine="Private mMainForm As Activity";
b4xpagesmanager._mmainform = RemoteObject.createNew ("anywheresoftware.b4a.objects.ActivityWrapper");__ref.setField("_mmainform",b4xpagesmanager._mmainform);
 //BA.debugLineNum = 44;BA.debugLine="Public ShowUpIndicator As Boolean = True";
b4xpagesmanager._showupindicator = b4xpagesmanager.__c.getField(true,"True");__ref.setField("_showupindicator",b4xpagesmanager._showupindicator);
 //BA.debugLineNum = 45;BA.debugLine="Public ActionBar As JavaObject";
b4xpagesmanager._actionbar = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_actionbar",b4xpagesmanager._actionbar);
 //BA.debugLineNum = 49;BA.debugLine="Public IsForeground As Boolean";
b4xpagesmanager._isforeground = RemoteObject.createImmutable(false);__ref.setField("_isforeground",b4xpagesmanager._isforeground);
 //BA.debugLineNum = 50;BA.debugLine="Public TransitionAnimationDuration As Int = 100";
b4xpagesmanager._transitionanimationduration = BA.numberCast(int.class, 100);__ref.setField("_transitionanimationduration",b4xpagesmanager._transitionanimationduration);
 //BA.debugLineNum = 51;BA.debugLine="Public MainPage As B4XMainPage";
b4xpagesmanager._mainpage = RemoteObject.createNew ("org.techteam.itsyours.b4xmainpage");__ref.setField("_mainpage",b4xpagesmanager._mainpage);
 //BA.debugLineNum = 52;BA.debugLine="Private StackString As String";
b4xpagesmanager._stackstring = RemoteObject.createImmutable("");__ref.setField("_stackstring",b4xpagesmanager._stackstring);
 //BA.debugLineNum = 53;BA.debugLine="Public LogEvents as Boolean = False";
b4xpagesmanager._logevents = b4xpagesmanager.__c.getField(true,"False");__ref.setField("_logevents",b4xpagesmanager._logevents);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _closepage(RemoteObject __ref,RemoteObject _b4xpage) throws Exception{
try {
		Debug.PushSubsStack("ClosePage (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("closepage")) { return __ref.runUserSub(false, "b4xpagesmanager","closepage", __ref, _b4xpage);}
RemoteObject _pi = RemoteObject.declareNull("org.techteam.itsyours.b4xpagesmanager._b4xpageinfo");
Debug.locals.put("B4XPage", _b4xpage);
 BA.debugLineNum = 186;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 187;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_findpifromb4xpage" /*RemoteObject*/ ,(Object)(_b4xpage));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 188;BA.debugLine="If mStackOfPageIds.Contains(pi.Id) = False Then R";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xset.class, "_contains" /*RemoteObject*/ ,(Object)((_pi.getField(true,"Id" /*RemoteObject*/ )))),b4xpagesmanager.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 189;BA.debugLine="If xui.IsB4i And GetTopPage <> pi Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i")) && RemoteObject.solveBoolean("!",__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ ),_pi)) { 
 BA.debugLineNum = 190;BA.debugLine="Log(\"Only top page can be closed\")";
Debug.JustUpdateDeviceLine();
b4xpagesmanager.__c.runVoidMethod ("LogImpl","99109508",RemoteObject.createImmutable("Only top page can be closed"),0);
 BA.debugLineNum = 191;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 192;BA.debugLine="Else If xui.IsB4i And mStackOfPageIds.Size = 1 Th";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xset.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 193;BA.debugLine="Log(\"First page cannot be closed\")";
Debug.JustUpdateDeviceLine();
b4xpagesmanager.__c.runVoidMethod ("LogImpl","99109511",RemoteObject.createImmutable("First page cannot be closed"),0);
 BA.debugLineNum = 194;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 196;BA.debugLine="ClosePageImpl(pi)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_closepageimpl" /*RemoteObject*/ ,(Object)(_pi));
 BA.debugLineNum = 197;BA.debugLine="If GetTopPage = pi Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ ),_pi)) { 
 BA.debugLineNum = 198;BA.debugLine="TopPageDisappear";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_toppagedisappear" /*RemoteObject*/ );
 };
 BA.debugLineNum = 200;BA.debugLine="If xui.IsB4A And mStackOfPageIds.Size = 1 Then Re";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A")) && RemoteObject.solveBoolean("=",__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xset.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 201;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xset.class, "_remove" /*RemoteObject*/ ,(Object)((_pi.getField(true,"Id" /*RemoteObject*/ ))));
 BA.debugLineNum = 202;BA.debugLine="If xui.IsB4A Then ShowPageImpl(GetTopPage)";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A").<Boolean>get().booleanValue()) { 
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_showpageimpl" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ )));};
 BA.debugLineNum = 203;BA.debugLine="TopPageAppear";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_toppageappear" /*RemoteObject*/ );
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _closepageimpl(RemoteObject __ref,RemoteObject _pi) throws Exception{
try {
		Debug.PushSubsStack("ClosePageImpl (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,289);
if (RapidSub.canDelegate("closepageimpl")) { return __ref.runUserSub(false, "b4xpagesmanager","closepageimpl", __ref, _pi);}
RemoteObject _i = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
Debug.locals.put("pi", _pi);
 BA.debugLineNum = 289;BA.debugLine="Private Sub ClosePageImpl (pi As B4XPageInfo) 'ign";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 291;BA.debugLine="If mStackOfPageIds.Size = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xset.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 292;BA.debugLine="Dim i As Intent";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 293;BA.debugLine="i.Initialize(i.ACTION_MAIN, \"\")";
Debug.JustUpdateDeviceLine();
_i.runVoidMethod ("Initialize",(Object)(_i.getField(true,"ACTION_MAIN")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 294;BA.debugLine="i.AddCategory(\"android.intent.category.HOME\")";
Debug.JustUpdateDeviceLine();
_i.runVoidMethod ("AddCategory",(Object)(RemoteObject.createImmutable("android.intent.category.HOME")));
 BA.debugLineNum = 295;BA.debugLine="i.Flags = 0x10000000";
Debug.JustUpdateDeviceLine();
_i.runMethod(true,"setFlags",BA.numberCast(int.class, 0x10000000));
 BA.debugLineNum = 296;BA.debugLine="StartActivity(i)";
Debug.JustUpdateDeviceLine();
b4xpagesmanager.__c.runVoidMethod ("StartActivity",__ref.getField(false, "ba"),(Object)((_i.getObject())));
 }else {
 BA.debugLineNum = 298;BA.debugLine="pi.Root.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_pi.getField(false,"Root" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 };
 BA.debugLineNum = 305;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _closerequestexists(RemoteObject __ref,RemoteObject _pi) throws Exception{
try {
		Debug.PushSubsStack("CloseRequestExists (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,507);
if (RapidSub.canDelegate("closerequestexists")) { return __ref.runUserSub(false, "b4xpagesmanager","closerequestexists", __ref, _pi);}
Debug.locals.put("pi", _pi);
 BA.debugLineNum = 507;BA.debugLine="Private Sub CloseRequestExists (pi As B4XPageInfo)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 508;BA.debugLine="Return xui.SubExists(pi.B4XPage, \"B4XPage_CloseRe";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_pi.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(BA.ObjectToString("B4XPage_CloseRequest")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 509;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createb4xpageinfo(RemoteObject __ref,RemoteObject _b4xpage,RemoteObject _id,RemoteObject _created,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("CreateB4XPageInfo (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,393);
if (RapidSub.canDelegate("createb4xpageinfo")) { return __ref.runUserSub(false, "b4xpagesmanager","createb4xpageinfo", __ref, _b4xpage, _id, _created, _title);}
RemoteObject _t1 = RemoteObject.declareNull("org.techteam.itsyours.b4xpagesmanager._b4xpageinfo");
Debug.locals.put("B4XPage", _b4xpage);
Debug.locals.put("Id", _id);
Debug.locals.put("Created", _created);
Debug.locals.put("Title", _title);
 BA.debugLineNum = 393;BA.debugLine="Private Sub CreateB4XPageInfo (B4XPage As Object,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 394;BA.debugLine="Dim t1 As B4XPageInfo";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("org.techteam.itsyours.b4xpagesmanager._b4xpageinfo");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 395;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 396;BA.debugLine="t1.B4XPage = B4XPage";
Debug.JustUpdateDeviceLine();
_t1.setField ("B4XPage" /*RemoteObject*/ ,_b4xpage);
 BA.debugLineNum = 397;BA.debugLine="t1.Id = Id";
Debug.JustUpdateDeviceLine();
_t1.setField ("Id" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 398;BA.debugLine="t1.Created = Created";
Debug.JustUpdateDeviceLine();
_t1.setField ("Created" /*RemoteObject*/ ,_created);
 BA.debugLineNum = 399;BA.debugLine="t1.Title = Title";
Debug.JustUpdateDeviceLine();
_t1.setField ("Title" /*RemoteObject*/ ,_title);
 BA.debugLineNum = 400;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 401;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createb4xpageparent(RemoteObject __ref,RemoteObject _nativetype) throws Exception{
try {
		Debug.PushSubsStack("CreateB4XPageParent (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,571);
if (RapidSub.canDelegate("createb4xpageparent")) { return __ref.runUserSub(false, "b4xpagesmanager","createb4xpageparent", __ref, _nativetype);}
RemoteObject _t1 = RemoteObject.declareNull("org.techteam.itsyours.b4xpagesmanager._b4xpageparent");
Debug.locals.put("NativeType", _nativetype);
 BA.debugLineNum = 571;BA.debugLine="Private Sub CreateB4XPageParent (NativeType As Obj";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 577;BA.debugLine="Dim t1 As B4XPageParent";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("org.techteam.itsyours.b4xpagesmanager._b4xpageparent");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 578;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 579;BA.debugLine="t1.NativeType = NativeType";
Debug.JustUpdateDeviceLine();
_t1.getField(false,"NativeType" /*RemoteObject*/ ).setObject (_nativetype);
 BA.debugLineNum = 580;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 581;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createmenu(RemoteObject __ref,RemoteObject _menu) throws Exception{
try {
		Debug.PushSubsStack("CreateMenu (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,467);
if (RapidSub.canDelegate("createmenu")) { return __ref.runUserSub(false, "b4xpagesmanager","createmenu", __ref, _menu);}
RemoteObject _pi = RemoteObject.declareNull("org.techteam.itsyours.b4xpagesmanager._b4xpageinfo");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _mi = RemoteObject.declareNull("org.techteam.itsyours.b4xpagesmanager._b4amenuitem");
RemoteObject _nativemenuitem = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _bd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _listener = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Menu", _menu);
 BA.debugLineNum = 467;BA.debugLine="Public Sub CreateMenu (Menu As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 468;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ );Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 469;BA.debugLine="If pi = Null Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_pi)) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 470;BA.debugLine="Dim jo As JavaObject = Menu";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _menu);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 471;BA.debugLine="For Each mi As B4AMenuItem In pi.Parent.MenuItems";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group4 = _pi.getField(false,"Parent" /*RemoteObject*/ ).getField(false,"MenuItems" /*RemoteObject*/ );
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_mi = (group4.runMethod(false,"Get",index4));Debug.locals.put("mi", _mi);
Debug.locals.put("mi", _mi);
 BA.debugLineNum = 472;BA.debugLine="Dim NativeMenuItem As JavaObject = jo.RunMethod(";
Debug.JustUpdateDeviceLine();
_nativemenuitem = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_nativemenuitem = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("add")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_mi.getField(false,"Title" /*RemoteObject*/ )}))));Debug.locals.put("NativeMenuItem", _nativemenuitem);
 BA.debugLineNum = 473;BA.debugLine="If mi.Bitmap.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_mi.getField(false,"Bitmap" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 474;BA.debugLine="Dim bd As BitmapDrawable";
Debug.JustUpdateDeviceLine();
_bd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bd", _bd);
 BA.debugLineNum = 475;BA.debugLine="bd.Initialize(mi.Bitmap)";
Debug.JustUpdateDeviceLine();
_bd.runVoidMethod ("Initialize",(Object)((_mi.getField(false,"Bitmap" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 476;BA.debugLine="NativeMenuItem.RunMethod(\"setIcon\", Array(bd))";
Debug.JustUpdateDeviceLine();
_nativemenuitem.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setIcon")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_bd.getObject())})));
 };
 BA.debugLineNum = 478;BA.debugLine="If mi.AddToBar Then";
Debug.JustUpdateDeviceLine();
if (_mi.getField(true,"AddToBar" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 479;BA.debugLine="NativeMenuItem.RunMethod(\"setShowAsAction\", Arr";
Debug.JustUpdateDeviceLine();
_nativemenuitem.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setShowAsAction")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((1))})));
 };
 BA.debugLineNum = 481;BA.debugLine="Dim listener As JavaObject";
Debug.JustUpdateDeviceLine();
_listener = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("listener", _listener);
 BA.debugLineNum = 482;BA.debugLine="listener.InitializeNewInstance(Application.Packa";
Debug.JustUpdateDeviceLine();
_listener.runVoidMethod ("InitializeNewInstance",(Object)(RemoteObject.concat(b4xpagesmanager.__c.getField(false,"Application").runMethod(true,"getPackageName"),RemoteObject.createImmutable(".b4xpagesmanager$PagesMenuListener"))),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_pi.getField(false,"B4XPage" /*RemoteObject*/ ),(_mi.getField(true,"Tag" /*RemoteObject*/ ))})));
 BA.debugLineNum = 483;BA.debugLine="NativeMenuItem.RunMethod(\"setOnMenuItemClickList";
Debug.JustUpdateDeviceLine();
_nativemenuitem.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setOnMenuItemClickListener")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_listener.getObject())})));
 }
}Debug.locals.put("mi", _mi);
;
 BA.debugLineNum = 485;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpageifneeded(RemoteObject __ref,RemoteObject _pi) throws Exception{
try {
		Debug.PushSubsStack("CreatePageIfNeeded (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,326);
if (RapidSub.canDelegate("createpageifneeded")) { return __ref.runUserSub(false, "b4xpagesmanager","createpageifneeded", __ref, _pi);}
Debug.locals.put("pi", _pi);
 BA.debugLineNum = 326;BA.debugLine="Private Sub CreatePageIfNeeded(pi As B4XPageInfo)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 327;BA.debugLine="If pi.Created Then Return";
Debug.JustUpdateDeviceLine();
if (_pi.getField(true,"Created" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 328;BA.debugLine="pi.IsFirst = IdToB4XPage.Size = 1";
Debug.JustUpdateDeviceLine();
_pi.setField ("IsFirst" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 1))));
 BA.debugLineNum = 329;BA.debugLine="CreatePageImpl (pi)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_createpageimpl" /*RemoteObject*/ ,(Object)(_pi));
 BA.debugLineNum = 330;BA.debugLine="pi.Created = True";
Debug.JustUpdateDeviceLine();
_pi.setField ("Created" /*RemoteObject*/ ,b4xpagesmanager.__c.getField(true,"True"));
 BA.debugLineNum = 331;BA.debugLine="RootB4XToPage.Put(pi.Root, pi)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rootb4xtopage" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_pi.getField(false,"Root" /*RemoteObject*/ ).getObject())),(Object)((_pi)));
 BA.debugLineNum = 332;BA.debugLine="CallSub2(pi.B4XPage, \"B4XPage_Created\", pi.root)";
Debug.JustUpdateDeviceLine();
b4xpagesmanager.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_pi.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(BA.ObjectToString("B4XPage_Created")),(Object)((_pi.getField(false,"Root" /*RemoteObject*/ ))));
 BA.debugLineNum = 334;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpageimpl(RemoteObject __ref,RemoteObject _pi) throws Exception{
try {
		Debug.PushSubsStack("CreatePageImpl (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,342);
if (RapidSub.canDelegate("createpageimpl")) { return __ref.runUserSub(false, "b4xpagesmanager","createpageimpl", __ref, _pi);}
Debug.locals.put("pi", _pi);
 BA.debugLineNum = 342;BA.debugLine="Private Sub CreatePageImpl (pi As B4XPageInfo)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 354;BA.debugLine="pi.Root = xui.CreatePanel(\"root\")";
Debug.JustUpdateDeviceLine();
_pi.setField ("Root" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("root"))));
 BA.debugLineNum = 355;BA.debugLine="pi.root.SetLayoutAnimated(0, 0, 0, 100%x, 100%y)";
Debug.JustUpdateDeviceLine();
_pi.getField(false,"Root" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xpagesmanager.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(b4xpagesmanager.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 356;BA.debugLine="pi.Parent = CreateB4XPageParent(mMainForm)";
Debug.JustUpdateDeviceLine();
_pi.setField ("Parent" /*RemoteObject*/ ,__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_createb4xpageparent" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mmainform" /*RemoteObject*/ ).getObject()))));
 BA.debugLineNum = 357;BA.debugLine="pi.Parent.MenuItems.Initialize";
Debug.JustUpdateDeviceLine();
_pi.getField(false,"Parent" /*RemoteObject*/ ).getField(false,"MenuItems" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 365;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findpifromb4xpage(RemoteObject __ref,RemoteObject _page) throws Exception{
try {
		Debug.PushSubsStack("FindPIFromB4XPage (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,280);
if (RapidSub.canDelegate("findpifromb4xpage")) { return __ref.runUserSub(false, "b4xpagesmanager","findpifromb4xpage", __ref, _page);}
RemoteObject _pi = RemoteObject.declareNull("org.techteam.itsyours.b4xpagesmanager._b4xpageinfo");
Debug.locals.put("Page", _page);
 BA.debugLineNum = 280;BA.debugLine="Public Sub FindPIFromB4XPage (Page As Object) As B";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 281;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xorderedmap.class, "_getvalues" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_pi = (group1.runMethod(false,"Get",index1));Debug.locals.put("pi", _pi);
Debug.locals.put("pi", _pi);
 BA.debugLineNum = 282;BA.debugLine="If pi.B4XPage = Page Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_pi.getField(false,"B4XPage" /*RemoteObject*/ ),_page)) { 
 BA.debugLineNum = 283;BA.debugLine="Return pi";
Debug.JustUpdateDeviceLine();
if (true) return _pi;
 };
 }
}Debug.locals.put("pi", _pi);
;
 BA.debugLineNum = 286;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) return (b4xpagesmanager.__c.getField(false,"Null"));
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpage(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("GetPage (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,367);
if (RapidSub.canDelegate("getpage")) { return __ref.runUserSub(false, "b4xpagesmanager","getpage", __ref, _id);}
Debug.locals.put("Id", _id);
 BA.debugLineNum = 367;BA.debugLine="Public Sub GetPage (Id As String) As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 368;BA.debugLine="Return GetPageFromId(Id).B4XPage";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_getpagefromid" /*RemoteObject*/ ,(Object)(_id)).getField(false,"B4XPage" /*RemoteObject*/ );
 BA.debugLineNum = 369;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpagefromid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("GetPageFromId (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,371);
if (RapidSub.canDelegate("getpagefromid")) { return __ref.runUserSub(false, "b4xpagesmanager","getpagefromid", __ref, _id);}
RemoteObject _pi = RemoteObject.declareNull("org.techteam.itsyours.b4xpagesmanager._b4xpageinfo");
Debug.locals.put("id", _id);
 BA.debugLineNum = 371;BA.debugLine="Private Sub GetPageFromId (id As String) As B4XPag";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 372;BA.debugLine="Dim pi As B4XPageInfo = IdToB4XPage.Get(id.ToLowe";
Debug.JustUpdateDeviceLine();
_pi = (__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_id.runMethod(true,"toLowerCase")))));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 373;BA.debugLine="If pi = Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_pi)) { 
 BA.debugLineNum = 374;BA.debugLine="Log(\"Error: page id not found: \" & id)";
Debug.JustUpdateDeviceLine();
b4xpagesmanager.__c.runVoidMethod ("LogImpl","99764867",RemoteObject.concat(RemoteObject.createImmutable("Error: page id not found: "),_id),0);
 BA.debugLineNum = 375;BA.debugLine="Log(\"Ids: \" & IdToB4XPage.Keys) 'ignore";
Debug.JustUpdateDeviceLine();
b4xpagesmanager.__c.runVoidMethod ("LogImpl","99764868",RemoteObject.concat(RemoteObject.createImmutable("Ids: "),__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ )),0);
 };
 BA.debugLineNum = 377;BA.debugLine="Return pi";
Debug.JustUpdateDeviceLine();
if (true) return _pi;
 BA.debugLineNum = 378;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpageinfofromroot(RemoteObject __ref,RemoteObject _root) throws Exception{
try {
		Debug.PushSubsStack("GetPageInfoFromRoot (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,380);
if (RapidSub.canDelegate("getpageinfofromroot")) { return __ref.runUserSub(false, "b4xpagesmanager","getpageinfofromroot", __ref, _root);}
Debug.locals.put("Root", _root);
 BA.debugLineNum = 380;BA.debugLine="Public Sub GetPageInfoFromRoot (Root As B4XView) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 381;BA.debugLine="Return RootB4XToPage.Get(Root)";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.getField(false,"_rootb4xtopage" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_root.getObject()))));
 BA.debugLineNum = 382;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettoppage(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetTopPage (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,565);
if (RapidSub.canDelegate("gettoppage")) { return __ref.runUserSub(false, "b4xpagesmanager","gettoppage", __ref);}
 BA.debugLineNum = 565;BA.debugLine="Public Sub GetTopPage As B4XPageInfo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 566;BA.debugLine="If mStackOfPageIds.Size = 0 Then Return Null";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xset.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
if (true) return (b4xpagesmanager.__c.getField(false,"Null"));};
 BA.debugLineNum = 567;BA.debugLine="Return IdToB4XPage.Get(mStackOfPageIds.AsList.Get";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xset.class, "_aslist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xset.class, "_getsize" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1))))));
 BA.debugLineNum = 568;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _handlecloserequest(RemoteObject __ref,RemoteObject _pi) throws Exception{
try {
		Debug.PushSubsStack("HandleCloseRequest (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,511);
if (RapidSub.canDelegate("handlecloserequest")) { __ref.runUserSub(false, "b4xpagesmanager","handlecloserequest", __ref, _pi); return;}
ResumableSub_HandleCloseRequest rsub = new ResumableSub_HandleCloseRequest(null,__ref,_pi);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_HandleCloseRequest extends BA.ResumableSub {
public ResumableSub_HandleCloseRequest(org.techteam.itsyours.b4xpagesmanager parent,RemoteObject __ref,RemoteObject _pi) {
this.parent = parent;
this.__ref = __ref;
this._pi = _pi;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
org.techteam.itsyours.b4xpagesmanager parent;
RemoteObject _pi;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _shouldclose = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("HandleCloseRequest (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,511);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("pi", _pi);
 BA.debugLineNum = 512;BA.debugLine="LogEvent(pi, \"B4XPage_CloseRequest\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_logevent" /*RemoteObject*/ ,(Object)(_pi),(Object)(RemoteObject.createImmutable("B4XPage_CloseRequest")));
 BA.debugLineNum = 513;BA.debugLine="Dim rs As ResumableSub = CallSub(pi.B4XPage, \"B4X";
Debug.JustUpdateDeviceLine();
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), parent.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(_pi.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("B4XPage_CloseRequest"))));Debug.locals.put("rs", _rs);
 BA.debugLineNum = 514;BA.debugLine="Wait For (rs) Complete (ShouldClose As Boolean)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xpagesmanager", "handlecloserequest"), _rs);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_shouldclose = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("ShouldClose", _shouldclose);
;
 BA.debugLineNum = 515;BA.debugLine="If ShouldClose Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 4;
if (_shouldclose.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 516;BA.debugLine="ClosePage(pi.B4XPage)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_closepage" /*RemoteObject*/ ,(Object)(_pi.getField(false,"B4XPage" /*RemoteObject*/ )));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 518;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _complete(RemoteObject __ref,RemoteObject _shouldclose) throws Exception{
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _activity) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xpagesmanager","initialize", __ref, _ba, _activity);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _module = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ba", _ba);
Debug.locals.put("Activity", _activity);
 BA.debugLineNum = 59;BA.debugLine="Public Sub Initialize (Activity As Activity)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="IdToB4XPage.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xorderedmap.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 64;BA.debugLine="RootB4XToPage.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rootb4xtopage" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xorderedmap.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 65;BA.debugLine="mStackOfPageIds.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xset.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 69;BA.debugLine="Context.InitializeContext";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_context" /*RemoteObject*/ ).runVoidMethod ("InitializeContext",__ref.getField(false, "ba"));
 BA.debugLineNum = 70;BA.debugLine="mMainForm = Activity";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mmainform" /*RemoteObject*/ ,_activity);
 BA.debugLineNum = 71;BA.debugLine="CheckMainActivityOrientations";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_checkmainactivityorientations" /*RemoteObject*/ );
 BA.debugLineNum = 72;BA.debugLine="Dim jo As JavaObject = Me";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 73;BA.debugLine="Dim module As JavaObject";
Debug.JustUpdateDeviceLine();
_module = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("module", _module);
 BA.debugLineNum = 74;BA.debugLine="module.InitializeStatic(jo.RunMethodJO(\"getActivi";
Debug.JustUpdateDeviceLine();
_module.runMethod(false,"InitializeStatic",(Object)(BA.ObjectToString(_jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getActivityBA")),(Object)((b4xpagesmanager.__c.getField(false,"Null")))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("className")))))).runVoidMethod ("SetField",(Object)(BA.ObjectToString("dontPause")),(Object)((b4xpagesmanager.__c.getField(true,"True"))));
 BA.debugLineNum = 78;BA.debugLine="B4XPages.InternalSetPagesManager(Me)";
Debug.JustUpdateDeviceLine();
b4xpagesmanager._b4xpages.runVoidMethod ("_internalsetpagesmanager" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 79;BA.debugLine="MainPage.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mainpage" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xmainpage.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 80;BA.debugLine="IdToB4XPage.Put(\"~~~~~temp~~~~\", CreateB4XPageInf";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(("~~~~~temp~~~~"))),(Object)((__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_createb4xpageinfo" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_mainpage" /*RemoteObject*/ ))),(Object)(BA.ObjectToString("")),(Object)(b4xpagesmanager.__c.getField(true,"False")),(Object)((RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 81;BA.debugLine="BackgroundStateChanged(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_backgroundstatechanged" /*RemoteObject*/ ,(Object)(b4xpagesmanager.__c.getField(true,"True")));
 BA.debugLineNum = 82;BA.debugLine="IdToB4XPage.Remove(\"~~~~~temp~~~~\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_idtob4xpage" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xorderedmap.class, "_remove" /*RemoteObject*/ ,(Object)((RemoteObject.createImmutable("~~~~~temp~~~~"))));
 BA.debugLineNum = 83;BA.debugLine="AddPageAndCreate(\"MainPage\", MainPage)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_addpageandcreate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("MainPage")),(Object)((__ref.getField(false,"_mainpage" /*RemoteObject*/ ))));
 BA.debugLineNum = 84;BA.debugLine="Log(\"Call B4XPages.GetManager.LogEvents = True to";
Debug.JustUpdateDeviceLine();
b4xpagesmanager.__c.runVoidMethod ("LogImpl","98650777",RemoteObject.createImmutable("Call B4XPages.GetManager.LogEvents = True to enable logging B4XPages events."),0);
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logevent(RemoteObject __ref,RemoteObject _pi,RemoteObject _ev) throws Exception{
try {
		Debug.PushSubsStack("LogEvent (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,613);
if (RapidSub.canDelegate("logevent")) { return __ref.runUserSub(false, "b4xpagesmanager","logevent", __ref, _pi, _ev);}
RemoteObject _msg = RemoteObject.createImmutable("");
Debug.locals.put("pi", _pi);
Debug.locals.put("ev", _ev);
 BA.debugLineNum = 613;BA.debugLine="Private Sub LogEvent (pi As B4XPageInfo, ev As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 614;BA.debugLine="If LogEvents Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_logevents" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 615;BA.debugLine="Dim msg As String = $\"*** ${pi.Id}: ${ev} ${Stac";
Debug.JustUpdateDeviceLine();
_msg = (RemoteObject.concat(RemoteObject.createImmutable("*** "),b4xpagesmanager.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_pi.getField(true,"Id" /*RemoteObject*/ )))),RemoteObject.createImmutable(": "),b4xpagesmanager.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ev))),RemoteObject.createImmutable(" "),b4xpagesmanager.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_stackstring" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("msg", _msg);Debug.locals.put("msg", _msg);
 BA.debugLineNum = 616;BA.debugLine="Log(msg)";
Debug.JustUpdateDeviceLine();
b4xpagesmanager.__c.runVoidMethod ("LogImpl","910878979",_msg,0);
 };
 BA.debugLineNum = 618;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainform_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("MainForm_Resize (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,558);
if (RapidSub.canDelegate("mainform_resize")) { return __ref.runUserSub(false, "b4xpagesmanager","mainform_resize", __ref, _width, _height);}
RemoteObject _w = RemoteObject.createImmutable(0);
RemoteObject _h = RemoteObject.createImmutable(0);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 558;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 559;BA.debugLine="Dim w As Int = Width";
Debug.JustUpdateDeviceLine();
_w = BA.numberCast(int.class, _width);Debug.locals.put("w", _w);Debug.locals.put("w", _w);
 BA.debugLineNum = 560;BA.debugLine="Dim h As Int = Height";
Debug.JustUpdateDeviceLine();
_h = BA.numberCast(int.class, _height);Debug.locals.put("h", _h);Debug.locals.put("h", _h);
 BA.debugLineNum = 561;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(Sender), \"B4XPage_";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_raiseevent" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_getpageinfofromroot" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), b4xpagesmanager.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))))),(Object)(BA.ObjectToString("B4XPage_Resize")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_w),(_h)})));
 BA.debugLineNum = 562;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _raiseevent(RemoteObject __ref,RemoteObject _targetpage,RemoteObject _subname,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("RaiseEvent (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,521);
if (RapidSub.canDelegate("raiseevent")) { return __ref.runUserSub(false, "b4xpagesmanager","raiseevent", __ref, _targetpage, _subname, _params);}
RemoteObject _length = RemoteObject.createImmutable(0);
Debug.locals.put("TargetPage", _targetpage);
Debug.locals.put("SubName", _subname);
Debug.locals.put("Params", _params);
 BA.debugLineNum = 521;BA.debugLine="Public Sub RaiseEvent (TargetPage As B4XPageInfo,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 522;BA.debugLine="If TargetPage = Null Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_targetpage)) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 523;BA.debugLine="Dim length As Int";
Debug.JustUpdateDeviceLine();
_length = RemoteObject.createImmutable(0);Debug.locals.put("length", _length);
 BA.debugLineNum = 524;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_params)) { 
_length = BA.numberCast(int.class, 0);Debug.locals.put("length", _length);}
else {
_length = _params.getField(true,"length");Debug.locals.put("length", _length);};
 BA.debugLineNum = 525;BA.debugLine="LogEvent(TargetPage, SubName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_logevent" /*RemoteObject*/ ,(Object)(_targetpage),(Object)(_subname));
 BA.debugLineNum = 526;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_targetpage.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_subname),(Object)(_length)),b4xpagesmanager.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 527;BA.debugLine="Select length";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_length,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 529;BA.debugLine="CallSubDelayed(TargetPage.B4XPage, SubName)";
Debug.JustUpdateDeviceLine();
b4xpagesmanager.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(_targetpage.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_subname));
 break; }
case 1: {
 BA.debugLineNum = 531;BA.debugLine="CallSubDelayed2(TargetPage.B4XPage, SubName, Pa";
Debug.JustUpdateDeviceLine();
b4xpagesmanager.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(_targetpage.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_subname),(Object)(_params.getArrayElement(false,BA.numberCast(int.class, 0))));
 break; }
case 2: {
 BA.debugLineNum = 533;BA.debugLine="CallSubDelayed3(TargetPage.B4XPage, SubName, Pa";
Debug.JustUpdateDeviceLine();
b4xpagesmanager.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(_targetpage.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_subname),(Object)(_params.getArrayElement(false,BA.numberCast(int.class, 0))),(Object)(_params.getArrayElement(false,BA.numberCast(int.class, 1))));
 break; }
default: {
 BA.debugLineNum = 535;BA.debugLine="Log(\"Too many parameters\")";
Debug.JustUpdateDeviceLine();
b4xpagesmanager.__c.runVoidMethod ("LogImpl","910354702",RemoteObject.createImmutable("Too many parameters"),0);
 break; }
}
;
 BA.debugLineNum = 537;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _raiseeventwithresult(RemoteObject __ref,RemoteObject _targetpage,RemoteObject _subname,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("RaiseEventWithResult (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,539);
if (RapidSub.canDelegate("raiseeventwithresult")) { return __ref.runUserSub(false, "b4xpagesmanager","raiseeventwithresult", __ref, _targetpage, _subname, _params);}
RemoteObject _length = RemoteObject.createImmutable(0);
Debug.locals.put("TargetPage", _targetpage);
Debug.locals.put("SubName", _subname);
Debug.locals.put("Params", _params);
 BA.debugLineNum = 539;BA.debugLine="Public Sub RaiseEventWithResult (TargetPage As B4X";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 540;BA.debugLine="If TargetPage = Null Then Return Null";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_targetpage)) { 
if (true) return b4xpagesmanager.__c.getField(false,"Null");};
 BA.debugLineNum = 541;BA.debugLine="Dim length As Int";
Debug.JustUpdateDeviceLine();
_length = RemoteObject.createImmutable(0);Debug.locals.put("length", _length);
 BA.debugLineNum = 542;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_params)) { 
_length = BA.numberCast(int.class, 0);Debug.locals.put("length", _length);}
else {
_length = _params.getField(true,"length");Debug.locals.put("length", _length);};
 BA.debugLineNum = 543;BA.debugLine="LogEvent(TargetPage, SubName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_logevent" /*RemoteObject*/ ,(Object)(_targetpage),(Object)(_subname));
 BA.debugLineNum = 544;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_targetpage.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_subname),(Object)(_length)),b4xpagesmanager.__c.getField(true,"False"))) { 
if (true) return b4xpagesmanager.__c.getField(false,"Null");};
 BA.debugLineNum = 545;BA.debugLine="Select length";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_length,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2))) {
case 0: {
 BA.debugLineNum = 547;BA.debugLine="Return CallSub(TargetPage.B4XPage, SubName)";
Debug.JustUpdateDeviceLine();
if (true) return b4xpagesmanager.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(_targetpage.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_subname));
 break; }
case 1: {
 BA.debugLineNum = 549;BA.debugLine="Return CallSub2(TargetPage.B4XPage, SubName, Pa";
Debug.JustUpdateDeviceLine();
if (true) return b4xpagesmanager.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(_targetpage.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_subname),(Object)(_params.getArrayElement(false,BA.numberCast(int.class, 0))));
 break; }
case 2: {
 BA.debugLineNum = 551;BA.debugLine="Return CallSub3(TargetPage.B4XPage, SubName, Pa";
Debug.JustUpdateDeviceLine();
if (true) return b4xpagesmanager.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(_targetpage.getField(false,"B4XPage" /*RemoteObject*/ )),(Object)(_subname),(Object)(_params.getArrayElement(false,BA.numberCast(int.class, 0))),(Object)(_params.getArrayElement(false,BA.numberCast(int.class, 1))));
 break; }
default: {
 BA.debugLineNum = 553;BA.debugLine="Log(\"Too many parameters\")";
Debug.JustUpdateDeviceLine();
b4xpagesmanager.__c.runVoidMethod ("LogImpl","910420238",RemoteObject.createImmutable("Too many parameters"),0);
 break; }
}
;
 BA.debugLineNum = 555;BA.debugLine="Return Null";
Debug.JustUpdateDeviceLine();
if (true) return b4xpagesmanager.__c.getField(false,"Null");
 BA.debugLineNum = 556;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settitle(RemoteObject __ref,RemoteObject _b4xpage,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("SetTitle (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,336);
if (RapidSub.canDelegate("settitle")) { return __ref.runUserSub(false, "b4xpagesmanager","settitle", __ref, _b4xpage, _title);}
RemoteObject _pi = RemoteObject.declareNull("org.techteam.itsyours.b4xpagesmanager._b4xpageinfo");
Debug.locals.put("B4XPage", _b4xpage);
Debug.locals.put("Title", _title);
 BA.debugLineNum = 336;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 337;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_findpifromb4xpage" /*RemoteObject*/ ,(Object)(_b4xpage));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 338;BA.debugLine="pi.Title = Title";
Debug.JustUpdateDeviceLine();
_pi.setField ("Title" /*RemoteObject*/ ,_title);
 BA.debugLineNum = 339;BA.debugLine="pi.Parent.NativeType.Title = Title";
Debug.JustUpdateDeviceLine();
_pi.getField(false,"Parent" /*RemoteObject*/ ).getField(false,"NativeType" /*RemoteObject*/ ).runMethod(false,"setTitle",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 340;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showpage(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("ShowPage (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("showpage")) { return __ref.runUserSub(false, "b4xpagesmanager","showpage", __ref, _id);}
RemoteObject _pi = RemoteObject.declareNull("org.techteam.itsyours.b4xpagesmanager._b4xpageinfo");
RemoteObject _top = RemoteObject.declareNull("org.techteam.itsyours.b4xpagesmanager._b4xpageinfo");
Debug.locals.put("Id", _id);
 BA.debugLineNum = 133;BA.debugLine="Public Sub ShowPage (Id As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 134;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_getpagefromid" /*RemoteObject*/ ,(Object)(_id));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 135;BA.debugLine="If pi = GetTopPage Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_pi,__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ ))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 136;BA.debugLine="CreatePageIfNeeded(pi)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_createpageifneeded" /*RemoteObject*/ ,(Object)(_pi));
 BA.debugLineNum = 137;BA.debugLine="TopPageDisappear";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_toppagedisappear" /*RemoteObject*/ );
 BA.debugLineNum = 139;BA.debugLine="Dim Top As B4XPageInfo = GetTopPage";
Debug.JustUpdateDeviceLine();
_top = __ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ );Debug.locals.put("Top", _top);Debug.locals.put("Top", _top);
 BA.debugLineNum = 140;BA.debugLine="If Top <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_top)) { 
 BA.debugLineNum = 141;BA.debugLine="Top.Root.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_top.getField(false,"Root" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 };
 BA.debugLineNum = 151;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xset.class, "_remove" /*RemoteObject*/ ,(Object)((_pi.getField(true,"Id" /*RemoteObject*/ ))));
 BA.debugLineNum = 152;BA.debugLine="ShowPageImpl(pi)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_showpageimpl" /*RemoteObject*/ ,(Object)(_pi));
 BA.debugLineNum = 153;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xset.class, "_add" /*RemoteObject*/ ,(Object)((_pi.getField(true,"Id" /*RemoteObject*/ ))));
 BA.debugLineNum = 154;BA.debugLine="TopPageAppear";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_toppageappear" /*RemoteObject*/ );
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showpageandremovepreviouspages(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("ShowPageAndRemovePreviousPages (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("showpageandremovepreviouspages")) { return __ref.runUserSub(false, "b4xpagesmanager","showpageandremovepreviouspages", __ref, _id);}
RemoteObject _pi = RemoteObject.declareNull("org.techteam.itsyours.b4xpagesmanager._b4xpageinfo");
RemoteObject _pagetoremove = RemoteObject.declareNull("org.techteam.itsyours.b4xpagesmanager._b4xpageinfo");
Debug.locals.put("Id", _id);
 BA.debugLineNum = 157;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 158;BA.debugLine="If GetTopPage = Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 159;BA.debugLine="ShowPage(Id)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_showpage" /*RemoteObject*/ ,(Object)(_id));
 BA.debugLineNum = 160;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 162;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_getpagefromid" /*RemoteObject*/ ,(Object)(_id));Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 163;BA.debugLine="CreatePageIfNeeded(pi)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_createpageifneeded" /*RemoteObject*/ ,(Object)(_pi));
 BA.debugLineNum = 164;BA.debugLine="TopPageDisappear";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_toppagedisappear" /*RemoteObject*/ );
 BA.debugLineNum = 168;BA.debugLine="For Each Id As String In mStackOfPageIds.AsList";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group8 = __ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xset.class, "_aslist" /*RemoteObject*/ );
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_id = BA.ObjectToString(group8.runMethod(false,"Get",index8));Debug.locals.put("Id", _id);
Debug.locals.put("Id", _id);
 BA.debugLineNum = 169;BA.debugLine="Dim PageToRemove As B4XPageInfo = GetPageFromId(";
Debug.JustUpdateDeviceLine();
_pagetoremove = __ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_getpagefromid" /*RemoteObject*/ ,(Object)(_id));Debug.locals.put("PageToRemove", _pagetoremove);Debug.locals.put("PageToRemove", _pagetoremove);
 BA.debugLineNum = 171;BA.debugLine="PageToRemove.Root.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_pagetoremove.getField(false,"Root" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 }
}Debug.locals.put("Id", _id);
;
 BA.debugLineNum = 178;BA.debugLine="mStackOfPageIds.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xset.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 179;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xset.class, "_add" /*RemoteObject*/ ,(Object)((_pi.getField(true,"Id" /*RemoteObject*/ ))));
 BA.debugLineNum = 180;BA.debugLine="If xui.IsB4A Or xui.IsB4J Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A")) || RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J"))) { 
 BA.debugLineNum = 181;BA.debugLine="ShowPageImpl(pi)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_showpageimpl" /*RemoteObject*/ ,(Object)(_pi));
 };
 BA.debugLineNum = 183;BA.debugLine="TopPageAppear";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_toppageappear" /*RemoteObject*/ );
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showpageimpl(RemoteObject __ref,RemoteObject _pi) throws Exception{
try {
		Debug.PushSubsStack("ShowPageImpl (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,307);
if (RapidSub.canDelegate("showpageimpl")) { return __ref.runUserSub(false, "b4xpagesmanager","showpageimpl", __ref, _pi);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("pi", _pi);
 BA.debugLineNum = 307;BA.debugLine="Private Sub ShowPageImpl (pi As B4XPageInfo)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 313;BA.debugLine="If pi.Root.Parent.IsInitialized Then pi.Root.Remo";
Debug.JustUpdateDeviceLine();
if (_pi.getField(false,"Root" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
_pi.getField(false,"Root" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");};
 BA.debugLineNum = 314;BA.debugLine="Dim pnl As Panel = pi.Root";
Debug.JustUpdateDeviceLine();
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _pi.getField(false,"Root" /*RemoteObject*/ ).getObject());Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 315;BA.debugLine="If TransitionAnimationDuration > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_transitionanimationduration" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 316;BA.debugLine="mMainForm.AddView(pnl, 0, 0, 20dip, 20dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mmainform" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_pnl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xpagesmanager.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(b4xpagesmanager.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 317;BA.debugLine="pnl.SetLayoutAnimated(TransitionAnimationDuratio";
Debug.JustUpdateDeviceLine();
_pnl.runVoidMethod ("SetLayoutAnimated",(Object)(__ref.getField(true,"_transitionanimationduration" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xpagesmanager.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(b4xpagesmanager.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 }else {
 BA.debugLineNum = 319;BA.debugLine="mMainForm.AddView(pnl, 0, 0, 100%x, 100%y)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mmainform" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_pnl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4xpagesmanager.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(b4xpagesmanager.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 };
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _toppageappear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TopPageAppear (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,262);
if (RapidSub.canDelegate("toppageappear")) { return __ref.runUserSub(false, "b4xpagesmanager","toppageappear", __ref);}
RemoteObject _pi = RemoteObject.declareNull("org.techteam.itsyours.b4xpagesmanager._b4xpageinfo");
 BA.debugLineNum = 262;BA.debugLine="Private Sub TopPageAppear";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 263;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ );Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 264;BA.debugLine="If pi = Null Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_pi)) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 265;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
Debug.JustUpdateDeviceLine();
_pi.getField(false,"Parent" /*RemoteObject*/ ).getField(false,"NativeType" /*RemoteObject*/ ).runMethod(false,"setTitle",BA.ObjectToCharSequence(_pi.getField(false,"Title" /*RemoteObject*/ )));
 BA.debugLineNum = 266;BA.debugLine="If Not(xui.IsB4i) Then";
Debug.JustUpdateDeviceLine();
if (b4xpagesmanager.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 267;BA.debugLine="If IsForeground Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_isforeground" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 268;BA.debugLine="RaiseEvent(pi, \"B4XPage_Appear\", Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_raiseevent" /*RemoteObject*/ ,(Object)(_pi),(Object)(BA.ObjectToString("B4XPage_Appear")),(Object)((b4xpagesmanager.__c.getField(false,"Null"))));
 };
 };
 BA.debugLineNum = 272;BA.debugLine="If ShowUpIndicator And ActionBar.IsInitialized Th";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_showupindicator" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",__ref.getField(false,"_actionbar" /*RemoteObject*/ ).runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 273;BA.debugLine="ActionBar.RunMethod(\"setDisplayHomeAsUpEnabled\",";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_actionbar" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setDisplayHomeAsUpEnabled")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((RemoteObject.solveBoolean(">",__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xset.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 1))))})));
 };
 BA.debugLineNum = 275;BA.debugLine="UpdateMenuItems";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_updatemenuitems" /*RemoteObject*/ );
 BA.debugLineNum = 277;BA.debugLine="UpdateStackString";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_updatestackstring" /*RemoteObject*/ );
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _toppagedisappear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TopPageDisappear (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,251);
if (RapidSub.canDelegate("toppagedisappear")) { return __ref.runUserSub(false, "b4xpagesmanager","toppagedisappear", __ref);}
RemoteObject _pi = RemoteObject.declareNull("org.techteam.itsyours.b4xpagesmanager._b4xpageinfo");
 BA.debugLineNum = 251;BA.debugLine="Private Sub TopPageDisappear";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 252;BA.debugLine="If xui.IsB4J Then Return";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J").<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 253;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
Debug.JustUpdateDeviceLine();
_pi = __ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_gettoppage" /*RemoteObject*/ );Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 254;BA.debugLine="If pi = Null Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_pi)) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 255;BA.debugLine="If Not(xui.IsB4i) Then";
Debug.JustUpdateDeviceLine();
if (b4xpagesmanager.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4i"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 256;BA.debugLine="If IsForeground Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_isforeground" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 257;BA.debugLine="RaiseEventWithResult(pi, \"B4XPage_Disappear\", N";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (org.techteam.itsyours.b4xpagesmanager.class, "_raiseeventwithresult" /*RemoteObject*/ ,(Object)(_pi),(Object)(BA.ObjectToString("B4XPage_Disappear")),(Object)((b4xpagesmanager.__c.getField(false,"Null"))));
 };
 };
 BA.debugLineNum = 260;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatemenuitems(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateMenuItems (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,463);
if (RapidSub.canDelegate("updatemenuitems")) { return __ref.runUserSub(false, "b4xpagesmanager","updatemenuitems", __ref);}
 BA.debugLineNum = 463;BA.debugLine="Private Sub UpdateMenuItems";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 464;BA.debugLine="Context.RunMethod(\"invalidateOptionsMenu\", Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_context" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("invalidateOptionsMenu")),(Object)((b4xpagesmanager.__c.getField(false,"Null"))));
 BA.debugLineNum = 465;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatestackstring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateStackString (b4xpagesmanager) ","b4xpagesmanager",14,__ref.getField(false, "ba"),__ref,620);
if (RapidSub.canDelegate("updatestackstring")) { return __ref.runUserSub(false, "b4xpagesmanager","updatestackstring", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _id = RemoteObject.createImmutable("");
 BA.debugLineNum = 620;BA.debugLine="Public Sub UpdateStackString";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 621;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 622;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 623;BA.debugLine="sb.Append(\"[\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("[")));
 BA.debugLineNum = 624;BA.debugLine="If mStackOfPageIds.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xset.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 625;BA.debugLine="For Each id As String In mStackOfPageIds.AsList";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group5 = __ref.getField(false,"_mstackofpageids" /*RemoteObject*/ ).runClassMethod (org.techteam.itsyours.b4xset.class, "_aslist" /*RemoteObject*/ );
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_id = BA.ObjectToString(group5.runMethod(false,"Get",index5));Debug.locals.put("id", _id);
Debug.locals.put("id", _id);
 BA.debugLineNum = 626;BA.debugLine="sb.Append(id).Append(\", \")";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(_id)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 }
}Debug.locals.put("id", _id);
;
 BA.debugLineNum = 628;BA.debugLine="sb.Remove(sb.Length - 2, sb.Length)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),RemoteObject.createImmutable(2)}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 };
 BA.debugLineNum = 630;BA.debugLine="sb.Append(\"]\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("]")));
 BA.debugLineNum = 631;BA.debugLine="StackString = sb.ToString";
Debug.JustUpdateDeviceLine();
__ref.setField ("_stackstring" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 632;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}