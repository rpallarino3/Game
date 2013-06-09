package frontend;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;

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
	
	public Screen() {
		size = new Dimension(900,600);
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
		System.out.println("Width: " + zone.getImage().getWidth(obs) + " Height: " + zone.getImage().getHeight(obs));
		g.drawImage(zone.getImage(), 0 + zone.getXOffset(), 0 + zone.getYOffset(), this);
		g.drawImage(tp.getImage(), tp.getDrawLocation().x, tp.getDrawLocation().y, this);
	}
	
	public void focusGained(FocusEvent e) {
		
		
	}

	public void focusLost(FocusEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		//Need to fix to get multiple key codes at once
		if (key == KeyEvent.VK_A) {
			if (tp.getGlobalLocation().x <= 450) {
				tp.moveGlobalLeft();
				tp.moveImageLeft();
				repaint();
			}
			else if (tp.getGlobalLocation().x >= zone.getImage().getWidth(obs) - 450) {
				tp.moveGlobalLeft();
				tp.moveImageLeft();
				repaint();
			}
			else {
				tp.moveGlobalLeft();
				zone.moveLeft();
				repaint();
			}
		}
		if (key == KeyEvent.VK_D){ 
			if (tp.getGlobalLocation().x >= zone.getImage().getWidth(obs) - 450) {
				tp.moveGlobalRight();
				tp.moveImageRight();
				repaint();
			}
			else if (tp.getGlobalLocation().x <= 450) {
				tp.moveGlobalRight();
				tp.moveImageRight();
				repaint();
			}
			else {
				tp.moveGlobalRight();
				zone.moveRight();
				repaint();
			}
		}
		if (key == KeyEvent.VK_W) {
			if (tp.getGlobalLocation().y <= 300) {
				tp.moveGlobalUp();
				tp.moveImageUp();
				repaint();
			}
			else if (tp.getGlobalLocation().y >= zone.getImage().getHeight(obs) - 300) {
				tp.moveGlobalUp();
				tp.moveImageUp();
				repaint();
			}
			else {
				tp.moveGlobalUp();
				zone.moveUp();
				repaint();
			}
		}
		if (key == KeyEvent.VK_S){
			if (tp.getGlobalLocation().y <= 300) {
				tp.moveGlobalDown();
				tp.moveImageDown();
				repaint();
			}
			else if (tp.getGlobalLocation().y >= zone.getImage().getHeight(obs)- 300) {
				tp.moveGlobalDown();
				tp.moveImageDown();
				repaint();
			}
			else {
				tp.moveGlobalDown();
				zone.moveDown();
				repaint();
			}
		}
		
		
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_A || key == KeyEvent.VK_D || key == KeyEvent.VK_W || key == KeyEvent.VK_S){
			tp.stopMove();
		}
		
	}
	

}
