package addPack;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void testAdd() {
		AddClass Ob = new AddClass();
		int act = Ob.add(2,4);
		assertTrue(6==act);
	}

}
