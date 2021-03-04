/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.util.ArrayList;
import template.MyModelInterface;

/**
 *
 * @author User
 */
public class JenisBarang implements MyModelInterface {
    Connection con;
    private int id;
    private String namaJenisBarang;

    public JenisBarang(Connection con) {
        this.con = con;
    }

    public JenisBarang(int id, String namaJenisBarang) {
        this.id = id;
        this.namaJenisBarang = namaJenisBarang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaJenisBarang() {
        return namaJenisBarang;
    }

    public void setNamaJenisBarang(String namaJenisBarang) {
        this.namaJenisBarang = namaJenisBarang;
    }

    
    
    @Override
    public boolean create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> search(String keyword) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
