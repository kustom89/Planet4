package e.kustom.planet4.network;

import e.kustom.planet4.models.Planet;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MiIndicator {

    @GET("/api/planets/{count}/")
    Call <Planet> indicatorByName(@Path("count") String count);

}
