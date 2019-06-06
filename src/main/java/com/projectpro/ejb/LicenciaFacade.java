package com.projectpro.ejb;

import com.projectpro.model.Licencia;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class LicenciaFacade extends AbstractFacade<Licencia> implements LicenciaFacadeLocal {

    @PersistenceContext(unitName = "projectproPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LicenciaFacade() {
        super(Licencia.class);
    }
    
}
