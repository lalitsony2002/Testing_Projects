package New_Packages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Test_Class {

	@Test
	public static void test() {
		
		System.out.println("Hello In Test Method");
		
	}
	
	@BeforeMethod
	public static void test1() {
		
		System.out.println("Before Method");
		
	}
	
	
	
	
}
