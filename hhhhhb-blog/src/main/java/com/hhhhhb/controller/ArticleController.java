package com.hhhhhb.controller;

import com.hhhhhb.domain.ResponseResult;
import com.hhhhhb.domain.entity.Article;
import com.hhhhhb.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("/hotArticleList")
    public ResponseResult hotArticleList() {
        ResponseResult result =  articleService.hotArticleList();
        return result;
    }
}
