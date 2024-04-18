package com.juliana.api;

import com.juliana.api.modelos.pokemonResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {
    @GET("pokemon")
    Call<pokemonResponse> obtenerListaPokemon();
}
