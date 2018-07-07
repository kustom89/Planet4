package e.kustom.planet4.network;

import android.os.AsyncTask;

import java.io.IOException;

import e.kustom.planet4.models.Planets;
import retrofit2.Call;
import retrofit2.Response;

public class GetPlanetDate extends AsyncTask<String, Integer, Planets> {


    @Override
    protected Planets doInBackground(String... params) {
        MiIndicator miIndicator = new PlanetInterceptor().getBasic();

        Call<Planets> indicator= miIndicator.indicatorByName("planets",2);
        //Call <Planets> indicator = miIndicator.indicatorByName(params[0], Integer.parseInt(params[1]));
        try {
            Response <Planets> response = indicator.execute();
            if (200 == response.code() && response.isSuccessful()) {
                response.body();

            } else {

                return null;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }
}
