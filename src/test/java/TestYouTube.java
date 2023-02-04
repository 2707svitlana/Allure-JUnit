import com.sun.tools.javac.comp.Check;
import config.BaseClass;
import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObject.YouTube;
import watchers.MyWatch;



@Story("TEST HILLEL")
@Feature("YOUTUBE FEATURE")
@Epic("SOME EPIC")
@DisplayName("CheckYouTube")

public class TestYouTube extends BaseClass {

    @Rule
    public
    MyWatch watch=new MyWatch();

    static YouTube youTube = PageFactory.initElements(driver, YouTube.class);

    @BeforeClass
    public static void testStart() {
        driver.get("https://www.youtube.com/");
    }

    @DisplayName("CheckYouTubeSearch")
    @Description("youTube.sendKeysToSearchField(\"no war\")")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void test1 () {
        youTube.sendKeysToSearchField("no war");
    }

    @DisplayName("PrintVideoLinks")
    @Description("youTube.PrintLinks()")
    @Severity(SeverityLevel.MINOR)
    @Test
    public void test2() {
        youTube.PrintLinks();
    }

    @AfterClass
    public static void testClose(){
    driver.quit();
    }
}














