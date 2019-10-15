package com.spp.bundleandserilizationdemoapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSend = (Button) findViewById(R.id.buttonId);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Employee emp=new Employee(1,"username");
//                Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
//                mIntent.putExtra("empObj", emp);
//                startActivity(mIntent);

                Student stud = new Student(10,"Sachin");


                Intent mIntent = new Intent(MainActivity.this,SecondActivity.class);
                mIntent.putExtra("studObj",stud);
                startActivity(mIntent);


            }
        });


    }
}



//    ArrayList<String> addressList=new ArrayList<String>();
//               addressList.add("Address1");
//                           addressList.add("Address2");
//                         MyObjects mObjects = new MyObjects("name",20,addressList);
//
//
//
//                         //Passing MyOjects instance
//                         Intent mIntent = new Intent(MainActivity.this, SecondActivity.class);
//        mIntent.putExtras("UniqueKey", mObjects);
//        startActivity(mIntent);