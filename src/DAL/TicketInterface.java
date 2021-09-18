/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.Ticket;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface TicketInterface {
    void create(Ticket t) throws MovieException;
    void edit(Ticket t) throws MovieException;
    void delete(Ticket t) throws MovieException;
    List <Ticket> findAll() throws MovieException;
    Ticket findMyId(Integer id) throws MovieException;
}
