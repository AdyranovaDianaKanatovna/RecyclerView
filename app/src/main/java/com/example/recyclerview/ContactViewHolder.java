package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private final TextView Contacts;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        Contacts = itemView.findViewById(R.id.contacts);

    }

    public void bind(String contacts) {
        Contacts.setText(contacts);
    }
}
