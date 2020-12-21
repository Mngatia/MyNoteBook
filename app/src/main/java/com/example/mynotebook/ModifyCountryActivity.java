package com.example.mynotebook;

// makes, modify, edits notes

import android.app.Activity;
import android.os.Bundle;
import android.view.View;


public class ModifyCountryActivity extends Activity implements View.OnClickListener {

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_country);
    }
}
