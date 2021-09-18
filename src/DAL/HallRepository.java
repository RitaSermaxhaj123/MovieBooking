/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Hall;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author 38344
 */
public class HallRepository extends MovieEntMen implements HallInterface{

    @Override
    public void create(Hall h) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.persist(h);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Hall h) throws MovieException {
         try{
            mem.getTransaction().begin();
            mem.merge(h);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Hall h) throws MovieException {
         try{
            mem.getTransaction().begin();
            mem.remove(h);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Hall> findAll() throws MovieException {
        try{
        return mem.createNamedQuery("Hall.findAll").getResultList();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Hall findMyId(Integer MovieID) throws MovieException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Hall findByHallName(String HallName){
        Query query=mem.createQuery("SELECT h from Hall h WHERE h.hallName = :param");
        query.setParameter("param", HallName);
        return (Hall)query.getResultList();
    }
    
}
