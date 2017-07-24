package Logic;

import java.util.Random;

public class SymbolGenerator {
	Random rng;
	
	public SymbolGenerator() {
		rng = new Random();
	}
	
	public char nextChar() {
		return (char) (rng.nextInt(26)+97);
	}
}
