/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import BLL.HallSeat;
import java.util.List;

/**
 *
 * @author 38344
 */
public interface HallSeatInterface {
    void create(HallSeat hs) throws MovieException;
    void edit(HallSeat hs) throws MovieException;
    void delete(HallSeat hs) throws MovieException;
    List <HallSeat> findAll() throws MovieException;
    HallSeat findMyId(Integer SeatID) throws MovieException;
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

