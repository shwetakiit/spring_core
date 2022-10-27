package kumari.shweta;

public class SomeThing {
	
	public static void outerclassMethod() {
		System.out.println("Outer class method");
	}
	
	static class OtherThing{
		
		public static void diplay() {
			System.out.println("Inner class method");
			outerclassMethod();
		}
		
	}

}
