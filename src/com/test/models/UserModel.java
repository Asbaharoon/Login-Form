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
public class UserModel {
    
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Integer cityId;
    String gender;

    public UserModel(String name, String email, String password, String gender,Integer cityId) {
        
        this.name = name;
        this.email = email;
        this.password = password;
        this.cityId = cityId;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        return "UserModel{" + "id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", cityId=" + cityId + ", gender=" + gender + '}';
    }

    
    
}
