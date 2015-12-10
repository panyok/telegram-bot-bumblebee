package com.github.bumblebee.command.bingpics;

import com.github.bumblebee.command.bingpics.response.BingSearchResponse;
import feign.Param;
import feign.RequestLine;

public interface BingSearchApi {

    String API_ROOT = "https://api.datamarket.azure.com/Bing/Search/v1";

    @RequestLine("GET /Image?$format=json&Query={query}&$top=20&ImageFilters='Size:Medium'")
    BingSearchResponse queryPictures(@Param("query") String search);
}
