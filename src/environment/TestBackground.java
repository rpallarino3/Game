package environment;

import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class TestBackground extends Zone{
	
	private String path = "src/Sprites/testbackground.png";
	private Image image;
	private File file;
	private int zoneNumber = -1;
	private int xOffset;
	private int yOffset;
	
	public TestBackground() {
		file = createFile(path);
		setImage(file);
		xOffset = 0;
		yOffset = 0;
	}

}
