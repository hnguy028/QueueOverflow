package UI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.*;
import Symbols.Glyphs;

/**
 * @author hinguyen
 *
 * Canvas will contain the information for the symbols to be drawn
 * TODO : for now the IO will be alphabetic symbols 
 */
public class Canvas extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Glyphs glyph;
	private Color color;
	private JLabel label;
	
	/**
	 * @param _bgcolor
	 * @param _bounds - bounds of the object containing the graphic
	 * @param _xCoord
	 * @param _yCoord
	 * @param _height
	 * @param _width
	 */
	public Canvas(Color _bgColor, String t) {
		this.color = _bgColor;
		label = new JLabel();
		label.setText(t);
		add(label);
		//setPreferredSize(_bounds);
		setBackground(_bgColor);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
	}
	
	public void setGylph(Glyphs _glyph) {
		this.glyph = _glyph;
	}
	
	public Glyphs getGlyph() {
		return this.glyph;
	}
}
