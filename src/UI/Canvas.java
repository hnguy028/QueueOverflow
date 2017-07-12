package UI;

import Symbols.Glyphs;

/**
 * @author hinguyen
 *
 * Canvas will contain the information for the symbols to be drawn
 */
public class Canvas {
	Glyphs glyph;
	
	//public Canvas() {}
	
	public void draw() {
		
	}
	
	public void setGylph(Glyphs _glyph) {
		this.glyph = _glyph;
	}
	
	public Glyphs getGlyph() {
		return this.glyph;
	}
}
