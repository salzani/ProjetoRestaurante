package com.example.projetorestauranteprime;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetorestauranteprime.adapter.AdapterMesas;
import com.example.projetorestauranteprime.adapter.AdapterPedidos;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPedidos;
    private RecyclerView recyclerViewMesas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerViewPedidos = findViewById(R.id.recyclerViewPedidos);

        // configurar adapater pedidos
        AdapterPedidos adapterPedidos = new AdapterPedidos();

        // configurar recyclerView pedidos
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerViewPedidos.setLayoutManager(layoutManager);
        recyclerViewPedidos.setHasFixedSize(true);
        recyclerViewPedidos.setAdapter(adapterPedidos);

        recyclerViewMesas = findViewById(R.id.recyclerViewMesas);

        // configurar adapater pedidos
        AdapterMesas adapterMesas = new AdapterMesas();

        // configurar recyclerView pedidos
        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);
        recyclerViewMesas.setLayoutManager(layoutManager2);
        recyclerViewMesas.setHasFixedSize(true);
        recyclerViewMesas.setAdapter(adapterMesas);
    }
}