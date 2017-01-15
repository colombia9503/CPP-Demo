package com.plusystem.mobile.cpp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.plusystem.mobile.cpp.Adapters.UsuariosAdapter;
import com.plusystem.mobile.cpp.POJOS.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuariosActivity extends AppCompatActivity {

    ListView listUsuarios;
    List<Usuario> usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios);

        usuarios = new ArrayList<Usuario>();

        listUsuarios = (ListView) findViewById(R.id.listUsuarios);
        UsuariosAdapter adapter = new UsuariosAdapter(UsuariosActivity.this, R.layout.item_usuario, usuarios);
        listUsuarios.setAdapter(adapter);
    }
}
