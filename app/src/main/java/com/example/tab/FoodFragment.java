package com.example.tab;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FoodFragment extends Fragment {
    RecyclerView food_recy_view;
    ArrayList<FoodModel> food_list;
    FoodAdap foodAdap;
    public FoodFragment() {
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
        View view = inflater.inflate(R.layout.fragment_food, container, false);

        food_list=new ArrayList<>();
        food_list.add(new FoodModel(R.drawable.r_view, "food 1", "Rs: 100"));
        food_list.add(new FoodModel(R.drawable.r_view, "food 2", "Rs: 100"));
        food_list.add(new FoodModel(R.drawable.r_view, "food 3", "Rs: 100"));
        food_list.add(new FoodModel(R.drawable.r_view, "food 4", "Rs: 100"));
        food_list.add(new FoodModel(R.drawable.r_view, "food 5", "Rs: 100"));

        food_recy_view = view.findViewById(R.id.food_recy_view);
        foodAdap = new FoodAdap(food_list, getActivity().getApplicationContext());
        LinearLayoutManager manager = new LinearLayoutManager(getActivity().getApplicationContext(), RecyclerView.HORIZONTAL, false);
        food_recy_view.setLayoutManager(manager);
        food_recy_view.setHasFixedSize(true);
        food_recy_view.setAdapter(foodAdap);
        return view;
    }
}