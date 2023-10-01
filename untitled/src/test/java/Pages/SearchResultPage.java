package Pages;

import static stepDefinition.Hooks.driver;
public class SearchResultPage {

//HomePage homePage=new HomePage();
public String itemName(){

return driver.getCurrentUrl();
}
}
