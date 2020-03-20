/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Vic
 */
public class PanelMain extends JPanel {
    private PanelGame panelGame;
    
    public PanelMain() {
        super(new BorderLayout(20, 20));

        this.add(new PanelChooser(), BorderLayout.LINE_START);
        this.add(new PanelInfo(), BorderLayout.LINE_END);
//        this.add(new PanelChooser(PanelChooser.HORIZONTAL), BorderLayout.LINE_END);
//        this.add(new PanelChooser(PanelChooser.VERTICAL), BorderLayout.PAGE_START);
//        this.add(new PanelChooser(PanelChooser.VERTICAL), BorderLayout.PAGE_END);

        panelGame = new PanelGame();
        this.add(panelGame, BorderLayout.CENTER);
    }

    public PanelGame getPanelGame() {
        return panelGame;
    }

    public void setPanelGame(PanelGame panelGame) {
        this.panelGame = panelGame;
    }
    
    

}
