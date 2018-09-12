package com.example.x.railwayapp

import android.telecom.Call
import com.example.x.railwayapp.beans.PNRStatusBean
import retrofit2.http.GET
import retrofit2.http.Path

interface RailwayAPI {

    @GET("v2/pnr-status/pnr/{pnrno}/apikey/1xf405f9pc/")
    fun getPnrInfo(@Path("pnrno") s: String): retrofit2.Call<PNRStatusBean>
}