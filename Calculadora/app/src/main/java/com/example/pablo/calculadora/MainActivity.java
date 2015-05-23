package com.example.pablo.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void cambiar(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        float temp = Float.parseFloat(num1.getText().toString());
        num1.setText(num2.getText().toString());
        num2.setText(String.valueOf(temp));
    }

    public void sumar(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        EditText resul = ( EditText) findViewById(R.id.result);
        try {
            float num01 = Float.parseFloat(num1.getText().toString());
            float num02 = Float.parseFloat(num2.getText().toString());
            float resul00 = num01+num02;
            resul.setText(String.valueOf(resul00)); ;
        }catch (Exception e){}

    }

    public void restar(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        EditText resul = ( EditText) findViewById(R.id.result);
        try {
            float num01 = Float.parseFloat(num1.getText().toString());
            float num02 = Float.parseFloat(num2.getText().toString());
            float resul00 = num01-num02;
            resul.setText(String.valueOf(resul00)); ;
        }catch (Exception e){}

    }

    public void multiplicar(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        EditText resul = ( EditText) findViewById(R.id.result);
        try {
            float num01 = Float.parseFloat(num1.getText().toString());
            float num02 = Float.parseFloat(num2.getText().toString());
            float resul00 = num01*num02;
            resul.setText(String.valueOf(resul00)); ;
        }catch (Exception e){}

    }

    public void dividir(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        EditText resul = ( EditText) findViewById(R.id.result);
        try {
            float num01 = Float.parseFloat(num1.getText().toString());
            float num02 = Float.parseFloat(num2.getText().toString());
            float resul00 = num01/num02;
            resul.setText(String.valueOf(resul00)); ;
        }catch (Exception e){}

    }


}
