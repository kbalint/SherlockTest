using System;

using Android.App;
using Android.Content;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;
using Xamarin.ActionbarSherlockBinding.App;
using Android.Animation;
using Xamarin.ActionbarSherlockBinding.Views;
using System.Threading;

namespace SherlockTest
{
    [Activity(Label = "SherlockTest", MainLauncher = true, Icon = "@drawable/icon")]
    public class Activity1 : SherlockFragmentActivity, Xamarin.ActionbarSherlockBinding.App.ActionBar.ITabListener
    {
        private RoundedColourFragment leftFrag;
        private RoundedColourFragment rightFrag;
        private bool useLogo = false;
        private bool showHomeUp = false;

        public class MyNavigationListener : Handler, Xamarin.ActionbarSherlockBinding.App.ActionBar.IOnNavigationListener, IDisposable
        { 
            public MyNavigationListener()
            {
            }

            public bool OnNavigationItemSelected(int position, long itemId)
            {
                OnNavigationItemSelected(position,itemId);
                return false;
            }
        }

        public class MyMenuItemOnMenuItemClickListener : Handler, Xamarin.ActionbarSherlockBinding.Views.IMenuItemOnMenuItemClickListener
        {
            public MyMenuItemOnMenuItemClickListener()
            {
            }

            ////on selecting show progress spinner for 1s
            public bool OnMenuItemClick(Xamarin.ActionbarSherlockBinding.Views.IMenuItem item) {
                item.SetActionView(Resource.Layout.indeterminate_progress_action);
                Thread.Sleep(10);

            //   Handler.PostDelayed(new Java.Lang.Runnable() {
            //            public void run() {
            //                refresh.setActionView(null);
            //            }
            //        }, 1000);
            //        return false;
                return false;
            }

        }

        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);
            SetContentView(Resource.Layout.Main);
            Xamarin.ActionbarSherlockBinding.App.ActionBar ab = base.SupportActionBar;
            
            ab.SetDisplayHomeAsUpEnabled(showHomeUp);
            ab.SetDisplayUseLogoEnabled(useLogo);


            for (int i = 1; i < 4; i++)
            {
                ab.AddTab(ab.NewTab().SetText("Tab " + i).SetTabListener(this));
            }

            // set up list nav
            ab.SetListNavigationCallbacks(ArrayAdapter.CreateFromResource(this, Resource.Array.sections, Resource.Layout.sherlock_spinner_dropdown_item), new MyNavigationListener());

            // default to tab navigation
            ShowTabsNav();

            // create a couple of simple fragments as placeholders
            int MARGIN = 16;
            leftFrag = new RoundedColourFragment(Resources.GetColor(Resource.Color.android_green), 1f, MARGIN, MARGIN / 2, MARGIN, MARGIN);
            rightFrag = new RoundedColourFragment(Resources.GetColor(Resource.Color.honeycombish_blue), 2f, MARGIN / 2, MARGIN, MARGIN, MARGIN);

            var ft = base.SupportFragmentManager.BeginTransaction();
            ft.Add(Resource.Id.root, leftFrag);
            ft.Add(Resource.Id.root, rightFrag); 
            ft.Commit(); 
        }

         
        public override bool OnCreateOptionsMenu(Xamarin.ActionbarSherlockBinding.Views.IMenu menu) 
        {
            base.SupportMenuInflater.Inflate(Resource.Menu.main_menu, menu);

             // set up a listener for the refresh item
            Xamarin.ActionbarSherlockBinding.Views.IMenuItem refresh = (Xamarin.ActionbarSherlockBinding.Views.IMenuItem)menu.FindItem(Resource.Id.menu_refresh);

            // TODO:
            refresh.SetOnMenuItemClickListener(new MyMenuItemOnMenuItemClickListener());

            //        refresh.SetOnMenuItemClickListener(new OnMenuItemClickListener() {
            //    // on selecting show progress spinner for 1s
            //    public boolean onMenuItemClick(MenuItem item) {
            //        // item.setActionView(R.layout.progress_action);
            //        handler.postDelayed(new Runnable() {
            //            public void run() {
            //                refresh.setActionView(null);
            //            }
            //        }, 1000);
            //        return false;
            //    }
            //});
            return base.OnCreateOptionsMenu(menu);
        }


        public override bool OnOptionsItemSelected(Xamarin.ActionbarSherlockBinding.Views.IMenuItem item)
        {
            switch (item.ItemId) {
            case Resource.Id.homeAsUp:
                // TODO handle clicking the app icon/logo
                return false;
            case Resource.Id.menu_refresh:
                // switch to a progress animation
                item.SetActionView(Resource.Layout.indeterminate_progress_action);
                return true;
            case Resource.Id.menu_both:
                // rotation animation of green fragment
                RotateLeftFrag();
                return true;
            case Resource.Id.menu_text:
                // alpha animation of blue fragment
                ObjectAnimator alpha = ObjectAnimator.OfFloat(rightFrag.View, "alpha", 1f, 0f);
                alpha.RepeatMode = ValueAnimatorRepeatMode.Reverse;
                alpha.RepeatCount = 1;
                alpha.SetDuration(800);
                alpha.Start();
                return true;
            case Resource.Id.menu_logo:
                useLogo = !useLogo;
                item.SetChecked(useLogo);
                base.SupportActionBar.SetDisplayUseLogoEnabled(useLogo);
                return true;
            case Resource.Id.menu_up:
                showHomeUp = !showHomeUp;
                item.SetChecked(showHomeUp);
                base.SupportActionBar.SetDisplayHomeAsUpEnabled(showHomeUp);
                return true;
            case Resource.Id.menu_nav_tabs:
                item.SetChecked(true);
                ShowTabsNav();
                return true;
            case Resource.Id.menu_nav_label:
                item.SetChecked(true);
                ShowStandardNav();
                return true;
            case Resource.Id.menu_nav_drop_down:
                item.SetChecked(true);
                ShowDropDownNav();
                return true;
            case Resource.Id.menu_bak_none:
                item.SetChecked(true);
                base.SupportActionBar.SetBackgroundDrawable(null);
                return true;
            case Resource.Id.menu_bak_gradient:
                item.SetChecked(true);
                base.SupportActionBar.SetBackgroundDrawable(Resources.GetDrawable(Resource.Drawable.ad_action_bar_gradient_bak));
                return true;
            default:
                return base.OnOptionsItemSelected(item);
            }
        }


        private void RotateLeftFrag()
        {
            if (leftFrag != null)
            {
                ObjectAnimator.OfFloat(leftFrag.View, "rotationY", 0, 180)
                        .SetDuration(500).Start();
            }
        }

        private void ShowStandardNav()
        {
            Xamarin.ActionbarSherlockBinding.App.ActionBar ab = base.SupportActionBar;
            if (ab.NavigationMode != Xamarin.ActionbarSherlockBinding.App.ActionBar.NavigationModeStandard)
            {
                ab.SetDisplayShowTitleEnabled(true);
                ab.NavigationMode = Xamarin.ActionbarSherlockBinding.App.ActionBar.NavigationModeStandard;
            }
        }

        private void ShowDropDownNav()
        {
            Xamarin.ActionbarSherlockBinding.App.ActionBar ab = base.SupportActionBar;
            if (ab.NavigationMode != Xamarin.ActionbarSherlockBinding.App.ActionBar.NavigationModeList)
            {
                ab.SetDisplayShowTitleEnabled(false);
                ab.NavigationMode = Xamarin.ActionbarSherlockBinding.App.ActionBar.NavigationModeList;
            }
           
        }

        private void ShowTabsNav()
        {
            Xamarin.ActionbarSherlockBinding.App.ActionBar ab = base.SupportActionBar;
            if (ab.NavigationMode != Xamarin.ActionbarSherlockBinding.App.ActionBar.NavigationModeTabs)
            {
                ab.SetDisplayShowTitleEnabled(false);
                ab.NavigationMode = Xamarin.ActionbarSherlockBinding.App.ActionBar.NavigationModeTabs;
            }
        }


        public void OnTabReselected(Xamarin.ActionbarSherlockBinding.App.ActionBar.Tab p0, Android.Support.V4.App.FragmentTransaction p1)
        {
            RotateLeftFrag();
        }

        public void OnTabSelected(Xamarin.ActionbarSherlockBinding.App.ActionBar.Tab p0, Android.Support.V4.App.FragmentTransaction p1)
        {
            //throw new NotImplementedException();
        }

        public void OnTabUnselected(Xamarin.ActionbarSherlockBinding.App.ActionBar.Tab p0, Android.Support.V4.App.FragmentTransaction p1)
        {
            //throw new NotImplementedException();
        }
    }
}

