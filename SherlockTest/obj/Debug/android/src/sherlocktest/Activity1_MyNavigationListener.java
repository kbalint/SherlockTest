package sherlocktest;


public class Activity1_MyNavigationListener
	extends android.os.Handler
	implements
		mono.android.IGCUserPeer,
		com.actionbarsherlock.app.ActionBar.OnNavigationListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onNavigationItemSelected:(IJ)Z:GetOnNavigationItemSelected_IJHandler:Xamarin.ActionbarSherlockBinding.App.ActionBar/IOnNavigationListenerInvoker, ActionBarSherlock\n" +
			"";
		mono.android.Runtime.register ("SherlockTest.Activity1/MyNavigationListener, SherlockTest, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Activity1_MyNavigationListener.class, __md_methods);
	}


	public Activity1_MyNavigationListener ()
	{
		super ();
		if (getClass () == Activity1_MyNavigationListener.class)
			mono.android.TypeManager.Activate ("SherlockTest.Activity1/MyNavigationListener, SherlockTest, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public Activity1_MyNavigationListener (android.os.Handler.Callback p0)
	{
		super (p0);
		if (getClass () == Activity1_MyNavigationListener.class)
			mono.android.TypeManager.Activate ("SherlockTest.Activity1/MyNavigationListener, SherlockTest, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.OS.Handler/ICallback, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=c4c4237547e4b6cd", this, new java.lang.Object[] { p0 });
	}


	public Activity1_MyNavigationListener (android.os.Looper p0)
	{
		super (p0);
		if (getClass () == Activity1_MyNavigationListener.class)
			mono.android.TypeManager.Activate ("SherlockTest.Activity1/MyNavigationListener, SherlockTest, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.OS.Looper, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=c4c4237547e4b6cd", this, new java.lang.Object[] { p0 });
	}


	public Activity1_MyNavigationListener (android.os.Looper p0, android.os.Handler.Callback p1)
	{
		super (p0, p1);
		if (getClass () == Activity1_MyNavigationListener.class)
			mono.android.TypeManager.Activate ("SherlockTest.Activity1/MyNavigationListener, SherlockTest, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.OS.Looper, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=c4c4237547e4b6cd:Android.OS.Handler/ICallback, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=c4c4237547e4b6cd", this, new java.lang.Object[] { p0, p1 });
	}


	public boolean onNavigationItemSelected (int p0, long p1)
	{
		return n_onNavigationItemSelected (p0, p1);
	}

	private native boolean n_onNavigationItemSelected (int p0, long p1);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
