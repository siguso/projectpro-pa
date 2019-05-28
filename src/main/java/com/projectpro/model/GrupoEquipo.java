package com.projectpro.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "grupo_equipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GrupoEquipo.findAll", query = "SELECT g FROM GrupoEquipo g")
    , @NamedQuery(name = "GrupoEquipo.findByCodGrupoEquipo", query = "SELECT g FROM GrupoEquipo g WHERE g.codGrupoEquipo = :codGrupoEquipo")
    , @NamedQuery(name = "GrupoEquipo.findByNombre", query = "SELECT g FROM GrupoEquipo g WHERE g.nombre = :nombre")
    , @NamedQuery(name = "GrupoEquipo.findByFechaCreacion", query = "SELECT g FROM GrupoEquipo g WHERE g.fechaCreacion = :fechaCreacion")})
public class GrupoEquipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_grupo_equipo")
    private Short codGrupoEquipo;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    
    @OneToMany(mappedBy = "codGrupoEquipo")
    private Collection<Usuario> usuarioCollection;

    public GrupoEquipo() {
    }

    public GrupoEquipo(Short codGrupoEquipo) {
        this.codGrupoEquipo = codGrupoEquipo;
    }

    public GrupoEquipo(Short codGrupoEquipo, String nombre, Date fechaCreacion) {
        this.codGrupoEquipo = codGrupoEquipo;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    public Short getCodGrupoEquipo() {
        return codGrupoEquipo;
    }

    public void setCodGrupoEquipo(Short codGrupoEquipo) {
        this.codGrupoEquipo = codGrupoEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codGrupoEquipo != null ? codGrupoEquipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrupoEquipo)) {
            return false;
        }
        GrupoEquipo other = (GrupoEquipo) object;
        if ((this.codGrupoEquipo == null && other.codGrupoEquipo != null) || (this.codGrupoEquipo != null && !this.codGrupoEquipo.equals(other.codGrupoEquipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectpro.model.GrupoEquipo[ codGrupoEquipo=" + codGrupoEquipo + " ]";
    }
    
}
