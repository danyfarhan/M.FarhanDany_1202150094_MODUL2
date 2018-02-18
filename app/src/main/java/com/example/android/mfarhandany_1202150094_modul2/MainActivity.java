package com.example.android.mfarhandany_1202150094_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton radiobuttondine,radiobuttontakeaway;
    Intent pindah;
    Button buttonpesan;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radiobuttondine = findViewById(R.id.radio_btn_dinein);
        radiobuttontakeaway = findViewById(R.id.radio_btn_takeaway);
    }


    public void PesanSekarang(View view) {
        if (view.getId()==R.id.button_pesan){

            if (radiobuttondine.isChecked()){
                pindah = new Intent(this, activity_dine_in.class);
                startActivity(pindah);
                toast = Toast.makeText(getApplicationContext(), "Dine In",
                        Toast.LENGTH_LONG); toast.show();
            }

            else if (radiobuttontakeaway.isChecked()){
                pindah = new Intent(this, TakeAway.class);
                startActivity(pindah);
                toast = Toast.makeText(getApplicationContext(), "Take Away",
                        Toast.LENGTH_LONG); toast.show();
            }

            else{
                toast = Toast.makeText(getApplicationContext(), "Anda Belum Memilih",
                        Toast.LENGTH_SHORT); toast.show();
            }
        }
    }
}
