package com.applemango.SteveJobda.dao;

public interface BaseDao<T> {
    boolean create(T t);

    boolean update(T t);

    boolean delete(int key);

    T find(int key);
}
