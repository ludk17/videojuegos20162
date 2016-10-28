package com.lumenagile.videojuegos20162.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.lumenagile.videojuegos20162.R;
import com.lumenagile.videojuegos20162.models.User;

import java.util.List;

public class UserAdapter extends BaseAdapter {

    private List<User> elements;
    private Activity activity;

    public UserAdapter(Activity activity, List<User> elements) {
        this.activity = activity;
        this.elements = elements;
    }

    @Override
    public int getCount() {
        return elements.size();
    }

    @Override
    public User getItem(int position) {
        return elements.get(position);
    }

    @Override
    public long getItemId(int position) {
        return elements.get(position).id;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        // Para poder setear al adapter una view (layout item)
        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.item_user, viewGroup);

        TextView tvNombre = (TextView)view.findViewById(R.id.tvNombre);
        tvNombre.setText("Cualquier cosa");

        return view;
    }

}
