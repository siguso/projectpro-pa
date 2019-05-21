package com.projectpro.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cod_usuario;
    
    @Column(name = "nom1")
    private String nom1;
    
    @Column(name = "nom2")
    private String nom2;
    
    @Column(name = "apell1")
    private String apell1;
    
    @Column(name = "apell2")
    private String apell2;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "pass")
    private String pass;
    
    @Column(name = "cel")
    private String cel;
    
    @Column(name = "activo")
    private short activo = 1;
    
    @Column(name = "cod_tpuser")
    private short cod_tpuser = 1;
    
    @Lob()
    @Column(name = "img")
    private byte[] img;
    
    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getNom1() {
        return nom1;
    }

    public void setNom1(String nom1) {
        this.nom1 = nom1;
    }

    public String getNom2() {
        return nom2;
    }

    public void setNom2(String nom2) {
        this.nom2 = nom2;
    }

    public String getApell1() {
        return apell1;
    }

    public void setApell1(String apell1) {
        this.apell1 = apell1;
    }

    public String getApell2() {
        return apell2;
    }

    public void setApell2(String apell2) {
        this.apell2 = apell2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }
    
    public short getActivo() {
        return activo;
    }

    public void setActivo(short activo) {
        this.activo = activo;
    }

    public short getCod_tpuser() {
        return cod_tpuser;
    }

    public void setCod_tpuser(short cod_tpuser) {
        this.cod_tpuser = cod_tpuser;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.cod_usuario;
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
        final Usuario other = (Usuario) obj;
        if (this.cod_usuario != other.cod_usuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "cod_usuario=" + cod_usuario + '}';
    }
    
    
}
