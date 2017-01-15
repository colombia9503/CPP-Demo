package com.plusystem.mobile.cpp;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.plusystem.mobile.cpp.Adapters.UsuariosAdapter;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnRegTransformador, btnTransformador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnRegTransformador = (Button) findViewById(R.id.btnRegTransformador);
        btnTransformador = (Button) findViewById(R.id.btnTransformador);

        btnTransformador.setOnClickListener(this);
        btnRegTransformador.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnRegTransformador:
                break;
            case R.id.btnTransformador:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.btnLogOut:
                Toast.makeText(this, "Log out", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnAcercaDe:
                Toast.makeText(this, "Acerca de", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
