package com.newsapi.search.modal;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    private String status;
    private Long totalResults;
    private List<Articles> articles;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setArticles(List<Articles> articles) {
        this.articles = articles;
    }

    public List<Articles> getArticles() {
        return articles;
    }

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return totalResults;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status='" +status + '\'' +
                ", totalResults=" +totalResults +
                ", articles=" + articles +
                '}';
    }
}
