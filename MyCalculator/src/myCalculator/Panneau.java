package myCalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau extends JPanel{

	public void paintComponent (Graphics g) {
		//vous verez cette phrase chaque appel de la methode
		System.out.println("Je suis executee !");
		
		int x1 = this.getWidth()/4;
		int y1 = this.getHeight()/4;
		g.drawOval(x1, y1 , this.getWidth()/2 , this.getHeight()/2 );
		
//		dessiner un rectangle
		//x1,y1,width,height
		 g.drawRect(100,100,150,160);
		    g.fillRect(250,250,120,140);
		    
//		    rectangle arrondi 
		    //x1, y1, width, height, arcWidth, arcHeight
		    g.drawRoundRect(200,10,30,50, 10, 10);
		    g.fillRoundRect(350,65,55,30,5,5);
		    
//		 lignes droites
		    //x1, y1, x2, y2
		    g.drawLine(0, 0, this.getWidth(), this.getHeight());
		    g.drawLine(0, this.getHeight(), this.getWidth(), 0);
		
//		dessiner un polygone
		    int x[] = {20, 30, 50, 60, 60, 50, 30, 20};
		    int y[] = {30, 20, 20, 30, 50, 60, 60, 50};
		    g.drawPolygon(x, y, 8);

		    int x2[] = {50, 60, 80, 90, 90, 80, 60, 50};
		    int y2[] = {60, 50, 50, 60, 80, 90, 90, 80};
		    g.fillPolygon(x2, y2, 8);
		    
//		    texte
		    Font font = new Font("Courier", Font.BOLD, 20);
		    g.setFont(font);
		    g.setColor(Color.red);          
		    g.drawString("Tiens ! Le Site du Zéro !", 100,200);
		    
//		   Images
		    try {
				Image img = ImageIO.read(new File("/Users/tuman/Pictures/Screenshot.jpg"));
				g.drawImage(img,0,0, this);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	
		}
	
		    
	}
}
