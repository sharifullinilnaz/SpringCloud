package ru.itis.cloud.articles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.cloud.articles.dto.Article;


import java.util.List;

public interface ArticlesRepository extends JpaRepository<Article, Long> {

    List<Article> findAll();

}
