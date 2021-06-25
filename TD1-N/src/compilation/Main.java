package compilation;

import java.util.Scanner;
import static compilation.Automate.*;

public class Main {
	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in);) {
			System.out.println("Give the String to test");
			String s = sc.next();
			boolean valid = validRational(s) ;
			
			if (valid) {
				System.out.println("String is valid");
			} else {
				System.out.println("String is not valid");
			}
			
		} catch (Exception e) {
			System.err.println("String use incorrect alphabet");
		}
	}

}
