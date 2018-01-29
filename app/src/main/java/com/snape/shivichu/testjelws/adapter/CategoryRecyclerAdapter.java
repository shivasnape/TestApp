package com.snape.shivichu.testjelws.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.snape.shivichu.testjelws.R;
import com.snape.shivichu.testjelws.model.CategoryDataList;

import java.util.List;

/**
 * Created by Shivichu on 29-01-2018.
 */

public class CategoryRecyclerAdapter extends RecyclerView.Adapter<CategoryRecyclerAdapter.MyViewHolder> {

    private List<CategoryDataList> list;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tProductName;

        public MyViewHolder(View view) {
            super(view);

            tProductName = (TextView) view.findViewById(R.id.recycler_product_name);
        }

    }

    public CategoryRecyclerAdapter(Context context, List<CategoryDataList> dataList) {
        this.context = context;
        this.list = dataList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_category_layout, parent, false);
        context = parent.getContext();
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        CategoryDataList data = list.get(position);

        holder.tProductName.setText(data.getsName());

    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}