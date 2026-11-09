import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TextCounterTest {


	@Test
	public void testNumberOfLines() {
		// Arrange
		TextCounter counter = new TextCounter();
		int expected = 1;

		// Act
		counter.addText("Hello");
		int actual = counter.getLines();

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void testNumberOfCharacters() {
		// Arrange
		TextCounter counter = new TextCounter();
		int expected = 13;

		// Act
		counter.addText("Hello Staffan");
		int actual = counter.getCharacters();

		// Assert
		assertEquals(expected, actual);
	}

	@Test
	public void testEmptyText() {
		// Arrange
		TextCounter counter = new TextCounter();
		int expectedLines = 1;
		int expectedCharacters = 0;

		// Act
		counter.addText("");
		int actualLines = counter.getLines();
		int actualCharacters = counter.getCharacters();

		// Assert
		assertEquals(expectedLines, actualLines);
		assertEquals(expectedCharacters, actualCharacters);
	}
}
