package UI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * @author hinguyen
 * 
 * Top level container of all objects and ui components (ie. board and canvas)
 */
public class Window {
	
	private JFrame frame;
	private int height;
	private int width;
	private Board board;
	
	
	/**
	 * 
	 */
	public Window(String _name,int _height, int _width) {
		this.height = _height;
		this.width = _width;
		this.board = new Board(new Dimension(width, height), 0.1, 0.1, 0.1);
		
		// Init frame and defualt ops
		frame = new JFrame(_name);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		
		// generate components (board and canvases)
		draw(board);
		
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public void draw(Board board) {
		frame.add(board);
		frame.pack();
	}
	
	public void resize() {
		
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}
}