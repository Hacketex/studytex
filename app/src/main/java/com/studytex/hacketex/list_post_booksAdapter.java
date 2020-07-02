package com.studytex.hacketex;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class list_post_booksAdapter extends FirebaseRecyclerAdapter<list_post_books, list_post_booksAdapter.courses_list_holder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public list_post_booksAdapter(@NonNull FirebaseRecyclerOptions<list_post_books> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull courses_list_holder holder, int position, @NonNull list_post_books model) {

        holder.CSname.setText(model.getTitle());
        holder.details.setText(model.getDescripition());
    }

    @NonNull
    @Override
    public courses_list_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bacholer_list, parent, false);

        return new courses_list_holder(view);
    }

    class courses_list_holder extends RecyclerView.ViewHolder{

        TextView CSname,details;

        public courses_list_holder(@NonNull View itemView) {
            super(itemView);
            CSname = itemView.findViewById(R.id.CSname);
        }
    }
}
