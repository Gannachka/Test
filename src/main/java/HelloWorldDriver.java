import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HelloWorldDriver {
    public static void main(String[] args) throws InterruptedException {

         WebDriver chrome = new EdgeDriver();
        chrome.get("https://www.lamoda.by/men-home/");
        WebElement searchButton = chrome.findElement(By.xpath("//div[@class='button button_blue search__button js-search-button']"));
        searchButton.click();
        //  WebElement searchInput = chrome.findElement(By.xpath("//input[@placeholder='Поиск']"));
        WebElement searchInput = chrome.findElement(By.xpath(" /html/body/div[1]/div[3]/div/div/div/div/input"));
        searchInput.click();
        searchInput.sendKeys("SA007AMJONT5");
        searchInput.sendKeys(Keys.ENTER);
        WebElement sizeChoiceCombobox = chrome.findElement(By.xpath("//div[@class='product-sizes-select ii-select__value ii-select__value_2line']"));
        sizeChoiceCombobox.click();
        WebElement targetSize = chrome.findElement(By.xpath("//div[@data-brand-size='6,5']"));
        targetSize.click();
        WebElement addToCartButton = chrome.findElement(By.xpath("//button[@title='Добавить в корзину']"));
        addToCartButton.click();
        WebElement goToCartButton = chrome.findElement(By.xpath("//div[@class='post-cart-add__footer']/div[2]"));
        goToCartButton.click();
        /*chrome.get("https://www.thenorthface.com/womens.html");
        WebElement searchButton = chrome.findElement(By.xpath("//*[@id=\"body-container\"]/div/div[1]/div/div/nav/div/ul/li[5]/a"));
        searchButton.click();
         WebElement searchInput = chrome.findElement(By.xpath(" //*[@id=\"-button-id\"]/span "));
        searchInput.click();
        WebElement targetSize = waitForElementLocatedBy(chrome,By.xpath("//*[@id=\"product-attr-form\"]/section[2]/div[3]/div/button[3]"));
        System.out.println(targetSize.toString());
        targetSize.click();
        WebElement addToCartButton = chrome.findElement(By.xpath("//*[@id=\"buttonAddToBag\"]"));
        addToCartButton.click();*/


    }

    private static WebElement waitForElementLocatedBy(WebDriver driver, By by){
        return new WebDriverWait(driver,4)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
