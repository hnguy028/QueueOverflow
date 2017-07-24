package Logic;

import java.util.LinkedList;

import symbols.Glyphs;

/**
 * @author hinguyen
 *
 * The bridge which connects the player's boards contains the symbols that are to be drawn next
 */
public class GlyphQueue {
	
	SymbolGenerator rsg;
	
	LinkedList<Glyphs> one;
	LinkedList<Glyphs> two;
	
	LinkedList<Character> test;
	
	public GlyphQueue() {
		rsg = new SymbolGenerator();
		
		one = new LinkedList<Glyphs>();
		two = new LinkedList<Glyphs>();
		
		test = new LinkedList<Character>();
		
		for(int i=0;i<10;i++) {addTest();}
	}
	
	public void addTest() {
		test.add(rsg.nextChar());
	}
	
	public char popTest() {
		return test.pop();
	}
	
}
