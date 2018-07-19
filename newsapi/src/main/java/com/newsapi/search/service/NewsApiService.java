package com.newsapi.search.service;


import com.newsapi.search.modal.QueryData;
import com.newsapi.search.modal.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.newsapi.search.utils.Constant.API_KEY;
import static com.newsapi.search.utils.Constant.NEWS_URL;

@Component
@CacheConfig(cacheNames = "newsapi")
public class NewsApiService {
    RestTemplate restTemplate;
    Response response;

   @Cacheable
    public Response getNewsApiData(QueryData queryData){
        restTemplate =new RestTemplate();
        String url=NEWS_URL+"country="+queryData.getCountry().toLowerCase()+"&"+"category=" + queryData.getCategoryType().toLowerCase()+"&" +"apiKey=" +API_KEY;
        response =restTemplate.getForObject(url, Response.class);
      return response;
    }
}
