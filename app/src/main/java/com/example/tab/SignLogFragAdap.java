package com.example.tab;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class SignLogFragAdap extends FragmentPagerAdapter {

    Context context;
    int totalTabs;

    public SignLogFragAdap(FragmentManager fm, Context context, int totalTabs) {
        super(fm);
        this.context = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                Login_frag login_frag = new Login_frag();
                return login_frag;

            case 1:
                Sign_frag sign_frag = new Sign_frag();
                return sign_frag;

            default:
            return null;
        }

    }

    @Override
    public int getCount() {
        return totalTabs;
    }


    }

