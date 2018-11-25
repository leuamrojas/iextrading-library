package com.whitespectre.iextradinglib;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class IEXTradingService {

    private IEXTradingAPIInterface apiInterface;

    public void getCompanyInfoAsync(String id) {

        apiInterface = IEXTradingAPIClient.getClient().create(IEXTradingAPIInterface.class);

        /*
         GET Company Info
         */
        Call<Company> call = apiInterface.getCompanyInfo(id);
        call.enqueue(new Callback<Company>() {
            @Override
            public void onResponse(Call<Company> call, Response<Company> response) {

                Company company = response.body();

                Log.d("getCompanyInfo",response.code()+"");

//                String displayResponse = "";

//                MultipleResource resource = response.body();
//                Integer text = resource.page;
//                Integer total = resource.total;
//                Integer totalPages = resource.totalPages;
//                List<MultipleResource.Datum> datumList = resource.data;
//
//                displayResponse += text + " Page\n" + total + " Total\n" + totalPages + " Total Pages\n";
//
//                for (MultipleResource.Datum datum : datumList) {
//                    displayResponse += datum.id + " " + datum.name + " " + datum.pantoneValue + " " + datum.year + "\n";
//                }
//
//                responseText.setText(displayResponse);

            }

            @Override
            public void onFailure(Call<Company> call, Throwable t) {
                call.cancel();
            }
        });

    }

    /**
     GET Stock Price
     **/
    public void getStockPriceAsync(String id) {
        apiInterface = IEXTradingAPIClient.getClient().create(IEXTradingAPIInterface.class);

        /**
         GET Stock Price
         **/
        Call<Integer> call = apiInterface.getStockPrice(id);
        call.enqueue(new Callback<Integer>() {
            @Override
            public void onResponse(Call<Integer> call, Response<Integer> response) {
                Log.d("TAG",response.code()+"");
            }
            @Override
            public void onFailure(Call<Integer> call, Throwable t) {
                call.cancel();
            }
        });
    }


}
