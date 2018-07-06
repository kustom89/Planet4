package e.kustom.planet4;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import e.kustom.planet4.models.Planet;
import e.kustom.planet4.network.GetPlanetDate;

public class MainActivity extends AppCompatActivity {
    TextView nameTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 new Backgroundname().execute("name","Alderaan");
                 new BackgroungClimate().execute("climate","temperate");

                 nameTv= findViewById(R.id.nameTv);
                 nameTv.setVisibility(View.VISIBLE);

            }
        });
    }


    private class Backgroundname extends GetPlanetDate{
        private ProgressDialog progressDialog;

        @Override
        protected void onPreExecute() {
            progressDialog= new ProgressDialog(MainActivity.this);
            progressDialog.show();

        }

        @Override
        protected void onPostExecute(Planet planet) {
        if(planet != null){
            TextView textView= findViewById(R.id.nameTv);
            textView.setText(planet.getResults()[0].getUrl());


        }
        progressDialog.dismiss();
        }
    }

    private class BackgroungClimate extends GetPlanetDate{

        @Override
        protected void onPostExecute(Planet planet) {
            if (planet != null) {
                TextView textView= findViewById(R.id.climateTv);
                textView.setText(planet.getResults()[0].getClimate());


            }
        }
    }

}
