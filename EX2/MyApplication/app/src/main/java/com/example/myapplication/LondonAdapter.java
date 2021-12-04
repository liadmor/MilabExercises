package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LondonAdapter extends RecyclerView.Adapter<LondonAdapter.LondonViewHolder> {

    String[] data1;
    int images[];
    Context context;

    public LondonAdapter(Context ct, String s1[], int img[]){
        context = ct;
        data1 = s1;
        images = img;
    }

    @NonNull
    @Override
    public LondonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row_london,parent, false);
        return new LondonViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull LondonViewHolder holder, int position) {
        holder.myName.setText(data1[position]);
        holder.myImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class LondonViewHolder extends RecyclerView.ViewHolder {

        TextView myName;
        ImageView myImage;

        public LondonViewHolder(@NonNull View itemView) {
            super(itemView);
            myName = itemView.findViewById(R.id.name);
            myImage = itemView.findViewById(R.id.imageView);
        }
    }
}
