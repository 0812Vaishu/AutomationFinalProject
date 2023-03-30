package Resources;

import org.testng.asserts.SoftAssert;

public class Common_Methods {
	
	public static void handleAssertions(String actual,String expected,String message) {
		
		SoftAssert a = new SoftAssert();
		
		String act=actual;
		
		String exp=expected;
		
		a.assertEquals(act, exp,message);
		
		a.assertAll();
	}

}
