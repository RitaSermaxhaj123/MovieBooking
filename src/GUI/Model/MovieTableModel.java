/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.Movie;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
public class MovieTableModel extends AbstractTableModel{

    List<Movie> lista;
    String[] cols={"MovieID","Title","Type","Duration","Language","Desc"};
    
    public MovieTableModel(){}
    
    public MovieTableModel(List<Movie> lista){
        this.lista=lista;
    }
    
    public void addList(List<Movie> lista){
        this.lista=lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }
    
    public String getColumnName(int col) {
        return cols[col];
    }
    public Movie getMovie(int index){
        return lista.get(index);
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Movie m=lista.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return m.getMovieID();
            case 1:
                return m.getMTitle();
            case 2:
                return m.getMType();
            case 3:
                return m.getMDuration();
            case 4:
                return m.getMLanguage();
            case 5:
                return m.getMDesc();
            default:
                return null;
        }
    }
    
}
