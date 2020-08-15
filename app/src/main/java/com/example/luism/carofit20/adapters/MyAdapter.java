package com.example.luism.carofit20.adapters;

import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.luism.carofit20.R;
import com.example.luism.carofit20.models.Alimento;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends Adapter<MyAdapter.FoodViewHolder> {
    private List<Alimento> foodList;
    private int layout;

    public static class FoodViewHolder extends ViewHolder {
        public TextView textViewFood;
        public TextView textViewPorcion;
        public TextView textViewPeso;

        public FoodViewHolder(View view) {
            super(view);
            this.textViewFood = view.findViewById(R.id.textViewFood);
            this.textViewPorcion = view.findViewById(R.id.textViewPorcion);
            this.textViewPeso = view.findViewById(R.id.textViewPeso);
        }

        public void Bind(Alimento alimento) {
            this.textViewFood.setText(alimento.getNombre());
            TextView textViewPorcion = this.textViewPorcion;
            TextView textViewPeso = this.textViewPeso;
            StringBuilder stringBuilderPorcion = new StringBuilder();
            StringBuilder stringBuilderPeso = new StringBuilder();
            stringBuilderPorcion.append("Porción: ");
            stringBuilderPeso.append("Peso: ");
            stringBuilderPorcion.append(alimento.getPorcion());
            stringBuilderPeso.append(alimento.getPeso());
            textViewPorcion.setText(stringBuilderPorcion.toString());
            textViewPeso.setText(stringBuilderPeso.toString());
        }
    }

    public MyAdapter(List<Alimento> list, int i) {
        this.foodList = list;
        this.layout = i;
    }

    public int getItemCount() {
        return this.foodList.size();
    }

    public void onBindViewHolder(FoodViewHolder foodViewHolder, int i) {
        foodViewHolder.Bind(this.foodList.get(i));
    }

    public FoodViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new FoodViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(this.layout, viewGroup, false));
    }

    public void setFilteredList(List<Alimento> list) {
        this.foodList = new ArrayList();
        this.foodList.addAll(list);
        notifyDataSetChanged();
    }
}
