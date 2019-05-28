package com.projectpro.model;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    //, @NamedQuery(name = "Usuario.findByCodUsuario", query = "SELECT u FROM Usuario u WHERE u.codUsuario = :codUsuario")
    , @NamedQuery(name = "Usuario.findBycod_usuario", query = "SELECT u FROM Usuario u WHERE u.cod_usuario = :cod_usuario")
    , @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email")
    , @NamedQuery(name = "Usuario.findByCel", query = "SELECT u FROM Usuario u WHERE u.cel = :cel")
    , @NamedQuery(name = "Usuario.findByNom1", query = "SELECT u FROM Usuario u WHERE u.nom1 = :nom1")
    , @NamedQuery(name = "Usuario.findByNom2", query = "SELECT u FROM Usuario u WHERE u.nom2 = :nom2")
    , @NamedQuery(name = "Usuario.findByApell1", query = "SELECT u FROM Usuario u WHERE u.apell1 = :apell1")
    , @NamedQuery(name = "Usuario.findByApell2", query = "SELECT u FROM Usuario u WHERE u.apell2 = :apell2")
    , @NamedQuery(name = "Usuario.findByPass", query = "SELECT u FROM Usuario u WHERE u.pass = :pass")
    , @NamedQuery(name = "Usuario.findByActivo", query = "SELECT u FROM Usuario u WHERE u.activo = :activo")
    , @NamedQuery(name = "Usuario.findByImg", query = "SELECT u FROM Usuario u WHERE u.img = :img")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_usuario")
    //private Integer codUsuario;
    private Integer cod_usuario;
    
// @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "email")
    private String email;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "cel")
    private String cel;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "nom1")
    private String nom1;
    
    @Size(max = 25)
    @Column(name = "nom2")
    private String nom2;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "apell1")
    private String apell1;
    
    @Size(max = 25)
    @Column(name = "apell2")
    private String apell2;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "pass")
    private String pass;
    
    @Column(name = "activo")
    private Short activo;
    
    @Size(max = 100)
    @Column(name = "img")
    private String img;
    
    @JoinColumn(name = "cod_grupo_equipo", referencedColumnName = "cod_grupo_equipo")
    @ManyToOne
    private GrupoEquipo codGrupoEquipo;
    
    @JoinColumn(name = "cod_tpuser", referencedColumnName = "cod_tpuser")
    @ManyToOne
    //private TipoUsuario codTpuser;
    private TipoUsuario cod_tpuser;

    public Usuario() {
    }

    /*public Usuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }*/
    public Usuario(Integer cod_usuario){
        this.cod_usuario = cod_usuario;
    }

    //public Usuario(Integer codUsuario, String email, String cel, String nom1, String apell1, String pass) {
    public Usuario(Integer cod_usuario, String email, String cel, String nom1, String apell1, String pass) {
        //this.codUsuario = codUsuario;
        this.cod_usuario = cod_usuario;
        this.email = email;
        this.cel = cel;
        this.nom1 = nom1;
        this.apell1 = apell1;
        this.pass = pass;
    }

    /*public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }*/

    public Integer getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(Integer cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Short getActivo() {
        return activo;
    }

    public void setActivo(Short activo) {
        this.activo = activo;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public GrupoEquipo getCodGrupoEquipo() {
        return codGrupoEquipo;
    }

    public void setCodGrupoEquipo(GrupoEquipo codGrupoEquipo) {
        this.codGrupoEquipo = codGrupoEquipo;
    }

    /*public TipoUsuario getCodTpuser() {
        return codTpuser;
    }

    public void setCodTpuser(TipoUsuario codTpuser) {
        this.codTpuser = codTpuser;
    }*/

    public TipoUsuario getCod_tpuser() {
        return cod_tpuser;
    }

    public void setCod_tpuser(TipoUsuario cod_tpuser) {
        this.cod_tpuser = cod_tpuser;
    }
    
    /*@Override
    public int hashCode() {
        int hash = 0;
        hash += (codUsuario != null ? codUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.codUsuario == null && other.codUsuario != null) || (this.codUsuario != null && !this.codUsuario.equals(other.codUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectpro.model.Usuario[ codUsuario=" + codUsuario + " ]";
    }*/
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_usuario != null ? cod_usuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.cod_usuario == null && other.cod_usuario != null) || (this.cod_usuario != null && !this.cod_usuario.equals(other.cod_usuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.projectpro.model.Usuario[ cod_usuario=" + cod_usuario + " ]";
    }
    
    
}
