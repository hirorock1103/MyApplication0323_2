package com.example.amb01.myapplication0323;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

public class PickUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_up);

        Button button = findViewById(R.id.my_pickup_activity_button_back_to_main_activity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PickUpActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        String[] list = {"あいうえお","kakikukeko","sasisu","aaaaa",
                "あいうえお","kakikukeko","sasisu","aaaaa",
                "あいうえお","kakikukeko","sasisu","aaaaa",};


        RecyclerView recyclerView = findViewById(R.id.my_pickup_activity_recycle_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //adapter
        RecyclerView.Adapter adapter = new MyAdapter(list);
        recyclerView.setAdapter(adapter);



    }
}
