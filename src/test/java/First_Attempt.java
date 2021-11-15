import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class First_Attempt {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M.MUTHUKUMAR\\eclipse-workspace\\Sselenium\\Cchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=my-account");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions s = new Actions(driver);
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		s.moveToElement(women).build().perform();
		WebElement casual = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[1]/a"));
         casual.click();
         Thread.sleep(3000);
         WebElement dress = driver.findElement(By.xpath("(//a[@class='product-name'])[2]"));
         dress.click();
         Thread.sleep(3000);
         JavascriptExecutor j = (JavascriptExecutor)driver;
         j.executeScript("window.scroll(0,600)", "");
         Thread.sleep(3000);
         WebElement cart = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span"));
         j.executeScript("arguments[0].scrollIntoView(true);", cart);
         cart.click();
         Thread.sleep(3000);
         WebElement out = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span"));
         out.click();
         Thread.sleep(3000);
         WebElement fimal = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span"));
         fimal.click();
         WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
         name.sendKeys("karthika04@gmail.com");
         WebElement pw = driver.findElement(By.xpath("//input[@name='passwd']"));
         pw.sendKeys("Karthika@04");
         Thread.sleep(3000);
         WebElement sign = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span"));
         sign.click();
         WebElement cli = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
         cli.click();
         WebElement press = driver.findElement(By.xpath("//input[@type='checkbox']"));
         press.click();
         WebElement cq = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span"));
         cq.click();
         Thread.sleep(3000);
         WebElement en = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a"));
         en.click();
         Thread.sleep(3000);
         WebElement o = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span"));
         o.click();
         Thread.sleep(3000);
         
         
	}

}
