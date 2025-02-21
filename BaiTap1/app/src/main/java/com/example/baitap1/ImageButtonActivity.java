package com.example.baitap1;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class ImageButtonActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_image_button);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.constraintLayout2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ConstraintLayout bg = (ConstraintLayout)
                findViewById(R.id.constraintLayout2);


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(R.drawable.bg1);
        arrayList.add(R.drawable.bg2);
        arrayList.add(R.drawable.bg3);


        Switch sw = (Switch) findViewById(R.id.switchToggle);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Random random = new Random();
                int vitri = random.nextInt(arrayList.size());
                if(isChecked){ //isChecked = true
                    bg.setBackgroundResource(arrayList.get(vitri));                }
                else{
                    bg.setBackgroundResource(arrayList.get(vitri));                }
            }
        });
    }
}