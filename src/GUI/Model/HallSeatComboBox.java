/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;


import BLL.HallSeat;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author 38344
 */

public class HallSeatComboBox extends AbstractListModel<HallSeat> implements ComboBoxModel<HallSeat>{

    private List<HallSeat> data;
    private HallSeat selectedItem;
    
    public HallSeatComboBox(){}
    public HallSeatComboBox(List<HallSeat> data){
        this.data=data;
    }
    
    @Override
    public int getSize() {
        return data.size();
    }
    public void add(List<HallSeat> data){
        this.data=data;
    }
    @Override
    public HallSeat getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem=(HallSeat)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
    
}
