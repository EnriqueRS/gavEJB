/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.gav.controladores;

import es.gav.entidades.FieldDataFieldMaximoPujadorId;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Enrique Ríos Santos
 */
@Stateless
public class FieldDataFieldMaximoPujadorIdFacade extends AbstractFacade<FieldDataFieldMaximoPujadorId> {
    @PersistenceContext(unitName = "gavEJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FieldDataFieldMaximoPujadorIdFacade() {
        super(FieldDataFieldMaximoPujadorId.class);
    }
    
}
