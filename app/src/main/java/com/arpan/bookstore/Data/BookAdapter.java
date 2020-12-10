package com.arpan.bookstore.Data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.arpan.bookstore.Models.Book;
import com.arpan.bookstore.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.ViewHolder> {

    private Context context;
    private List<Book> bookList;

    public BookAdapter(Context context, List<Book> bookList) {
        this.context = context;
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_cards, parent, false);
        return new ViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Book book = bookList.get(position);

        String imageLink = book.getImage();

        holder.bookName.setText(book.getBookName());
        holder.bookDescription.setText(book.getBookDescription());

        if(!imageLink.isEmpty()) {
            Picasso.get()
                    .load(imageLink)
                    .placeholder(android.R.drawable.ic_input_add)
                    .resize(55, 70)
                    .into(holder.bookImage);
        }
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView bookName;
        TextView bookDescription;
        ImageView bookImage;

        public ViewHolder(@NonNull View itemView, Context ctx) {
            super(itemView);

            bookImage = itemView.findViewById(R.id.bookImageId);
            bookName = itemView.findViewById(R.id.bookNameId);
            bookDescription = itemView.findViewById(R.id.bookDescriptionId);
        }
    }
}
