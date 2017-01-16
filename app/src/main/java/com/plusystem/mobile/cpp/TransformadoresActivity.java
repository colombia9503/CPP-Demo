package com.plusystem.mobile.cpp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
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

public class TransformadoresActivity extends AppCompatActivity implements View.OnClickListener,
        NavigationView.OnNavigationItemSelectedListener {

    ListView lisTransformadores;
    FloatingActionButton btnAdd;
    List<Transformador> objects;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transformadores);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        llenarLista();

        lisTransformadores = (ListView) findViewById(R.id.transformadoresList);
        btnAdd = (FloatingActionButton) findViewById(R.id.btnAgregarTransformador);

        TransformadoresAdapter adapter = new TransformadoresAdapter(TransformadoresActivity.this, R.layout.item_transformador, objects);
        lisTransformadores.setAdapter(adapter);
        btnAdd.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.menu_transformadores, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.MenuTransfBuscar) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_about) {
            Toast.makeText(TransformadoresActivity.this, "Acerca de", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_logout) {
            Toast.makeText(TransformadoresActivity.this, "Salir", Toast.LENGTH_SHORT).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAgregarTransformador:
                startActivity(new Intent(TransformadoresActivity.this, RegistrarTransformadorActivity.class));
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
        objects.add(new Transformador("Transformador 5", "Transformador de prueba"));
        objects.add(new Transformador("Transformador 6", "Transformador de prueba"));
        objects.add(new Transformador("Transformador 7", "Transformador de prueba"));
        objects.add(new Transformador("Transformador 8", "Transformador de prueba"));
        objects.add(new Transformador("Transformador 9", "Transformador de prueba"));
        objects.add(new Transformador("Transformador 10", "Transformador de prueba"));
        objects.add(new Transformador("Transformador 11", "Transformador de prueba"));
    }

}
