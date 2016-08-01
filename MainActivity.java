package com.example.admin.addingtextbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    ImageButton button;
  //  private LinearLayout Llayout;
   // private int id = 0;
    //create array of edit text
//    private List<EditText> editTextslist = new ArrayList<EditText>();
  String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(ImageButton)findViewById(R.id.imageButton) ;
        editText=(EditText)findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentlogin = new Intent(MainActivity.this, SettingActivity.class);
                intentlogin.putExtra("sendtweet",editText.getText().toString());
                startActivity(intentlogin);

            }
        });

    }
}
























        /*
        Llayout = new LinearLayout(this);
        Llayout.setOrientation(LinearLayout.VERTICAL);

        Button addButton = new Button(this);
        addButton.setText("+");

       // ImageButton addButton = new ImageButton(this); //<-- this is the activity
//        addButton.setImageResource(R.drawable.add);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if(id<5)
                {
                    addEditText();
                }
            else {
                    Toast.makeText(getApplicationContext(),"you can not make more then five entry",Toast.LENGTH_LONG).show();
                }
            }
        });

       Button submit = new Button(this);
        submit.setText("Go");
       // ImageButton submit = new ImageButton(this); //<-- this is the activity
       // submit.setImageResource(R.drawable.tweet);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                StringBuilder stringBuilder = new StringBuilder();
                for (EditText editText : editTextslist) {

                    //stringBuilder.append(editText.getText().toString());
                    String result= editText.getText().toString();

                    Intent intentlogin = new Intent(MainActivity.this, welcomeActivity.class);
                    intentlogin.putExtra("sendtweet",result);
                    startActivity(intentlogin);
                }
            }
        });

        Llayout.addView(addButton);
        Llayout.addView(submit);
        setContentView(Llayout);
    }

    private void addEditText() {

        LinearLayout editTextLayout = new LinearLayout(this);
        editTextLayout.setOrientation(LinearLayout.VERTICAL);
        Llayout.addView(editTextLayout);

        EditText editText1 = new EditText(this);
        editText1.setHint("please enter tweet for search");
        editText1.setId(id++);
        editTextLayout.addView(editText1);
        editTextslist.add(editText1);
*/

