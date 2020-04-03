package lsystems;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LLine {

	
	char line[];
	Set<LRule> rules;
	
	public LLine (char[] start, Set<LRule> rules) {
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException {
		if (line[0] == 'Q') {
			String message;
			message = "Q";
			throw new LSystemSymbolException(message);
		}
		List<Character> temp = new ArrayList<Character>();
		char[] holder;
			//outerLoop:
		for (int j = 0; j < line.length; j++) {
				for (LRule i: rules) {
					if (line[j] == i.getMatch()) {
						holder = i.getBody();
						if (holder.length == 0) {
							throw new LSystemLengthException();
						}
						for (int c = 0; c < holder.length; c++) {
							temp.add(holder[c]);
						}
					}
				}
			}
		line = listToArray(temp);
	}
	
	
	
	private char[] listToArray(List<Character> list) {
		char[] newChars = new char[list.size()];
		for (int i = 0; i < list.size(); i++) {
			newChars[i] = list.get(i);
		}
		return newChars;
	}

	public String toString() {
		
		return new String(line);
	}
	
}
