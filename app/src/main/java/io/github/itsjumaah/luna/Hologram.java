package io.github.itsjumaah.luna;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hologram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hologram);


        final Button b = (Button) findViewById(R.id.back1);
        assert b != null;
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent b = new Intent(Hologram.this, MainActivity.class);
                Hologram.this.startActivity(b);

            }
        });
    }
}

