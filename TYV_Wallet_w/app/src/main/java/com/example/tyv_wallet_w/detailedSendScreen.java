package com.example.tyv_wallet_w;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class detailedSendScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_send_screen);

        ImageView leftIcon = findViewById(R.id.id_left_icon);
        TextView titleText = findViewById(R.id.id_text_toolbar);

        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(detailedSendScreen.this, sendScreen.class);
                startActivity(intent);
            }
        });
        titleText.setText("SEND TYV");
    }
}