package com.studytex.hacketex;

import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.storage.StorageReference;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class list_post_books {
    String title;
    String descripition;

    public list_post_books() {
    }

    @Override
    public String toString() {
        return "list_post_books{" +
                "title='" + title + '\'' +
                ", descripition='" + descripition + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripition() {
        return descripition;
    }

    public void setDescripition(String descripition) {
        this.descripition = descripition;
    }
}
