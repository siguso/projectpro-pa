package com.projectpro.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "proyecto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proyecto.findAll", query = "SELECT p FROM Proyecto p")
    , @NamedQuery(name = "Proyecto.findByCodProyecto", query = "SELECT p FROM Proyecto p WHERE p.codProyecto = :codProyecto")
    , @NamedQuery(name = "Proyecto.findByTitulo", query = "SELECT p FROM Proyecto p WHERE p.titulo = :titulo")
    //, @NamedQuery(name = "Proyecto.findByVisitas", query = "SELECT p FROM Proyecto p WHERE p.visitas = :visitas")
    //, @NamedQuery(name = "Proyecto.findByCalificacion", query = "SELECT p FROM Proyecto p WHERE p.calificacion = :calificacion")
    //, @NamedQuery(name = "Proyecto.findByLike", query = "SELECT p FROM Proyecto p WHERE p.like = :like")
    , @NamedQuery(name = "Proyecto.findByDescripcion", query = "SELECT p FROM Proyecto p WHERE p.descripcion = :descripcion")})
public class Proyecto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_proyecto")
    private Integer codProyecto;
    @Size(max = 45)
    @Column(name = "titulo")
    private String titulo;
    /*@Column(name = "visitas")
    private Integer visitas;
    @Column(name = "calificacion")
    private Integer calificacion;
    @Column(name = "´like´")
    private Integer like;*/
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    /*@Lob
    @Column(name = "img1")
    private byte[] img1;*/
    @JoinColumn(name = "cod_licencia", referencedColumnName = "cod_licencia")
    @ManyToOne
    private Licencia codLicencia;

    public Proyecto() {
    }

    public Proyecto(Integer codProyecto) {
        this.codProyecto = codProyecto;
    }

    public Integer getCodProyecto() {
        return codProyecto;
    }

    public void setCodProyecto(Integer codProyecto) {
        this.codProyecto = codProyecto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /*public Integer getVisitas() {
        return visitas;
    }

    public void setVisitas(Integer visitas) {
        this.visitas = visitas;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }*/

    /*public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }*/

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /*public byte[] getImg1() {
        return img1;
    }

    public void setImg1(byte[] img1) {
        this.img1 = img1;
    }*/

    public Licencia getCodLicencia() {
        return codLicencia;
    }

    public void setCodLicencia(Licencia codLicencia) {
        this.codLicencia = codLicencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProyecto != null ? codProyecto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proyecto)) {
            return false;
        }
        Proyecto other = (Proyecto) object;
        if ((this.codProyecto == null && other.codProyecto != null) || (this.codProyecto != null && !this.codProyecto.equals(other.codProyecto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectpro.model.Proyecto[ codProyecto=" + codProyecto + " ]";
    }
    
}
