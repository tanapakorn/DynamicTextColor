package com.family.dynamictextcolor;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends ActionBarActivity {

    RelativeLayout relativeLayout;
    Button button;
    TextView textView;
    int mNumber;
    Random mRandom = new Random();
    int[] ints = {Color.BLUE,Color.GREEN,Color.CYAN,Color.MAGENTA,Color.YELLOW};
    String[] strings = {"Color.BLUE","Color.GREEN","Color.CYAN","Color.MAGENTA","Color.YELLOW"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);
        textView = (TextView)findViewById(R.id.textView);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNumber = mRandom.nextInt(5);
                relativeLayout.setBackgroundColor(ints[mNumber]);
                textView.setText(strings[mNumber]);
            }
        });
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
