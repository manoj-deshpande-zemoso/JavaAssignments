package assignment02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import assignments.common.CommonFunctions;

public class Main implements CommonFunctions{
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("We're gonna test if the entered text contains all alphabets(case insensitive)");
		
		Main main = new Main();
		// O(n) time complexity
		// O(n) space complexity
		main.containsAllAlphabets();
		
		System.out.println("Stopping application....Stopped");
	}
	
	private void containsAllAlphabets() {
		
		while(true) {
			// Scanner Job
			System.out.println("Enter some text: ");
			String text = sc.nextLine();
			
			char[] charArray = text.toLowerCase().toCharArray();
			
			// Converting array to stream and filtering only alphabets from the array
			Stream<Character> charStream = IntStream.range(0, charArray.length).mapToObj(i -> charArray[i]).filter(i -> i<=122 && i>=97);
			
			// Converting stream to set to avoid duplicates
			Set<Character> charSet = new HashSet<Character>(charStream.collect(Collectors.toSet()));
			
			// Logic
			if(charSet.size() == 26) System.out.println("Yes!! It has all alphabets");
			else System.out.println("No!! It does not have all alphabets");
			
			breaker();
			
			System.out.println("Want another go? Y or N");
			if(sc.nextLine().equalsIgnoreCase("N")) break;
		}
		sc.close();
	}

}
