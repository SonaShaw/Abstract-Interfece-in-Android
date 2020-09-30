package com.example.adminsonapc.app_27_polymorphism_abstract_interface;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView txtAnimal = (TextView) findViewById(R.id.txtAnimal);
        TextView txtLion = (TextView) findViewById(R.id.txtLion);
        TextView txtPolymorphism = (TextView) findViewById(R.id.txtPolymorphism);
        TextView txtCat = (TextView) findViewById(R.id.txtCat);


        Animal animal = new Animal("Cheetah","yellow",100,500);
        Lion lion = new Lion("sheru","white",200,400,
                            true,300);

        txtAnimal.setText(animal.toString());
        txtLion.setText(lion.toString());

        Animal myAnimal = lion;
        txtPolymorphism.setText(myAnimal.toString());

        Cat myCat = new Cat("pussy","pink",30,50);
        txtCat.setText(myCat.toString());
        myAnimal = myCat;
        txtCat.setText(myAnimal.toString());

    }
}
