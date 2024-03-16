package com.model;

import java.io.Serializable;

public class User implements Serializable{
    /**
     * 用户
     */

    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
