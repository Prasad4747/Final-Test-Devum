package pageobjectdevum;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

public class ContainerControlerType {
    WebDriver driver;
    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(xpath = "//span[text()='Sign In']")
    private WebElement signIn;

    @FindBy(xpath = "//mat-icon[text()=\" keyboard_double_arrow_right\"]")
    private WebElement doubleArrow;

    @FindBy(xpath = "//span[text()=\"App Studio\"]")
    private WebElement appStudio;

    @FindBy(xpath = "//h3[text()=' APP STUDIO']")
    private WebElement appStudioName;

    @FindBy(xpath = "//span[text()='New Page']")
    private WebElement newpage;

    @FindBy(xpath = "//*[@id=\"mat-input-5\"]")
    private WebElement pageName;

    @FindBy(xpath = "//*[@id=\"mat-select-value-3\"]/span")
    private WebElement dropDwon;

    @FindBy(xpath = "//*[@id=\"mat-option-5\"]/span")
    private WebElement selectMasterpage;

    @FindBy(xpath = "//span[text()='SAVE']")
    private WebElement savePage;

    @FindBy(id = "mat-input-4")
    private WebElement serachPageName;

    @FindBy(xpath = "//div[text()='Trail25']")
    private WebElement pageDisplyed;

    @FindBy(xpath = "//div[@class='row rt-mb-10 rt-px-20']//div[1]//mat-card[1]//div[1]//img[1]")
    private WebElement clickonTrail25Page;

    @FindBy(xpath = "(//span[normalize-space()='Outline'])[1]")
    private WebElement clickonOutLineTab;

    @FindBy(xpath = "(//span[@id='node:Trail30_page_Web'])[1]")
    private WebElement mousehoverOnTrail30Page;

    @FindBy(xpath = "(//span[normalize-space()='Add child'])[1]")
    private WebElement mouseHoverAddChild;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'][normalize-space()='Container'])[1]")
    private WebElement mouseHoverContainer;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'][normalize-space()='Container'])[2]")
    private WebElement mouseHoverFinalContainer;

    @FindBy(xpath = "(//button[@aria-label='toggle undefined'])[1]")
    private WebElement clickOnindicator;

    @FindBy(xpath = "(//mat-tree-node[@role='treeitem'])[2]")
    private WebElement rightClickonContainer;

    @FindBy(xpath = "(//span[normalize-space()='Add child'])[1]")
    private WebElement clickOnAddChild;

    @FindBy(xpath = " (//span[normalize-space()='Basic Elements'])[1]")
    private WebElement clickOnBasicElement;

    @FindBy(xpath = "(//button[@role='menuitem'])[20]")
    private WebElement clickOnHeading;

    @FindBy(xpath = "(//button[@aria-label='toggle undefined'])[2]")
    private WebElement clickOnindicator1;

    @FindBy(xpath = "(//mat-tree-node[@role='treeitem'])[3]")
    private WebElement clickonHeading1;

    @FindBy(xpath = "(//span[@id='control-properties'])[1]")
    private WebElement properties;

    @FindBy(xpath = "(//input[@type='number'])[3]")
    private WebElement topMargin;

    @FindBy(xpath = "(//input[@type='number'])[4]")
    private WebElement bottomMargin;

    @FindBy(xpath = "(//input[@type='number'])[2]")
    private WebElement rightMargin;

    @FindBy(xpath = "(//input[@type='number'])[1]")
    private WebElement leftmargin;

    @FindBy(xpath = "(//input[@type='number'])[7]")
    private WebElement topPadding;

    @FindBy(xpath = "(//input[@type='number'])[8]")
    private WebElement bottomPadding;

    @FindBy(xpath = "(//input[@type='number'])[5]")
    private WebElement leftPadding;

    @FindBy(xpath = "(//input[@type='number'])[8]")
    private WebElement rightPadding;

    @FindBy (xpath = "(//span[normalize-space()='Upload'])[1]")
    private WebElement clickOnUploadImage;

    @FindBy (xpath = "(//img[@alt='Thumbnail'])[8]")
    private WebElement selectImage;

    @FindBy (xpath = "(//span[normalize-space()='Continue'])[1]")
    private WebElement continueImageSelectButton;

    @FindBy (xpath = "(//h1[normalize-space()='Heading'])[1]")
    private WebElement  elementWithBackgroud;

    @FindBy (xpath = "(//mat-icon[@class='mat-icon notranslate material-icons mat-icon-no-color mat-ligature-font'])[1]")
    private  WebElement closeThePage;

    @FindBy (xpath = "(//button[normalize-space()='Yes, Leave'])[1]")
    private  WebElement permissonToLeavePage;

    @FindBy (xpath = "(//img[@src='./assets/img/nav-icons/app_studio.svg'])[1]")
    private  WebElement clickOnAppStudio1;

    @FindBy (id = "mat-input-1")
    private WebElement serchPage1;

    @FindBy (xpath = "//button[contains(@class,'mat-mdc-menu-trigger rt-horiz-icon mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base')]")
    private WebElement clickOn3Dots;

    @FindBy (xpath = "(//span[@class='ng-star-inserted'])[1]")
    private WebElement clickOnDisable;

    @FindBy(xpath = "(//span[normalize-space()='YES, Disable'])[1]")
    private WebElement clickOnYesDisable;

//   @FindBy(xpath = "//button[@class='mat-mdc-menu-trigger rt-horiz-icon mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base cdk-focused cdk-mouse-focused']//span[@class='mat-mdc-focus-indicator']")
//   private WebElement clickonThDots;

    @FindBy(xpath = "(//span[normalize-space()='YES, DELETE'])[1]")
    private WebElement yesDelete;

    @FindBy(xpath = "(//span[normalize-space()='Delete'])[1]")
    private WebElement clickOnDelete;

    @FindBy(xpath = "(//p[normalize-space()='No records found'])[1]")
    private WebElement norecordText;


    @FindBy(xpath = "(//span[@class='mat-mdc-focus-indicator'])[1]//ancestor::button")
    private WebElement profile;

    @FindBy(xpath = "//span[text()=\"Logout\"]")
    private WebElement logout;


    public ContainerControlerType(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void logingDevum() throws InterruptedException {
        username.sendKeys("prasad");
        password.sendKeys("Souravmessi10@");
        signIn.click();
        Thread.sleep(10000);
    }

    public void verifyAppStudioPage() throws InterruptedException {
        Thread.sleep(5000);
        doubleArrow.click();
        appStudio.click();
        boolean displayAppStudio = appStudioName.isDisplayed();
        if (displayAppStudio) {
            System.out.println("Test Pass : User is navigated to App Studio Page");
        } else {
            System.out.println("Test Fail : User is Not navigated to App Studio Page");
        }
    }

    public void addingNewPage() throws InterruptedException {
        Thread.sleep(5000);
        newpage.click();
        pageName.sendKeys("Trail30");
        dropDwon.click();
        selectMasterpage.click();
        savePage.click();
        Thread.sleep(5000);
        // Validate that the new page is created by checking the presence of the new page name
        boolean ispageDisplayed = true;
        if (ispageDisplayed){
            System.out.println("Test Pass: New page 'Trail30' is created and displayed.");
        }
        else {
            System.out.println("Test Fail: New page 'Trail30' is not created or not displayed.");
        }
    }

    public void trialPageClick() throws InterruptedException {
        //Thread.sleep(2000);
        clickonTrail25Page.click();
        System.out.println(" you are at Trail30 Page");

    }

    public void ClickonOutLineTab() throws InterruptedException {
        Thread.sleep(2000);
        clickonOutLineTab.click();

    }

    public void mousehoverOnTarilPage() throws InterruptedException, AWTException {
        Actions actions = new Actions(driver);
        // actions.moveToElement(mousehoverOnTrail30Page).perform(); // Perform Mouse Hover
        Thread.sleep(200);
        //container added
        actions.contextClick(mousehoverOnTrail30Page).perform();  // Perform Right Click
        actions.click(mouseHoverAddChild).perform();  //Mouse Hover Add to child
        actions.click(mouseHoverContainer).perform(); // Mouse hover on Container
        actions.click(mouseHoverFinalContainer).perform();// Mouse hover on Final Container

        // Heading added
        clickOnindicator.click(); // Click on Container
        actions.contextClick(rightClickonContainer).perform(); //right click on Container
        clickOnAddChild.click(); // Click on Add to Child
        clickOnBasicElement.click(); // Click on Basic element
        clickOnHeading.click();  // Click on Heading

        // Verify if Heading element is added
        try {
            WebElement headingElement = driver.findElement(By.xpath("(//h1[normalize-space()='Heading'])[1]"));
            if (headingElement.isDisplayed()) {
                System.out.println("Test Pass: Heading element is added.");
            } else {
                System.out.println("Test Fail: Heading element is not added.");
            }
        } catch (Exception e) {
            System.out.println("Test Fail: Heading element is not added.");
        }

        Thread.sleep(2000);
        mousehoverOnTrail30Page.click();
        clickOnindicator1.click();

        clickonHeading1.click();
        properties.click();
    }

    public void setMargin(int top, int bottom, int right, int left) {
        topMargin.clear();
        topMargin.sendKeys(String.valueOf(top));
        bottomMargin.clear();
        bottomMargin.sendKeys(String.valueOf(bottom));
        rightMargin.clear();
        rightMargin.sendKeys((String.valueOf(right)));
        leftmargin.clear();
        leftmargin.sendKeys(String.valueOf(left));
    }

    public void setPadding(int top, int bottom, int right, int left) {
        topPadding.clear();
        topPadding.sendKeys((String.valueOf(top)));
        bottomPadding.clear();
        bottomPadding.sendKeys((String.valueOf(bottom)));
        rightPadding.clear();
        rightPadding.sendKeys(String.valueOf(right));
        leftPadding.clear();
        leftmargin.sendKeys(String.valueOf(left));
    }

    public String getTopMargin() {
        return topMargin.getAttribute("value");
    }

    public String getBottomMargin() {
        return bottomMargin.getAttribute("value");
    }

    public String getRightMargin() {
        return rightMargin.getAttribute("value");
    }

    public String getLeftMargin() {
        return leftmargin.getAttribute("value");
    }

    public String getTopPadding() {
        return topPadding.getAttribute("value");
    }

    public String getBottomPadding() {
        return bottomPadding.getAttribute("value");
    }

    public String getRightPadding() {
        return rightPadding.getAttribute("value");
    }

    public String getLeftPadding() {
        return leftPadding.getAttribute("value");
    }

    public void validateMarginSettings(int expectedTop, int expectedBottom, int expectedRight, int expectedLeft) {
        String top = getTopMargin();
        String bottom = getBottomMargin();
        String right = getRightMargin();
        String left = getLeftMargin();


        if (String.valueOf(expectedTop).equals(top) &&
                String.valueOf(expectedBottom).equals(bottom) &&
                String.valueOf(expectedRight).equals(right) &&
                String.valueOf(expectedLeft).equals(left)) {
            System.out.println("Test Pass: Margin settings are correct.");
        } else
        {
            System.out.println(" Test Fail : Margin settings are incorrect.");
        }
    }

    public  void validatePaddingSettings(int expectedTop, int expectedBottom, int expectedLeft, int expectedRight) {
        String top = getTopPadding();
        String bottom = getBottomPadding();
        String right = getRightPadding();
        String left = getLeftPadding();

        if (String.valueOf(expectedTop).equals(top) &&
                String.valueOf(expectedBottom).equals(bottom) &&
                String.valueOf(expectedRight).equals(right) &&
                String.valueOf(expectedLeft).equals(left)) {
            System.out.println("Padding settings are correct.");
        } else {
            System.out.println("Padding settings are incorrect.");
        }
    }



    public void addingAnImage() throws InterruptedException {
        clickOnUploadImage.click();
        //Thread.sleep(2000);
        selectImage.click();
        continueImageSelectButton.click();

//        closeThePage.click();
//        permissonToLeavePage.click();
    }

    public void deleteThePage() throws InterruptedException {
        Thread.sleep(10000);
        clickOnAppStudio1.click();
        //serchPage1.sendKeys("Trail30");
        clickOn3Dots.click();
        clickOnDisable.click();
        clickOnYesDisable.click();
        Thread.sleep(10000);
        clickOn3Dots.click();
        clickOnDelete.click();
        yesDelete.click();
        Thread.sleep(10000);
        //serchPage1.sendKeys("Trail30");
        //clickOnDelete.click();


        //validate delete page
        Thread.sleep(3000);
        try {
            WebElement norecordText = driver.findElement(By.xpath("(//p[normalize-space()='No records found'])[1]"));

            if (norecordText.isDisplayed()) {
                System.out.println("Test pass : Page is deleted successfully");
            } else {
                System.out.println("Test fail : Unable to delete the page");

            }
        } catch (Exception e)
        {
            System.out.println(" Test Fail: Page Is not Created");
        }
    }


    public void logOut() throws InterruptedException {
        Thread.sleep(5000);
        profile.click();
        logout.click();
    }
}
