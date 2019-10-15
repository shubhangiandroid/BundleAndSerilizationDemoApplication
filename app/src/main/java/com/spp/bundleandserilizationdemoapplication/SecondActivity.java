package com.spp.bundleandserilizationdemoapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//        Intent mIntent = getIntent();
//        Employee obj = (Employee)    mIntent.getParcelableExtra("empObj");
//        Log.i("Name",obj.getName());

//        //Getting MyObjects instance
//        Intent mIntent = getIntent();
//        Student obj = (Student) mIntent.getSerializableExtra("studObj");
//        Log.i("Name",obj.getName());
//    }

//
//    //Getting MyObjects instance
//    Intent mIntent = getIntent();
//    MyObjects mObjects = (MyObjects) mIntent.getParcelableExtra("UniqueKey");
//   Log.i ("Name",mObjects.getName());
   }}