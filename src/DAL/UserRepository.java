/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Users;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Admin
 */
public class UserRepository extends MovieEntMen implements UserInterface{

    @Override
    public void create(Users u) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.persist(u);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Users u) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.merge(u);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Users u) throws MovieException {
       try{
            mem.getTransaction().begin();
            mem.remove(u);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Users> findAll() throws MovieException {
        try{
        return mem.createNamedQuery("Users.findAll").getResultList();
        }
        catch(Exception e){
            throw new MovieException("Msg \n " + e.getMessage());
        }
    }

    @Override
    public Users findMyId(Integer id) throws MovieException {
        Query query=mem.createQuery("SELECT u from Users u WHERE u.userID = :param");
        query.setParameter("param", id);
        return (Users)query.getResultList();
    }

    @Override
    public Users loginUser(String u, String p) throws MovieException {
        try{
            Query query=mem.createQuery("Select u from Users u where u.email = :email AND u.upassword = :pass ");
            query.setParameter("email",u);
            query.setParameter("pass", p);
            return (Users)query.getSingleResult();
        }
        catch(Exception e){
            throw new MovieException("Msg \n"+e.getMessage());
        }
    }
    
}
