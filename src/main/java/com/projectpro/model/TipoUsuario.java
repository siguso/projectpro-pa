package com.projectpro.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "tipo_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoUsuario.findAll", query = "SELECT t FROM TipoUsuario t")
    //, @NamedQuery(name = "TipoUsuario.findByCodTpuser", query = "SELECT t FROM TipoUsuario t WHERE t.codTpuser = :codTpuser")
    , @NamedQuery(name = "TipoUsuario.findBycod_tpuser", query = "SELECT t FROM TipoUsuario t WHERE t.cod_tpuser = :cod_tpuser")
    , @NamedQuery(name = "TipoUsuario.findByDescripcion", query = "SELECT t FROM TipoUsuario t WHERE t.descripcion = :descripcion")})
public class TipoUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_tpuser")
    //private Short codTpuser;
    private Short cod_tpuser;
    
    @Size(max = 35)
    @Column(name = "descripcion")
    private String descripcion;
    
    //@OneToMany(mappedBy = "codTpuser")
    @OneToMany(mappedBy = "cod_tpuser")
    private Collection<Usuario> usuarioCollection;

    public TipoUsuario() {
    }

    /*public TipoUsuario(Short codTpuser) {
        this.codTpuser = codTpuser;
    }

    public Short getCodTpuser() {
        return codTpuser;
    }

    public void setCodTpuser(Short codTpuser) {
        this.codTpuser = codTpuser;
    }*/

    public Short getCod_tpuser() {
        return cod_tpuser;
    }

    public void setCod_tpuser(Short cod_tpuser) {
        this.cod_tpuser = cod_tpuser;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    /*
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTpuser != null ? codTpuser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoUsuario)) {
            return false;
        }
        TipoUsuario other = (TipoUsuario) object;
        if ((this.codTpuser == null && other.codTpuser != null) || (this.codTpuser != null && !this.codTpuser.equals(other.codTpuser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectpro.model.TipoUsuario[ codTpuser=" + codTpuser + " ]";
    }*/
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_tpuser != null ? cod_tpuser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoUsuario)) {
            return false;
        }
        TipoUsuario other = (TipoUsuario) object;
        if ((this.cod_tpuser == null && other.cod_tpuser != null) || (this.cod_tpuser != null && !this.cod_tpuser.equals(other.cod_tpuser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectpro.model.TipoUsuario[ codTpuser=" + cod_tpuser + " ]";
    }
    
}
