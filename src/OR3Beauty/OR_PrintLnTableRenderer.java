/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OR3Beauty;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

/**
 * https://coderanch.com/t/339854/java/jTable-setBackground-Color-Row
 * @author User
 */

public class OR_PrintLnTableRenderer extends DefaultTableCellRenderer 
{
    public OR_PrintLnTableRenderer() 
    {
        super();
        setOpaque(true);
    } 
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column) 
    { 
        if((boolean)table.getValueAt(row, 0))
        {
            setForeground(Color.black);        
            setBackground(Color.red);            
        }    
        else
        {    
            setBackground(Color.white);    
            setForeground(Color.black);    
        } 
        setText(value !=null ? value.toString() : "");
        return this;
    }
}
