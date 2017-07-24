package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import Logic.GlyphQueue;

/**
 * @author hinguyen
 * 
 * Top level container of all objects and ui components (ie. board and canvas)
 */
public class Window extends JFrame implements KeyListener, Runnable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int height;
	private int width;
	private Board board;
	private GlyphQueue q;
	
	/**
	 * 
	 */
	public Window(String _name,int _height, int _width) {
		this.height = _height;
		this.width = _width;
		this.q = new GlyphQueue();
		this.board = new Board(2, q);
		
		
		// Init frame and defualt ops
		setTitle(_name);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(width, height));
		setMaximumSize(new Dimension(width, height));
		setLayout(new BorderLayout());
		setBackground(Color.CYAN);
		
		// generate components (board and canvases)
		draw(board);
		
		pack();
		setVisible(true);
		
	}
	
	public void draw(Board board) {
		add(board, BorderLayout.CENTER);
		pack();
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}