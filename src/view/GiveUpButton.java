package view;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.ModelGame;

public class GiveUpButton extends JButton{
	public GiveUpButton(String title) {
		super(title + " give up");
		this.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	ModelGame.gameOver++;
            	
            	if (ModelGame.gameOver==4) {
					JFrame endFrame = new JFrame("End Frame");
					JPanel endPanel = new JPanel();
					endPanel.setLayout(new BoxLayout(endPanel, BoxLayout.Y_AXIS));
					JLabel scores = new JLabel("Scores:");
					endPanel.add(scores);
					String[] colors = {"red", "yellow", "green", "blue"}; 
					for (int i = 0; i < ModelGame.score.length; i++) {
						JLabel score = new JLabel(colors[i] + ": "+ModelGame.score[i]);
						endPanel.add(score);
					}
					endFrame.add(endPanel);
					endFrame.pack();
					endFrame.setVisible(true);
					JButton endButton = new JButton("END GAME");
					endButton.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							System.exit(1);
						}
					});
					endFrame.addWindowListener(new WindowAdapter() {
						@Override
						 
						public void windowClosing(WindowEvent e) {
						 
						    System.exit(1);
						 
						}
					});
					endPanel.add(endButton);
					endFrame.add(endPanel);
					endFrame.pack();
					endFrame.setVisible(true);
					
				}
            }
        });
	}
}
