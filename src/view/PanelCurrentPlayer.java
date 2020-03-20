package view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import model.ModelGame;

public class PanelCurrentPlayer extends JPanel{
	static String[] colors = {"RED", "YELLOW", "GREEN", "BLUE"};
	static Color[] colorcolors = {Color.red, Color.yellow, Color.green, Color.blue};
	private static JLabel currPlayer = new JLabel();
	private static JLabel used = new JLabel("");
	public PanelCurrentPlayer() {
		currPlayer.setText("PLAYER "+ colors[ModelGame.color-1] + "'S TURN");
		currPlayer.setForeground(colorcolors[ModelGame.color-1]);
		this.add(currPlayer);
		this.add(used);
	}
	
	public static void updatePlayer() {
		currPlayer.setText("PLAYER "+ colors[ModelGame.color-1] + "'S TURN");
		currPlayer.setForeground(colorcolors[ModelGame.color-1]);
	}
	
	public static void tileUsed() {
		used.setText("choose another tile");
	}
	
	public static void tileOkay() {
		used.setText("");
	}
}
