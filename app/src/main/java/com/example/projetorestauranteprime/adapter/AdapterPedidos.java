package com.example.projetorestauranteprime.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetorestauranteprime.R;

public class AdapterPedidos extends RecyclerView.Adapter<AdapterPedidos.MyViewHolder>{
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_pedidos, parent, false);


        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView titulo;
        TextView time;
        TextView mesa;
        TextView pedido;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
