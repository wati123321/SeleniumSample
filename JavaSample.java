import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import com.browserstack.local.Local;


import java.net.URL;

public class JavaSample {

    public static final String USERNAME = "tejaswatamwar2";
    public static final String AUTOMATE_KEY = "KnUSTdPBrU8tp7gzjNFp";
    public static final String URL = "http://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static void main(String[] args) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Firefox");
        caps.setCapability("browser_version", "72.0");
        //caps.setCapability("browser", "Chrome");
        //caps.setCapability("browser_version", "79.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1024x768");
        caps.setCapability("name", "Bstack-[Java] Sample Test");
        caps.setCapability("browserstack.local", "true");
        caps.setCapability("browserstack.networkLogs", "true");
        //caps.setCapability("acceptSslCerts", "true");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("https://apple.com");
        //WebElement element = driver.findElement(By.name("q"));

        //element.sendKeys("BrowserStack");
        //element.submit();

        System.out.println(driver.getTitle());
        driver.quit();

    }
}