package com.projectpro.controller;

import com.projectpro.model.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class GrupoController implements Serializable{
    
    @Inject
    private UsuarioController usuarioController;
    private Usuario usuario;
    
    @PostConstruct
    public void init(){
        this.usuario = usuarioController.getUsuario();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
