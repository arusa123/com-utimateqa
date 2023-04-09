import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseURL = "https://courses.ultimateqa.com/users/sign_in";
        //Setup Chrome browser
        WebDriver driver = new ChromeDriver();
        //Open URL
        driver.get(baseURL);
        //implicit wait to load
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());
        //print the page source
        System.out.println("Page source" + driver.getPageSource());
        //enter email in the email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("prime@gmail.com");
        //password in the password field
        driver.findElement(By.id("user[password]")).sendKeys("Prime123");
        //close the browser
        driver.close();

    }
}
