package com.zzpzaf.se.blogbackdemo1;

import java.util.List;

public interface IPostsRepository {

    List<Category> getCayegories();

    Category getCategoryById(int id);


    List<Article> getArticles(); 

    List<Article> getCategoryArticles(int id); 

    Article getArticleById(int id);

}


