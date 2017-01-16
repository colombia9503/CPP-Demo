package com.plusystem.mobile.cpp;

import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class RegistrarTransformadorActivity extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener{

    FloatingActionButton btnRegTransGuardar;
    EditText txtRegTransNoSerie, txtRegTransKv, txtRegTransPeso, txtRegTransConcentracion, txtRegTransDesc;
    Spinner spMarca;
    ImageView imvFoto1, imvFoto2, imvFoto3;
    List<String> spItems;

    private static int PHOTO_COUNT = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_transformador);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        spItems = new ArrayList<String>();

        spItems.add("Marca del transformador");
        spItems.add("Marca 1");
        spItems.add("Marca 2");
        spItems.add("Marca 3");

        getHolders();

        ArrayAdapter<String> spAdapter = new ArrayAdapter<String>(RegistrarTransformadorActivity.this, R.layout.support_simple_spinner_dropdown_item, spItems);
        spMarca.setAdapter(spAdapter);

        imvFoto1.setOnClickListener(this);
        imvFoto2.setOnClickListener(this);
        imvFoto3.setOnClickListener(this);
        btnRegTransGuardar.setOnClickListener(this);

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
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_registrar_transformador, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.menuRegresar) {
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
            // Handle the camera action
        } else if (id == R.id.nav_logout) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //app methods
    private void getHolders(){
        //Button
        btnRegTransGuardar = (FloatingActionButton) findViewById(R.id.btnRegTransGuardar);

        //EditText
        txtRegTransNoSerie = (EditText) findViewById(R.id.txtRegTransNoSerie);
        txtRegTransKv = (EditText) findViewById(R.id.txtRegTransKv);
        txtRegTransPeso = (EditText) findViewById(R.id.txtRegTransPeso);
        txtRegTransConcentracion = (EditText) findViewById(R.id.txtRegTransConcentracion);
        txtRegTransDesc = (EditText) findViewById(R.id.txtRegTransDesc);

        //Spinner
        spMarca = (Spinner) findViewById(R.id.spMarca);

        //ImageView
        imvFoto1 = (ImageView) findViewById(R.id.imvFoto1);
        imvFoto2 = (ImageView) findViewById(R.id.imvFoto2);
        imvFoto3 = (ImageView) findViewById(R.id.imvFoto3);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imvFoto1:
                Toast.makeText(RegistrarTransformadorActivity.this,"Foto 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imvFoto2:
                Toast.makeText(RegistrarTransformadorActivity.this,"Foto 2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.imvFoto3:
                Toast.makeText(RegistrarTransformadorActivity.this,"Foto 3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnRegTransGuardar:
                Toast.makeText(RegistrarTransformadorActivity.this,"Saved",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
