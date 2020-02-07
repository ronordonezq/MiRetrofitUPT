package com.example.miretrofitupt;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface servicesRetrofit {
  @GET("clientes.php")//indicamos el metodo y el endpoint
  Call<List<Cliente>> getUsersGet();//Recuerda que debes colocar como recibiremos esos datos,en este caso una lista de objs

  @GET("login.php")
  Call<String> getLoginGet(@Query("Usuario") String idUser, @Query("pass") String mipass);//Recuerda que el valor
// @Query(valor) debe ser igual a como lo espera el servicio

}
