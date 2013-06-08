package environment;

import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class TestBackground {
	
	private String path = "src/Sprites/testbackground.png";
	private Image image = null;
	public TestBackground() {
		try {
			image = ImageIO.read(new File(path));
		}
		catch (Exception e) {
			System.out.println("Can't find testbackground image");
		}
	}
	
	public Image getImage() {
		return image;
	}

}
