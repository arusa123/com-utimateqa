import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser = "Edge";
    static WebDriver driver;
    static String baseURL = "https://courses.ultimateqa.com/users/sign_in";

    public static void main(String[] args) {
        //browser setup
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Invalid browser");
        }
        //open URL
        driver.get(baseURL);
        //implicit wait to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        //Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //print the page source
        System.out.println("Page source" + driver.getPageSource());
        //Enter the email in the email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("Prime@gmai.com");
        //password field
        driver.findElement(By.id("user[password]")).sendKeys("Prime123");
        //close browser
        driver.close();

    }
}
