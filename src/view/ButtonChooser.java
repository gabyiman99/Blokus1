/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import model.ModelGame;

/**
 *
 * @author Vic
 */
public class ButtonChooser extends JButton {
	
	private String buttonIcon;

    public ButtonChooser(int type, String buttonIcon) {
        this.setPreferredSize(new Dimension(100, 100));
        this.buttonIcon = buttonIcon;
        
        
        ImageIcon icon = new ImageIcon(buttonIcon);
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(120, 120, java.awt.Image.SCALE_SMOOTH);

        Icon fixedIcon = new ImageIcon(resizedImg);
        
        
        this.setIcon(fixedIcon);
        
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ModelGame.type = type;
                int[][] coordinates = ModelGame.getCoordinates(type);

                //bikin popup window
                FramePopUp frame = new FramePopUp(type, coordinates);
                frame.showWindow();
            }
        });
    }

    public void changeButtonIcon() {
    	ImageIcon icon = new ImageIcon(this.buttonIcon);
    	this.setIcon(icon);
    }

	public void setButtonIcon(String buttonIcon) {
		this.buttonIcon = buttonIcon;
	}
    
    

}
