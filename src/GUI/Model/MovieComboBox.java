/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.Movie;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Admin
 */
public class MovieComboBox extends AbstractListModel<Movie> implements ComboBoxModel<Movie>{

    private List<Movie> data;
    private Movie selectedItem;
    
    public MovieComboBox(){}
    public MovieComboBox(List<Movie> data){
        this.data=data;
    }
    
    public void add(List<Movie> data){
        this.data=data;
    }
    
    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Movie getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem=(Movie)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
    
}
