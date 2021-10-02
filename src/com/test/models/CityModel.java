/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.models;

/**
 *
 * @author Ahsan
 */
public class CityModel {
    
    Integer id;
    String name;
    Integer cityId;

    public CityModel(Integer id, String name, Integer cityId) {
        this.id = id;
        this.name = name;
        this.cityId = id;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
