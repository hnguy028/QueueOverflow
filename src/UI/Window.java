package UI;

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
	
	
	/**
	 * 
	 */
	public Window(String _name,int _height, int _width) {
		this.height = _height;
		this.width = _width;
		
		// Init frame and defualt ops
		frame = new JFrame(_name);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		
		// generate components (board and canvases)

		
		frame.pack();
		frame.setVisible(true);
		
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