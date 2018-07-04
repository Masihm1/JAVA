import static org.junit.Assert.*;

import org.junit.Test;

public class Library_Test {

	@Test
	public void additemTest() {

		Storage s = new Storage();
		int size = s.Items.size();
		s.addBook("TEST", "TEST", true, "TEST", 10);
		assertEquals(s.Items.size(), size + 1);
	}

	@Test
	public void removeBookTest() {

		Storage s = new Storage();
		int size = s.Items.size();
		s.removeBook(9);
		assertEquals(s.Items.size(), size - 1);
	}

	@Test
	public void updateItem() {

		Storage s = new Storage();
		int size = s.Items.size();
		s.updateItem(9);
		assertEquals(s.Items.size(), size - 1);

	}
}
