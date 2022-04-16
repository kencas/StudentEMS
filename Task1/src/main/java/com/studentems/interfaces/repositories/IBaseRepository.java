/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.studentems.interfaces.repositories;
import java.util.List;

/**
 *
 * @author Philip
 */
public interface IBaseRepository <T>{
    public void create();
    public void update();
    public T get(String id);
    public List<T> list();
    
}
