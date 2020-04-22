package ru.itis.cloud.articles.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.cloud.articles.dto.Article;
import ru.itis.cloud.articles.services.ArticlesService;

import java.util.List;

@RestController
@Slf4j
public class ArticlesController {

    @Autowired
    private ArticlesService articlesService;

    @GetMapping("/articles")
    public List<Article> getArticles() {
        log.info("Get request");
        return articlesService.getArticles();
    }
}
