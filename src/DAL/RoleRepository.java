/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Roles;
import java.util.List;

/**
 *
 * @author Admin
 */
public class RoleRepository extends MovieEntMen implements RoleInterface{

     public void create(Roles r) throws MovieException {
        try{
            //fillon komunikimin me databaze
            mem.getTransaction().begin();
            mem.persist(r);
            //ruan te dhenat e marruar
            mem.getTransaction().commit();
        }
        catch(Exception e){
        throw new MovieException("Msg \n" + e.getMessage()); //To change body of generated methods, choose Tools | Templates.
        }
    }

    @Override
    public void edit(Roles r) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.merge(r);
            mem.getTransaction().commit();
        }
        catch(Exception e){
        throw new MovieException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public void delete(Roles r) throws MovieException {
         try{ 
             mem.getTransaction().begin();
             mem.remove(r);
             mem.getTransaction().commit();
        }
        catch(Exception e){
        throw new MovieException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public List<Roles> findAll() throws MovieException {
         try{
             return mem.createNamedQuery("Roles.findAll").getResultList();
        }
        catch(Exception e){
        throw new MovieException("Msg \n"+ e.getMessage());
        }
    }

    @Override
    public Roles findMyId(Integer ID) throws MovieException {
       try{
        }
        catch(Exception e){
        throw new MovieException("Msg \n"+ e.getMessage());
        }
        return null;
    }

    
}
