package com.example.tab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SnackFragment extends Fragment {
    RecyclerView snack_r_view;
    ArrayList<FoodModel> snack_list;
    FoodAdap snack_adap;

    public SnackFragment() {
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
        View view = inflater.inflate(R.layout.fragment_snack, container, false);

        snack_list=new ArrayList<>();
        snack_list.add(new FoodModel(R.drawable.r_view, "snack 1", "Rs: 100"));
        snack_list.add(new FoodModel(R.drawable.r_view, "snack 2", "Rs: 100"));
        snack_list.add(new FoodModel(R.drawable.r_view, "snack 3", "Rs: 100"));
        snack_list.add(new FoodModel(R.drawable.r_view, "snack 4", "Rs: 100"));
        snack_list.add(new FoodModel(R.drawable.r_view, "snack 5", "Rs: 100"));

        snack_r_view = view.findViewById(R.id.snack_r_view);
        snack_adap = new FoodAdap(snack_list, getActivity().getApplicationContext());
        LinearLayoutManager manager = new LinearLayoutManager(getActivity().getApplicationContext(), RecyclerView.HORIZONTAL, false);
        snack_r_view.setLayoutManager(manager);
        snack_r_view.setHasFixedSize(true);
        snack_r_view.setAdapter(snack_adap);
        return view; }
}