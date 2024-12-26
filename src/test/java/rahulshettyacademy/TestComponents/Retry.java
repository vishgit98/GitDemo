package rahulshettyacademy.TestComponents;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	int count = 0;
	int maxTry = 1;

//	sometimes Tests fails due to some random issues. So, to make sure Test failed is real we'll rerun the failed Test which will be
//	done by "IRetryAnalyzer" interface. 
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (count < maxTry) { // will only rerun failed test once.
			count++;
			return true;
		}
		return false;
	}

}
