package com.newsapi.search.controller;

import com.newsapi.search.modal.Articles;
import com.newsapi.search.modal.QueryData;
import com.newsapi.search.service.NewsData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@RequestMapping("/user")
@RestController
public class NewsApiController {

    private NewsData newsData=new NewsData();

    @PostMapping("/queryNewsApi")
    public Map<String,List> getQueryData(@RequestBody QueryData queryData){
        List<Articles> list=newsData.queryNewsDataResponse(queryData);
        Map<String,List> map =new HashMap<>();
        List list1= new ArrayList();
        list1.add(queryData.getKeyword());
        list1.add(queryData.getCountry());
        list1.add(queryData.getCategoryType());
        map.put("articles",list);
        map.put("queryData",list1);
        return map;
    }

}
