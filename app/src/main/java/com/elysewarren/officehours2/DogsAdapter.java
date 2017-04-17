package com.elysewarren.officehours2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by elysewarren on 4/12/17.
 */

public class DogsAdapter extends RecyclerView.Adapter<DogViewHolder> {

    private List<Dog> dogs;
    private Context context;

    public DogsAdapter(List<Dog> dogs, Context context) {
        this.dogs = dogs;
        this.context = context;
    }

    @Override
    public DogViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_dog, parent, false);
        return new DogViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(DogViewHolder holder, int position) {
        Dog dog = dogs.get(position);
        holder.bind(dog);
    }

    @Override
    public int getItemCount() {
        return dogs.size();
    }
}