package com.projectpro.controller;

import com.projectpro.ejb.ProyectoFacadeLocal;
import com.projectpro.model.Proyecto;
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
public class ProyectoController implements Serializable{
    
    @EJB
    private ProyectoFacadeLocal proyectoEJB;
    private Proyecto proyecto;
    private List<Proyecto> proyectos;

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }
    
    @PostConstruct
    public void init() {
        proyecto = new Proyecto();
        proyectos = proyectoEJB.findAll();
    }
    
    public void registrar() {
        try {
            proyectoEJB.create(proyecto);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro Exitoso!", ""));
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Registro no Realizado!", ""));
        }
    }
}
