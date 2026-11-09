public class TextCounter {

	private int lines = 0;
	private int characters = 0;

	public void addText(String text) {
		lines++;
		characters = characters + text.length();
	}

	public int getLines() {
		return lines;
	}

	public int getCharacters() {
		return characters;
	}
}
