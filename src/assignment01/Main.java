package assignment01;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import assignments.common.CommonFunctions;

public class Main implements CommonFunctions{

	public static void main(String[] args) {
		
		System.out.println("We're gonna test if we can filter files in the home directory using regex");
		Main main = new Main();
		main.filterFileNames();
		
	}
	
	public void filterFileNames() {
		File homeDirectory = new File(System.getenv("HOME"));
		List<String> fileNames = Arrays.asList(homeDirectory.list());
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
			
			breaker();
		}
	}

}
