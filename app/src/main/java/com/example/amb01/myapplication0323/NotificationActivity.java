package com.example.amb01.myapplication0323;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class NotificationActivity extends AppCompatActivity implements View.OnClickListener{

    private InputMethodManager inputMethodManager;
    private LinearLayout layout;
    private int notificationId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        Button button = findViewById(R.id.my_notification_button1);
        button.setOnClickListener(this);

        EditText editText = findViewById(R.id.my_notification_editText);
        layout = findViewById(R.id.my_notification_layout);

        inputMethodManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);

        Button btnSet = findViewById(R.id.my_notification_button1);
        Button btnDisolve = findViewById(R.id.my_notification_button2);





    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.my_notification_button1 :
                Intent intent = new Intent(NotificationActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }

    }
}
