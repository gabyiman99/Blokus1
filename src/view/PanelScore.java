package view;

import java.awt.Color;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.ModelGame;

public class PanelScore extends JPanel{
	
	private static JLabel[] scoresLabel = new JLabel[4];
	
	public PanelScore() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JLabel scores = new JLabel("SCORES:");
		scores.setAlignmentX(Component.CENTER_ALIGNMENT);
		this.add(scores);
		for (int i = 0; i < scoresLabel.length; i++) {
			scoresLabel[i] = new JLabel("-89");
			scoresLabel[i].setAlignmentX(Component.CENTER_ALIGNMENT);
			this.add(scoresLabel[i]);
		}
	}
	
	public static void updateScores() {
		for (int i = 0; i < scoresLabel.length; i++) {
			scoresLabel[i].setText("" + ModelGame.score[i]);
		}
		
	}
}
