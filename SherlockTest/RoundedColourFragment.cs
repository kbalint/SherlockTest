using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Xamarin.ActionbarSherlockBinding.App;
using Android.Graphics.Drawables;

namespace SherlockTest
{
    class RoundedColourFragment : SherlockFragment
    {
        private View mView;
        private int mColour;
        private float mWeight;
        private int marginLeft, marginRight, marginTop, marginBottom;

        // need a public empty constructor for framework to instantiate
        public RoundedColourFragment()
        {

        }

        public RoundedColourFragment(int colour, float weight, int margin_left, int margin_right, int margin_top, int margin_bottom) {
            mColour = colour;
            mWeight = weight;
            marginLeft = margin_left;
            marginRight = margin_right;
            marginTop = margin_top;
            marginBottom = margin_bottom;
        }

        public override void OnCreate(Bundle savedInstanceState) {
            base.OnCreate(savedInstanceState);
            mView = new View(this.Activity);

            GradientDrawable background = (GradientDrawable) Resources.GetDrawable(Resource.Drawable.rounded_rect);
            background.SetColor(mColour);

            mView.SetBackgroundDrawable(background);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(0, Xamarin.ActionbarSherlockBinding.App.ActionBar.LayoutParams.FillParent, mWeight);
            lp.SetMargins(marginLeft, marginTop, marginRight, marginBottom);
            mView.LayoutParameters = lp;
        }

        public override View OnCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            return mView;
        }
    }
}