package services;

import java.util.List;

import model.PhotoData;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/photos")
    Call<List<PhotoData>> getAllPhotos();
}
