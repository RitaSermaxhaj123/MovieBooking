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
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Admin
 */
public class HallComboBox extends AbstractListModel<Hall> implements ComboBoxModel<Hall>{

    private List<Hall> data;
    private Hall selectedItem;
    
    public HallComboBox(){}
    public HallComboBox(List<Hall> data){
        this.data=data;
    }
    
    @Override
    public int getSize() {
        return data.size();
    }
    public void add(List<Hall> data){
        this.data=data;
    }
    @Override
    public Hall getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem=(Hall)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
    
}
