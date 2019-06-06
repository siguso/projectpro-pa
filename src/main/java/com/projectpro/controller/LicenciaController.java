package com.projectpro.controller;

import com.projectpro.ejb.LicenciaFacadeLocal;
import com.projectpro.model.Licencia;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class LicenciaController implements Serializable{
    
    @EJB
    private LicenciaFacadeLocal licenciaEJB;
    private Licencia licencia;
    private List<Licencia> licencias;

    public Licencia getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }

    public List<Licencia> getLicencias() {
        return licencias;
    }

    public void setLicencias(List<Licencia> licencias) {
        this.licencias = licencias;
    }
    
    @PostConstruct
    public void init() {
        licencia = new Licencia();
        licencias = licenciaEJB.findAll();
    }
    
}
