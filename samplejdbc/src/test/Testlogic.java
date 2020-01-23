package test;

import static org.junit.Assert.*;

import org.junit.Test;

import logic.Calculation;

public class Testlogic {

	@Test
	public void test() {
		assertEquals(4,Calculation.findMax(new int[] {1,2,3,4}));
		
	}

}
