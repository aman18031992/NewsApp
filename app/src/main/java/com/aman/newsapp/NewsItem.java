package com.aman.newsapp;

import java.io.Serializable;

/**
 * Created by aman on 2018-07-14.
 * This class is used to store basic information of news.
 */
public class NewsItem implements Serializable {
    private String Title;
    private String PublicationDate;
    private String WebUrl;

    public NewsItem(String title, String publicationDate, String webUrl) {
        Title = title;
        PublicationDate = publicationDate;
        WebUrl = webUrl;
    }

    public String getTitle() {
        return Title;
    }

    public String getPublicationDate() {
        return PublicationDate;
    }

    public String getWebUrl() {
        return WebUrl;
    }
}
