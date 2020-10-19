package assignment01;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		File homeDirectory = new File(System.getenv("HOME"));
		List<String> fileNames = Arrays.asList(homeDirectory.list());
		final String applicationStop = "I'm done";
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Please input a regex:");
			String regex = sc.nextLine();
			
			// Application stop condition
			if(applicationStop.equalsIgnoreCase(regex)) {
				sc.close();
				System.out.println("Stopping the application...Stopped");
				return;
			}
			
			// Filtering fileNames using Java 8 stream API
			fileNames.stream()
			.filter(Pattern.compile(regex).asPredicate())
			.forEach(System.out::println);
			System.out.println("\n*******************\n"); // breaker
		}
		
	}

}
