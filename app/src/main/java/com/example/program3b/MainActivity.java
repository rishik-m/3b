package com.example.program3b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText myphone;
    Button call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        call = findViewById(R.id.call);
        myphone = findViewById(R.id.myphone);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri myuri = Uri.parse("tel: " + myphone.getText().toString());
                Intent it = new Intent(Intent.ACTION_DIAL, myuri);
                startActivity(it);
            }
        });
    }


}
