/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cds2;

/**
 *
 * @author kwaku
 */
public class Genre {
    private int id;
    private String name;
    
    public Genre(){}
    
    public Genre(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
}
