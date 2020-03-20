package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.ModelGame;

public class PanelPopUp extends JPanel{
	private int[][] coordinates;
	private int numrotate;
	public int getNumrotate() {
		return numrotate;
	}
	public void setNumrotate(int numrotate) {
		this.numrotate = numrotate;
	}
	public PanelPopUp(int type, int[][] coordinates) {
		super(new BorderLayout());
		this.coordinates = coordinates;
		this.setPreferredSize(new Dimension(400,400));
		
		JLabel labelType = new JLabel("" + type);
		this.add(labelType);
		
		JButton rotate = new JButton("ROTATE");
		JButton flipHor = new JButton("FLIP HORIZONTAL");
		JButton flipVer = new JButton("FLIP VERTICAL");
		
		JPanel panelButton = new JPanel();
		
		panelButton.add(rotate);
		panelButton.add(flipVer);
		panelButton.add(flipHor);
		
		this.add(panelButton, BorderLayout.SOUTH);
		
		PanelViewerPopUp newPVPU = new PanelViewerPopUp(coordinates);
		this.add(newPVPU, BorderLayout.CENTER);
		
	
		//System.out.println("" + newPVPU.getCoordinates());
		
		rotate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//numrotate++;
				setCoordinates(ModelGame.rotate(getCoordinates()));
				newPVPU.render(getCoordinates());
				ModelGame.listOp.add(1);
				//System.out.println(numrotate+"");
			}
		});
		flipHor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setCoordinates(ModelGame.flipH(getCoordinates()));
				newPVPU.render(getCoordinates());
				ModelGame.listOp.add(2);
//				setNumrotate(getNumrotate()+1);
//				//setCoordinates(ModelGame.flipHorizontal(getCoordinates()));
//				newPVPU.render(getCoordinates());
//				System.out.println(getNumrotate()+"");
			}
		});
		flipVer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setCoordinates(ModelGame.flipV(getCoordinates()));
				newPVPU.render(getCoordinates());
				ModelGame.listOp.add(3);
//				setNumrotate(getNumrotate()+1);
//				//setCoordinates(ModelGame.flipHorizontal(getCoordinates()));
//				newPVPU.render(getCoordinates());
//				System.out.println(getNumrotate()+"");
			}
		});
	}
	public int[][] getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(int[][] coordinates) {
		this.coordinates = coordinates;
	}
	
}
