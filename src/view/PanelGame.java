/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import model.ModelGame;

/**
 *
 * @author Vic
 */
public class PanelGame extends JPanel {

    public PanelGame() {
        super(new GridLayout(20, 20));
        render();
    }

    public void render() {
        // emptying panel
        this.removeAll();
        
        // real rendering process
        for (int i = 0; i < ModelGame.size; i++) {
            for (int j = 0; j < ModelGame.size; j++) {
                ButtonBlock bb = new ButtonBlock(j, i, this);
                switch(ModelGame.gameArray[j][i]){
                    case 1:
                        bb.setColor(Color.red);
                        break;
                    case 2:
                        bb.setColor(Color.yellow);
                        break;
                    case 3:
                        bb.setColor(Color.green);
                        break;
                    case 4:
                        bb.setColor(Color.blue);
                        break;
                }
                this.add(bb);
            }
        }
        
        this.revalidate();
        this.repaint();
    }

}
