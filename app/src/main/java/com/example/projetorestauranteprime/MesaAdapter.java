package com.example.projetorestauranteprime;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MesaAdapter extends RecyclerView.Adapter<MesaAdapter.MyViewHolder> {

    Context context;
    ArrayList<Mesa> mesas;
    public MesaAdapter(Context context, ArrayList<Mesa> mesas){
        this.context = context;
        this.mesas = mesas;
    }
    @NonNull
    @Override
    public MesaAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycler_view_mesa, parent, false);
        return new MesaAdapter.MyViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull MesaAdapter.MyViewHolder holder, int position) {
        holder.id.setText("Mesa " + mesas.get(position).getId());
        holder.people.setText(mesas.get(position).getPeople() + " pessoas");
        holder.ordersPlaced.setText(Integer.toString(mesas.get(position).getOrdersPlaced()));
        holder.readyOrders.setText(Integer.toString(mesas.get(position).getReadyOrders()));
    }

    @Override
    public int getItemCount() {
        return mesas.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView id, people, ordersPlaced, readyOrders;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            id = itemView.findViewById(R.id.mesaIdTextView);
            people = itemView.findViewById(R.id.peopleTextView);
            ordersPlaced = itemView.findViewById(R.id.numbersOrdersPlacedTextView);
            readyOrders = itemView.findViewById(R.id.numbersReadyOrdersTextView);
        }
    }
}
