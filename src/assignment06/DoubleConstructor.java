package assignment06;

public class DoubleConstructor {
	
	public String name = "Halle";
	
	public DoubleConstructor() {
		// This is not possible because only way to call a constructor is by using "new"
		// DoubleConstructor("Berry");
		// We can invoke like this but the new Object created cannot be returned
		// because constructor cannot have return statement, it becomes into a regular method if return statement is added
		DoubleConstructor db = new DoubleConstructor("Berry");
	}
	
	public DoubleConstructor(String name) {
		this.name = name;
	}

}
