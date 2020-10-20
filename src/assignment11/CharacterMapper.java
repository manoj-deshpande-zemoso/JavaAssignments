package assignment11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterMapper {
	
	private static Map<Character, Integer> charMap = new HashMap<Character, Integer>();

	public static void main(String[] args) throws IOException {
		
		String fileToRead = args[0];
		String fileToWrite = args[1];
		Scanner sc = new Scanner(new File(fileToRead));
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			processLine(line);
		}
		sc.close();
		StringBuffer sb = new StringBuffer();
		for(Map.Entry<Character, Integer> entry : charMap.entrySet()) 
			sb.append(entry.getKey() + " has appeared : " + entry.getValue() + " times\n");
		FileWriter fw = new FileWriter(fileToWrite);
		fw.write(sb.toString());
		fw.close();
	}
	public static void processLine(String line) {
		char[] chars = line.toCharArray();
		for(char c : chars) {
			if(charMap.get(c) == null) charMap.put(c, 0);
			charMap.put(c, charMap.get(c)+1);
		}
	}

}
