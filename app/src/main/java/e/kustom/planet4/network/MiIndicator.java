package e.kustom.planet4.network;

import e.kustom.planet4.models.Planets;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MiIndicator {

    @GET("/api/{planets}/{number}/")
    Call <Planets> indicatorByName(@Path("planets") String indicator,@Path("number") int param);

}
