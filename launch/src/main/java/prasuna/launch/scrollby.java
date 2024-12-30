package prasuna.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollby {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\Users\prasu\Downloads\chrome-win64.zip\chrome-win64.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.apple.com/in/");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		Actions actions= new Actions(driver);
		actions.scrollByAmount(0,3000).perform();
		driver.get("https://github.com/prasuna-latika");
		Thread.sleep(10000);
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(10000);
		driver.findElement(By.name("sex")).click();
		WebElement femaleRadioButton=driver.findElement(By.xpath("//*[@id=\"u_0_d_ke\"]/span[1]/label"));
		Thread.sleep(10000);
		driver.manage().window().minimize();
		Thread.sleep(10000);
		driver.close();
		driver.getCurrentUrl();
	}

}
