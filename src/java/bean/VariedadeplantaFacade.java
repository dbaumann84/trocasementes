/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entidade.Variedadeplanta;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author profe
 */
@Stateless
public class VariedadeplantaFacade extends AbstractFacade<Variedadeplanta> {

    @PersistenceContext(unitName = "TrocaDeSemestesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VariedadeplantaFacade() {
        super(Variedadeplanta.class);
    }
    
}
