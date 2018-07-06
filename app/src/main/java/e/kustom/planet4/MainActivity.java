package e.kustom.planet4;

import android.app.ProgressDialog;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import e.kustom.planet4.models.Planet;
import e.kustom.planet4.network.GetPlanetDate;

public class MainActivity extends AppCompatActivity {

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
            textView.setText(String.valueOf(planet.getName()));
        }
        progressDialog.dismiss();
        }
    }

    private class BackgroungClimate extends GetPlanetDate{

        @Override
        protected void onPostExecute(Planet planet) {
            if (planet != null) {
                TextView textView1 = findViewById(R.id.climateTv);
                textView1.setText(String.valueOf(planet.getResidents()));

            }
        }
    }

}
