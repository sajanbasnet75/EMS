/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrms;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author LORDsajan
 */
public class Renderer extends DefaultTableCellHeaderRenderer {

    JLabel imglbl = new JLabel();

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1); //To change body of generated methods, choose Tools | Templates.
    }

}
