package frontend;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

import playerstuff.TestPlayer;

public class Screen extends JComponent implements KeyListener, FocusListener {
	
	TestPlayer tp;
	
	public Screen() {
		Dimension size = new Dimension(900,600);
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		addFocusListener(this);
		addKeyListener(this);
		this.setFocusable(true);
		tp = new TestPlayer();
	}
	
	public void paint(Graphics g) {
		g.fillRect(0, 0, 900, 600);
		g.drawImage(tp.getImage(), tp.getX(), tp.getY(), this);
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
		
		if (key == KeyEvent.VK_A) {
			tp.moveLeft();
			repaint();
		}
		else if (key == KeyEvent.VK_D){ 
			tp.moveRight();
			repaint();
		}
		else if (key == KeyEvent.VK_W) {
			tp.moveUp();
			repaint();
		}
		else if (key == KeyEvent.VK_S){
			tp.moveDown();
			repaint();
		}
		
		
	}

	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_A || key == KeyEvent.VK_D || key == KeyEvent.VK_W || key == KeyEvent.VK_S){
			tp.stopMove();
		}
		
	}
	

}
