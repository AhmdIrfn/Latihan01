package id.ac.poliban.mi.irfan.latihan01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents() {
        //pasang event listener
        Button btAjax = findViewById(R.id.btAjax);
        Button btBarcelona = findViewById(R.id.btBarcelona);
        Button btRealMadrid = findViewById(R.id.btRealMadrid);
        Button btRoma = findViewById(R.id.btRoma);
        Button btFiorentina = findViewById(R.id.btFiorentina);
        Button btBocaJunior = findViewById(R.id.btBocaJunior);


        btAjax.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I'm Ajax in the Amsterdam!", Toast.LENGTH_SHORT).show();
            }
        });

        btBarcelona.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Kampret Decul!", Toast.LENGTH_SHORT).show();
            }
        });

        btRealMadrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hala Madrid!", Toast.LENGTH_SHORT).show();
            }
        });

        btRoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Italiano!", Toast.LENGTH_SHORT).show();
            }
        });

        btFiorentina.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Bari Maras!", Toast.LENGTH_SHORT).show();
            }
        });

        btBocaJunior.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Bocah Junior1", Toast.LENGTH_SHORT).show();
            }
        });
    }
}