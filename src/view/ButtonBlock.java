/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import model.ModelGame;

/**
 *
 * @author Vic
 */
public class ButtonBlock extends JButton {

    private PanelGame parent;
    private int x, y;
    
    public ButtonBlock(int x, int y, PanelGame parent) {
        this.setPreferredSize(new Dimension(30, 30));
        this.setBackground(Color.WHITE);
        this.x = x;
        this.y = y;
        
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println(x + " " + y);
               ModelGame.addBlockToModel(x, y);
//            	ModelGame.addBlockToModel(x, y, ModelGame.getCoordinates(ModelGame.type));
                parent.render();
            }
        });
    }
    
    public void setColor(Color color) {
        this.setBackground(color);
    }
    
}
