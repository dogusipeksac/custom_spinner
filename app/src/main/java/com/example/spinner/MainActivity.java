package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    private ArrayList<Badge> badgeArrayList;
    private BadgeAdapter badgeAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        initList();
        badgeAdapter=new BadgeAdapter(this,badgeArrayList);
        spinner.setAdapter(badgeAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Badge badgeClickedItem=(Badge) parent.getItemAtPosition(position);
                String clickedBadgeName=badgeClickedItem.getTitle();
                Toast.makeText(MainActivity.this, clickedBadgeName+"selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void initList() {
        badgeArrayList=new ArrayList<>();
        badgeArrayList.add(new Badge("Sorun Çözücü",R.drawable.image6));
        badgeArrayList.add(new Badge("Lider",R.drawable.image7));
        badgeArrayList.add(new Badge("Çözücü",R.drawable.image8));
        badgeArrayList.add(new Badge("Sorun",R.drawable.image9));
    }
}