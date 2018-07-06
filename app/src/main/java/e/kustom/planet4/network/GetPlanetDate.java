package e.kustom.planet4.network;

import android.os.AsyncTask;

import java.io.IOException;

import e.kustom.planet4.models.Planet;
import retrofit2.Response;

public class GetPlanetDate extends AsyncTask<String, Void, Planet> {
    @Override
    protected Planet doInBackground(String... params) {
        MiIndicator myPlanet = new PlanetInterceptor().getBasic();
        retrofit2.Call <Planet[]> planet=myPlanet.indicatorByName("Alderaan");
        try{
            Response<Planet[]> response =planet.execute();
            if(200 == response.code()&& response.isSuccessful()){
                return response.body()[0];

            }
            else{
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}
