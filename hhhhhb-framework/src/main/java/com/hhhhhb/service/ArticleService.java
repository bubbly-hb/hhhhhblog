package com.hhhhhb.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hhhhhb.domain.ResponseResult;
import com.hhhhhb.domain.entity.Article;

public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();
}
