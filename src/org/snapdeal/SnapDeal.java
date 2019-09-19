package org.snapdeal;
	import java.util.Set;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class SnapDeal {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SnapDeal\\Driver\\chromedriver.exe");
			
		    WebDriver driver = new ChromeDriver();
			driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		search.sendKeys("iphones 7");
		
		WebElement a = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		a.click();

		WebElement b = driver.findElement(By.xpath("(//p[text()='Apple iPhone 7 Plus Soft Silicon Cases Wow Imagine - Black'])[1]"));
		b.click();
		
		String PwiN = driver.getWindowHandle();
		System.out.println(PwiN);
		
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin);
		
		for (String eachWindowIF : allwin) {
			if (!PwiN.equals(eachWindowIF)) {
			driver.switchTo().window(eachWindowIF);
		
			WebElement c = driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
			c.click();
			
		Thread.sleep(2000);	
			
			WebElement d = driver.findElement(By.xpath("//div[@class='cartInner']"));
			d.click();
			Thread.sleep(2000);
			
			WebElement e = driver.findElement(By.xpath("//div[@id='CS1']"));
			e.click();
			
			WebElement f = driver.findElement(By.xpath("//li[@class='undefined']"));
			f.click();
			
			
			}
		}
		}

		
	}


