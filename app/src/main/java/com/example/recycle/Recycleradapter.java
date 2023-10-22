package com.example.recycle;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;

public class Recycleradapter extends RecyclerView.Adapter<Recycleradapter.ViewHolder> {
    private Context context;
    private String[] data;

    public Recycleradapter(Context context, String[] data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String item = data[position];
        holder.l.setText(item);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView l;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            l = itemView.findViewById(R.id.textView);
        }
    }
}
