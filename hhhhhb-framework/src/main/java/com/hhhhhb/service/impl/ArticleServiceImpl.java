package com.hhhhhb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hhhhhb.domain.entity.Article;
import com.hhhhhb.mapper.ArticleMapper;
import com.hhhhhb.service.ArticleService;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
}
