/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.dao;

import duoc.entidades.Estacionamientos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author samm
 */
@Repository("estacionamientosDao")
public class estacionamientosDao {
    
    @PersistenceContext
    private EntityManager em;
    
    public List<Estacionamientos> listarTodo(){
        String jpql = "select u from estacionamientos u";
        return em.createQuery(jpql, Estacionamientos.class).getResultList();
    }
    
}
