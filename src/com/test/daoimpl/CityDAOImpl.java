/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.daoimpl;

import com.test.dbconnection.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.test.dao.CityDAO;

/**
 *
 * @author Ahsan
 */
public class CityDAOImpl implements CityDAO{

    Connection con;
    
    public CityDAOImpl(){
        con = DatabaseConnection.getDBConnection();
    }
    
    @Override
    public ArrayList<String> getAllCountryNames() {
       
        List allDeptName = new ArrayList(5);
                
        try{
            
            PreparedStatement pst = con.prepareStatement("Select name from cities order by id");
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                
                allDeptName.add(rs.getString("name"));
                
            }
        return (ArrayList) allDeptName;
        
        }catch(Exception e){
            
        }
        
        return new ArrayList(0);
    }

    @Override
    public String getSpecificCountryName(Integer id) {
            
        try{
            
            PreparedStatement pst = con.prepareStatement("Select name from cities where id = %d".formatted(id));
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                return (rs.getString("name"));
            }
       
        }catch(Exception e){
            
        }
    
        return "";
    }

    @Override
    public Integer getSpecificCountryId(String name) {
       try{
            
            PreparedStatement pst = con.prepareStatement("Select id from cities where name = ?");
            
            pst.setString(1, name);
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                return (rs.getInt(1));
            }
       
        }catch(Exception e){
            
        }
    
        return -1;
    
    }
    
    
}
