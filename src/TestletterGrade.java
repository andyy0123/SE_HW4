import junit.framework.*;

public class TestletterGrade extends TestCase {

	public int grade1, grade2, grade3, grade4, grade5, grade6, grade7;
	public letterGrade result;
	
	public void setUp() {
		result = new letterGrade();
	}
	
	public void test_1() {
		grade1 = 91;
		char result1 = 'A';
		assertEquals(result1, result.letterGrade(grade1));
	}
	
	public void test_2() {
		grade2 = 82;
		char result2 = 'B';
		assertEquals(result2, result.letterGrade(grade2));
	}
	public void test_3() {
		grade3 = 73;
		char result3 = 'C';
		assertEquals(result3, result.letterGrade(grade3));
	}
	public void test_4() {
		grade4 = 64;
		char result4 = 'D';
		assertEquals(result4, result.letterGrade(grade4));
	}
	public void test_5() {
		grade5 = 35;
		char result5 = 'F';
		assertEquals(result5, result.letterGrade(grade5));
	}
	public void test_6() {
		grade6 = -6;
		char result6 = 'X';
		assertEquals(result6, result.letterGrade(grade6));
	}
	public void test_7() {
		grade7 = 107;
		char result7 = 'X';
		assertEquals(result7, result.letterGrade(grade7));
	}
}