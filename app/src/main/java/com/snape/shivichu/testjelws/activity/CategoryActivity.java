package com.snape.shivichu.testjelws.activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import com.snape.shivichu.testjelws.R;
import com.snape.shivichu.testjelws.adapter.CategoryRecyclerAdapter;
import com.snape.shivichu.testjelws.model.CategoryDataList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shivichu on 28-01-2018.
 */

public class CategoryActivity extends AppCompatActivity {

    private Activity activity;
    private Context context;

    private List<CategoryDataList> categoryDataList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private CategoryRecyclerAdapter mCategoryRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_page);

        activity = this;
        context = getApplicationContext();

        Window window = activity.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)

        {
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(ContextCompat.getColor(activity, R.color.window_bar));
        }

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
        {
            //setting action bar with custom color defined in colors
            actionBar.setDisplayHomeAsUpEnabled(false);
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(context, R.color.action_bar)));
            actionBar.setTitle("Select Product");
        }


        mRecyclerView = (RecyclerView) findViewById(R.id.category_recycler_view);


        mCategoryRecyclerAdapter = new CategoryRecyclerAdapter(getApplicationContext(), categoryDataList);
        int numberOfColumns = 2;
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        mRecyclerView.setAdapter(mCategoryRecyclerAdapter);


        initView();

    }

    private void initView() {

        for(int i=0;i<10;i++)
        {

            CategoryDataList data = new CategoryDataList();

            data.setsName("Product "+String.valueOf(i));

            categoryDataList.add(data);

        }

        mCategoryRecyclerAdapter.notifyDataSetChanged();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
