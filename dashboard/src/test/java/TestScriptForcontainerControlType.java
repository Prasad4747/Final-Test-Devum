import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjectdevum.ContainerControlerType;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class TestScriptForcontainerControlType {
    ContainerControlerType container;
    public static WebDriver driver;

    @BeforeClass
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://testbed.devum.com/#/security/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        System.out.println("The Browser is Open");
    }

    @Test(priority = 1)
    public void logingpage() throws InterruptedException {
        container = new ContainerControlerType(driver);
        container.logingDevum();
        System.out.println("login successfully");

    }

    @Test(priority = 2)
    public void validateAppStudioPage() throws InterruptedException {
        container = new ContainerControlerType(driver);
        container.verifyAppStudioPage();
    }

    @Test(priority = 3)
    public void creatingNewpage() throws InterruptedException {
        container = new ContainerControlerType(driver);
        container.addingNewPage();
    }

    @Test(priority = 4)
    public void trialPageClick() throws InterruptedException {
        container = new ContainerControlerType(driver);
        container.trialPageClick();
    }

    @Test(priority = 5)
    public void testClickOutlineTab() throws InterruptedException {
        container = new ContainerControlerType(driver);
        container.ClickonOutLineTab();
    }

    @Test(priority = 6)
    public void testHoverAndRightClick() throws InterruptedException, AWTException {
        container = new ContainerControlerType(driver);
        container.mousehoverOnTarilPage();
    }

    @Test(priority = 7)
    public void testSetMarginAndPadding() throws InterruptedException {
        container = new ContainerControlerType(driver);
        container.setMargin(80, 90, 60, 90);
        container.setPadding(60, 80, 90, 100);

        // Validation For Margin
        container.validateMarginSettings(80, 90, 60, 90);

        // Validation For Padding
        container.validatePaddingSettings(60, 80, 90, 100);
    }

    @Test(priority = 8)
    public void testUploadAnImage() throws InterruptedException {
        container = new ContainerControlerType(driver);
        container.addingAnImage();
    }

    @Test(priority = 9)
    public void testDeletePage() throws InterruptedException {
        container = new ContainerControlerType(driver);
        container.deleteThePage();
    }


    @Test(priority = 10)
    public void logout() throws InterruptedException {
        container = new ContainerControlerType(driver);
        container.logOut();
        System.out.println("logout successfully");

    }

}

    @AfterClass
    public void teardown()
    {
        driver.quit();
    }




