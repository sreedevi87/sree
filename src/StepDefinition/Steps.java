package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
	@Given("^Open the chrome and launch the application$")				
    public void open_chrome_and_launch_the_application() throws Throwable							
    {		
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\requiredsoftwareforsetupforselenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
        			
    }
	 @When("^application opened$")					
	    public void applicationopened() throws Throwable 							
	    {		
		 driver.get("http://127.0.0.1/orangehrm-2.6/login.php");					
	    }	
	 @Then("^verifying the title whether it has correct title OrangeHRM - New Level of HR Management$")
	 public void verifying_the_title_whether_it_has_correct_title_OrangeHRM_New_Level_of_HR_Management() throws Throwable {
		 String actualtitle=driver.getTitle();
	        if (actualtitle.equalsIgnoreCase("OrangeHRM - New Level of HR Management")) System.out.println("title matched"); else System.out.println("title not matched");
	     
	 }

    @Then("^Enter the Username and Password$")					
    public void Enter_the_Username_and_Password() throws Throwable 							
    {		
    	driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");					
    }		

    @Then("^login is successful$")					
    public void login_is_successful() throws Throwable 							
    {    		
    	driver.findElement(By.xpath("//input[@name='Submit']")).click();	
    	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
    }	
    @Then("^verifying the title whether it has correct title$")
    public void titleisCorrect() throws Throwable 							
    {    		
    	String actualtitle=driver.getTitle();
        if (actualtitle.equalsIgnoreCase("OrangeHRM")) System.out.println("title matched"); else System.out.println("title not matched");				
    }		
    @Then("^Verify Username text$")
    public void verifyusername() throws Throwable
    {
    	if (driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText().contains("admin")) System.out.println("contains admin label");
    }
    @Then("^VerifyTextPresent$")
    public void verifyTextPresent() {
    	 if (driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText().contains("Welcome")) System.out.println("welcome text is present"); else System.out.println("welcome text is not present"); 	
    }
    @Then("^Employee Leave Summary sub menu$")
    public void employeeLeavesummarysubmenu() throws Exception
    {
    	 WebElement leavelink= driver.findElement(By.linkText("Leave"));
         Actions a=new Actions(driver);
         a.moveToElement(leavelink).build().perform();
         Thread.sleep(1000L);
         WebElement leavesummarylink= driver.findElement(By.linkText("Leave Summary"));
         a.moveToElement(leavesummarylink).build().perform();
         Thread.sleep(1000L);
         driver.findElement(By.linkText("Employee Leave Summary")).click();
    }
    @Then("^selectframe$")
    public void selectFrame() throws Exception{
    	driver.switchTo().frame("rightMenu");
    }
    @Then("^clickView$")
    public void clickView() throws Exception{
    	driver.findElement(By.id("btnView")).click();
    }
    @Then("^exitframe$")
    public void exitFrame() throws Exception{
    	driver.switchTo().defaultContent();
    	    }
    @Then("^PIM Main menu link$")
    public void PIM_main_menu_link() throws Exception{
    	WebElement pimelement=driver.findElement(By.linkText("PIM"));
        Actions a=new Actions(driver);
        a.moveToElement(pimelement).build().perform();
        driver.findElement(By.linkText("Add Employee")).click();
    	    }
    @Then("^verify logout$")
    public void logout() throws Throwable{
    	driver.findElement(By.linkText("Logout")).click();
    	
    }
    @Then("^teardown$")
    public void tearDown() throws Exception{
    	driver.close();
    }
    @Then("^selectingframe$")
    public void selectingframe() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @Then("^Entering firstname and lastname$")
    public void entering_firstname_and_lastname() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    
    

}
