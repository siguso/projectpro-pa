package com.projectpro.ejb;

import com.projectpro.model.GrupoEquipo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class GrupoEquipoFacade extends AbstractFacade<GrupoEquipo> implements GrupoEquipoFacadeLocal {

    @PersistenceContext(unitName = "projectproPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GrupoEquipoFacade() {
        super(GrupoEquipo.class);
    }
    
}
