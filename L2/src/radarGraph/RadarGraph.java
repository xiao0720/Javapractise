package radarGraph;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

/**
 * JPanel RadarGraph, a container.
 * 
 * @author Xiao
 *
 */
public class RadarGraph extends JPanel{
	public RadarGraph(){
		//setBackground(Color.WHITE);
	}

/**
* PaintComponent funciton inside RadarGraph.java.
* This method is from JPanel class, whenever the JVM needs to redraw the element on the screen, it executes.
* Graphic2D is implementation of abstract class Graphics used for 2D drawing.
*/
	@Override
	public void paintComponent(Graphics g){
		//clear the screen
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		drawWeb(g2d);
		System.out.println("Graph redrawn.");
	}

/**
* Calculate X and Y of the window
*/
	private void drawWeb(Graphics2D g2d){
		Dimension d = this.getSize();
		int X = (int)(d.getWidth())/2;
		int Y = (int)(d.getHeight())/2;
		double R = 0.9 * (d.getHeight())/2;
		double[] Theta = new double[6];

		for (int i = 0; i<6; i++) {
			Theta[i] = (Math.PI*2*i)/5-Math.PI*1/10;
		}

		int X1, Y1;
		for (int i = 0; i<5; i++) {
			X1 = X + (int)(R*Math.cos(Theta[i]));
			Y1 = Y + (int)(R*Math.sin(Theta[i]));
			g2d.drawLine(X, Y, X1, Y1);	
		}
		
		int X01, X02, Y01, Y02;
		for (int i = 1; i < 11; i++) {
			for(int j = 0; j<5; j++){
				X01 = X + (int)(R*i/10*Math.cos(Theta[j]));
				Y01 = Y + (int)(R*i/10*Math.sin(Theta[j]));
				X02 = X + (int)(R*i/10*Math.cos(Theta[j+1]));
				Y02 = Y + (int)(R*i/10*Math.sin(Theta[j+1]));
				g2d.drawLine(X01, Y01, X02, Y02);
			}
		}
		
		double[][] ran = new double[3][5];
		int[][] Xarr = new int[3][6];
		int[][] Yarr = new int[3][6]; 
		for (int i=0; i<3; i++) {
			for (int j=0; j<5; j++) {
				ran[i][j] = Math.random();
				Xarr[i][j] =X + (int)(R*ran[i][j]*Math.cos(Theta[j]));
				Yarr[i][j] =Y + (int)(R*ran[i][j]*Math.sin(Theta[j]));	
				Xarr[i][5] = Xarr[i][0];
				Yarr[i][5] = Yarr[i][0];
			}
		}
		
		/*
		for (int i=0; i<3; i++) {
			for (int j=0; j<5; j++) {
				g2d.drawLine(Xarr[i][j], Yarr[i][j], Xarr[i][j+1], Yarr[i][j+1]);
			}
		}
		*/
		for (int i=0; i<3; i++) {
			int[] xpoints ={Xarr[i][0],Xarr[i][1],Xarr[i][2],Xarr[i][3],Xarr[i][4]};
			int[] ypoints ={Yarr[i][0],Yarr[i][1],Yarr[i][2],Yarr[i][3],Yarr[i][4]};
			int npoints = 5;
			int red=(int)(Math.random()*255);
			int green=(int)(Math.random()*255);
			int blue=(int)(Math.random()*255);
			g2d.setColor(new Color(red,green,blue,150));//different colours every time
			g2d.fillPolygon(xpoints, ypoints, npoints);				
		}
			
	}

}
