package com.projectpro.ejb;

import com.projectpro.model.Categoria;
import java.util.List;
import javax.ejb.Local;

@Local
public interface CategoriaFacadeLocal {

    void create(Categoria categoria);

    void edit(Categoria categoria);

    void remove(Categoria categoria);

    Categoria find(Object id);

    List<Categoria> findAll();

    List<Categoria> findRange(int[] range);

    int count();
    
}
