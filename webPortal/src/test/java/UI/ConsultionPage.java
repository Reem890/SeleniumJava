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

public class ConsultionPage {
	static WebDriver driver;
	@Test
	public void conultionPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://ref-bookvel.herokuapp.com");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		driver.findElement(By.xpath("//*[@id=\"app\"]/nav/div[2]/div[1]/a[2]")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		
		Actions actions =  new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"username\"]")));
		Thread.sleep(2000);
		actions.click();
		actions.sendKeys("Reem");
		WebDriverWait waitElement= new WebDriverWait(driver,20);
		waitElement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"experts\"]")));
		driver.findElement(By.xpath("//*[@id=\"experts\"]")).click();
		String PageTitle = driver.getTitle();
		String month = "january,2021";
		String day = "23";
		driver.findElement(By.xpath("//*[@id=\"date\"]")).click();
		
			Select dropdownDuration= new Select(driver.findElement(By.xpath("//*[@id=\"duration\"]")));
			dropdownDuration.selectByVisibleText("15");
			Select dropdpwnTime= new Select(driver.findElement(By.xpath("//*[@id=\"available_hours\"]")));
			dropdownDuration.selectByVisibleText("1:00");
			driver.findElement(By.xpath("//*[@id=\"book_form\"]/div[6]/button")).click();

		}
		
		
	}

	


