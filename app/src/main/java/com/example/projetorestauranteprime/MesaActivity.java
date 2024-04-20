package com.example.projetorestauranteprime;

import static java.lang.Integer.parseInt;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MesaActivity extends AppCompatActivity {
    ArrayList<Mesa> mesas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mesa);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RecyclerView recyclerView = findViewById(R.id.tableRecyclerView);

        setUpMesas();

        MesaAdapter adapter = new MesaAdapter(this, mesas);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpMesas(){
        String[] idMesas = getResources().getStringArray(R.array.mesas_id);
        String[] peopleMesas = getResources().getStringArray(R.array.mesas_people);
        String[] ordersPlaced = getResources().getStringArray(R.array.mesas_orders_placed);
        String[] readyOrders = getResources().getStringArray(R.array.mesas_ready_orders);

        for(int i = 0; i < idMesas.length; i++){
            mesas.add(new Mesa(parseInt(idMesas[i]), parseInt(peopleMesas[i]
            ), parseInt(ordersPlaced[i]), parseInt(readyOrders[i])));
        }
    }
}