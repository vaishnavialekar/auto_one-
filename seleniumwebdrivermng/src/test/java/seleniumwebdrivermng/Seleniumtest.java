package seleniumwebdrivermng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumtest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup(); // System.setProperties("D:\\AUTOMATION\\chrome driver")
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.airindia.in/");
		System.out.println(driver.getTitle());
		// driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#lblOneWay")).click();
		try {                                   // div[class='iradio hover checked'] ins[class='iCheck-helper']
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println(driver.findElement(By.cssSelector("#lblOneWay")
		// ).isSelected());

		driver.findElement(By.id("from")).sendKeys("mu");

		List<WebElement> mylist = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : mylist) {
			if (option.getText().equalsIgnoreCase("Mumbai, Chhatrapati Shivaji International Airport, BOM, India")) {
				option.click();
				break;
			}
		}

			driver.findElement(By.id("to")).sendKeys("Nagpur, Dr Babasaheb Ambedkar International Airport Sonegaon Airport, NAG, India");

			List<WebElement> mylist1 = driver.findElements(By.xpath("//*[@id=\"ui-id-839\"]"));

			for (WebElement option : mylist1) {
				if (option.getText().equalsIgnoreCase("Nagpur, Dr Babasaheb Ambedkar International Airport Sonegaon Airport, NAG, India")) {
					option.click();
					break;
				}
			
			/*for (WebElement option : mylist1) {
				if (option.getText().contains("Nagpur, Dr Babasaheb Ambedkar International Airport Sonegaon Airport, NAG, India")) {
					//option.click();
					break;
				} */
				
			}
			
			
			driver.findElement(By.xpath("//*[@id=\"id_1\"]/img")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[2]/td[7]/a")).click();
			
			
			Select drpdown = new Select (driver.findElement(By.id ("ddladult1")));
			drpdown.selectByValue("3");			
			
			// driver.findElement(By.xpath("//*[@id=\"loginPageId\"]/div[2]/div/form/div[1]/div/div/input")).sendKeys("UG3034");
			// driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Neml@1234");
			// driver.findElement(By.xpath("//*[@id=\"loginPageId\"]/div[2]/div/form/div[3]/button")).click();
			// System.out.println("login success");
			// System.out.println(driver.findElement(By.xpath("//*[@id=\"loginPageId\"]/div[2]/div/form/span[1]")).getText());
			// driver.close();
			// driver.quit();

		
	}
}
