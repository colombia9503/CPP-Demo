package com.plusystem.mobile.cpp.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import com.plusystem.mobile.cpp.POJOS.Usuario;
import com.plusystem.mobile.cpp.R;
/**
 * Created by santiago u.on 12/01/17.
 */

public class UsuariosAdapter extends ArrayAdapter<Usuario> {
    private Context context;
    private int resource;
    List<Usuario> objects;

    private static final String URL_BASE = "http://192.168.0.109:8081";
    private static final String URL_JSON = "/usuarios";
    private static final String TAG="UsuariosAdapter";

    public UsuariosAdapter (Context context, int resource, List<Usuario> objects){
        super(context, resource);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }


    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null) {
            holder = new ViewHolder();
            convertView = View.inflate(context, resource, null);

            holder.txtUICuenta = (TextView) convertView.findViewById(R.id.txtUICuenta);
            holder.txtUINombre = (TextView) convertView.findViewById(R.id.txtIUNombre);
            holder.txtUIRol = (TextView) convertView.findViewById(R.id.txtIURol);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Usuario user = objects.get(position);
        if(user != null) {
            holder.txtUICuenta.setText("Cuenta: " + user.getUsuario());
            holder.txtUINombre.setText("Nombre: " + user.getNombre());
            holder.txtUIRol.setText("Rol: " + user.getRol());
        }

        return convertView;
    }

    private class ViewHolder {
        TextView txtUICuenta, txtUINombre, txtUIRol;
    }


}
