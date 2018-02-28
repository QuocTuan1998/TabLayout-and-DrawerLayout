package com.example.quoctuan.learntablayout.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.quoctuan.learntablayout.fragment.FragmentAlbums;
import com.example.quoctuan.learntablayout.fragment.FragmentSingers;
import com.example.quoctuan.learntablayout.fragment.FragmentSong;


/**
 * Created by quoctuan on 28/02/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag = null;

        switch (position) {
            case 0:
                frag = new FragmentSong();
                break;
            case 1:
                frag  = new FragmentAlbums();
                break;
            case 2:
                frag = new FragmentSingers();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title ="";
        switch (position) {
            case 0:
                title = "Songs";
                break;
            case 1:
                title = "Albums";
                break;
            case 2:
                title = "Singers";
                break;
        }
        return title;
    }
}
