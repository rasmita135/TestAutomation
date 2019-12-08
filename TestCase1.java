import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("chromedriverexe","C:\\Users\\Dell\\Downloads\\chromedriver_win32 - Copy.zip");
      WebDriver driver =new ChromeDriver();
      driver.get("https://vast-dawn-73245.herokuapp.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/div[1]/input")).sendKeys("5");
      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/div[2]/input")).sendKeys("6");
      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/form/input")).click();
      String n=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div")).getText();
    		  System.out.println(n);
    		  driver.quit();
     }

}