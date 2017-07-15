package logic;

import java.util.LinkedList;

import symbols.Glyphs;

/**
 * @author hinguyen
 *
 * This class will contain the connection to the peer, as well as handle network communication 
 */
public class GlyphQueue {
	LinkedList<Glyphs> glyphQueue;
	
	public void connect() {
		
	}
	
	public void sendGlyph(Glyphs g) {
		// peer.send(g);
	}
	
	public Glyphs pop() {
		return glyphQueue.pop();
	}
}
