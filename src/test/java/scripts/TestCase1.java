package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase1 {
	@Test
	public void demo() {
		Reporter.log("hello java",true);
	}
}

