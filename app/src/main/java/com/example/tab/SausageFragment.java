package com.example.tab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SausageFragment extends Fragment {
    RecyclerView sausage_r_view;
    ArrayList<FoodModel> sausage_list;
    FoodAdap sausage_adap;

    public SausageFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sausage, container, false);

        sausage_list = new ArrayList<>();
        sausage_list.add(new FoodModel(R.drawable.r_view, "sausage1", "Rs. 60"));
        sausage_list.add(new FoodModel(R.drawable.r_view, "sausage2", "Rs. 60"));
        sausage_list.add(new FoodModel(R.drawable.r_view, "sausage3", "Rs. 60"));
        sausage_list.add(new FoodModel(R.drawable.r_view, "sausage4", "Rs. 60"));
        sausage_list.add(new FoodModel(R.drawable.r_view, "sausage5", "Rs. 60"));

        sausage_r_view=view.findViewById(R.id.sausage_r_view);
        sausage_adap = new FoodAdap(sausage_list, getActivity().getApplicationContext());
        LinearLayoutManager manager = new LinearLayoutManager(getActivity().getApplicationContext(), RecyclerView.HORIZONTAL, false);
        sausage_r_view.setLayoutManager(manager);
        sausage_r_view.setHasFixedSize(true);
        sausage_r_view.setAdapter(sausage_adap);

        return view;
    }
}