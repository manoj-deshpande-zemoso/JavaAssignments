package assignment07.innerclasses;

public class OuterClass {
	
	class FirstInnerClass{
		
		public String name;
		public FirstInnerClass(String name) {
			this.name = name;
		}
		class SecondInnerClass{
			
			public void print() {
				System.out.println(name);
			}
		}
		
	}
	
}
