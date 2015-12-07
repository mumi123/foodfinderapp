package foodfinder.hslu.ch.foodfinderapp;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import foodfinder.hslu.ch.foodfinderapp.database.DatabaseHandler;
import foodfinder.hslu.ch.foodfinderapp.settings.Settings;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        System.out.println("Holla!");

        DatabaseHandler myDBHandler = new DatabaseHandler(this);

        SQLiteDatabase db = myDBHandler.getWritableDatabase();
        myDBHandler.getWritableDatabase();

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
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
            //Intent myIntent = new Intent(MainActivity.this, Settings.class);
            //myIntent.putExtra("key", value); //Optional parameters
            //MainActivity.this.startActivity(myIntent);
            Intent intent = new Intent(getApplicationContext(), Settings.class);
            startActivity(intent);
        }else if(id == R.id.action_about) {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);

            //main
            builder.setMessage(R.string.dialog_message)
                    .setTitle(R.string.dialog_title);

            AlertDialog dialog = builder.create();
            dialog.show();
        }

        return super.onOptionsItemSelected(item);
    }
}
