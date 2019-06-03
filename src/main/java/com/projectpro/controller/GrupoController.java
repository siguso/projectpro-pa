package com.projectpro.controller;

import com.projectpro.ejb.GrupoEquipoFacadeLocal;
import com.projectpro.model.GrupoEquipo;
import com.projectpro.model.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
//import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
//@SessionScoped
public class GrupoController implements Serializable{
    
    @EJB
    private GrupoEquipoFacadeLocal grupoEJB;
    private GrupoEquipo grupoEquipo;
    
    public GrupoEquipo getGrupoEquipo() {
        return grupoEquipo;
    }

    public void setGrupoEquipo(GrupoEquipo grupoEquipo) {
        this.grupoEquipo = grupoEquipo;
    }
    
    @PostConstruct
    public void init(){
        grupoEquipo = new GrupoEquipo();
    }
    
    public void registrar() {
        try {
            grupoEJB.create(grupoEquipo);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro Exitoso!", ""));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Registro no Realizado!", ""));
        }
    }
    
}
