package assignment03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	static int counter=0;

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("We are going to ping www.google.com website 10 times and find the median ping");
		Main main = new Main();
		main.findMedianPing();
	}
	
	public void findMedianPing() throws IOException, InterruptedException {
		// Create and start the ping process
		ProcessBuilder pb = new ProcessBuilder("ping", "www.google.com");
		Process process = pb.start();
		
		// Reading Process input stream
		BufferedReader bf = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String s = null;
		StringBuffer sb = new StringBuffer();
		while((s = bf.readLine()) != null) {
			sb.append(s + "\n");
			System.out.println(s);
			counter++;
			// Ending process if pinged 10 times
			if(counter>10) {
				process.destroy();
				break;
			}
		}
		// Splitting stringbuffer at " " and filtering those elements which have "time=" in them
		List<Float> list = Arrays.asList(sb.toString().split(" ")).stream()
				.filter(str -> str.startsWith("time="))
				// truncating the string and parsing as float
				.map(str -> Float.parseFloat(str.substring(5)))
				.collect(Collectors.toList());
		// Sorting list to find median
		list.sort(Float::compare);
		System.out.println("Median ping is : " + ((list.get(4) + list.get(5))/2));
	}

}
