/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoc.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author samm
 */
@Entity
@Table(name = "estacionamientos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estacionamientos.findAll", query = "SELECT e FROM Estacionamientos e"),
    @NamedQuery(name = "Estacionamientos.findById", query = "SELECT e FROM Estacionamientos e WHERE e.id = :id"),
    @NamedQuery(name = "Estacionamientos.findByNombre", query = "SELECT e FROM Estacionamientos e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Estacionamientos.findByValor", query = "SELECT e FROM Estacionamientos e WHERE e.valor = :valor")})
public class Estacionamientos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 250)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "valor")
    private Integer valor;
    @OneToMany(mappedBy = "estacionamientoId")
    private List<Tickets> ticketsList;

    public Estacionamientos() {
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

    @XmlTransient
    public List<Tickets> getTicketsList() {
        return ticketsList;
    }

    public void setTicketsList(List<Tickets> ticketsList) {
        this.ticketsList = ticketsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estacionamientos)) {
            return false;
        }
        Estacionamientos other = (Estacionamientos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "duoc.entidades.Estacionamientos[ id=" + id + " ]";
    }
    
}
