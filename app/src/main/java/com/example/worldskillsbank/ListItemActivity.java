package com.example.worldskillsbank;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;



public class ListItemActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_valuti);

        // Находим ListView в разметке активити
        ListView listView = (ListView) this.findViewById(R.id.listViews);

        // Создаём ListView, в котором будут храниться данные для списка
        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        /* Наполняем List данным. В данном случае данные передаются Объектом,
         * в котором хранятся id, указывающие на флаги в ресурсах, а также
         * на Строки, в которых прописаны названия валют стран и аббревиатуры этих валют */
        list.add(new DataFlags(R.drawable.flag_russian, R.string.russian, R.string.russianRUB));
        list.add(new DataFlags(R.drawable.flag_africa, R.string.africa, R.string.africaZAR));
        list.add(new DataFlags(R.drawable.flag_singapore, R.string.singapore, R.string.singaporeSGD));
        list.add(new DataFlags(R.drawable.flag_turkish, R.string.turkish, R.string.turkishTRY));
        list.add(new DataFlags(R.drawable.flag_america, R.string.america, R.string.americanUSD));
        list.add(new DataFlags(R.drawable.flag_kazach, R.string.kazach, R.string.kazachKZT));
        list.add(new DataFlags(R.drawable.flag_germany, R.string.germnay, R.string.germnanyEUR));



        /* Создаём адаптер, который будет передавать данные из List`а в
         * элемент ListView и подключаем его непосредственно к ListView`у
         */
        MyListAdapter myListAdaptery = new MyListAdapter(this, list);
        listView.setAdapter(myListAdaptery);

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