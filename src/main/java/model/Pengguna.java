/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.MD5;

/**
 *
 * @author User
 */
public class Pengguna {
    Connection connection;
    
    private int id;
    private String username;
    private String password;
    private String namaLengkap;
    private boolean isAdmin;
    
    public Pengguna(Connection connection) {
        this.connection = connection;
    }
    
    public Pengguna(int id, String username, String namaLengkap, boolean isAdmin) {
        this.id = id;
        this.username = username;
        this.namaLengkap = namaLengkap;
        this.isAdmin = isAdmin;
    }
    
    public Pengguna login(){
        Pengguna pengguna = null;
        
        String loginSQL = "SELECT * FROM pengguna WHERE username = ? AND password = ?";
        
        PreparedStatement ps;
        try {
            ps = this.connection.prepareStatement(loginSQL);
            
            String md5Password = MD5.getMd5(this.password);
            
            ps.setString(1, this.username);
            ps.setString(2, md5Password);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                pengguna = new Pengguna(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(4),
                        rs.getBoolean(5)
                );
            }
        } catch (SQLException ex) {
            System.out.println("Gagal login");
        }
        
        return pengguna;
    }
}
