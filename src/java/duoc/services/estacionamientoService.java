/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.services;

import duoc.dao.estacionamientosDao;
import duoc.entidades.Estacionamientos;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author samm
 */
@Service("estacionamientoService")
public class estacionamientoService {
    estacionamientosDao estaDao;
    
    public List<Estacionamientos> todo(){
        return estaDao.listarTodo();
    }
    
}
