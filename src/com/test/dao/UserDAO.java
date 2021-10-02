/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dao;


import com.test.dbconnection.DatabaseConnection;
import com.test.models.UserModel;
import java.sql.Connection;

/**
 *
 * @author Ahsan
 */
public interface UserDAO {
            
    public Integer add(UserModel user);
    
    public Integer update(UserModel user);
    
    public Integer delete(Integer id);
    
    public boolean isEmailPasswordMatch(String email, String password);
    
    public boolean isEmailExist(String email);
    
    public boolean isPasswordExist(String password);
    
    public UserModel getSpecificUser(String email, String password);
}
