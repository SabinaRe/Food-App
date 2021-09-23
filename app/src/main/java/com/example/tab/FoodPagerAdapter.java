package com.example.tab;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FoodPagerAdapter extends FragmentPagerAdapter {
    int tabCount;

    public FoodPagerAdapter(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount=tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FoodFragment foodFragment = new FoodFragment();
                return foodFragment;

            case 1:
                DrinkFragment drinkFragment = new DrinkFragment();
                return drinkFragment;

            case 2:
                SnackFragment snackFragment = new SnackFragment();
                return snackFragment;

            case 3:
                SoupFragment soupFragment = new SoupFragment();
                return soupFragment;

            case 4:
                SausageFragment sausageFragment = new SausageFragment();
                return sausageFragment;
            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return tabCount;
    }
}
