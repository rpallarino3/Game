package playerstuff;

import java.awt.Image;
import javax.swing.ImageIcon;
//import java.io.File;
//import Sprites;

public class TestPlayer {
	//public String player = "testplayer.png";
	//File dir1 = new File(".");
	private String pathToPlayer = "src/Sprites/testplayer.png";
	private int x;
	private int y;
	private int dx;
	private int dy;
	private Image image;
	
	public TestPlayer() {
//		try {
//		System.out.println(dir1.getCanonicalPath());
//		} catch (Exception e) {
//			System.out.println("Nothing");
//		}
		ImageIcon ii = new ImageIcon(pathToPlayer);
		image = ii.getImage();
		x = 40;
		y = 60;
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

}
