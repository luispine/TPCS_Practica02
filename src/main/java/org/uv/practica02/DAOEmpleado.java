/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.practica02;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vazqu
 */
public class DAOEmpleado implements IDAOGeneral<Empleado, Long>{

    @Override
    public Empleado save(Empleado pojo) {
        ConexionDB con = ConexionDB.getInstance();
        String sql = "insert into empleado (clave, nombre. direccion,telefono) values + "
                + " ('" + pojo.getClave() + "','" + pojo.getNombre() + "','" + pojo.getDireccion() + "','"
                + pojo.getTelefono() + "')";
        boolean res = con.execute(sql);
        if (res) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, "se guardo");
        } else {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, "error");
        }
        return pojo;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Empleado update(Empleado pojo, Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Empleado findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Empleado> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
