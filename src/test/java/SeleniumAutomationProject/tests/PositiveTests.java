package SeleniumAutomationProject.tests;

import SeleniumAutomationProject.cases.positive.BuyProduct;
import SeleniumAutomationProject.cases.positive.Registration;
import SeleniumAutomationProject.cases.positive.SearchProduct;
import SeleniumAutomationProject.driver.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;

public class PositiveTests extends BaseTest {

    @Test
    public void positiveRegistrationTest() { // Automate User Registration process of e-commerce website.
        Registration registration = new Registration();

        registration.clickSignInButton();
        registration.insertEmail();
        registration.clickCreateAccount();
        registration.enterInformation();
        registration.clickRegisterButton();
    }

    @Test
    public void positiveSearchProduct() { // Automate 'Search Product' feature of e-commerce website with Selenium.
        SearchProduct searchProduct = new SearchProduct();
        searchProduct.openWomenTshirtCategory();
        searchProduct.getInformationOfFirstProduct();
        searchProduct.searchTheProduct();
        searchProduct.validateProduct();
    }

    @Test
    public void positiveBuyProduct(){
        BuyProduct buyProduct = new BuyProduct();
        buyProduct.loginToWebsite();
        buyProduct.openCategory();
        buyProduct.openFirstProduct();
        buyProduct.increaseQuantity();
        buyProduct.selectSize();
        buyProduct.selectColor();
        buyProduct.clickAddToCart();
        buyProduct.buyTheProduct();
    }
}

