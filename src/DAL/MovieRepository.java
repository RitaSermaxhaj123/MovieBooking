/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Movie;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Admin
 */
public class MovieRepository extends MovieEntMen implements MovieInterface{

    @Override
    public void create(Movie m) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.persist(m);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void edit(Movie m) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.merge(m);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public void delete(Movie m) throws MovieException {
        try{
            mem.getTransaction().begin();
            mem.remove(m);
            mem.getTransaction().commit();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public List<Movie> findAll() throws MovieException {
        try{
        return mem.createNamedQuery("Movie.findAll").getResultList();
        }
        catch(Exception e){
            throw new MovieException("Msg \n" + e.getMessage());
        }
    }

    @Override
    public Movie findMyId(Integer id) throws MovieException {
        Query query=mem.createQuery("SELECT m from Movie m WHERE m.MovieID = :param");
        query.setParameter("param", id);
        return (Movie)query.getResultList();
    }
    
}
