package fromyproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fromy {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/");
		//		driver.manage().window().maximize();
		Thread.sleep(3000);

		//autocomplete..
		driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[1]")).click();
		Thread.sleep(1000);

		//address
		driver.findElement(By.id("autocomplete")).sendKeys("xxxx");
		Thread.sleep(1000);

		//street 1 
		driver.findElement(By.id("street_number")).sendKeys("yyyy");
		Thread.sleep(1000);

		//street 2 
		driver.findElement(By.id("route")).sendKeys("zzzzz");
		Thread.sleep(1000);

		//city....
		driver.findElement(By.id("locality")).sendKeys("qqqqqq");
		Thread.sleep(1000);

		//state...
		driver.findElement(By.id("administrative_area_level_1")).sendKeys("oooo");
		Thread.sleep(1000);

		// zip code....
		driver.findElement(By.id("postal_code")).sendKeys("kkkkkk");
		Thread.sleep(1000);

		//country...
		driver.findElement(By.id("country")).sendKeys("ppppppp");
		Thread.sleep(1000);

		//home..
		driver.findElement(By.id("logo")).click();
		Thread.sleep(1000);

		//buttons.....
		driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[2]")).click();
		Thread.sleep(1000);

		//dropdown....
		driver.findElement(By.id("btnGroupDrop1")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='dropdown-item'])[16]")).click();
		Thread.sleep(1000);

		//home
		driver.findElement(By.id("logo")).click();
		Thread.sleep(1000);

		//checkbox....
		driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkbox-2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("checkbox-3")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("checkbox-2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("checkbox-3")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("checkbox-1")).click();
		Thread.sleep(1000);
		//home
		driver.findElement(By.id("logo")).click();
		Thread.sleep(1000);

		//		Datepicker...
		driver.findElement(By.xpath("(//a[@class='btn btn-lg'])[4]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(1000);

		while(true) {
			String month="April 2025";
			String day = "9";
			String text = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();


			if(text.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
			}

		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class='table-condensed']/tbody[1]/tr[2]/td[4]")).click();
		Thread.sleep(2000);

		//drag&drop
		driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space(text())='Drag and Drop']")).click();
		driver.navigate().refresh();

		WebElement drage=driver.findElement(By.xpath("//div[contains(@class,'ui-widget-content ui-draggable')]//img[1]"));
		WebElement drop=driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));

		Actions action =new Actions(driver);
		action.dragAndDrop(drage, drop).perform();
		Thread.sleep(2000);

		//dropdown
		driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space(text())='Dropdown']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("( //a[@class='dropdown-item'])[21]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("INPUT");
		Thread.sleep(2000);
		//Scrolling page
		driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("( //a[@class='dropdown-item'])[11]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)","");
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Kumar");
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("03/04/2025");
		Thread.sleep(3000);
		//Radio button
		driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("( //a[@class='dropdown-item'])[12]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='form-check-input'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='form-check-input'])[3]")).click();

		//from

		driver.findElement(By.xpath("//li[@class='nav-item']//a[1]")).click();
		Thread.sleep(2000);
		//First Name
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Raj");
		Thread.sleep(2000);
		//Second Name
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("Kumar");
		Thread.sleep(2000);
		//Jop Title
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("Developer");
		Thread.sleep(2000);
		//Highest Level Of Education
		driver.findElement(By.id("radio-button-2")).click();
		Thread.sleep(2000);
		//Scroll page
		js.executeScript("window.scrollBy(0,300)","");
		Thread.sleep(3000);
		//Sex
		driver.findElement(By.id("checkbox-1")).click();

		//Year Of Experience
		driver.findElement(By.xpath("//select[@class='form-control']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//select[@class='form-control']//option)[2]")).click();
Thread.sleep(3000);
		//date


		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(2000);

		while(true) {
			String month="April 2025";
			String day = "9";
			String text = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText();


			if(text.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("(//th[@class='next'])[1]")).click();
			}


		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class='table-condensed']/tbody[1]/tr[2]/td[4]")).click();
		Thread.sleep(2000);


		//Sumit

		driver.findElement(By.xpath("//a[contains(@class,'btn btn-lg')]")).click();
		Thread.sleep(5000);
		
		
		driver.quit();

	}
}

