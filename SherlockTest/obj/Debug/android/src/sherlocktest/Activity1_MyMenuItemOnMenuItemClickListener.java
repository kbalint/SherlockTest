package sherlocktest;


public class Activity1_MyMenuItemOnMenuItemClickListener
	extends android.os.Handler
	implements
		mono.android.IGCUserPeer,
		com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onMenuItemClick:(Lcom/actionbarsherlock/view/MenuItem;)Z:GetOnMenuItemClick_Lcom_actionbarsherlock_view_MenuItem_Handler:Xamarin.ActionbarSherlockBinding.Views.IMenuItemOnMenuItemClickListenerInvoker, ActionBarSherlock\n" +
			"";
		mono.android.Runtime.register ("SherlockTest.Activity1/MyMenuItemOnMenuItemClickListener, SherlockTest, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Activity1_MyMenuItemOnMenuItemClickListener.class, __md_methods);
	}


	public Activity1_MyMenuItemOnMenuItemClickListener ()
	{
		super ();
		if (getClass () == Activity1_MyMenuItemOnMenuItemClickListener.class)
			mono.android.TypeManager.Activate ("SherlockTest.Activity1/MyMenuItemOnMenuItemClickListener, SherlockTest, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public Activity1_MyMenuItemOnMenuItemClickListener (android.os.Handler.Callback p0)
	{
		super (p0);
		if (getClass () == Activity1_MyMenuItemOnMenuItemClickListener.class)
			mono.android.TypeManager.Activate ("SherlockTest.Activity1/MyMenuItemOnMenuItemClickListener, SherlockTest, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.OS.Handler/ICallback, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=c4c4237547e4b6cd", this, new java.lang.Object[] { p0 });
	}


	public Activity1_MyMenuItemOnMenuItemClickListener (android.os.Looper p0)
	{
		super (p0);
		if (getClass () == Activity1_MyMenuItemOnMenuItemClickListener.class)
			mono.android.TypeManager.Activate ("SherlockTest.Activity1/MyMenuItemOnMenuItemClickListener, SherlockTest, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.OS.Looper, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=c4c4237547e4b6cd", this, new java.lang.Object[] { p0 });
	}


	public Activity1_MyMenuItemOnMenuItemClickListener (android.os.Looper p0, android.os.Handler.Callback p1)
	{
		super (p0, p1);
		if (getClass () == Activity1_MyMenuItemOnMenuItemClickListener.class)
			mono.android.TypeManager.Activate ("SherlockTest.Activity1/MyMenuItemOnMenuItemClickListener, SherlockTest, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.OS.Looper, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=c4c4237547e4b6cd:Android.OS.Handler/ICallback, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=c4c4237547e4b6cd", this, new java.lang.Object[] { p0, p1 });
	}


	public boolean onMenuItemClick (com.actionbarsherlock.view.MenuItem p0)
	{
		return n_onMenuItemClick (p0);
	}

	private native boolean n_onMenuItemClick (com.actionbarsherlock.view.MenuItem p0);

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
