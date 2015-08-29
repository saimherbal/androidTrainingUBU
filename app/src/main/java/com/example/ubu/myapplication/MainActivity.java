package com.example.ubu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btnAdd;
    RadioGroup radG;
    RadioButton radB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showText();
    }

    private void showText() {

        btnAdd = (Button) findViewById(R.id.btnAdd);
        radG = (RadioGroup) findViewById(R.id.radG1);



       btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectID =  radG.getCheckedRadioButtonId();

                radB = (RadioButton) findViewById(selectID);
                Toast.makeText(getApplicationContext(),"" + radB.getText().toString(),Toast.LENGTH_LONG).show();

            }
        });
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
}
