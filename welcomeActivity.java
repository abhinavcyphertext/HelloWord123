package com.example.admin.addingtextbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class welcomeActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        String selectedtweet;
        Bundle extras=getIntent().getExtras();
        selectedtweet=extras.getString("sendtweet");
        textView=(TextView)findViewById(R.id.newtext);
       textView.setText(selectedtweet);
    }
}
