package com.mood.flux.service;

import java.util.List;

public interface BaseService<T> {
    /**
     * insert
     * @param t
     * @return
     */
    int addEntity(T t);

    /**
     * update
     * @param t
     * @return
     */
    int updateEntity(T t);

    /**
     * delete
     * @param t
     * @return
     */
    int deleteEntity(T t);

    /**
     * selectOneById
     * @param id
     * @return
     */
    T selectOneById(Object id);

    /**
     * select one
     * @param t
     * @return
     */
    T selectOne(T t);

    /**
     * select list
     * @param t
     * @return
     */
    List<T> selectList(T t);

    /**
     * selectCount
     * @param t
     * @return
     */
    int selectCount(T t);

    /**
     *
     * @param recordList
     * @return
     */
    int insertList(List<T> recordList);

    /**
     *
     * @param ids
     * @return
     */
    int deleteByIds(String ids);
}
