/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entidade.Especiedeplanta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author profe
 */
@Stateless
public class EspeciedeplantaFacade extends AbstractFacade<Especiedeplanta> {

    @PersistenceContext(unitName = "TrocaDeSemestesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EspeciedeplantaFacade() {
        super(Especiedeplanta.class);
    }
    
}
