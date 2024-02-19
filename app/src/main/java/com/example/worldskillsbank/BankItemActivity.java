package com.example.worldskillsbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class BankItemActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_bank);

        ListView listView = (ListView) this.findViewById(R.id.listViews2);

        ArrayList<DataBanks> list2 = new ArrayList<>();
        list2.clear();

        list2.add(new DataBanks(R.string.adres, R.string.sost, R.string.rasp1));
        list2.add(new DataBanks(R.string.adres, R.string.sost, R.string.rasp2));
        list2.add(new DataBanks(R.string.adres, R.string.sost, R.string.rasp1));
        list2.add(new DataBanks(R.string.adres, R.string.sost, R.string.rasp2));
        list2.add(new DataBanks(R.string.adres, R.string.sost, R.string.rasp1));
        list2.add(new DataBanks(R.string.adres, R.string.sost, R.string.rasp2));
        list2.add(new DataBanks(R.string.adres, R.string.sost, R.string.rasp1));



        BanksAdapter banksAdapter = new BanksAdapter(this, list2);
        listView.setAdapter(banksAdapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //if (id == R.id.action_settings) {
        //return true;
        //}

        return super.onOptionsItemSelected(item);
    }
}
