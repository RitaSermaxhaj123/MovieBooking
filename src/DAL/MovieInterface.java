/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Movie;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface MovieInterface {
    void create(Movie m) throws MovieException;
    void edit(Movie m) throws MovieException;
    void delete(Movie m) throws MovieException;
    List <Movie> findAll() throws MovieException;
    Movie findMyId(Integer MovieID) throws MovieException;
}
