package com.example.tyv_wallet_w;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button sendButton, receiveButton;
    ImageView three;
    DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendButton = (Button)findViewById(R.id.id_button_send);
        receiveButton = (Button)findViewById(R.id.id_button_receive);
        three = (ImageView)findViewById(R.id.id_three_base);

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "dfad", Toast.LENGTH_SHORT).show();

                drawer = (DrawerLayout) findViewById(R.id.navigation_main);
                drawer.openDrawer(GravityCompat.START);
            }
        });

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MainActivity.this, sendScreen.class);
                startActivity(intent);
            }
        });
        receiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_receive = new Intent(MainActivity.this, receiveScreen.class);
                startActivity(intent_receive);
            }
        });
    }
}