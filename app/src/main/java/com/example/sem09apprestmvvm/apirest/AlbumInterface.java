package com.example.sem09apprestmvvm.apirest;

import com.example.sem09apprestmvvm.model.Album;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AlbumInterface {

    @GET("albums")
    public Call<List<Album>> getAlbums();



}
