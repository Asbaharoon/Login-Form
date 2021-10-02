/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.dao;

import java.util.ArrayList;

/**
 *
 * @author Ahsan
 */
public interface CityDAO {
 
    public ArrayList<String> getAllCountryNames();
    
    public String getSpecificCountryName(Integer id);
    
    public Integer getSpecificCountryId(String name);
}
