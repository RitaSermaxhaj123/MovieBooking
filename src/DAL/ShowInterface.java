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
public interface ShowInterface {
    void create(ShowTime sh) throws MovieException;
    void edit(ShowTime sh) throws MovieException;
    void delete(ShowTime sh) throws MovieException;
    List <ShowTime> findAll() throws MovieException;
    ShowTime findMyId(Integer id) throws MovieException;
}
