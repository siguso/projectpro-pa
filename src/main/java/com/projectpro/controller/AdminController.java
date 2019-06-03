package com.projectpro.controller;

import com.projectpro.ejb.UsuarioFacadeLocal;
import com.projectpro.model.TipoUsuario;
import com.projectpro.model.Usuario;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class AdminController implements Serializable{
    
    @EJB
    private UsuarioFacadeLocal usuarioEJB;
    private Usuario usuario;
    private List<Usuario> usuarios;
    private Usuario SelectUser;

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

    public Usuario getSelectUser() {
        return SelectUser;
    }

    public void setSelectUser(Usuario SelectUser) {
        this.SelectUser = SelectUser;
    }
    
    
    @PostConstruct
    public void init() {
        usuario = new Usuario();
        usuarios = usuarioEJB.findAll();
    }
    
    public void registrar() {
        try {
            TipoUsuario a = new TipoUsuario();
            short num = 1;
            a.setCod_tpuser(num);
            usuario.setCod_tpuser(a);
            usuarioEJB.create(usuario);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro Exitoso!", ""));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Registro no Realizado!", ""));
        }
    }
    
    public void modificar() {
        try {
            usuarioEJB.edit(usuario);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Modificación Exitosa!", ""));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Modificación no Realizada!", ""));
        }
    }
    
}
