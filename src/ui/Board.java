package ui;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 * @author hinguyen
 *
 * Contains the canvas
 */
public class Board extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Dimension dimensions;
	private int x, y, height, width;
	private Canvas canvasIn;
	private Canvas canvasOut;
	
	/**
	 * Constructor
	 */
	public Board(Dimension _boardDimensions, double xPadding, double yPadding, double _glyphPadding) {
		this.dimensions = _boardDimensions;
		this.x = (int) (dimensions.getWidth() * xPadding);
		this.y = (int) (dimensions.getHeight() * yPadding);
		this.width = (int) (dimensions.getWidth() - (4 * this.x));
		this.height = (int) (dimensions.getHeight() - (2 * this.y));
		
		Dimension canvasDimension = new Dimension(width / 2, height);
		
		canvasIn = new Canvas(Color.BLACK, canvasDimension, x, y, _glyphPadding);
		canvasOut = new Canvas(Color.BLACK, canvasDimension, (int) ((dimensions.getWidth() / 2) + x), y, _glyphPadding);
		
		add(canvasIn);
		add(canvasOut);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillRect(0,0,width,height);
	}
	
	public Canvas getInCanvas() {
		return canvasIn;
	}
	
	public Canvas getOutCanvas() {
		return canvasOut;
	}
}
