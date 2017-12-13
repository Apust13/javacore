package com.apust.java8.stream.article;

/**
 * Created by APUST on 10/29/2017.
 */
public class Article {

    public Article(String tag, String title, int size) {
        this.tag = tag;
        this.title = title;
        this.year = size;
    }

    private String tag;

    private String title;

    private int year;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return title + ": ["+ tag +"] " + year;
    }
}
