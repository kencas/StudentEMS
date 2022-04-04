package com.studentems.models;

/**
 *
 * @author STM Developer
 */
public class Score extends BaseModel{
    private int id = 30;

    @Override
    public int getId() {
        return id + 20;
    }

    @Override
    public void setId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
