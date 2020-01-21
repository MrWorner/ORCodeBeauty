/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

public class TableComboBoxTest extends JFrame {

    private JTable table;
    private DefaultTableModel tableModel;
    private Object[][] tableCells;
    private final String[] TABLE_COLUMNS = {"No.1"};
    private final String[] YES_NO_SELECTION = {"Yes", "No"};

    public TableComboBoxTest() {
        Container pane = getContentPane();
        pane.setLayout(new BorderLayout());
        tableModel = new DefaultTableModel(tableCells, TABLE_COLUMNS);

        table = new JTable(tableModel);

        DefaultCellEditor cellEditor = null;

        JComboBox selA = new JComboBox(YES_NO_SELECTION);
        cellEditor = new DefaultCellEditor(selA);
        cellEditor.setClickCountToStart(1);
        table.getColumn(TABLE_COLUMNS[0]).setCellEditor(cellEditor);

        JScrollPane jsp = new JScrollPane();
        jsp.getViewport().add(table, null);
        pane.add(jsp, BorderLayout.CENTER);

        TableCellEditor tce = null;
        addRow("Yes");
        outputDefaultSelection(0, 0);

        addRow("No");
        outputDefaultSelection(1, 0);

        System.out.println("");

        selA.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    JComboBox cb = (JComboBox) e.getSource();
                    String sel = (String) cb.getSelectedItem();
                    int rowIndex = table.getSelectedRow();
                    rowIndex = table.convertRowIndexToModel(rowIndex);

                    if (rowIndex == -1) {
                        return;
                    }

                    outputDefaultSelection(rowIndex, 0);
                    System.out.println("Select: " + sel + " at " + rowIndex);
                }
            }
        });
    }

    private void addRow(String v1) {
        Vector<String> vec = new Vector<String>();
        vec.add(v1);

        tableModel.addRow(vec);
        tableModel.fireTableDataChanged();
    }

    private void outputDefaultSelection(int row, int col) {
        TableCellEditor tce = table.getCellEditor(row, col);
        System.out.println("Default " + row + "-" + col + " Selection: " + tce.getCellEditorValue());
        System.out.println("Default " + row + "-" + col + " Value: " + table.getModel().getValueAt(row, col));
    }

    public static void main(String[] args) {
        TableComboBoxTest stt = new TableComboBoxTest();
        stt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        stt.setSize(200, 100);
        stt.setVisible(true);
    }
}
