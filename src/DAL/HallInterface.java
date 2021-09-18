/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Hall;
import java.util.List;

/**
 *
 * @author 38344
 */
public interface HallInterface {
    void create(Hall h) throws MovieException;
    void edit(Hall h) throws MovieException;
    void delete(Hall h) throws MovieException;
    List <Hall> findAll() throws MovieException;
    Hall findMyId(Integer MovieID) throws MovieException;
}
