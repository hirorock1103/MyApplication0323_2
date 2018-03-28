package com.example.amb01.myapplication0323;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by amb01 on 2018/03/24.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    View base;
    TextView text;

    public MyViewHolder(View itemView) {
        super(itemView);
        base = itemView;
        text = itemView.findViewById(R.id.my_card_row_text);
    }
}
