package frontend;
import java.awt.*;

import javax.swing.*;

public class Frame {
	public static void main(String args[]) {
		JFrame frame = new JFrame("Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Screen screen = new Screen();
		frame.setContentPane(screen);
		frame.setResizable(false);
		frame.pack();
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((screensize.width-frame.getWidth())/2,(screensize.height-frame.getHeight())/2);
		frame.setVisible(true);
	}
}
