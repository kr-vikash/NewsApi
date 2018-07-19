package com.newsapi.search.modal;


public class QueryData {
    private String keyword;
    private String country;
    private String categoryType;

    public QueryData(String keyword, String country, String categoryType) {
        this.keyword = keyword;
        this.country = country;
        this.categoryType = categoryType;
    }
    public QueryData(){
    }
    public String getKeyword(){
        return keyword;
    }
    public String getCountry(){
        return country;
    }
    public String getCategoryType(){
        return categoryType;
    }
}
