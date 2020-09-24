package myCalculator;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{

	public Fenetre () {
		
		this.setTitle("Mein erstes Fenster");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		//instanciation d un objet panel
//		JPanel pan = new JPanel();
//		//couleur de fond
//		pan.setBackground(Color.orange);
//		//on previent notre Jframe que notre Jpanel sera son content pane
		this.setContentPane(new Panneau());
		this.setVisible(true);
	}
}
