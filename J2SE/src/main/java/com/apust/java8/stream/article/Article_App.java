package com.apust.java8.stream.article;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by APUST on 10/29/2017.
 */
public class Article_App {

    public static void main(String[] args) {

        Article art1 = new Article("Java 2", "How to learn Java more effective.", 2013);
        Article art2 = new Article("C# 2", "How to learn C# more effective.", 1999);
        Article art3 = new Article("Swift 2", "How to learn SWIFT more effective.", 2017);

        Data articles = new Data(art1, art2, art3);
        Data articles2 = new Data();

        System.out.println(articles.getArticle("Java"));
        System.out.println(articles.getArticle2("C#"));

        System.out.println(articles2.getArticle("Java") == null);
        System.out.println(articles2.getArticle2("C#") == null);


    }
}
class Data {
    public Data(Article ... args) {
        if(args.length != 0){
            dataBase = new ArrayList<>(Arrays.asList(args));
        } else {
            dataBase = new ArrayList<>();
        }
    }
    private List<Article> dataBase;

    public Article getArticle(String str) {
        for(Article art : dataBase){
            if(art.getTag().contains(str)){
                return art;
            }
        }
        return null;
    }

    public Optional<Article> getArticle2(String str) {
        return dataBase.stream().filter(article -> article.getTag().contains(str)).findFirst();
    }


}

