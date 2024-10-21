/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ever_vc
 */
@Entity
@Table(name = "mayor", catalog = "contamaster", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Mayor.findAll", query = "SELECT m FROM Mayor m")})
public class Mayor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "fecha_inicio", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @Column(name = "fecha_fin", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "total_debe", nullable = false, precision = 10, scale = 2)
    private BigDecimal totalDebe;
    @Basic(optional = false)
    @Column(name = "total_haber", nullable = false, precision = 10, scale = 2)
    private BigDecimal totalHaber;
    @Basic(optional = false)
    @Column(name = "saldo", nullable = false, precision = 10, scale = 2)
    private BigDecimal saldo;
    @Basic(optional = false)
    @Column(name = "saldo_anterior", nullable = false, precision = 10, scale = 2)
    private BigDecimal saldoAnterior;
    @JoinColumn(name = "id_cuenta_fk", referencedColumnName = "id")
    @ManyToOne
    private Cuenta idCuentaFk;

    public Mayor() {
    }

    public Mayor(Integer id) {
        this.id = id;
    }

    public Mayor(Integer id, Date fechaInicio, Date fechaFin, BigDecimal totalDebe, BigDecimal totalHaber, BigDecimal saldo, BigDecimal saldoAnterior) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.totalDebe = totalDebe;
        this.totalHaber = totalHaber;
        this.saldo = saldo;
        this.saldoAnterior = saldoAnterior;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public BigDecimal getTotalDebe() {
        return totalDebe;
    }

    public void setTotalDebe(BigDecimal totalDebe) {
        this.totalDebe = totalDebe;
    }

    public BigDecimal getTotalHaber() {
        return totalHaber;
    }

    public void setTotalHaber(BigDecimal totalHaber) {
        this.totalHaber = totalHaber;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(BigDecimal saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public Cuenta getIdCuentaFk() {
        return idCuentaFk;
    }

    public void setIdCuentaFk(Cuenta idCuentaFk) {
        this.idCuentaFk = idCuentaFk;
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
        if (!(object instanceof Mayor)) {
            return false;
        }
        Mayor other = (Mayor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Mayor[ id=" + id + " ]";
    }
    
}
