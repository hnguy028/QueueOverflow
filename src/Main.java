import UI.Window;

public class Main {
	
	public static void main(String[] args) {
		
		// Initialize GUI
		Window window = new Window("Queue Overflow",500,500);
		
		// Initialize Player information
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		// loop to attempt connection to server/peer
		
		// initialization sequence
		
		// each user will begin with 3 rng generated symbols in the queue
		// begin sending and receiving symbols over the network
		
		// Game loop
		while(true) {
			// check exit sequence (connection interrupt, application close, end game, score cap, etc)
			
			// get next symbol from glyphQueue
			// get users reply to input stream
			// check for match
			// score calculation
			
			// get users reply to output stream
			// check symbol validity
			// send glyph code over p2p connection
		}
		
		// game over sequence
	}
}