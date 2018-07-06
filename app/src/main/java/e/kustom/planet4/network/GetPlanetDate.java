package e.kustom.planet4.network;

import android.os.AsyncTask;

import java.io.IOException;

import e.kustom.planet4.models.Planet;
import retrofit2.Call;
import retrofit2.Response;

public class GetPlanetDate extends AsyncTask<String, Void, Planet> {

    @Override
    protected Planet doInBackground(String... params) {
        MiIndicator miIndicator = new PlanetInterceptor().getBasic();
        Call <Planet> indicator = miIndicator.indicatorByName("2");
        try {
            Response <Planet> response = indicator.execute();
            if (200 == response.code() && response.isSuccessful()) {
                response.body();

            }

            else {

                return null;
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;



    }

}
