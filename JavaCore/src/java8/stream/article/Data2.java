package java8.stream.article;

import java8.stream.article.Article;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by APUST on 10/29/2017.
 */
public class Data2 {
    public Data2(Article... args) {
        if(args.length != 0){
            dataBase = new ArrayList<>(Arrays.asList(args));
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


}
