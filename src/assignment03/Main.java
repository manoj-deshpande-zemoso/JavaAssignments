package assignment03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	
	static int counter=0;

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("We are going to ping www.google.com website 10 times and find the median ping");
		Main main = new Main();

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the host you want to ping: ");
		String host = sc.nextLine();
		System.out.print("Enter the number of pings: ");
		int numOfPings = sc.nextInt();
		main.findMedianPing(host, numOfPings);
	}
	
	public void findMedianPing(String host, int numOfPings) throws IOException, InterruptedException {
		// Create and start the ping process
		ProcessBuilder pb = new ProcessBuilder("ping", host);
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
			if(counter>numOfPings) {
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
		int size = list.size();
		float medianPing = list.get(size/2);
		if(size%2==0)
			medianPing = (list.get(size/2) + list.get((size/2)-1))/2;
		System.out.println("Median ping is : " + medianPing);
	}

}
