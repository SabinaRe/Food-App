package com.example.tab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SoupFragment extends Fragment {
    RecyclerView soup_r_view;
    ArrayList<FoodModel> soup_list;
    FoodAdap soup_adap;

    public SoupFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_soup, container, false);

        soup_list = new ArrayList<>();
        soup_list.add(new FoodModel(R.drawable.r_view, "soup1", "Rs. 60"));
        soup_list.add(new FoodModel(R.drawable.r_view, "soup2", "Rs. 60"));
        soup_list.add(new FoodModel(R.drawable.r_view, "soup3", "Rs. 60"));
        soup_list.add(new FoodModel(R.drawable.r_view, "soup4", "Rs. 60"));
        soup_list.add(new FoodModel(R.drawable.r_view, "soup5", "Rs. 60"));

        soup_r_view=view.findViewById(R.id.soup_r_view);
        soup_adap = new FoodAdap(soup_list, getActivity().getApplicationContext());
        LinearLayoutManager manager = new LinearLayoutManager(getActivity().getApplicationContext(), RecyclerView.HORIZONTAL, false);
        soup_r_view.setLayoutManager(manager);
        soup_r_view.setHasFixedSize(true);
        soup_r_view.setAdapter(soup_adap);

        return view;
    }
}