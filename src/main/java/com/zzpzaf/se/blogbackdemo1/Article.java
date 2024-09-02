package com.zzpzaf.se.blogbackdemo1;

public class Article {

    private int articleId;
    private int categoryId;
    private String articleTitle;
    private String articleSubTitle;
    private String articleContent;
    
    public int getArticleId() {
        return articleId;
    }
    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }
    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public String getArticleTitle() {
        return articleTitle;
    }
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }
    public String getArticleContent() {
        return articleContent;
    }
    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }
    public String getArticleSubTitle() {
        return articleSubTitle;
    }
    public void setArticleSubTitle(String articleSubTitle) {
        this.articleSubTitle = articleSubTitle;
    }

}
