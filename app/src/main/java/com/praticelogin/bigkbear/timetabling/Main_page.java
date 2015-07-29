package com.praticelogin.bigkbear.timetabling;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by BigKBear on 7/28/15.
 */
public class Main_page extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        //fetch the string
        String username = getIntent().getStringExtra("Username");

        //set the text field to that value
        TextView tv = (TextView)findViewById(R.id.TVusername);
        tv.setText(username);
    }
}
