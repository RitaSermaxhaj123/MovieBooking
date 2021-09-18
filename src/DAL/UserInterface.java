/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Users;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface UserInterface {
    void create(Users u) throws MovieException;
    void edit(Users u) throws MovieException;
    void delete(Users u) throws MovieException;
    List <Users> findAll() throws MovieException;
    Users findMyId(Integer id) throws MovieException;
    Users loginUser(String u, String p) throws MovieException;
}
