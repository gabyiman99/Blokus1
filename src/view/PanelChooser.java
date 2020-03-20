/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Vic
 */
public class PanelChooser extends JPanel {

    public PanelChooser() {
    
        JPanel panelChooserInner = new JPanel(new GridLayout(0, 1));
        JScrollPane panelChooserScrollPane = new JScrollPane(panelChooserInner, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        panelChooserScrollPane.setPreferredSize(new Dimension(120, 600));
        
        // todo harus diisi manual
        for (int i = 0; i < 21; i++) {
            panelChooserInner.add(new ButtonChooser(i, "iconfix/"+(i+1)+".png"));
        }
        
        this.add(panelChooserScrollPane);

    }

}
