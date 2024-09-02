package com.zzpzaf.se.blogbackdemo1;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PostsRepository implements IPostsRepository {

    private final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Category> getCayegories() {
        String sql = "SELECT * FROM testcategories";
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Category.class));
    }

    @Override
    public Category getCategoryById(int id) {
        String selQuery = "SELECT * FROM testcategories WHERE categoryId = ?";
        Category category = new Category();
        try {
            category = jdbcTemplate.queryForObject(selQuery, BeanPropertyRowMapper.newInstance(Category.class), id);
        } catch (Exception e) {
            // logger.info(">===>> PostsRepository ERRORs: " + e.getMessage());
        }
        return category;
    }



    @Override
    public List<Article> getArticles() {
        String sql = "SELECT * FROM testarticles";
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Article.class));
    }

    @Override
    public List<Article> getCategoryArticles(int id) {
        String sql = "SELECT * FROM testarticles WHERE categoryId = ?";
        List<Article> catArticles = new ArrayList<Article>();
        try {
            catArticles = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Article.class),id);
        } catch (Exception e) {
            // logger.info(">===>> PostsRepository ERRORs: " + e.getMessage());
        }
        return catArticles;
    }


    @Override
    public Article getArticleById(int id) {
        String selQuery = "SELECT * FROM testarticles WHERE articleId = ?";
        Article article = new Article();
        try {
            article = jdbcTemplate.queryForObject(selQuery, BeanPropertyRowMapper.newInstance(Article.class), id);
        } catch (Exception e) {
            // logger.info(">===>> PostsRepository ERRORs: " + e.getMessage());
        }
        return article;
    }

}
