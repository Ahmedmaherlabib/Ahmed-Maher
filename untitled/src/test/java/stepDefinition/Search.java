package stepDefinition;

import Pages.HomePage;
import Pages.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static stepDefinition.Hooks.driver;

public class Search {
SoftAssert softAssert=new SoftAssert();
    HomePage homePage=new HomePage();
    SearchResultPage searchResultPage=new SearchResultPage();

    @Given("user go to url")
    public void Go_To_Url(){homePage.GoToUrl();
      }
    @When("user press on search field")
    public void Click_Search_Field(){homePage.clickSearchField();
    }

    @Then("user could type item name")
    public void TypeItemName(){
          homePage.Enter_item_Name("phone");
    }
    @Then("user click Enter button")
    public void clickEnter(){
     homePage.Enter_button();
    }
    @Then("url contain the item name")
    public void ItemInUrl(){
        Assert.assertTrue(searchResultPage.itemName().contains("Apple"));
    }
}

