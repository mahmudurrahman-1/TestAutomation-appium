package pageObject;

import driver.PageDriver;
import org.openqa.selenium.support.PageFactory;

public class Home {
    public Home(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }

    public void Test(){
        System.out.println("Alhamdulillah");
    }
}
