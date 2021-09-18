/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Booking;
import java.util.List;

/**
 *
 * @author Admin
 */
public class BookingRepository extends MovieEntMen implements BookingInterface {

    @Override
    public void create(Booking b) throws MovieException {
       try{
            mem.getTransaction().begin();
            mem.persist(b);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Booking b) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.merge(b);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Booking b) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.remove(b);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Booking> findAll() throws MovieException {
        try{
            return mem.createNamedQuery("Booking.findAll").getResultList();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" +e.getMessage());
        }
    }

    @Override
    public Booking findMyId(Integer id) throws MovieException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
