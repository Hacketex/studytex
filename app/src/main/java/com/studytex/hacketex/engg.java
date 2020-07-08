package com.studytex.hacketex;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;

import java.util.List;

public class engg extends AppCompatActivity {

    ListView engg_list_code;
    DatabaseReference databaseReference;
    List<syllabus> B_voc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engg);

        engg_list_code = (ListView)findViewById(R.id.engg_syl_list);
    }
}