package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class YouTube {
    @FindBy(xpath = "//input[@id=\"search\"]")
     WebElement searchField;
    @FindBy(xpath = "//div[@id=\"contents\"and contains(@class,\"style-scope\")and contains(@class,\"ytd-section-list-renderer\")]")
     WebElement elementLinks;

    public void sendKeysToSearchField(String word) {
        this.searchField.sendKeys(word);
        this.searchField.submit();
    }

    public  void PrintLinks(){
        List<WebElement> listVideosLinks= elementLinks.findElements(By.xpath("//a[@id=\"video-title\"]"));
          System.out.println(listVideosLinks.get(0).getAttribute("href"));
    }

    }
