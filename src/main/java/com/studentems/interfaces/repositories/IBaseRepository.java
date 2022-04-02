package com.studentems.interfaces.repositories;

import java.util.List;

/**
 *
 * @author STM Developer
 */
public interface IBaseRepository<T> {
    public void create();
    public void update();
    public T get(String id);
    public List<T> list();
}