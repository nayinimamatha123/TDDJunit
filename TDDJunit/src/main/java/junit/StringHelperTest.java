package junit;

import static org.junit.Assert.*;

public class StringHelperTest {
	@test
	public void testStringHavingAInFirstCharacterOnly() {
		StringHelper helper =new StringHelper();
		assertEquals("BCD",helper.removeAInFirst2Chars("ABCD"));

}
	@test
	public void testStringHavingNoAFirstCharacterOnly() {
		StringHelper helper =new StringHelper();
		assertEquals("BBAA",helper.removeAInFirst2Chars("BBAA"));

}
}
