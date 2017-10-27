package com.example.a301.myapplication;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.a301.myapplication.Data.DataManager_Notify;
import com.example.a301.myapplication.Data.DataManager_Student;
import com.example.a301.myapplication.Model.Model_Lecture;
import com.example.a301.myapplication.Model.Model_Notify;
import com.example.a301.myapplication.Model.Model_Student;

import java.util.ArrayList;


public class BaseActivity extends AppCompatActivity {

    public static String currentStudent;
    TextView textView1;
    TextView textView2;
    public static ArrayList<Model_Lecture> lectureList;
    public static ArrayList<Model_Student> studentList;
    public static ArrayList<Model_Notify> notifyList;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        lectureList = new ArrayList<>();
        studentList= new ArrayList<>();
        notifyList=new ArrayList<>();



        DataManager_Notify dmN = new DataManager_Notify();
        dmN.loadData();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                DataManager_Student dmS = new DataManager_Student();
                dmS.loadData(BaseActivity.this);


            }
        }, 2000);

    }

}
