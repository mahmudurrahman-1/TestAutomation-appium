package pageObject;

import driver.PageDriver;
import org.openqa.selenium.support.PageFactory;

public class GuestOrder {
    public GuestOrder(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }
}
