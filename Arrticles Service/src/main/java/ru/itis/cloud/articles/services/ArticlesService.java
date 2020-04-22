package ru.itis.cloud.articles.services;

import ru.itis.cloud.articles.dto.Article;

import java.util.List;

public interface ArticlesService {
    List<Article> getArticles();
}