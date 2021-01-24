package UI;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class ExpertShow {
	static WebDriver driver;

	@Test
	public void WilliamJordan() {
		System.setProperty("webdriver.chrome.driver", "C:\\browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://ref-bookvel.herokuapp.com");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/div/div[2]/div[1]/div[2]/a")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Actions actions= new Actions(driver);
	// actions.moveToElement(driver.findElement(by.))
	@Test
	public void QosaiShawa() {
		System.setProperty("webdriver.chrome.driver", "C:\\browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://ref-bookvel.herokuapp.com");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/div/div[2]/div[2]/div[2]/a")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void ShaimaBadawi() {
		System.setProperty("webdriver.chrome.driver", "C:\\browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://ref-bookvel.herokuapp.com");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/section/div/div[2]/div[3]/div[2]/a")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}