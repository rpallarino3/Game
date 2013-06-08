package environment;

import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public abstract class Zone {
	
	private String path;
	private File file;
	private Image image;
	private int zoneNumber;
	
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
}
