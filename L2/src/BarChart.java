import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class BarChart {
	public static void main(String[] args) throws Exception{
		//run asynchronously
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
			}
		});
	}

	private static void createAndShowGUI(){
		//1. create the frame
		JFrame frame = new JFrame("Bar Chart");
		
		//2. set frame size
		frame.setSize(400, 300);
		double[] values = new double[3];

		String[] names = new String[3];

		values[0] = 1;
		names[0] = "Item 1";

		values[1] = 2;
		names[1] = "Item 2";

		values[2] = 4;
		names[2] = "Item 3";
		
		//3. create components and put them into the frame
		frame.getContentPane().add(new JLabel("Hello"),BorderLayout.NORTH);
		frame.getContentPane().add(new ChartPanel(values, names));
		
		//4. optional, what happens when closes the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//5. putting them together
		frame.pack();
		
		//6. display the window
		frame.setVisible(true);
	}
}


