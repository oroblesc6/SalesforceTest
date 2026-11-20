import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main_Leads {

    public static void main(String[] args) {
        //System.out.print(1);

        WebDriver driver = new ChromeDriver();
        driver.get("https://imperva--qabox.sandbox.my.salesforce.com/");
        driver.findElement(By.xpath("//button[.//span[normalize-space()='CDI STA']]")).click();
        //driver.findElement(By.xpath("//input[@id='sas_user']")).sendKeys("T0297570");
        WebElement userField = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.id("sas_user")));
        userField.click();
        driver.findElement(By.id("sas_user")).sendKeys("T0297570");


    }

}
