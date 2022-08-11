package Hooks;

import io.cucumber.java.en.Given;
import org.testng.annotations.Test;
import pageObject.Home;

public class HomeTest {

    //Instances
    Home homepage =new Home();
    //
    @Given("^Mike on home page after opening nopCart mobile app$")
    public void openApp(){
        homepage.Test();
    }
}
