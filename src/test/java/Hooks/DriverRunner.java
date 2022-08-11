package Hooks;

import driver.BaseDriver;
import driver.PageDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utilities.Dataparser;

import java.util.Properties;

public class DriverRunner extends BaseDriver {
    Properties prop = Dataparser.loadProperties("devices.properties");

    public void startDriver(){
        String pname,dversion,dname,id;
        pname = prop.getProperty("platform_name");
        dversion=prop.getProperty("device_version");
        dname = prop.getProperty("device_name");
        id = prop.getProperty("udid");
        driver=setup(pname,dversion,dname,id);
    }

    @AfterSuite
    public void closeDriver(){
        PageDriver.getCurrentDriver().quit();
    }
}
