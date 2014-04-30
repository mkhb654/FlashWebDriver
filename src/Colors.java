import junit.framework.Assert;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Colors {

	private final static String GREEN = "GREEN";
	private final static String BLUE = "BLUE"; 
	private final static String RED = "RED"; 
	private final static String URL = "http://flashselenium.t35.me/colors.html"; 
	public static void main(String[] args) {
		 FirefoxDriver driver = new FirefoxDriver();

		 FlexWebDriver flashApp = new FlexWebDriver(driver, "coloredSquare");

		driver.get("http://flashselenium.t35.me/colors.html");
		
		Assert.assertEquals("Clicking Colors", driver.getTitle()); 
		Assert.assertEquals(GREEN, flashApp.call("getColor")); 
		flashApp.call("click"); 
		Assert.assertEquals(BLUE, flashApp.call("getColor")); 
		flashApp.call("click"); 
		Assert.assertEquals(RED, flashApp.call("getColor")); flashApp.call("click"); 
		Assert.assertEquals(GREEN, flashApp.call("getColor")); 
	}

}
