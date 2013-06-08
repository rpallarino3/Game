package environment;

import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public abstract class Zone {
	
	private String path;
	private File file;
	private Image image;
	private int zoneNumber;
	private int xOffset;
	private int yOffset;
	
	public Image getImage() {
		return image;
	}
	
	public File createFile(String p) {
		return new File(p);
	}
	
	public void setImage(File f) {
		try {
			image = ImageIO.read(f);
		}
		catch (Exception e) {
			System.out.println("Can't find background image for Zone " + zoneNumber);
		}
	}
	
	public int getZoneNumber() {
		return zoneNumber;
	}
	
	public int getXOffset() {
		return xOffset;
	}
	
	public int getYOffset() {
		return yOffset;
	}
	
	public void moveUp() {
		yOffset += 5;
	}
	
	public void moveDown() {
		yOffset -= 5;
	}
	
	public void moveLeft() {
		xOffset += 5;
	}
	
	public void moveRight() {
		xOffset -= 5;
	}
}
