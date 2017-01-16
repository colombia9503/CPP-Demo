package com.plusystem.mobile.cpp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.loopj.android.http.JsonHttpResponseHandler;
import com.plusystem.mobile.cpp.API.RestClient;
import com.plusystem.mobile.cpp.Adapters.UsuariosAdapter;
import com.plusystem.mobile.cpp.POJOS.Usuario;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.message.BasicHeader;

public class UsuariosActivity extends AppCompatActivity {

    ListView listUsuarios;
    List<Usuario> usuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios);
        listUsuarios = (ListView) findViewById(R.id.listUsuarios);
        getUsuarios();
    }

    private void getUsuarios() {
        List<Header> headers = new ArrayList<Header>();
        headers.add(new BasicHeader("Accept", "application/json"));
        RestClient.get(UsuariosActivity.this, "api/usuarios", headers.toArray(new Header[headers.size()]),
                null, new JsonHttpResponseHandler() {
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                        usuarios = new ArrayList<Usuario>();
                        for (int i = 1; i < response.length(); i++) {
                            try {
                                usuarios.add(new Usuario(response.getJSONObject(i)));
                            } catch (JSONException ex) {
                                ex.printStackTrace();
                            }
                        }
                        UsuariosAdapter adapter = new UsuariosAdapter(UsuariosActivity.this, R.layout.item_usuario, usuarios);
                        listUsuarios.setAdapter(adapter);
                    }

                    @Override
                    public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                        Toast.makeText(UsuariosActivity.this, "Problemas de conexión con el API", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
