
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class CheckboxSample extends JFrame implements ActionListener {

    //vars
    JCheckBox cb1, cb2, cb3, cb4, cb5, cb6;
    JTextArea ta;
    String text = "";
    JLabel lbl;

    CheckboxSample() {

        Container c = getContentPane();
        c.setBackground(Color.BLACK);
        c.setLayout(new FlowLayout());

        ta = new JTextArea(10, 20);

        //create two check boxes
        cb1 = new JCheckBox("Java");
        cb2 = new JCheckBox("C#");
        cb3 = new JCheckBox("VB.Net");
        cb4 = new JCheckBox("Python");
        cb5 = new JCheckBox("C++");
        cb6 = new JCheckBox("Objective-C");

        lbl = new JLabel("Choose your favorite programming language/s: ");

        //add the checkboxes,  textarea to the container
        lbl.setForeground(Color.white);
        c.add(lbl);
        c.add(cb1);
        c.add(cb2);
        c.add(cb3);
        c.add(cb4);
        c.add(cb5);
        c.add(cb6);
        c.add(ta);
        ta.enable(false);

        //add action listeners. We need not add listener to text area
        //since the user clicks on the checkboxes or radio buttons only
        cb1.addActionListener(this);
        cb2.addActionListener(this);
        cb3.addActionListener(this);
        cb4.addActionListener(this);
        cb5.addActionListener(this);
        cb6.addActionListener(this);

        //close the frame upon clicking
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //know which components are selected by user
        if (cb1.getModel().isSelected()) {
            text += "\nJava";
        }
        if (cb2.getModel().isSelected()) {
            text += "\nC#";
        }
        if (cb3.getModel().isSelected()) {
            text += "\nVB.Net";
        }
        if (cb4.getModel().isSelected()) {
            text += "\nPython";
        }
        if (cb5.getModel().isSelected()) {
            text += "\nC++";
        }
        if (cb6.getModel().isSelected()) {
            text += "\nObjective-C";
        }
        //else text+="\nFemale";
        //display the selected message in text area
        ta.setText(text);

        //reset the message to empty string
        text = "";
    }

    public static void main(String args[]) {
        //create frame
        CheckboxSample cr = new CheckboxSample();
        cr.setTitle("My Samples");
        cr.setSize(500, 400);
        cr.setVisible(true);
    }

}
