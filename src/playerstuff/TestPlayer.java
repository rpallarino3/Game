package playerstuff;

import java.awt.Image;
import javax.swing.ImageIcon;

public class TestPlayer {
	
	public String player = "testplayer.png";
	
	private int x;
	private int y;
	private int dx;
	private int dy;
	private Image image;
	
	public TestPlayer() {
		ImageIcon ii = new ImageIcon(player);
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
