package com.example.personslist;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {
    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder personViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
