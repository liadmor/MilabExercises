package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NewYorkAdapter extends RecyclerView.Adapter<NewYorkAdapter.NewYorkViewHolder> {

    String[] data1;
    int images[];
    Context context;

    public NewYorkAdapter(Context ct, String s1[], int img[]){
        context = ct;
        data1 = s1;
        images = img;
    }

    @NonNull
    @Override
    public NewYorkAdapter.NewYorkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_newyork,parent, false);
        return new NewYorkAdapter.NewYorkViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull NewYorkAdapter.NewYorkViewHolder holder, int position) {
        holder.myName.setText(data1[position]);
        holder.myImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class NewYorkViewHolder extends RecyclerView.ViewHolder {

        TextView myName;
        ImageView myImage;

        public NewYorkViewHolder(@NonNull View itemView) {
            super(itemView);
            myName = itemView.findViewById(R.id.name);
            myImage = itemView.findViewById(R.id.imageView);
        }
    }
}