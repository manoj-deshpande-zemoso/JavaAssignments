package assignment06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VampireNumber {
	
	public void printHundredVampireNumbers() {
		List<Long> vampireNumbers = new ArrayList<Long>(100);
		for(long num=10; vampireNumbers.size()<100; num++) {
			// If numOfDigits is odd then its not a VampireNumber
			if(numOfDigits(num)%2 != 0) {
				num = num * 10 - 1;
				continue;
			}
			for(long factor=2; factor<Math.sqrt(num); factor++) {
				if(num%factor != 0) continue;
				long quotient = num/factor;
				if(isVampireFactor(num, factor, quotient)) 
					vampireNumbers.add(num);
			}
		}
		vampireNumbers.forEach(System.out::println);
	}
	
	private int numOfDigits(long l) {
		return Long.toString(Math.abs(l)).length();
	}
	
	private boolean isVampireFactor(long num, long factor, long quotient) {
		
		if(Long.toString(factor).endsWith("0") && Long.toString(quotient).endsWith("0")) return false;
		
		int numLen = numOfDigits(num);
		if(numOfDigits(factor) != numLen/2 || numOfDigits(quotient) != numLen/2) return false;
		
		// If the digits are jumbled then the num of bytes would be same
		byte[] numBytes = Long.toString(num).getBytes();
		byte[] factorsBytes = (Long.toString(factor) + Long.toString(quotient)).getBytes();
		Arrays.sort(numBytes); Arrays.sort(factorsBytes);
		return Arrays.equals(numBytes, factorsBytes);
	}
	
}
