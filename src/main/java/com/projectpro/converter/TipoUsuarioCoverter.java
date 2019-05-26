package com.projectpro.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("tipoUsuarioConverter")
public class TipoUsuarioCoverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return value;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        int tipo_usu = 0;
        String tipo_usuario = "";
        
        if(value != null){
            switch(tipo_usu){
                case 0:
                    tipo_usuario = "ADMINISTRADOR";
                    break;
                case 1:
                    tipo_usuario = "LECTOR";
                    break;
                case 2:
                    tipo_usuario = "AUTOR";
                    break;
                case 3:
                    tipo_usuario = "EVALUADOR";
                    break;
                case 4:
                    tipo_usuario = "FINANCIADOR";
                    break;    
            }
            /*tipo_usuario = (String) value;
            switch(tipo_usuario){
                case "0":
                    tipo_usuario = "ADMINISTRADOR";
                    break;
                case "1":
                    tipo_usuario = "LECTOR";
                    break;
                case "2":
                    tipo_usuario = "AUTOR";
                    break;
                case "3":
                    tipo_usuario = "EVALUADOR";
                    break;
                case "4":
                    tipo_usuario = "FINANCIADOR";
                    break;    
            }*/
            
        }
        return tipo_usuario;
    }
    
}
