package frontend;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

import javax.swing.*;

import playerstuff.TestPlayer;
import environment.TestBackground;
import environment.Zone;

public class Screen extends JComponent implements KeyListener, FocusListener {
	
	TestPlayer tp;
	private Zone zone;
	Dimension size;
	private ImageObserver obs;
	private int currentZoneNumber;
	private ArrayList<Integer> keysPressed;
	
	public Screen() {
		size = new Dimension(900,600);
		keysPressed = new ArrayList<Integer>();
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		addFocusListener(this);
		addKeyListener(this);
		this.setFocusable(true);
		//obs = new ImageObserver();
		initializePlayer();
		initializeBackground();
	}
	
	public void initializePlayer() {
		tp = new TestPlayer();
		tp.setDrawLocation(size.width/2 - tp.getXOffset(),size.height/2 - tp.getYOffset());
		tp.setGlobalLocation(450, 300);
	}
	
	public void initializeBackground() {
		zone = new TestBackground();
	}
	
	public void paint(Graphics g) {
		g.fillRect(0, 0, 900, 600);
		g.setColor(Color.BLUE);
		g.fillRect(400, 250, 100, 100);
		//System.out.println("Width: " + zone.getImage().getWidth(obs) + " Height: " + zone.getImage().getHeight(obs));
		g.drawImage(zone.getImage(), 0 + zone.getXOffset(), 0 + zone.getYOffset(), this);
		g.drawImage(tp.getImage(), tp.getDrawLocation().x, tp.getDrawLocation().y, this);
		move();
	}
	
	public void focusGained(FocusEvent e) {
		
		
	}

	public void focusLost(FocusEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void move() {
		if (keysPressed.contains(KeyEvent.VK_A)) {
			System.out.println("A");
			if (tp.getGlobalLocation().x <= 450) {
				tp.moveGlobalLeft();
				tp.moveImageLeft();
				//repaint();
			}
			else if (tp.getGlobalLocation().x >= zone.getImage().getWidth(obs) - 450) {
				tp.moveGlobalLeft();
				tp.moveImageLeft();
				//repaint();
			}
			else {
				tp.moveGlobalLeft();
				zone.moveLeft();
				//repaint();
			}
		}
		if (keysPressed.contains(KeyEvent.VK_D)){ 
			System.out.println("D");
			if (tp.getGlobalLocation().x >= zone.getImage().getWidth(obs) - 450) {
				tp.moveGlobalRight();
				tp.moveImageRight();
				//repaint();
			}
			else if (tp.getGlobalLocation().x <= 450) {
				tp.moveGlobalRight();
				tp.moveImageRight();
				//repaint();
			}
			else {
				tp.moveGlobalRight();
				zone.moveRight();
				//repaint();
			}
		}
		if (keysPressed.contains(KeyEvent.VK_W)) {
			System.out.println("W");
			if (tp.getGlobalLocation().y <= 300) {
				tp.moveGlobalUp();
				tp.moveImageUp();
				//repaint();
			}
			else if (tp.getGlobalLocation().y >= zone.getImage().getHeight(obs) - 300) {
				tp.moveGlobalUp();
				tp.moveImageUp();
				//repaint();
			}
			else {
				tp.moveGlobalUp();
				zone.moveUp();
				//repaint();
			}
		}
		if (keysPressed.contains(KeyEvent.VK_S)) {
			System.out.println("S");
			if (tp.getGlobalLocation().y <= 300) {
				tp.moveGlobalDown();
				tp.moveImageDown();
				//repaint();
			}
			else if (tp.getGlobalLocation().y >= zone.getImage().getHeight(obs)- 300) {
				tp.moveGlobalDown();
				tp.moveImageDown();
				//repaint();
			}
			else {
				tp.moveGlobalDown();
				zone.moveDown();
				//repaint();
			}
		}
		repaint();
	}

	public void keyPressed(KeyEvent e) {
		if (!keysPressed.contains(e.getKeyCode())) {
			keysPressed.add(e.getKeyCode());
		}		
	}

	public void keyReleased(KeyEvent e) {
		if (keysPressed.contains(e.getKeyCode())) {
			keysPressed.remove((Object)e.getKeyCode());
			System.out.println(keysPressed.size());
		}
		
	}
	

}
