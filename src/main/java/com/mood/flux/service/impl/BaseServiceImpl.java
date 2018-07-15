package com.mood.flux.service.impl;


import com.mood.flux.service.BaseService;
import com.mood.flux.utils.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private BaseMapper<T> mapper;
    /**
     * insert
     *
     * @param t
     * @return
     */
    @Override
    public int addEntity(T t) {
        return mapper.insert(t);
    }

    /**
     * update
     *
     * @param t
     * @return
     */
    @Override
    public int updateEntity(T t) {
        return mapper.updateByPrimaryKey(t);
    }

    /**
     * delete
     *
     * @param t
     * @return
     */
    @Override
    public int deleteEntity(T t) {
        return mapper.delete(t);
    }

    /**
     * selectOneById
     *
     * @param id
     * @return
     */
    @Override
    public T selectOneById(Object id) {
        return mapper.selectByPrimaryKey(id);
    }

    /**
     * select one
     *
     * @param t
     * @return
     */
    @Override
    public T selectOne(T t) {
        return mapper.selectOne(t);
    }

    /**
     * select list
     *
     * @param t
     * @return
     */
    @Override
    public List<T> selectList(T t) {
        return mapper.select(t);
    }

    /**
     * selectCount
     *
     * @param t
     * @return
     */
    @Override
    public int selectCount(T t) {
        return mapper.selectCount(t);
    }

    /**
     * @param recordList
     * @return
     */
    @Override
    public int insertList(List<T> recordList) {
        return mapper.insertList(recordList);
    }

    /**
     * @param ids
     * @return
     */
    @Override
    public int deleteByIds(String ids) {
        return mapper.deleteByIds(ids);
    }
}
