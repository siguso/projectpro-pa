package com.projectpro.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_usuario")
public class Tipo_Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private short cod_tpuser;
    
    @Column(name = "descripcion")
    private String descripcion;

    public int getCod_tpuser() {
        return cod_tpuser;
    }

    public void setCod_tpuser(short cod_tpuser) {
        this.cod_tpuser = cod_tpuser;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.cod_tpuser;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tipo_Usuario other = (Tipo_Usuario) obj;
        if (this.cod_tpuser != other.cod_tpuser) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tipo_Usuario{" + "cod_tpuser=" + cod_tpuser + '}';
    }
    
    
}
