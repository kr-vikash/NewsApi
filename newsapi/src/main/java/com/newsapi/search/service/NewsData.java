package com.newsapi.search.service;

import com.newsapi.search.modal.Articles;
import com.newsapi.search.modal.QueryData;
import com.newsapi.search.modal.Response;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class NewsData {


    public List<Articles> queryNewsDataResponse(QueryData queryData){
        NewsApiService newsApiService =new NewsApiService();
        Response response = newsApiService.getNewsApiData(queryData);

        List<Articles> result = response.getArticles()
                .stream()
                .filter(Objects::nonNull)
                .filter(x->  Objects.nonNull(x.getDescription()) && x.getDescription().toLowerCase().contains(queryData.getKeyword().toLowerCase()) || Objects.nonNull(x.getTitle()) && x.getTitle().toLowerCase().contains(queryData.getKeyword().toLowerCase()))
                .collect(Collectors.toList());
        return result;
    }

 
}
