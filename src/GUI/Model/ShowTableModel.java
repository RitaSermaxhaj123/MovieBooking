/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BLL.ShowTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
public class ShowTableModel extends AbstractTableModel{

    List<ShowTime> lista;
    String[] cols = {"ShowId","Movie","Hall","Start Date","End Date","Show Time"};
    
    public ShowTableModel(){}
    
    public ShowTableModel(List<ShowTime> lista){
        this.lista=lista;
    }
    public void addLista(List<ShowTime> lista){
        this.lista=lista;
    }
    @Override
    public int getRowCount() {
        return lista.size();
    }

    public String getColumnName(int col){
        return cols[col];
    }
    
    @Override
    public int getColumnCount() {
        return cols.length;
    }
    
    public ShowTime getShowTime(int index){
        return lista.get(index);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ShowTime sht = lista.get(rowIndex);
        switch(columnIndex){
            case 0:
                return sht.getShowID();
            case 1:
                return sht.getMovie();
            case 2:
                return sht.getHall();
            case 3:
                return getDatetoString(sht.getShSDate());
            case 4:
                return getDatetoString(sht.getShEDate());
            case 5:
                return sht.getShTime();
            default:
                    return null;
        }
    }
    
    public String getDatetoString(Date d){
        DateFormat da= new SimpleDateFormat("dd-MM-yyyy");
        return da.format(d);
    }
    
}
