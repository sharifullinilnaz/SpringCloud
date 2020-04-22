package ru.itis.cloud.articles.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.cloud.articles.dto.Article;
import ru.itis.cloud.articles.repository.ArticlesRepository;

import java.util.List;

@Service
public class ArticlesServiceImpl implements ArticlesService{

    @Autowired
    private ArticlesRepository articlesRepository;

    public List<Article> getArticles(){
        return articlesRepository.findAll();
    }
}
