package e.kustom.planet4.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PlanetInterceptor {

    private static final String BASE_URL="http://swapi.co/";

    public MiIndicator getBasic(){
        Retrofit planetIntercetor=new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MiIndicator indicadorRequest= planetIntercetor.create(MiIndicator.class);

        return indicadorRequest;

    }
}
