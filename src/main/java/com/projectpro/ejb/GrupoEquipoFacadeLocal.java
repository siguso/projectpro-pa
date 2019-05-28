package com.projectpro.ejb;

import com.projectpro.model.GrupoEquipo;
import java.util.List;
import javax.ejb.Local;

@Local
public interface GrupoEquipoFacadeLocal {

    void create(GrupoEquipo grupoEquipo);

    void edit(GrupoEquipo grupoEquipo);

    void remove(GrupoEquipo grupoEquipo);

    GrupoEquipo find(Object id);

    List<GrupoEquipo> findAll();

    List<GrupoEquipo> findRange(int[] range);

    int count();
    
}
