package com.example.bottomnavigation.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.bottomnavigation.fragment.fragmentCafe;
import com.example.bottomnavigation.fragment.fragmentHome;
import com.example.bottomnavigation.fragment.fragmentNotification;
import com.example.bottomnavigation.fragment.fragmentSearch;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    int pageNum;

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new fragmentHome();
            case 1:return new fragmentNotification();
            case 2:return new fragmentSearch();
            case 3:return new fragmentCafe();
            default:return new fragmentHome();
        }
    }

    @Override
    public int getCount() {
        return pageNum;
    }
}
