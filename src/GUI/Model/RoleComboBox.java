/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.Roles;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Admin
 */
public class RoleComboBox extends AbstractListModel<Roles> implements ComboBoxModel<Roles> {

    private List<Roles> data;
    private Roles selectedItem;

    public RoleComboBox() {
    }
    public void add(List<Roles> data){
        this.data=data;
    }
    public RoleComboBox(List<Roles> data) {
        this.data = data;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Roles getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem=(Roles)anItem;
    }

    @Override
    public Object getSelectedItem() {
         return selectedItem;
    }

}
