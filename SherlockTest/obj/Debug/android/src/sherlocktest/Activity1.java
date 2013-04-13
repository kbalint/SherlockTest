package sherlocktest;


public class Activity1
	extends com.actionbarsherlock.app.SherlockFragmentActivity
	implements
		mono.android.IGCUserPeer,
		com.actionbarsherlock.app.ActionBar.TabListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_onCreateOptionsMenu:(Lcom/actionbarsherlock/view/Menu;)Z:GetOnCreateOptionsMenu_Lcom_actionbarsherlock_view_Menu_Handler\n" +
			"n_onOptionsItemSelected:(Lcom/actionbarsherlock/view/MenuItem;)Z:GetOnOptionsItemSelected_Lcom_actionbarsherlock_view_MenuItem_Handler\n" +
			"n_onTabReselected:(Lcom/actionbarsherlock/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V:GetOnTabReselected_Lcom_actionbarsherlock_app_ActionBar_Tab_Landroid_support_v4_app_FragmentTransaction_Handler:Xamarin.ActionbarSherlockBinding.App.ActionBar/ITabListenerInvoker, ActionBarSherlock\n" +
			"n_onTabSelected:(Lcom/actionbarsherlock/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V:GetOnTabSelected_Lcom_actionbarsherlock_app_ActionBar_Tab_Landroid_support_v4_app_FragmentTransaction_Handler:Xamarin.ActionbarSherlockBinding.App.ActionBar/ITabListenerInvoker, ActionBarSherlock\n" +
			"n_onTabUnselected:(Lcom/actionbarsherlock/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V:GetOnTabUnselected_Lcom_actionbarsherlock_app_ActionBar_Tab_Landroid_support_v4_app_FragmentTransaction_Handler:Xamarin.ActionbarSherlockBinding.App.ActionBar/ITabListenerInvoker, ActionBarSherlock\n" +
			"";
		mono.android.Runtime.register ("SherlockTest.Activity1, SherlockTest, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", Activity1.class, __md_methods);
	}


	public Activity1 ()
	{
		super ();
		if (getClass () == Activity1.class)
			mono.android.TypeManager.Activate ("SherlockTest.Activity1, SherlockTest, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public boolean onCreateOptionsMenu (com.actionbarsherlock.view.Menu p0)
	{
		return n_onCreateOptionsMenu (p0);
	}

	private native boolean n_onCreateOptionsMenu (com.actionbarsherlock.view.Menu p0);


	public boolean onOptionsItemSelected (com.actionbarsherlock.view.MenuItem p0)
	{
		return n_onOptionsItemSelected (p0);
	}

	private native boolean n_onOptionsItemSelected (com.actionbarsherlock.view.MenuItem p0);


	public void onTabReselected (com.actionbarsherlock.app.ActionBar.Tab p0, android.support.v4.app.FragmentTransaction p1)
	{
		n_onTabReselected (p0, p1);
	}

	private native void n_onTabReselected (com.actionbarsherlock.app.ActionBar.Tab p0, android.support.v4.app.FragmentTransaction p1);


	public void onTabSelected (com.actionbarsherlock.app.ActionBar.Tab p0, android.support.v4.app.FragmentTransaction p1)
	{
		n_onTabSelected (p0, p1);
	}

	private native void n_onTabSelected (com.actionbarsherlock.app.ActionBar.Tab p0, android.support.v4.app.FragmentTransaction p1);


	public void onTabUnselected (com.actionbarsherlock.app.ActionBar.Tab p0, android.support.v4.app.FragmentTransaction p1)
	{
		n_onTabUnselected (p0, p1);
	}

	private native void n_onTabUnselected (com.actionbarsherlock.app.ActionBar.Tab p0, android.support.v4.app.FragmentTransaction p1);

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
