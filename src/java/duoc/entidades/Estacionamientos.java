package duoc.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author samm
 */
@Entity
@Table(name = "estacionamientos")
public class Estacionamientos{

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Integer id;    
    private String nombre;
    private Integer valor; 

    public Estacionamientos() {
    }

    public Estacionamientos(Integer id, String nombre, Integer valor) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
    }    

    public Estacionamientos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Estacionamientos{" + "id=" + id + ", nombre=" + nombre + ", valor=" + valor + '}';
    }
    
}
