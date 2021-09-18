/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.ShowTime;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ShowRepository extends MovieEntMen implements ShowInterface{

    @Override
    public void create(ShowTime sh) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.persist(sh);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(ShowTime sh) throws MovieException {
       try{
            mem.getTransaction().begin();
            mem.merge(sh);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(ShowTime sh) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.remove(sh);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<ShowTime> findAll() throws MovieException {
        try{
            return mem.createNamedQuery("ShowTime.findAll").getResultList();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public ShowTime findMyId(Integer id) throws MovieException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
