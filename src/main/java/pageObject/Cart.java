package pageObject;

import driver.PageDriver;
import org.openqa.selenium.support.PageFactory;

public class Cart {
    public Cart(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }

}
