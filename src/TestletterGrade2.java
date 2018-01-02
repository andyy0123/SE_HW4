import junit.framework.*;

public class TestletterGrade2 extends TestCase {

	public int grade1, grade2, grade3, grade4, grade5, grade6, grade7, grade8, grade9;
	public int grade10, grade11, grade12, grade13, grade14, grade15, grade16, grade17, grade18;
	public letterGrade result;

	public void setUp() {
		result = new letterGrade();
	}
	public void test_1() {
		grade1 = 101;
		char result1 = 'X';
		assertEquals(result1, result.letterGrade(grade1));
	}
	public void test_2() {
		grade2 = 100;
		char result2 = 'A';
		assertEquals(result2, result.letterGrade(grade2));
	}
	public void test_3() {
		grade3 = 99;
		char result3 = 'A';
		assertEquals(result3, result.letterGrade(grade3));
	}
	public void test_4() {
		grade4 = 91;
		char result4 = 'A';
		assertEquals(result4, result.letterGrade(grade4));
	}
	public void test_5() {
		grade5 = 90;
		char result5 = 'A';
		assertEquals(result5, result.letterGrade(grade5));
	}
	public void test_6() {
		grade6 = 89;
		char result6 = 'B';
		assertEquals(result6, result.letterGrade(grade6));
	}
	public void test_7() {
		grade7 = 81;
		char result7 = 'B';
		assertEquals(result7, result.letterGrade(grade7));
	}
	public void test_8() {
		grade8 = 80;
		char result8 = 'B';
		assertEquals(result8, result.letterGrade(grade8));
	}
	public void test_9() {
		grade9 = 79;
		char result9 = 'C';
		assertEquals(result9, result.letterGrade(grade9));
	}
	public void test_10() {
		grade10 = 71;
		char result10 = 'C';
		assertEquals(result10, result.letterGrade(grade10));
	}
	public void test_11() {
		grade11 = 70;
		char result11 = 'C';
		assertEquals(result11, result.letterGrade(grade11));
	}
	public void test_12() {
		grade12 = 69;
		char result12 = 'D';
		assertEquals(result12, result.letterGrade(grade12));
	}
	public void test_13() {
		grade13 = 61;
		char result13 = 'D';
		assertEquals(result13, result.letterGrade(grade13));
	}
	public void test_14() {
		grade14 = 60;
		char result14 = 'D';
		assertEquals(result14, result.letterGrade(grade14));
	}
	public void test_15() {
		grade15 = 59;
		char result15 = 'F';
		assertEquals(result15, result.letterGrade(grade15));
	}
	public void test_16() {
		grade16 = 1;
		char result16 = 'F';
		assertEquals(result16, result.letterGrade(grade16));
	}
	public void test_17() {
		grade17 = 0;
		char result17 = 'F';
		assertEquals(result17, result.letterGrade(grade17));
	}
	public void test_18() {
		grade18 = -1;
		char result18 = 'X';
		assertEquals(result18, result.letterGrade(grade18));
	}
}