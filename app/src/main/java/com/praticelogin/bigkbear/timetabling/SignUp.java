package com.praticelogin.bigkbear.timetabling;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by BigKBear on 7/28/15.
 */
public class SignUp extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_teacher);
    }

    public void onSignUpClick(View v)
    {
        if(v.getId() == R.id.Bsignupbutton)
        {
            EditText firstname = (EditText)findViewById(R.id.TFfirstname);
            EditText middlename = (EditText)findViewById(R.id.TFmiddlename);
            EditText lastname = (EditText)findViewById(R.id.TFlastname);
            EditText address = (EditText)findViewById(R.id.TFaddress);
            EditText housenumber = (EditText)findViewById(R.id.TFhousenumber);
            EditText cellnumber = (EditText)findViewById(R.id.TFcellnumber);
            EditText gender = (EditText)findViewById(R.id.TFgender);
            EditText role = (EditText)findViewById(R.id.TFrole);
            EditText username = (EditText)findViewById(R.id.TFusername);
            EditText pass1 = (EditText)findViewById(R.id.TFpass1);
            EditText pass2 = (EditText)findViewById(R.id.TFpass2);

            String firstnamestr = firstname.getText().toString();
            String middlenamestr = middlename.getText().toString();
            String lastnamestr = lastname.getText().toString();
            String addressstr = address.getText().toString();
            String housenumberstr = housenumber.getText().toString();
            String cellnumberstr = cellnumber.getText().toString();
            String genderstr = gender.getText().toString();
            String rolestr = role.getText().toString();
            String pass1str = pass1.getText().toString();
            String pass2str = pass2.getText().toString();

            if(!pass1str.equals(pass2str))
            {
                //popup message
                Toast pass = Toast.makeText(SignUp.this, "Passwords do not match!", Toast.LENGTH_SHORT);
                pass.show();
            }
        }
    }
}
