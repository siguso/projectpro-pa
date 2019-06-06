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
@Table(name = "licencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Licencia.findAll", query = "SELECT l FROM Licencia l")
    , @NamedQuery(name = "Licencia.findByCodLicencia", query = "SELECT l FROM Licencia l WHERE l.codLicencia = :codLicencia")
    , @NamedQuery(name = "Licencia.findByNombre", query = "SELECT l FROM Licencia l WHERE l.nombre = :nombre")
    , @NamedQuery(name = "Licencia.findByDescripcion", query = "SELECT l FROM Licencia l WHERE l.descripcion = :descripcion")})
public class Licencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "cod_licencia")
    private Short codLicencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "codLicencia")
    private Collection<Proyecto> proyectoCollection;

    public Licencia() {
    }

    public Licencia(Short codLicencia) {
        this.codLicencia = codLicencia;
    }

    public Licencia(Short codLicencia, String nombre) {
        this.codLicencia = codLicencia;
        this.nombre = nombre;
    }

    public Short getCodLicencia() {
        return codLicencia;
    }

    public void setCodLicencia(Short codLicencia) {
        this.codLicencia = codLicencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<Proyecto> getProyectoCollection() {
        return proyectoCollection;
    }

    public void setProyectoCollection(Collection<Proyecto> proyectoCollection) {
        this.proyectoCollection = proyectoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codLicencia != null ? codLicencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Licencia)) {
            return false;
        }
        Licencia other = (Licencia) object;
        if ((this.codLicencia == null && other.codLicencia != null) || (this.codLicencia != null && !this.codLicencia.equals(other.codLicencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectpro.model.Licencia[ codLicencia=" + codLicencia + " ]";
    }
    
}
