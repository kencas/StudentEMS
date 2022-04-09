package com.studentems.models;

/**
 *
 * @author STM Developer
 */
abstract class BaseModel {
    abstract int getId();//lazy implementation
    abstract void setId(int id);
    void doWork() //eager implementation
    {
        System.out.println("Do work");
    }
}
