package watchers;

import io.qameta.allure.Step;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import util.Scanner;

import java.text.SimpleDateFormat;
import java.util.Date;
public class MyWatch extends TestWatcher {
    Date date = new Date();
    SimpleDateFormat formater = new SimpleDateFormat("HHmmss");//добавляет время к скриншоту
    @Override
    @Step("method by succeeded")
    protected void succeeded(Description description) {
        System.out.println(Scanner.getString());
        Scanner.takeScreen("1.png");


    }
}
