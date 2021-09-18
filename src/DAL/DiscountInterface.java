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
public interface DiscountInterface {
    void create(Discount d) throws MovieException;
    void edit(Discount d) throws MovieException;
    void delete(Discount d) throws MovieException;
    List <Discount> findAll() throws MovieException;
    Discount findMyId(Integer id) throws MovieException;
}
