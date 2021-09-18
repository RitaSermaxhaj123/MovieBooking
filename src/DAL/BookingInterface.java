/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Booking;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface BookingInterface {
    void create(Booking b) throws MovieException;
    void edit(Booking b) throws MovieException;
    void delete(Booking b) throws MovieException;
    List <Booking> findAll() throws MovieException;
    Booking findMyId(Integer id) throws MovieException;
}
