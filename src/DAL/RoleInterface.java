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
public interface RoleInterface {
    void create(Roles r) throws MovieException;
    void edit(Roles r) throws MovieException;
    void delete(Roles r) throws MovieException;
    List <Roles> findAll() throws MovieException;
    Roles findMyId(Integer ID) throws MovieException;
}
