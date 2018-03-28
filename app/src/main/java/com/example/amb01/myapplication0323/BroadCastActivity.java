package com.example.amb01.myapplication0323;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BroadCastActivity extends AppCompatActivity {

    private BroadcastReceiver reciever;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("INFO", "onCreate");
        setContentView(R.layout.activity_broad_cast);

        Button button = findViewById(R.id.my_broadcast_activity_button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BroadCastActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        reciever = new MyBroadCastReciever();
        IntentFilter filter = new IntentFilter();
        filter.addAction(Intent.ACTION_TIME_TICK);
        //filter.addAction(Intent.ACTION_TIME_CHANGED);
        registerReceiver(reciever,filter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(reciever);
    }

    public class MyBroadCastReciever extends BroadcastReceiver {


        @Override
        public void onReceive(Context context, Intent intent) {

            //複数のIntentを受信する場合
            Log.i("INFO", "action : " + intent.getAction());


        }



    }
}
