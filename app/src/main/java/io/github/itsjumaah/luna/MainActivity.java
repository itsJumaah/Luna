package io.github.itsjumaah.luna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //init the buttons
        final Button skyMap = (Button) findViewById(R.id.skyMap);
        final Button hologram   = (Button) findViewById(R.id.hologram);
        final Button gallery    = (Button) findViewById(R.id.gallery);
        final Button settings    = (Button) findViewById(R.id.settings);


        //on the click of sky map button run it
        assert skyMap != null;
        skyMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent skyInt = new Intent(MainActivity.this, SkyMap.class);
                MainActivity.this.startActivity(skyInt);

            }
        });

        //if Hologram is clicked
        assert hologram != null;
        hologram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent holoInt = new Intent(MainActivity.this, Hologram.class);
                MainActivity.this.startActivity(holoInt);

            }
        });

        //if gallery is clicked
        assert gallery != null;
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent galleryInt = new Intent(MainActivity.this, Gallery.class);
                MainActivity.this.startActivity(galleryInt);

            }
        });

        //if Settings
        assert settings != null;
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent settingsInt = new Intent(MainActivity.this, Settings.class);
                MainActivity.this.startActivity(settingsInt);

            }
        });


    }
}
