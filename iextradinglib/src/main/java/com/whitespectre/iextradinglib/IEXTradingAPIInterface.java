package com.whitespectre.iextradinglib;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IEXTradingAPIInterface {

    @GET("/stock/{id}/company")
    Call<Company> getCompanyInfo(@Path("id") String id);

    @GET("/stock/{id}/price")
    Call<Integer> getStockPrice(@Path("id") String id);
}
