package com.projectpro.controller;

import com.projectpro.ejb.UsuarioFacadeLocal;
import com.projectpro.model.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
//import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
//@ViewScoped
@SessionScoped
public class UsuarioController implements Serializable {
    
    @EJB
    private UsuarioFacadeLocal usuarioEJB;
    private Usuario usuario;
    private List<Usuario>usuarios;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    @PostConstruct
    public void init(){
        usuario = new Usuario();
        usuarios = usuarioEJB.findAll();
    }
    
    public void registrar(){
        try{
            usuarioEJB.create(usuario);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro Exitoso!", ""));
        }catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Registro no Realizado!", ""));
        }
    }
    
    public String modificar(Usuario usuario){
        this.usuario = usuario;
        return "update_user_data";
    }
    
    public void modificar(){
        try{
            usuarioEJB.edit(usuario);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Modificación Exitosa!", ""));
        }catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Modificación no Realizada!", ""));
        }
    }
   
    /*public void asignar(Usuario usuario){
        this.usuario = usuario;
    }*/
}
