package it.pradita.ac.id.latihanandroid;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button btnmahasiswa,  btnmatakuliah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnmahasiswa=(Button)findViewById(R.id.btnmahasiswa);
        btnmatakuliah=(Button)findViewById(R.id.btnmatakuliah);


        btnmahasiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(Menu.this, Activity_Mahasiswa.class);
                startActivity(intent);
            }
        });

        btnmatakuliah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu.this, Activity_Matakuliah.class);
                startActivity(intent);
            }
        });

    }
}
