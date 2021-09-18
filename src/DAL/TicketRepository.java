/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Ticket;
import java.util.List;

/**
 *
 * @author Admin
 */
public class TicketRepository extends MovieEntMen implements TicketInterface{

    @Override
    public void create(Ticket t) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.persist(t);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Ticket t) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.merge(t);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Ticket t) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.remove(t);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Ticket> findAll() throws MovieException {
        try{
        return mem.createNamedQuery("Ticket.findAll").getResultList();
        }
        catch(Exception e){
            throw new MovieException("Msg \n " + e.getMessage());
        }
    }

    @Override
    public Ticket findMyId(Integer id) throws MovieException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
