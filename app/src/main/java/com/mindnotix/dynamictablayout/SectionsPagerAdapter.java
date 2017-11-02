package com.mindnotix.dynamictablayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.List;

/**
 * Created by Admin on 02-11-2017.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private List<Category> categories ;

    public SectionsPagerAdapter(FragmentManager fm,List<Category> categories) {
        super(fm);
        this.categories = categories;
    }

    @Override
    public Fragment getItem(int position) {

        ListFragment fragment = new ListFragment();
        Bundle args = new Bundle();
        args.putInt(ListFragment.ARG_SECTION_NUMBER, position + 1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return categories.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return categories.get(position).getName();
    }
}
