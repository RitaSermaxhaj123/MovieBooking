/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.HallSeat;
import java.util.List;

/**
 *
 * @author 38344
 */
public class HallSeatRepository extends MovieEntMen implements HallSeatInterface{

    @Override
    public void create(HallSeat hs) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.persist(hs);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(HallSeat hs) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.merge(hs);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(HallSeat hs) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.remove(hs);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<HallSeat> findAll() throws MovieException {
        try{
            return mem.createNamedQuery("HallSeat.findAll").getResultList();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" +e.getMessage());
        }
    }

    @Override
    public HallSeat findMyId(Integer SeatID) throws MovieException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
