/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.flavio_jara_r_proyectojpa.ejb;

import com.mycompany.flavio_jara_r_proyectojpa.entidades.Pieza;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Intr4Snak3
 */
@Stateless
public class PiezaFacade extends AbstractFacade<Pieza> {

    @PersistenceContext(unitName = "PruebaFlavioJaraPersistenceJPA")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PiezaFacade() {
        super(Pieza.class);
    }
    
}
