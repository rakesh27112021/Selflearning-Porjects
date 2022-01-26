import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
	
    public static void main(String[] args) throws InterruptedException {
			 //driver info         	path of the driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh\\Downloads\\selinium-test-main\\selinium-test-main\\95\\95\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.amazon.in/");
		wd.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung");
		Thread.sleep(20000);
		//logic
		wd.close();
    }
}
