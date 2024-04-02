import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mercury {

	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\cmr\\\\Desktop\\\\22r01a6710\\\\\\\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.mercurytravels.co.in/");
	Thread.sleep(1000);
	Actions b =new Actions(d);
	WebElement c=d.findElement(By.xpath("(//a[normalize-space()='Customer Login'])[2]"));
	b.moveToElement(c).perform();
	Thread.sleep(1000);
	WebElement r=d.findElement(By.xpath("(//a[normalize-space()='Register'])[2]"));
	r.click();
	Thread.sleep(1000);
	WebElement f=d.findElement(By.id("acc_first_name"));
	f.sendKeys("gopi");
	Thread.sleep(1000);
	WebElement l=d.findElement(By.id("acc_last_name"));
	l.sendKeys("b");
	Thread.sleep(1000);
	WebElement e=d.findElement(By.id("acc_user_email"));
	e.sendKeys("gopi.lucky8066@gmail.com");
	Thread.sleep(1000);
	WebElement p=d.findElement(By.id("acc_user_password"));
	p.sendKeys("123456");
	Thread.sleep(1000);
	WebElement cp=d.findElement(By.id("acc_user_passconf"));
	cp.sendKeys("123456");
	Thread.sleep(1000);
	WebElement mn=d.findElement(By.id("acc_mobile_no"));
	mn.sendKeys("1111111111");
	Thread.sleep(1000);
	WebElement rb=d.findElement(By.xpath("(//button[normalize-space()='Register'])"));
	rb.click();
	Thread.sleep(1000);
	}
	
	
}
