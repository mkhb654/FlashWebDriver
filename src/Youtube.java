import org.openqa.selenium.firefox.FirefoxDriver;


public class Youtube {
	
	public static void main(String[] args) throws InterruptedException {
		 FirefoxDriver driver = new FirefoxDriver();

		 FlexWebDriver flashApp = new FlexWebDriver(driver, "movie_player");

		driver.get("http://www.youtube.com/watch?v=qdf5NofgGfU&feature=fvst");
		Thread.sleep(2000L);
    	// let the video load
    	while (Integer.parseInt(flashApp.call("getPlayerState")) == 3){
    		Thread.sleep(1000);
    	}
    	
    	// Play the video for 10 seconds
    	Thread.sleep(5000);
    	flashApp.call("pauseVideo");
    	Thread.sleep(5000);
    	flashApp.call("playVideo");
    	Thread.sleep(5000);
    	flashApp.call("seekTo","140","true");
    	Thread.sleep(5000);
    	flashApp.call("mute");
    	Thread.sleep(5000);
    	flashApp.call("setVolume","50");
    	Thread.sleep(5000);
		

	}
                
}