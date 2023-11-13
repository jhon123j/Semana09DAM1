package com.example.sem09apprestmvvm.apirest;

import com.example.sem09apprestmvvm.model.Album;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AlbumClient {

    public final String BASE_URL = "https://jsonplaceholder.typicode.com/";
    private AlbumInterface albumInterface;
    private static AlbumClient INSTANCE;

    public AlbumClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        albumInterface = retrofit.create(AlbumInterface.class);
    }

    public static AlbumClient getInstance(){
        if(INSTANCE == null){
            INSTANCE = new AlbumClient();
        }
        return  INSTANCE;
    }

    public Call<List<Album>> getAlbums(){
        return albumInterface.getAlbums();
    }


}
