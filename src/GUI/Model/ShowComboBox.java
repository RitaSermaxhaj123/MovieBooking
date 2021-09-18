/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

/**
 *
 * @author Admin
 */
import BLL.Hall;
import BLL.ShowTime;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Admin
 */
public class ShowComboBox extends AbstractListModel<ShowTime> implements ComboBoxModel<ShowTime>{

    private List<ShowTime> data;
    private ShowTime selectedItem;
    
    public ShowComboBox(){}
    public ShowComboBox(List<ShowTime> data){
        this.data=data;
    }
    
    @Override
    public int getSize() {
        return data.size();
    }
    public void add(List<ShowTime> data){
        this.data=data;
    }
    @Override
    public ShowTime getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem=(ShowTime)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
}
