package org.techteam.itsyours;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "org.techteam.itsyours.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", org.techteam.itsyours.b4xmainpage.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.WebViewWrapper _webview1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _recordpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _audiopanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _videopanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _testpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _donatepanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _merchpanel = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _iyview = null;
public String _layouthome = "";
public anywheresoftware.b4a.objects.ImageViewWrapper _iywebview = null;
public anywheresoftware.b4a.objects.LabelWrapper _webbackbutton = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _ytubeview = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _faceview = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _instaview = null;
public anywheresoftware.b4a.objects.PanelWrapper _backpanel = null;
public org.techteam.itsyours.b4xaudio _audiopage = null;
public org.techteam.itsyours.b4xvideo _videopage = null;
public org.techteam.itsyours.main _main = null;
public org.techteam.itsyours.dropbox _dropbox = null;
public org.techteam.itsyours.starter _starter = null;
public org.techteam.itsyours.b4xpages _b4xpages = null;
public org.techteam.itsyours.b4xcollections _b4xcollections = null;
public String  _aboutpanel_click(org.techteam.itsyours.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "aboutpanel_click", false))
	 {return ((String) Debug.delegate(ba, "aboutpanel_click", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub aboutPanel_Click";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Root.RemoveAllViews";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Root.LoadLayout(\"WebView\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("WebView",ba);
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="WebView1.loadurl(\"https://www.itsyours.org/about-";
__ref._webview1 /*anywheresoftware.b4a.objects.WebViewWrapper*/ .LoadUrl("https://www.itsyours.org/about-us/");
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="End Sub";
return "";
}
public String  _audiopanel_click(org.techteam.itsyours.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "audiopanel_click", false))
	 {return ((String) Debug.delegate(ba, "audiopanel_click", null));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Private Sub audioPanel_Click";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="B4XPages.ShowPage(\"Audio\")";
_b4xpages._showpage /*String*/ (ba,"Audio");
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(org.techteam.itsyours.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Root.LoadLayout(\"MainPageLayout\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPageLayout",ba);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="LayoutHome = \"MainPageLayout\"";
__ref._layouthome /*String*/  = "MainPageLayout";
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="AudioPage.Initialize";
__ref._audiopage /*org.techteam.itsyours.b4xaudio*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="B4XPages.AddPageAndCreate(\"Audio\", AudioPage)";
_b4xpages._addpageandcreate /*String*/ (ba,"Audio",(Object)(__ref._audiopage /*org.techteam.itsyours.b4xaudio*/ ));
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="VideoPage.Initialize";
__ref._videopage /*org.techteam.itsyours.b4xvideo*/ ._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="B4XPages.AddPageAndCreate(\"Video\", VideoPage)";
_b4xpages._addpageandcreate /*String*/ (ba,"Video",(Object)(__ref._videopage /*org.techteam.itsyours.b4xvideo*/ ));
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="End Sub";
return "";
}
public String  _backpanel_touch(org.techteam.itsyours.b4xmainpage __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "backpanel_touch", false))
	 {return ((String) Debug.delegate(ba, "backpanel_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Private Sub backPanel_Touch (Action As Int, X As F";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Root.RemoveAllViews";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Root.LoadLayout(\"MainPageLayout\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPageLayout",ba);
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(org.techteam.itsyours.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Private WebView1 As WebView";
_webview1 = new anywheresoftware.b4a.objects.WebViewWrapper();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Private recordPanel As Panel";
_recordpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Private audioPanel As Panel";
_audiopanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Private videoPanel As Panel";
_videopanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Private testPanel As Panel";
_testpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="Private donatePanel As Panel";
_donatepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="Private merchPanel As Panel";
_merchpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="Private iyView As ImageView";
_iyview = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="Private LayoutHome As String";
_layouthome = "";
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="Private iYWebView As ImageView";
_iywebview = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="Private webBackButton As Label";
_webbackbutton = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=589839;
 //BA.debugLineNum = 589839;BA.debugLine="Private ytubeView As ImageView";
_ytubeview = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="Private faceView As ImageView";
_faceview = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="Private instaView As ImageView";
_instaview = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="Private backPanel As Panel";
_backpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=589843;
 //BA.debugLineNum = 589843;BA.debugLine="Private AudioPage As B4XAudio";
_audiopage = new org.techteam.itsyours.b4xaudio();
RDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="Private VideoPage As B4XVideo";
_videopage = new org.techteam.itsyours.b4xvideo();
RDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="End Sub";
return "";
}
public String  _donatepanel_click(org.techteam.itsyours.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "donatepanel_click", false))
	 {return ((String) Debug.delegate(ba, "donatepanel_click", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub donatePanel_Click";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Root.RemoveAllViews";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Root.LoadLayout(\"WebView\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("WebView",ba);
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="WebView1.loadurl(\"https://www.itsyours.org/donate";
__ref._webview1 /*anywheresoftware.b4a.objects.WebViewWrapper*/ .LoadUrl("https://www.itsyours.org/donate/");
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="End Sub";
return "";
}
public String  _faceview_click(org.techteam.itsyours.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "faceview_click", false))
	 {return ((String) Debug.delegate(ba, "faceview_click", null));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Private Sub faceView_Click";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Root.RemoveAllViews";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Root.LoadLayout(\"WebView\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("WebView",ba);
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="WebView1.loadurl(\"https://www.facebook.com/itsYou";
__ref._webview1 /*anywheresoftware.b4a.objects.WebViewWrapper*/ .LoadUrl("https://www.facebook.com/itsYours.org/");
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="End Sub";
return "";
}
public String  _initialize(org.techteam.itsyours.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public String  _instaview_click(org.techteam.itsyours.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "instaview_click", false))
	 {return ((String) Debug.delegate(ba, "instaview_click", null));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Private Sub instaView_Click";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Root.RemoveAllViews";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="Root.LoadLayout(\"WebView\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("WebView",ba);
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="WebView1.loadurl(\"https://www.instagram.com/iynon";
__ref._webview1 /*anywheresoftware.b4a.objects.WebViewWrapper*/ .LoadUrl("https://www.instagram.com/iynonprofit/");
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="End Sub";
return "";
}
public String  _iyview_click(org.techteam.itsyours.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "iyview_click", false))
	 {return ((String) Debug.delegate(ba, "iyview_click", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub iyView_Click";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Select LayoutHome";
switch (BA.switchObjectToInt(__ref._layouthome /*String*/ ,"MainPageLayout")) {
case 0: {
 break; }
default: {
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="Root.LoadLayout(\"MainPageLayout\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPageLayout",ba);
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="LayoutHome = \"MainPageLayout\"";
__ref._layouthome /*String*/  = "MainPageLayout";
 break; }
}
;
RDebugUtils.currentLine=786439;
 //BA.debugLineNum = 786439;BA.debugLine="End Sub";
return "";
}
public String  _iywebview_click(org.techteam.itsyours.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "iywebview_click", false))
	 {return ((String) Debug.delegate(ba, "iywebview_click", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub iYWebView_Click";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Root.RemoveAllViews";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="Root.LoadLayout(\"MainPageLayout\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPageLayout",ba);
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="End Sub";
return "";
}
public String  _merchpanel_click(org.techteam.itsyours.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "merchpanel_click", false))
	 {return ((String) Debug.delegate(ba, "merchpanel_click", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub merchPanel_Click";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Root.RemoveAllViews";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Root.LoadLayout(\"WebView\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("WebView",ba);
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="WebView1.loadurl(\"https://www.itsyours.org/produc";
__ref._webview1 /*anywheresoftware.b4a.objects.WebViewWrapper*/ .LoadUrl("https://www.itsyours.org/product/its-yours-t-shirt/");
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="End Sub";
return "";
}
public String  _recordpanel_click(org.techteam.itsyours.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "recordpanel_click", false))
	 {return ((String) Debug.delegate(ba, "recordpanel_click", null));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub recordPanel_Click";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Root.RemoveAllViews";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Root.LoadLayout(\"selectrecord\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("selectrecord",ba);
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="LayoutHome = \"selectrecord\"";
__ref._layouthome /*String*/  = "selectrecord";
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="End Sub";
return "";
}
public String  _testpanel_click(org.techteam.itsyours.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "testpanel_click", false))
	 {return ((String) Debug.delegate(ba, "testpanel_click", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub testPanel_Click";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Root.RemoveAllViews";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Root.LoadLayout(\"WebView\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("WebView",ba);
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="WebView1.loadurl(\"https://www.itsyours.org/testim";
__ref._webview1 /*anywheresoftware.b4a.objects.WebViewWrapper*/ .LoadUrl("https://www.itsyours.org/testimonies/");
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="End Sub";
return "";
}
public String  _videopanel_click(org.techteam.itsyours.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "videopanel_click", false))
	 {return ((String) Debug.delegate(ba, "videopanel_click", null));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub videoPanel_Click";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="B4XPages.ShowPage(\"Video\")";
_b4xpages._showpage /*String*/ (ba,"Video");
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return "";
}
public String  _webbackbutton_click(org.techteam.itsyours.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "webbackbutton_click", false))
	 {return ((String) Debug.delegate(ba, "webbackbutton_click", null));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub webBackButton_Click";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="WebView1.Back";
__ref._webview1 /*anywheresoftware.b4a.objects.WebViewWrapper*/ .Back();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public String  _ytubeview_click(org.techteam.itsyours.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "ytubeview_click", false))
	 {return ((String) Debug.delegate(ba, "ytubeview_click", null));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub ytubeView_Click";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Root.RemoveAllViews";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Root.LoadLayout(\"WebView\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("WebView",ba);
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="WebView1.loadurl(\"https://www.youtube.com/channel";
__ref._webview1 /*anywheresoftware.b4a.objects.WebViewWrapper*/ .LoadUrl("https://www.youtube.com/channel/UC41X0QO8aeiP5ClWoXhkeRQ");
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="End Sub";
return "";
}
}