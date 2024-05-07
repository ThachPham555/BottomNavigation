package com.example.bottomnavigation.cafe;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class CafeViewPagerAdapter extends FragmentStatePagerAdapter {

    public CafeViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new fragmentCuli();
            case 1: return new fragmentMoka();
            case 2: return new fragmentRubusta();
            default:return new fragmentCuli();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "CULI";
            case 1: return "MOKA";
            case 2: return "RUBUSTA";
            default:return "CULI";
        }
    }
}
