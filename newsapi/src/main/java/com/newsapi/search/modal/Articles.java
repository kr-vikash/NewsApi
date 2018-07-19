package com.newsapi.search.modal;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Articles {
        Articles(){
        }
    private String title;
    private String description;
    private String url;


    public String getTitle(){
        return this.title;
    }
    public String getDescription(){
        return this.description;
    }
    public String getUrl(){
        return this.url;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

@Override
public String toString() {
    return "articles{" +
            "title=" + title +
            ", description='" + description + '\'' +
            ",url='" + url + '\''+
            '}';
}

}
