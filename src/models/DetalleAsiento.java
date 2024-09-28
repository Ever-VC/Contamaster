/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author ever_vc
 */
@Entity
@Table(name = "detalle_asiento", catalog = "contamaster", schema = "public")
@NamedQueries({
    @NamedQuery(name = "DetalleAsiento.findAll", query = "SELECT d FROM DetalleAsiento d")})
public class DetalleAsiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @JoinColumn(name = "id_asiento_fk", referencedColumnName = "id")
    @ManyToOne
    private Asiento idAsientoFk;
    @JoinColumn(name = "id_movimiento_fk", referencedColumnName = "id")
    @ManyToOne
    private Movimiento idMovimientoFk;

    public DetalleAsiento() {
    }

    public DetalleAsiento(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Asiento getIdAsientoFk() {
        return idAsientoFk;
    }

    public void setIdAsientoFk(Asiento idAsientoFk) {
        this.idAsientoFk = idAsientoFk;
    }

    public Movimiento getIdMovimientoFk() {
        return idMovimientoFk;
    }

    public void setIdMovimientoFk(Movimiento idMovimientoFk) {
        this.idMovimientoFk = idMovimientoFk;
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
        if (!(object instanceof DetalleAsiento)) {
            return false;
        }
        DetalleAsiento other = (DetalleAsiento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.DetalleAsiento[ id=" + id + " ]";
    }
    
}
