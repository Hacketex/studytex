package com.studytex.hacketex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

//books courses java files renamed
public class switchtry extends AppCompatActivity {


    private RecyclerView recyclerView;
    private list_post_booksAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.books_courses);
        recyclerView = findViewById(R.id.recyclerBook_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<list_post_books> options =
                new FirebaseRecyclerOptions.Builder<list_post_books>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("books"), list_post_books.class)
                        .build();

        adapter = new list_post_booksAdapter(options);
        recyclerView.setAdapter(adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}