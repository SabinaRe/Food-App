package com.example.tab;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdap extends RecyclerView.Adapter<FoodAdap.FoodViewHolder>{
    ArrayList<FoodModel> food_list;
    Context context;

    public FoodAdap(ArrayList<FoodModel> food_list, Context context){
        this.food_list=food_list;
        this.context=context;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.food_single_row, parent, false);
        return new FoodViewHolder(view);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

        holder.food_img.setImageResource(food_list.get(position).food_img);
        holder.food_name.setText(food_list.get(position).food_name);
        holder.food_price.setText(food_list.get(position).food_price);

        holder.food_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, FoodDetailActivity.class);
                intent.putExtra("food_name", food_list.get(position).getFood_name());
                intent.putExtra("food_img", food_list.get(position).getFood_img());
                intent.putExtra("food_price", food_list.get(position).getFood_price());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return food_list.size();
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder{
        ImageView food_img;
        TextView food_name, food_price;
        View view;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            view=itemView;

            food_img = itemView.findViewById(R.id.food_img);
            food_name = itemView.findViewById(R.id.food_name);
            food_price = itemView.findViewById(R.id.food_price);

        }
    }
}
