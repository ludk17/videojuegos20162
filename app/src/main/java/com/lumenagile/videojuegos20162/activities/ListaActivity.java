package com.lumenagile.videojuegos20162.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.lumenagile.videojuegos20162.R;
import com.lumenagile.videojuegos20162.adapters.UserAdapter;
import com.lumenagile.videojuegos20162.models.User;

import java.util.LinkedList;
import java.util.List;

public class ListaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        List<User> users = new LinkedList<>();
        users.add(new User(1, "Luis Mendoza", "9999999999"));
        users.add(new User(2, "Francisco Bonaparte", "9999999999"));

        ListView lista = (ListView)findViewById(R.id.lista_personas);
        UserAdapter adapter = new UserAdapter(ListaActivity.this, users);
        lista.setAdapter(adapter);

    }
}
