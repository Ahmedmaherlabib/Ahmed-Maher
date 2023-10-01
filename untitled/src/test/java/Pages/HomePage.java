package Pages;
import org.openqa.selenium.By;
import static stepDefinition.Hooks.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
public class HomePage {


public void GoToUrl(){driver.get("https://demo.nopcommerce.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

}

    public WebElement searchField() {
        return driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
    }
    public WebElement searchButton() {
        return driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button"));
    }


    public void clickSearchField(){
       searchField().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    public void Enter_item_Name(String itemName){
     searchField().sendKeys("Apple");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
public void Enter_button(){
    searchButton().click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
}
