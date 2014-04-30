import org.openqa.selenium.firefox.FirefoxDriver;


public class Permadi_Flash {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		 FirefoxDriver driver = new FirefoxDriver();

		 FlexWebDriver flashApp = new FlexWebDriver(driver, "myFlashMovie");

		driver.get("http://www.permadi.com/tutorial/flashjscommand/");
		
		 flashApp.call("Play"); // first number
    	 Thread.sleep(3000L);
    	 flashApp.call("StopPlay"); // operation
    	 
    	 System.out.println(flashApp.call("GetVariable","/:message"));
    	 flashApp.call("SetVariable","/:message","hello there");
    	 System.out.println(flashApp.call("GetVariable","/:message"));

	}

}
