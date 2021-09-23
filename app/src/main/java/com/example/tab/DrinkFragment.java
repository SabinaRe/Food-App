package com.example.tab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class DrinkFragment extends Fragment {
    RecyclerView drink_r_view;
    ArrayList<FoodModel> drink_list;
    FoodAdap drink_adap;

    public DrinkFragment() {
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
        View view = inflater.inflate(R.layout.fragment_drink, container, false);

        drink_list=new ArrayList<>();
        drink_list.add(new FoodModel(R.drawable.r_view, "drink 1", "Rs: 100"));
        drink_list.add(new FoodModel(R.drawable.r_view, "drink 2", "Rs: 100"));
        drink_list.add(new FoodModel(R.drawable.r_view, "drink 3", "Rs: 100"));
        drink_list.add(new FoodModel(R.drawable.r_view, "drink 4", "Rs: 100"));
        drink_list.add(new FoodModel(R.drawable.r_view, "drink 5", "Rs: 100"));

        drink_r_view = view.findViewById(R.id.drink_r_view);
        drink_adap = new FoodAdap(drink_list, getActivity().getApplicationContext());
        LinearLayoutManager manager = new LinearLayoutManager(getActivity().getApplicationContext(), RecyclerView.HORIZONTAL, false);
        drink_r_view.setLayoutManager(manager);
        drink_r_view.setHasFixedSize(true);
        drink_r_view.setAdapter(drink_adap);
        return view; }
}