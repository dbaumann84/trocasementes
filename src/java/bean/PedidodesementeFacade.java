/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entidade.Pedidodesemente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author profe
 */
@Stateless
public class PedidodesementeFacade extends AbstractFacade<Pedidodesemente> {

    @PersistenceContext(unitName = "TrocaDeSemestesPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PedidodesementeFacade() {
        super(Pedidodesemente.class);
    }
    
}
