package com.example.homework6;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FunctionAdapter extends RecyclerView.Adapter<FunctionAdapter.ViewHolder> {
    private List<Function> FunctionList;
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView functionImage;
        TextView functionName;

        public ViewHolder(View view){
            super(view);
            functionImage=(ImageView) view.findViewById(R.id.function_image);
            functionName=(TextView) view.findViewById(R.id.function_name);
        }
    }
    public FunctionAdapter(List<Function> functionList){
        FunctionList=functionList;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext())
                .inflate(R.layout.function_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Function function=FunctionList.get(position);
        holder.functionImage.setImageResource(function.getImageId());
        holder.functionName.setText(function.getName());
    }

    @Override
    public int getItemCount() {
        return FunctionList.size();
    }
}
