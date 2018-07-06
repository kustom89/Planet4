package e.kustom.planet4.network;

import e.kustom.planet4.models.Planet;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MiIndicator {

    @GET("/api/{indicator}/{name}")
    Call <Planet> indicatorByName(@Path("indicator") String indicator, @Path("name") String name);

}
