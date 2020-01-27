import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/* Hey look I added something*/ 
class Week2Tester {

	/*
	 * maxTriple: 
     * Test case 1:
     * maxTriple([1, 2, 3]) → 3
	 */

	@Test
	public void testMaxTriple1() {
		Week2 sol = new Week2();
		int[] A = {1,2,3};
		assertEquals(3, sol.maxTriple(A)); 
	}

	/*
	 * maxMod5:
     * Test case 1:
     * maxMod5(2, 3) → 3
	 */

	@Test
	public void testMaxMod51() {
		Week2 sol = new Week2();
		assertEquals(3, sol.maxMod5(2,3)); 
	}

	/*
	 * prefixAgain:
     * Test case 1:
     * prefixAgain("abXYabc", 1) → true
	 */

	@Test
	public void testPrefixAgain1() {
		Week2 sol = new Week2();
		assertEquals(true,sol.prefixAgain("abXYabc", 1));
	}

	/*
	 * withoutString:
     * Test case 1:
     * withoutString("Hello there", "llo") → "He there"
	 */

	@Test
	public void testWithoutString1() {
		Week2 sol = new Week2();
		assertEquals("He there",sol.withoutString("Hello there", "llo"));
	}

}
