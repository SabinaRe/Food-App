package com.example.tab;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Sign_frag extends Fragment {
    Button btn_sig;

    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
       ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_sign, container, false);

       btn_sig = root.findViewById(R.id.btn_sig);
       btn_sig.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(getActivity(), DashboardActivity.class));
           }
       });
       return root;
    }
}