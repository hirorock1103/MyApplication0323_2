package com.example.amb01.myapplication0323;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class NoDinnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_dinner);

        Button button = findViewById(R.id.my_no_dinner_button_send);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RadioGroup radioGroup = findViewById(R.id.my_radio_group_place);
                int checkId = radioGroup.getCheckedRadioButtonId();
                String value = ((RadioButton)findViewById(checkId)).getText().toString();

                EditText editText = findViewById(R.id.my_no_dinner_edit_title);
                String title = editText.getText().toString();

                //strings.xml
                Resources resources = getResources();
                Uri uri = Uri.parse("mailto:" + resources.getString(R.string.mail_to).toString());

                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);

                intent.putExtra(Intent.EXTRA_SUBJECT,title);
                intent.putExtra(Intent.EXTRA_TEXT,value + "が食べたい");

                startActivity(intent);


            }
        });







    }
}
