

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazoncapturelinks {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://Google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://amazon.in");
		List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of links an amazon : "+ links.size());
        
        for(WebElement link : links) {
        	System.out.println(link.getText());
        }
		driver.quit();
	}

}
