package New_Packages;

public class Class2 {
	
	String Str;
	
	
	/*public Class2(String Str) {
		this.Str = "Hello";
		
	}*/
	
	
	public static void testMethod() {
		
	System.out.println("Hello Test Method Invoke in Class 2 ");
	Class2 obj = new Class2();
	obj.testMethod2();
	}
	
	
	public void testMethod2() {
		
		System.out.println("Hello Test Method Invoke in Class 2 and testMethod2 called ");
		
	}

}
