
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		letterGrade lg= new letterGrade();
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a score :");
			String score = in.nextLine();
			if (score.equals("exit")) {
				System.out.println("Thanks for using this !");
				System.exit(0);
				in.close();
			}
			else {
				int scoreNum = Integer.parseInt(score);
				System.out.println("Grade:"+lg.letterGrade(scoreNum));
			}
		}
	}
}
