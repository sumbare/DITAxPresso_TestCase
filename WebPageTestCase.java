import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageTestCase {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method 

		WebDriver driver=new ChromeDriver();
		driver.findElement(By.linkText("Contact Us")).click();
		driver.findElement(By.xpath("//input[@name=First Name]")).sendKeys("Sujata");
		String url = driver.getCurrentUrl();

		if (url.contentEquals("https://ditaxpresso.com/#/contactus")) {
			System.out.println("User On Contact Us Page :Test Case Pass Sucessfully");

		}else {}

		System.out.println("User  Not On Contact Us Page :Test Case Fail");



		driver.findElement(By.name("Last name")).sendKeys("Sumbare");
		driver.findElement(By.name("Phone")).sendKeys("9921821402");

		driver.findElement(By.id("formsubmit")).click();
		String buttonTitle = driver.getTitle();

		System.out.println(buttonTitle);
		if(buttonTitle.contains("Submit")) {
			System.out.println("Submit Button Type is Submit" );	  

		}else {
			System.out.println("Button is Normal Button");
		}
		driver.findElement(By.id("reset")).click();
		String resetTitle = driver.getTitle();

		System.out.println(resetTitle);
		if(buttonTitle.contains("Submit")) {
			System.out.println("Reset Button Type is Submit" );	  

		}else {
			System.out.println("Button is Normal Button");
		}

    driver.findElement(By.xpath("//i[class=ti-mobile]")).click();
    driver.close();









	}

}
