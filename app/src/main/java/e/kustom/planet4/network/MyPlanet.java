package e.kustom.planet4.network;

import e.kustom.planet4.models.Planet;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MyPlanet {

    @GET("/api/planets/{count}")
    Call <Planet[]> indicatorByUrl(@Path("planets") String count);
}
