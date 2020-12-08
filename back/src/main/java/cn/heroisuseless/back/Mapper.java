package cn.heroisuseless.back;

import java.util.List;

import cn.heroisuseless.back.entity.NewsEntity;

public interface Mapper {
    List<NewsEntity> findAll();
}
