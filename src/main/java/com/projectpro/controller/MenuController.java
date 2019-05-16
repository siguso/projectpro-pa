package com.projectpro.controller;

import com.projectpro.model.Usuario;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@SessionScoped
public class MenuController implements Serializable {
    
    public void cerrarSesion(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
    }
    
    public String mostrarEmailUsuarioLogeado(){
        Usuario us =(Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
        return us.getEmail();
    }
    
    public String mostrarUsuarioLogeado(){
        Usuario us =(Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
        return us.getNom1() + " " + us.getNom2() + " " + us.getApell1() + " " + us.getApell2();
    }
    
}
