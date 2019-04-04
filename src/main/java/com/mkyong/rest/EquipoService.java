/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.rest;


import java.util.List;
 
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.o7planning.restfulcrud.dao.EquipoDAO;
import org.o7planning.restfulcrud.model.Equipo;
/**
 *
 * @author brown
 */

@Path("/equipos")
public class EquipoService {
    
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Equipo> getEmployees_JSON() {
        List<Equipo> listaretorno = EquipoDAO.getAllEquipo();
        return listaretorno;
    }
    
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Equipo addEmployee(Equipo equi) {
        return EquipoDAO.addEquipo(equi);
    }
    @PUT
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Equipo updateEquipo(Equipo equi) {
        return EquipoDAO.updateEquipo(equi);
    }
 
    @DELETE
    @Path("/{equiID}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public void deleteEquipo(@PathParam("equiID") String equiID) {
        EquipoDAO.deleteEquipo(equiID);
    }
}
