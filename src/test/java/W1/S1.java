package W1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class S1 {
    WebDriver driver;

    @Test
    public void test01() throws InterruptedException {
        .chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("https://www.amazon.com"); // amazona git

        Thread.sleep(3000);

        driver.manage().window().minimize(); // minimize yap

        Thread.sleep(5000);

        driver.manage().window().maximize(); // maximize yap

        Thread.sleep(5000);

        driver.close(); // kapat
    }

}
