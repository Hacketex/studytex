package com.studytex.hacketex;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.google.android.gms.common.api.internal.BackgroundDetector.initialize;

public class notes extends AppCompatActivity {

    private TextView bsc_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notes);
        com.google.firebase.FirebaseApp.initializeApp(this);
        Object _savedInstanceState = null;
        initialize((Application) _savedInstanceState);
        initializeLogic();
        bsc_text = findViewById(R.id.bsc_text);
        bsc_text.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
            bsc_branch();
            }
        });
    }

    private void initializeLogic() {
    }

    public void bsc_branch() {
        Intent intent = new Intent(this, bsc_branch.class);
        startActivity(intent);
    }
}