package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.ModelGame;

public class PanelInfo extends JPanel{
	
	private static JLabel[] scoresLabel = new JLabel[4];
	
	public PanelInfo() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setPreferredSize(new Dimension(150, 600));
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		PanelScore panelScore = new PanelScore();
		this.add(panelScore);
		PanelCurrentPlayer panelCurrentPlayer = new PanelCurrentPlayer();
		this.add(panelCurrentPlayer);
		
		
		GiveUpButton redGiveUp = new GiveUpButton("red");
		GiveUpButton yellowGiveUp = new GiveUpButton("yellow");
		GiveUpButton greenGiveUp = new GiveUpButton("green");
		GiveUpButton blueGiveUp = new GiveUpButton("blue");
		
		JLabel giveUp = new JLabel("Give Up Buttons");
		giveUp.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(giveUp);
		
		this.add(redGiveUp);
		this.add(yellowGiveUp);
		this.add(greenGiveUp);
		this.add(blueGiveUp);
	}
	
}
