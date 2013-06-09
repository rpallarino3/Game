package playerstuff;

import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;
//import java.io.File;
//import Sprites;

public class TestPlayer {
	//public String player = "testplayer.png";
	//File dir1 = new File(".");
	private String pathToPlayer = "src/Sprites/testplayer.png";
	private Point drawLocation;
	private Point globalLocation;
	private int x;
	private int y;
	private int dx;
	private int dy;
	private int xOffset;
	private int yOffset;
	private Image image;
	
	public TestPlayer() {
//		try {
//		System.out.println(dir1.getCanonicalPath());
//		} catch (Exception e) {
//			System.out.println("Nothing");
//		}
		drawLocation = new Point(0,0);
		globalLocation = new Point(0,0);
		ImageIcon ii = new ImageIcon(pathToPlayer);
		image = ii.getImage();
		xOffset = ii.getIconWidth()/2;
		yOffset = ii.getIconHeight()/2;
	}
	
	public void moveImageLeft() {
		drawLocation.x -= 5;
	}
	
	public void moveImageRight() {
		drawLocation.x += 5;
	}
	
	public void moveImageUp() {
		drawLocation.y -= 5;
	}
	
	public void moveImageDown() {
		drawLocation.y += 5;
	}
	
	public void moveGlobalLeft() {
		globalLocation.x -= 5;
	}
	
	public void moveGlobalRight() {
		globalLocation.x += 5;
	}
	
	public void moveGlobalUp() {
		globalLocation.y -= 5;
	}
	
	public void moveGlobalDown() {
		globalLocation.y += 5;
	}
	
	public void move() {
		x += dx;
		y += dy;
	}
	
	public void moveLeft() {
		dx = -5;
		move();
	}
	
	public void moveRight() {
		dx = 5;
		move();
	}
	
	public void moveUp() {
		dy = -5;
		move();
	}
	
	public void moveDown() {
		dy = 5;
		move();
	}
	
	public void stopMove() {
		dx = 0;
		dy = 0;
	}
	
	public Image getImage() {
		return image;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getXOffset() {
		return xOffset;
	}
	
	public int getYOffset() {
		return yOffset;
	}
	
	public Point getDrawLocation() {
		return drawLocation;
	}
	
	public void setDrawLocation(int x, int y) {
		drawLocation.x = x;
		drawLocation.y = y;
	}
	
	public Point getGlobalLocation() {
		return globalLocation;
	}
	
	public void setGlobalLocation(int x, int y) {
		globalLocation.x = x;
		globalLocation.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	

}
