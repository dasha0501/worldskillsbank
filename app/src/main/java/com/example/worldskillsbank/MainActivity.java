package com.example.worldskillsbank;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText login;
    EditText password;
    ImageView metka;
    Button bankBtn;
    LinearLayout lay1;
    LinearLayout lay2;
    Button valutaBtn;
    ImageView valuta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bankBtn = findViewById(R.id.bankomat);
        metka = findViewById(R.id.metka);
        btn = findViewById(R.id.vxod);
        valutaBtn = findViewById(R.id.valutaBtn);
        valuta = findViewById(R.id.valutaImg);
        lay1 = findViewById(R.id.lay1);
        lay2 = findViewById(R.id.lay2);

        metka.setVisibility(View.INVISIBLE);
        bankBtn.setVisibility(View.INVISIBLE);
        valutaBtn.setVisibility(View.INVISIBLE);
        valuta.setVisibility(View.INVISIBLE);
        lay1.setVisibility(View.INVISIBLE);
        lay2.setVisibility(View.INVISIBLE);

        btn.setOnClickListener(this::showVxod);

        valutaBtn.setOnClickListener(this::Vality);
        bankBtn.setOnClickListener(this::Bank);

    }

    private void showVxod(View view)
    {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Авторизация");
        dialog.setMessage("Введите Ваш логин и пароль");


        LayoutInflater inflater = LayoutInflater.from(this);
        View sign = inflater.inflate(R.layout.signinwindow, null);
        dialog.setView(sign);


        final EditText login = sign.findViewById(R.id.Login);
        final EditText password = sign.findViewById(R.id.Password);



        dialog.setPositiveButton("Войти", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (login.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Вход выполнен!",Toast.LENGTH_SHORT).show();
                    metka.setVisibility(View.VISIBLE);
                    bankBtn.setVisibility(View.VISIBLE);
                    valutaBtn.setVisibility(View.VISIBLE);
                    valuta.setVisibility(View.VISIBLE);
                    lay1.setVisibility(View.VISIBLE);
                    lay2.setVisibility(View.VISIBLE);
                    btn.setVisibility(View.INVISIBLE);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Неправильные данные!",Toast.LENGTH_SHORT).show();
                }

            }
        });
        dialog.setNegativeButton("Отменить", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();

    }

    private void Vality(View view)
    {
        Intent intent = new Intent(this, ListItemActivity.class);
        startActivity(intent);
    }

    private void Bank(View view)
    {
        Intent intent = new Intent(this, BankItemActivity.class);
        startActivity(intent);
    }
}