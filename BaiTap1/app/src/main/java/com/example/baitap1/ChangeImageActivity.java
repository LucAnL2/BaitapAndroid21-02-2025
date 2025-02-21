package com.example.baitap1;

import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class ChangeImageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_change_image);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.constraintLayout1), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ConstraintLayout bg = (ConstraintLayout)
                findViewById(R.id.constraintLayout1);
        bg.setBackgroundColor(Color.BLUE);
        bg.setBackgroundResource(R.drawable.bg2);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(R.drawable.bg1);
        arrayList.add(R.drawable.bg2);
        arrayList.add(R.drawable.bg3);
        Random random = new Random();
        int vitri = random.nextInt(arrayList.size());
        bg.setBackgroundResource(arrayList.get(vitri));
    }
}
