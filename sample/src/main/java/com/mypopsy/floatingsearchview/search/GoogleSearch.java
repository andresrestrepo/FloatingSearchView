package com.mypopsy.floatingsearchview.search;


import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

// https://developers.google.com/web-search/docs/?csw=1#API_Overview
public interface GoogleSearch {

    String BASE_URL = "http://linkapedia-api-release.elasticbeanstalk.com";

    @GET("/search/suggests?limit=7")
    Observable<Response> search(@Query("term") String query);
}
