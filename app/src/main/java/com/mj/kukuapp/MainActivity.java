package com.mj.kukuapp;


import android.app.Activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



//import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    Button btTrade, btLearn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btLearn = findViewById(R.id.btLearnFr);
        btTrade = findViewById(R.id.btTrade);


        btLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                replaceFragment(new BuyFragment());
                
            }
        });

        btTrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new LearnFragment());

            }
        });

            }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getParent().getFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();
        }


    }



