package e.kustom.planet4.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PlanetInterceptor {

    private static final String BASE_URL="http://swapi.co/";

    public MyPlanet getBasic(){
        Retrofit planetIntercetor=new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MyPlanet indicadorRequest= planetIntercetor.create(MyPlanet.class);

        return indicadorRequest;

    }
}
