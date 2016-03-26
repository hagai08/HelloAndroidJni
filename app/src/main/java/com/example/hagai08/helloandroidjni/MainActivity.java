package com.example.hagai08.helloandroidjni;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

 //   Map<Integer,Long> fiboMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


      //  fiboMap = new HashMap<Integer,Long>();


    }

  /**
   * Calculate Fibonacci using java code

    public void calculateFibonacci(View view){

        EditText inputNumber = (EditText) findViewById(R.id.inputNumber);
        int number = Integer.parseInt(inputNumber.getText().toString());

        int result = fibonacci(number);

        ((TextView) findViewById(R.id.textViewResult)).setText(String.valueOf(result));
    }*/


    /**
     * Calculate Fibonacci using C code with JNI
     * @param view
     */
    public void calculateFibonacci(View view){

        EditText inputNumber = (EditText) findViewById(R.id.inputNumber);
        int number = Integer.parseInt(inputNumber.getText().toString());

        String result = fibonacciJni(number);

        ((TextView) findViewById(R.id.textViewResult)).setText(result);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    static {
        System.loadLibrary("hello-android-jni");
    }

    public native String fibonacciJni(int n);


    public static int fibonacci(int n){
        if (n == 0 ){
            return 0;
        }
        else if (n==1){
                return 1;
            }
        else{
            return (fibonacci(n-1) + fibonacci(n-2));
        }
    }





}
