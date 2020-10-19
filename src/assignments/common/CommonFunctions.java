package assignments.common;

public interface CommonFunctions {
	
	public static final String applicationStop = "I'm done";
	
	default void breaker() {
		System.out.println("\n**************************************\n");
	}
	
}
