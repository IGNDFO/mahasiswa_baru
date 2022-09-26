package com.example.pendaftaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText etno_daftar,etnama;
Button btndaftar;
String nodaftar,nama;
//deklarasi 2 baris diatas


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etno_daftar= findViewById(R.id.et_nomor_pendaftaran);
        etnama=findViewById(R.id.et_nama_mhs);
        btndaftar=findViewById(R.id.btn_daftar);

        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nodaftar=etno_daftar.getText().toString();
                nama=etnama.getText().toString();

                if (nodaftar.trim().equals("")){
                    etno_daftar.setError("HARUS DIISI!!");
                }//pas di klik ngambil data dan kalau kosong muncul peringatan
                else if (nama.trim().equals("")){
                    etnama.setError("HERUS DIISI");
                }//pas di klik ngambil data dan kalau kosong muncul peringatan
                else {
                    Toast.makeText(MainActivity.this, "SELAMAT "+nama+" ANDA TELAH TERDAFTAR", Toast.LENGTH_SHORT).show();//PILIH TOAST BIASA
                }
            }
        });



    }
}