package com.nihongo.simonini;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter{

    /** Context of the app */
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // Implement getItem() which returns the fragment associated with each position
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AnimalsFragment();
            case 1:
                return new ColorsFragment();
            case 2:
                return new ExpressionsFragment();
            case 3:
                return new FamilyFragment();
            case 4:
                return new NumbersFragment();
            default:
                return null;
        }

    }

    // Need to override getCount() to return the numbers of pages we have
    @Override
    public int getCount() {
        return 5;
    }

    // Implement getPageTitle() returning a string describing each page
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.animals_title);
        } else if (position == 1) {
            return mContext.getString(R.string.colors_title);
        } else if (position == 2) {
            return mContext.getString(R.string.expressions_title);
        } else if (position == 3){
            return mContext.getString(R.string.family_title);
        } else if (position == 4){
            return mContext.getString(R.string.numbers_title);
        }
        else {
            return null;
        }

    }



}
