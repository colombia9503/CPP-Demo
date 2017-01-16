package com.plusystem.mobile.cpp.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.plusystem.mobile.cpp.POJOS.Transformador;
import com.plusystem.mobile.cpp.R;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by root on 13/01/17.
 */

public class TransformadoresAdapter extends ArrayAdapter {

    List<Transformador> objects;
    private Context context;
    private int resource;

    public TransformadoresAdapter(Context context, int resource, List<Transformador> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if(convertView == null) {
            holder = new ViewHolder();
            convertView = View.inflate(context, resource, null);
            convertView.setTag(holder);

            holder.txtItemTransfDesc = (TextView) convertView.findViewById(R.id.txtItemTransfDesc);
            holder.txtItemTransfNombre = (TextView) convertView.findViewById(R.id.txtItemTransfNombre);
        } else {
          holder = (ViewHolder) convertView.getTag();
        }

        Transformador object = objects.get(position);
        if (object != null) {
            holder.txtItemTransfDesc.setText(object.getDescripcion());
            holder.txtItemTransfNombre.setText(object.getNombre());
        }
        return convertView;
    }

    public class ViewHolder {
        TextView txtItemTransfNombre, txtItemTransfDesc;
    }
}
