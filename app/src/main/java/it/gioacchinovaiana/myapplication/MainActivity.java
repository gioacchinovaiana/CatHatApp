package it.gioacchinovaiana.myapplication;

import android.content.Context;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private Button button_on_the_cat;
    private Button button_thing_1;
    private Button button_thing_2;
    private Button button_thingamajigger;
    private Button button_sally;
    private Button button_nick;
    private Button button_seuss;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_on_the_cat = (Button) findViewById(R.id.button_the_cat);
        button_thing_1 = (Button) findViewById(R.id.button_thing_1);
        button_thing_2 = (Button) findViewById(R.id.button_thing_2);
        button_thingamajigger = (Button) findViewById(R.id.button_thingamajigger);
        button_sally = (Button) findViewById(R.id.button_sally);
        button_nick = (Button) findViewById(R.id.button_nick);
        button_seuss = (Button) findViewById(R.id.button_seuss);


        button_on_the_cat.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence toast_text = getString(R.string.on_the_cat);
                viewToast(toast_text);
            }
        });
        button_thing_1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence toast_text = getString(R.string.thing_1);
                viewToast(toast_text);
            }
        });
        button_thing_2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence toast_text = getString(R.string.thing_2);
                viewToast(toast_text);
            }
        });
        button_thingamajigger.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence toast_text = getString(R.string.thingamajigger);
                viewToast(toast_text);
            }
        });
        button_sally.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence toast_text = getString(R.string.sally);
                viewToast(toast_text);
            }
        });
        button_nick.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence toast_text = getString(R.string.nick);
                viewToast(toast_text);
            }
        });
        button_seuss.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence toast_text = getString(R.string.dr_seuss);
                viewToast(toast_text);
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

    public void viewToast(CharSequence toast_text) {
        Context context = getApplicationContext();
        //CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;
    
        Toast toast = Toast.makeText(context, toast_text, duration);
        toast.show();
    }
}
