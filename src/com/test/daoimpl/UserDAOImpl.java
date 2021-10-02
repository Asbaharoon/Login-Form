/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.daoimpl;

import com.test.dao.UserDAO;
import com.test.dbconnection.DatabaseConnection;
import com.test.models.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Ahsan
 */
public class UserDAOImpl implements UserDAO {

    Connection con;
    
    public UserDAOImpl(){
        
        con = DatabaseConnection.getDBConnection();
    }
    
    @Override
    public Integer add(UserModel user) {
        
        try{
            
            PreparedStatement pst = con.prepareStatement("insert into users (name, email, password, city_id, gender) values(?, ?, ?, ?, ?)");
            pst.setString(1, user.getName());
            pst.setString(2, user.getEmail());
            pst.setString(3, user.getPassword());
            pst.setInt(4, user.getCityId());
            pst.setString(5, user.getGender());
            
            return (pst.executeUpdate());
            
        }catch(Exception e){
            
            System.out.println("Exception");
            
        }
        
        return -1;
    }

    @Override
    public boolean isEmailPasswordMatch(String email, String password) {
        
        try{
            
            PreparedStatement pst = con.prepareStatement("select * from users where email = ? and password = ?");
            pst.setString(1, email);
            pst.setString(2, password);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                
                return true;
            }
            return false;
            
        }catch(Exception e){
            
            
        }
        return false;
    }

    @Override
    public UserModel getSpecificUser(String email, String password) {
        
        UserModel user = null;
        
        try{
            
            PreparedStatement pst = con.prepareStatement("select * from users where email = ? and password = ?");
            pst.setString(1, email);
            pst.setString(2, password);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                //(String name, String email, String password, String gender,Integer cityId) {
                user = new UserModel(rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(6), rs.getInt(5) );
                user.setId(rs.getInt(1));
            }
            
        }catch(Exception e){
            
            
        }
        return user;
        
    }

    @Override
    public Integer update(UserModel user) {
         
        try{
            
            PreparedStatement pst = con.prepareStatement("update users set name = ?,  email = ?, password = ?, city_id = ?, gender = ? where id = ?");
            pst.setString(1, user.getName());
            pst.setString(2, user.getEmail());
            pst.setString(3, user.getPassword());
            pst.setInt(4, user.getCityId());
            pst.setString(5, user.getGender());
            pst.setInt(6, user.getId());
            
            return (pst.executeUpdate());
            
        }catch(Exception e){
            
            System.out.println("Exception");
            
        }
        
        return -1;
    }

    @Override
    public Integer delete(Integer id) {
        
        try{
            
            PreparedStatement pst = con.prepareStatement("delete from users where id = ?");
            pst.setInt(1, id);
            return (pst.executeUpdate());
            
        }catch(Exception e){
            
            System.out.println("Exception");
            
        }
        
        return -1;
    }

    @Override
    public boolean isEmailExist(String email) {
       
         try{
            
            PreparedStatement pst = con.prepareStatement("select * from users where email = ? ");
            pst.setString(1, email);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                
                return true;
            }
            return false;
            
        }catch(Exception e){
            
            
        }
        return false;
    }

    @Override
    public boolean isPasswordExist(String password) {
        
         try{
            
            PreparedStatement pst = con.prepareStatement("select * from users where password = ? ");
            pst.setString(1, password);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                
                return true;
            }
            return false;
            
        }catch(Exception e){
            
            
        }
        return false;
    }
    
}
