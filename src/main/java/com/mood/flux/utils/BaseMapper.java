package com.mood.flux.utils;

import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.ids.DeleteByIdsMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;
@Repository
public interface BaseMapper<T> extends Mapper<T>,InsertListMapper<T>,DeleteByIdsMapper<T> {
}
