package util;

import config.BaseClass;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Scanner extends BaseClass {
    @Step("Make Screenshot")
    @Attachment(value = "Screenshot", type = "image/png")
    public static byte[] takeScreen( String fileName){
        File screenshotfile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);


        try {
            FileUtils.copyFile(screenshotfile,new File("screen/",fileName+".png"));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return  ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
    @Attachment
    @Step("public static String getString(){\\n\" +\n" +
            "            \"        return \\\"Some String\\\";\\n\" +\n" +
            "            \"    }")


    public static String getString(){
        return "Some String";
    }

}
