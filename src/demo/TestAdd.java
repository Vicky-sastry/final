package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd {

	@Test
	public void test() {
		addition a = new addition();
		int output=a.add(2, 4);
		assertEquals(6,output);
	}

}
