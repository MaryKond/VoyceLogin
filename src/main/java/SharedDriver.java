import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SharedDriver {

    private static WebDriver webDriver;

    public static WebDriver getWebDriver(){
        if(webDriver==null){
            WebDriverManager.firefoxdriver().setup();
//            WebDriverManager.chromedriver().setup();


            // incognito mode
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--incognito");
//            DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//            options.merge(capabilities);
//            webDriver = new ChromeDriver(options);
            webDriver = new FirefoxDriver();
            webDriver.manage().window().maximize();



        }
        return webDriver;
    }
    public static void closeDriver(){
        if(webDriver!=null){
            webDriver.close();
        }


    }
//    public static void quitDriver(){
//        if(webDriver!=null){
//            webDriver.quit();
//        }


//    }
}