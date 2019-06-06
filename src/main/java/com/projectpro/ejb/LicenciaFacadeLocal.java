package com.projectpro.ejb;

import com.projectpro.model.Licencia;
import java.util.List;
import javax.ejb.Local;

@Local
public interface LicenciaFacadeLocal {

    void create(Licencia licencia);

    void edit(Licencia licencia);

    void remove(Licencia licencia);

    Licencia find(Object id);

    List<Licencia> findAll();

    List<Licencia> findRange(int[] range);

    int count();
    
}
