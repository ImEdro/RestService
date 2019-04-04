/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.o7planning.restfulcrud.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.o7planning.restfulcrud.model.Equipo;

/**
 *
 * @author brown
 */
public class EquipoDAO {
    
     private static final Map<String, Equipo> equiMap = new HashMap<String, Equipo>();
 
    static {
        initEqui();
    }
    
     private static void initEqui() {
    }
     
    public static Equipo addEquipo(Equipo equi) {
        equiMap.put(equi.getId(), equi);
        return equi;
    }
    
     public static Equipo updateEquipo(Equipo equi) {
        equiMap.put(equi.getId(), equi);
        return equi;
    }
 
    public static void deleteEquipo(String equiID) {
        equiMap.remove(equiID);
    }
    
    public static List<Equipo> getAllEquipo() {
        Collection<Equipo> c = equiMap.values();
        List<Equipo> list = new ArrayList<Equipo>();
        list.addAll(c);
        return list;
    }
     
    List<Equipo> list;
}
