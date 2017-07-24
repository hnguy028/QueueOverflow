package ui;

import javax.swing.JPanel;

import logic.GlyphQueue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

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
	private int length;
	private Canvas canvasIn;
	private Canvas canvasOut;
	
	/**
	 * Constructor
	 */
	public Board(int _length, GlyphQueue q) {
		this.length = _length;
		
		setBackground(Color.BLACK);
		setLayout(new GridLayout(1,length));
		
		canvasIn = new Canvas(Color.BLUE, q.popTest()+"");
		canvasOut = new Canvas(Color.RED, q.popTest()+"");
		
		add(canvasIn);
		add(canvasOut);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	public Canvas getInCanvas() {
		return canvasIn;
	}
	
	public Canvas getOutCanvas() {
		return canvasOut;
	}
}
