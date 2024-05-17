package testAP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ap_Login {
	public String baseURL = "https://ap.poly.edu.vn/";
	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
//		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
			
	}
	
	@Test(priority = 1)
	public void runWeb() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		// Click button sinh viên
		WebElement driveEle = driver.findElements(By.className("homepageButton")).get(3);
		Actions actions = new Actions(driver).click(driveEle);
		actions.build().perform();

		// Click Login with
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dropIcon")));
		WebElement driveEle1 = driver.findElement(By.className("dropIcon"));
		Actions actions1 = new Actions(driver).click(driveEle1);
		actions1.build().perform();

		// Cick Login with Cao Đẳng
		WebElement driveEle2 = driver.findElement(By.xpath("//button[@class='topBarButton dropButton']"));
		Actions actions2 = new Actions(driver).click(driveEle2);
		actions2.build().perform();
	}

	@Test(priority = 2)
	public void click_send_Web() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//sendkey UserName
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='whsOnd zHQkBf']")));
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("hieuhtps30123");
		
		//Click button Next
		WebElement driveEle3 = driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 BqKGqe Jskylb TrZEUc lw1w4b']"));
		Actions actions3 = new Actions(driver).click(driveEle3);
		actions3.build().perform();
		
		//sendkey Password
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='whsOnd zHQkBf']")));
		driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("Hieuha1419@03");
		
		//Click button Next
		Thread.sleep(5000);
		WebElement driveEle4 = driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 BqKGqe Jskylb TrZEUc lw1w4b']"));
		Actions actions4 = new Actions(driver).click(driveEle4);
		actions4.build().perform();
		
	}
}
