package com.plusystem.mobile.cpp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.plusystem.mobile.cpp.Adapters.TransformadoresAdapter;
import com.plusystem.mobile.cpp.POJOS.Transformador;

import java.util.ArrayList;
import java.util.List;

public class TransformadoresActivity extends AppCompatActivity implements View.OnClickListener {

    ListView lisTransformadores;
    FloatingActionButton btnAdd;
    List<Transformador> objects;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transformadores);

        llenarLista();

        lisTransformadores = (ListView) findViewById(R.id.transformadoresList);
        btnAdd = (FloatingActionButton) findViewById(R.id.btnAgregarTransformador);

        TransformadoresAdapter adapter = new TransformadoresAdapter(TransformadoresActivity.this, R.layout.item_transformador, objects);
        lisTransformadores.setAdapter(adapter);
        btnAdd.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_transformadores, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.btnLogOut:
                Toast.makeText(this, "Log out", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnAcercaDe:
                startActivity(new Intent(TransformadoresActivity.this, UsuariosActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAgregarTransformador:
                Toast.makeText(this, "agregar", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void llenarLista(){
        objects = new ArrayList<Transformador>();
        objects.add(new Transformador("Transformador 1", "Transformador de prueba"));
        objects.add(new Transformador("Transformador 2", "Transformador de prueba"));
        objects.add(new Transformador("Transformador 3", "Transformador de prueba"));
        objects.add(new Transformador("Transformador 4", "Transformador de prueba"));
        objects.add(new Transformador("Transformador 5", "Transformador de prueba"));
        objects.add(new Transformador("Transformador 6", "Transformador de prueba"));
        objects.add(new Transformador("Transformador 7", "Transformador de prueba"));
        objects.add(new Transformador("Transformador 8", "Transformador de prueba"));

    }
}
