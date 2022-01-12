package com.example.tyv_wallet_w;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class sendScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_screen);

        ImageView leftIcon = findViewById(R.id.id_left_icon);
        TextView titleText = findViewById(R.id.id_text_toolbar);
        Button detailedSendButton;
        detailedSendButton = (Button) findViewById(R.id.id_button_sendToW);

        detailedSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_detailedSend = new Intent(sendScreen.this, detailedSendScreen.class);
                startActivity(intent_detailedSend);
            }
        });
        leftIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sendScreen.this, MainActivity.class);
                startActivity(intent);
            }
        });
        titleText.setText("SEND TYV");
    }
}