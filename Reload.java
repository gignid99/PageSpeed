package Sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub''
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\nidhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    long start = System.currentTimeMillis();
    driver.get("https://www.google.com/");
    WebElement p=driver.findElement(By.name("q"));
    p.sendKeys("Schools in Dubai");
   
    p.submit();
    driver.get("https://edumynation.com/category/schools-in-dubai");
    long finish=System.currentTimeMillis();
    long totalTime=finish+start;
    System.out.println("Page load time: "+totalTime);

	}

}
