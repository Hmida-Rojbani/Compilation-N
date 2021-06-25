package compilation;

public class Automate {
	
	public static boolean onlyOneOccurence(String s) {
		char c ;
		int etat = 0;
		int i=0;
		OUTER: while(i < s.length()) {
			c = s.charAt(i);
			if(c!='a' && c!='b')
				throw new IllegalArgumentException("Wrong alphabet");
			switch (etat) {
			case 0: if(c=='b')
					etat=1;				
				break;
			case 1: if(c=='b')
				etat=2;				
			break;

			case 2:
				break OUTER;
			}
			i++;
		}
		
		return etat==1;
	}

}
