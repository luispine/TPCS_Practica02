/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.uv.practica02;

import java.util.List;

/**
 *
 * @author Vazqu
 */
public interface IDAOGeneral <T,I>{
    public T save(T pojo);
    public T update(T pojo, I id);
    public boolean delete(I id);
    public T findById(I id);
    public List<T> findAll();
}
