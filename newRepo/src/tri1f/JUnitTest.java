package tri1f;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTest {
	AnswerChoiceIndex ACI = new AnswerChoiceIndex();
	@Test
	void test() {
		assertEquals(ACI.returnAns(0), 'A');
		assertEquals(ACI.returnAns(1), 'B');
		assertEquals(ACI.returnAns(2), 'C');
		assertEquals(ACI.returnAns(3), 'D');
		assertEquals(ACI.returnAns(4), 'E');
	}

}
