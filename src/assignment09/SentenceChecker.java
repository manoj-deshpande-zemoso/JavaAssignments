package assignment09;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SentenceChecker{
	
	public static void main(String args[] ) {
		
		System.out.println("Type a sentence");
		
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		/*
		 * ^ means "begins with" 
		 * \\s means white space 
		 * + means 1 or more
		 * [A-Za-z,;'"\\s] means any letter,
		 *  ,, ;, ', ", or whitespace character 
		 *  $ means "ends with"
		 */
		boolean isSentence = Pattern.matches("^+[A-Za-z,;'\"\\s]+[.?!]$", text);
		
		if(isSentence) System.out.println("This is a sentence");
		else System.out.println("This is not a valid sentence");
		sc.close();
		
	}

}
