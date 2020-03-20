package view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelViewerPopUp extends JPanel{
	private int[][] coordinates;
	public PanelViewerPopUp(int[][] coordinates ) {
		super(new GridLayout(5,5));
		//this.removeAll();
		render(coordinates);
	}	
	public void render(int[][] coordinates) {
		this.removeAll();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				JPanel label = new JPanel();
				label.setSize(20,20);
				label.setBorder(BorderFactory.createLineBorder(Color.black));
				for (int k = 0; k < coordinates.length; k++) {
					if (i == coordinates[k][1] && j == coordinates[k][0]) {
						label.setBackground(Color.pink);
					}
				}
				this.add(label);
			}
		}
		this.repaint();
		this.revalidate();
	}
}
