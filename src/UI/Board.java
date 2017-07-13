package UI;

/**
 * @author hinguyen
 *
 * Contains the canvas
 */
public class Board {
	Canvas canvasIn;
	Canvas canvasOut;
	
	/**
	 * Constructor
	 */
	public Board() {
		canvasIn = new Canvas();
		canvasOut = new Canvas();
	}
	
	public Canvas getInCanvas() {
		return canvasIn;
	}
	
	public Canvas getOutCanvas() {
		return canvasOut;
	}
}
