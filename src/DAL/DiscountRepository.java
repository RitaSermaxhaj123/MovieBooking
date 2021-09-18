/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Discount;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DiscountRepository extends MovieEntMen implements DiscountInterface {

    @Override
    public void create(Discount d) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.persist(d);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Discount d) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.merge(d);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Discount d) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.remove(d);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Discount> findAll() throws MovieException {
        try{
            return mem.createNamedQuery("Discount.findAll").getResultList();
        }
        catch(Exception e){
            throw new MovieException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public Discount findMyId(Integer id) throws MovieException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
