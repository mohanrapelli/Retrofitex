package com.example.retrofitex.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitex.Model.ResultModel;
import com.example.retrofitex.R;

import java.util.ArrayList;


public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {

    ArrayList<ResultModel> resultList;

    public CountryAdapter(ArrayList<ResultModel> resultList) {
        this.resultList = resultList;
    }

    @NonNull
    @Override
    public CountryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryAdapter.ViewHolder holder, int position) {

        ResultModel resultModel = resultList.get(position);
        holder.textView1.setText(resultModel.getCode());
        holder.textView.setText(resultModel.getName());
        holder.textView2.setText(resultModel.getRegion());

    }

    @Override
    public int getItemCount() {
        return resultList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{


        TextView textView,textView1,textView2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView= itemView.findViewById(R.id.name1);
            textView1= itemView.findViewById(R.id.name2);
            textView2=itemView.findViewById(R.id.name3);

        }
    }
}
