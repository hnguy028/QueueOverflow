package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.*;

import symbols.Glyphs;

/**
 * @author hinguyen
 *
 * Canvas will contain the information for the symbols to be drawn
 * TODO : for now the IO will be alphabetic symbols 
 */
public class Canvas extends JComponent {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Glyphs glyph;
	private Color color;
	private Dimension bounds;
	private int x;
	private int y;
	private double padding;
	private int height;
	private int width;
	
	/**
	 * @param _bgcolor
	 * @param _bounds - bounds of the object containing the graphic
	 * @param _xCoord
	 * @param _yCoord
	 * @param _height
	 * @param _width
	 */
	public Canvas(Color _bgColor, Dimension _bounds, int _xCoord, int _yCoord, double _padding) {
		this.color = _bgColor;
		this.bounds = _bounds;
		this.x = _xCoord;
		this.y = _yCoord;
		this.padding = _padding;
		this.height = (int) (_bounds.height * (1 - _padding));
		this.width = (int) (_bounds.width * (1 - _padding));
		
		setPreferredSize(_bounds);
		setBackground(_bgColor);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.CYAN);
		g.fillRect(x, y, width, height);
	}
	
	public void setGylph(Glyphs _glyph) {
		this.glyph = _glyph;
	}
	
	public Glyphs getGlyph() {
		return this.glyph;
	}
}
