package com.example.myapplication;


import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class PriceFetcher  {

    private RequestQueue _queue;
    public final static String REQUEST_URL = "http://10.0.2.2:3000/stockName?symbol=";

    public PriceFetcher(Context context) {
        _queue = Volley.newRequestQueue(context);
    }

    public void dispatchRequest(final StockResponseListener listener) {
        JsonObjectRequest req = new JsonObjectRequest(Request.Method.GET, REQUEST_URL+MainActivity.stockNameHolder, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            StockResponse res = new StockResponse(false, response.getString("symbol"), response.getString("price"));
                            listener.onResponse(res);
                        }
                        catch (JSONException e) {
                            listener.onResponse(new StockResponse(true, null, "There is no price for this stock"));
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onResponse(new StockResponse(true, null, "There is no price for this stock"));
            }
        });

        _queue.add(req);
    }
}
