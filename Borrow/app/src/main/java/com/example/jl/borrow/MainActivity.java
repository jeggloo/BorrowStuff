package com.example.jl.borrow;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.app.TabActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    TabHost tabHost;
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

        //tabHost = getTabHost();
        tabHost = null;

        TabHost.TabSpec ts1 = tabHost.newTabSpec("page1");
        ts1.setIndicator("Photo1");
        ts1.setContent(new Intent(this, myItems.class));
        tabHost.addTab(ts1);

        TabHost.TabSpec ts2 = tabHost.newTabSpec("page2");
        ts2.setIndicator("Photo2");
        ts2.setContent(new Intent(this, Borrow.class));
        tabHost.addTab(ts2);

        TabHost.TabSpec ts3 = tabHost.newTabSpec("page3");
        ts3.setIndicator("Photo3");
        ts3.setContent(new Intent(this, Bids.class));
        tabHost.addTab(ts3);
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
