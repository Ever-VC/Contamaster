/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.Serializable;
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
@Table(name = "session_log", catalog = "contamaster", schema = "public")
@NamedQueries({
    @NamedQuery(name = "SessionLog.findAll", query = "SELECT s FROM SessionLog s")})
public class SessionLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "login_timestamp", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date loginTimestamp;
    @Column(name = "logout_timestamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date logoutTimestamp;
    @JoinColumn(name = "id_usuario_fk", referencedColumnName = "id")
    @ManyToOne
    private Usuario idUsuarioFk;

    public SessionLog() {
    }

    public SessionLog(Integer id) {
        this.id = id;
    }

    public SessionLog(Integer id, Date loginTimestamp) {
        this.id = id;
        this.loginTimestamp = loginTimestamp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getLoginTimestamp() {
        return loginTimestamp;
    }

    public void setLoginTimestamp(Date loginTimestamp) {
        this.loginTimestamp = loginTimestamp;
    }

    public Date getLogoutTimestamp() {
        return logoutTimestamp;
    }

    public void setLogoutTimestamp(Date logoutTimestamp) {
        this.logoutTimestamp = logoutTimestamp;
    }

    public Usuario getIdUsuarioFk() {
        return idUsuarioFk;
    }

    public void setIdUsuarioFk(Usuario idUsuarioFk) {
        this.idUsuarioFk = idUsuarioFk;
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
        if (!(object instanceof SessionLog)) {
            return false;
        }
        SessionLog other = (SessionLog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.SessionLog[ id=" + id + " ]";
    }
    
}
