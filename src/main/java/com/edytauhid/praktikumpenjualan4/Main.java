/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edytauhid.praktikumpenjualan4;

import db.Database;
import java.sql.Connection;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        
        Database db = new Database();
        Connection con = db.getConnection();
    
}
}
