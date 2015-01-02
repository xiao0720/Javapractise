package helloSwing;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldSwing {
	private static void createAndShowGUI(){
		//1. create the frame
		JFrame frame = new JFrame("HelloWorldSwing");

		//2. optional: what happens when the frame closes
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Hello World Label
		JLabel label = new JLabel("Hello World");
		JLabel label2 = new JLabel("This is label 2");

		//3. create components and put them in the frame
		//... create emptyLabel...
		frame.getContentPane().add(label, BorderLayout.NORTH);
		frame.getContentPane().add(label2);

		//Display the window
		//4. size the frame
		frame.pack();

		//5. show the frame
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		//Scheduling a job for the event-dispatching thread
		//create and showing the app's GUI
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});

	}

}
