package compilation;

public class Automate {

	public static boolean onlyOneOccurence(String s) {
		char c;
		int etat = 0;
		int i = 0;
		OUTER: while (i < s.length()) {
			c = s.charAt(i);
			if (c != 'a' && c != 'b')
				throw new IllegalArgumentException("Wrong alphabet");
			switch (etat) {
			case 0:
				if (c == 'b')
					etat = 1;
				break;
			case 1:
				if (c == 'b')
					etat = 2;
				break;

			case 2:
				break OUTER;
			}
			i++;
		}

		return etat == 1;
	}

	public static boolean validInteger(String s) {
		char c;
		int etat = 0;
		int i = 0;
		OUTER: while (i < s.length()) {
			c = s.charAt(i);
			if (c != '+' && c != '-' && !Character.isDigit(c))
				throw new IllegalArgumentException("Wrong alphabet");
			switch (etat) {
			case 0:
				if (c == '+' || c == '-')
					etat = 1;
				else
					etat = 2;
				break;
			case 1:
				if (Character.isDigit(c))
					etat = 2;
				else
					etat = 3;
				break;

			case 2:
				if (!Character.isDigit(c))
					etat = 3;
				break;
			case 3:
				break OUTER;
			}
			i++;
		}

		return etat == 2;
	}

	public static boolean validRational(String s) {
		char c;
		int etat = 0;
		int i = 0;
		OUTER: while (i < s.length()) {
			c = s.charAt(i);
			if (c != '+' && c != '-' && c != '/' && !Character.isDigit(c))
				throw new IllegalArgumentException("Wrong alphabet");
			switch (etat) {
			case 0:
				if (c == '+' || c == '-')
					etat = 1;
				else if(Character.isDigit(c))
					etat = 2;
				else 
					etat =5;
				break;
			case 1:
				if (Character.isDigit(c))
					etat = 2;
				else
					etat = 5;
				break;

			case 2:
				if (c == '/')
					etat = 3;
				else if (!Character.isDigit(c))
					etat = 5;
				break;
			case 3:
				if (Character.isDigit(c))
					etat = 4;
				else
					etat = 5;
			case 4:
				if (!Character.isDigit(c))
					etat = 5;
				break;
			case 5:
				break OUTER;
			}
			i++;
		}

		return etat == 4;
	}
	
	public static boolean endsWithABA(String s) {
		char c;
		int etat = 0;
		int i = 0;
		 while (i < s.length()) {
			c = s.charAt(i);
			if (c != 'a' && c != 'b')
				throw new IllegalArgumentException("Wrong alphabet");
			switch (etat) {
			case 0:
				if (c == 'a')
					etat = 1;
				break;
			case 1:
				if (c == 'b')
					etat = 2;
				break;
			case 2:
				if (c == 'b')
					etat = 0;
				else if (c == 'a')
					etat = 3;
				break;

			case 3:
				if (c == 'b')
					etat = 2;
				else if (c == 'a')
					etat = 1;
				break;
			}
			i++;
		}

		return etat == 3;
	}

}
