package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class stepDefination {

	
	WebDriver driver;
	
   
	@Given("^user should be navigated to the Google Search page$")
	public void user_should_be_navigated_to_the_Google_Search_page()  {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("step1");
	}

	@When("^He enter any value in the Search Box$")
	public void he_enter_any_value_in_the_Search_Box() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step2");
	}

	@When("^Click on Search Buttton$")
	public void click_on_Search_Buttton()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step3");
	}

	@Then("^Related results will be displayed$")
	public void related_results_will_be_displayed()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step4");
	}
	
	@When("^He enter any value \"([^\"]*)\" in the Search Box$")
	public void he_enter_any_value_in_the_Search_Box(String testdata1)  {
	    System.out.println(testdata1);
	    
	}

	@Then("^Related results like \"([^\"]*)\" and \"([^\"]*)\" will be displayed$")
	public void related_results_like_and_will_be_displayed(String testdata2, String testdata3)  {
		System.out.println(testdata2);
		System.out.println(testdata3);
	    
	}
	
/////////////////assignment1////////////////////
	
	@Given("^launch the broswer and navigate to elearning url$")
	public void launch_the_broswer_and_navigate_to_elearning_url() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RayachotiLalithya\\Documents\\lalithya\\selenium\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/");
		driver.manage().window().maximize();
		Thread.sleep(7000);

	}

	@Then("^user is on homepage and signup link should be displayed$")
	public void user_is_on_homepage_and_signup_link_should_be_displayed()  {
	    driver.findElement(By.xpath("//a[contains(text(),' Sign up')]")).isDisplayed();
	    
	}

	@When("^user click on signup link$")
	public void user_click_on_signup_link() throws InterruptedException  {
		driver.findElement(By.xpath("//a[contains(text(),' Sign up')]")).click();
		Thread.sleep(5000);
   
	}

	@Then("^user navigate to the Registration page$")
	public void user_navigate_to_the_Registration_page()  {
		driver.findElement(By.xpath("//h2[contains(text(),'Registration')]")).isDisplayed();
	}

	@Then("^user enters all the mandatory information$")
	public void user_enters_all_the_mandatory_information() throws InterruptedException  {
		driver.findElement(By.xpath("//input[@id='registration_firstname']")).sendKeys("naveen1");
		driver.findElement(By.xpath("//input[@id='registration_lastname']")).sendKeys("navven1");
		driver.findElement(By.xpath("//input[@id='registration_email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("BlackPink");
		driver.findElement(By.xpath("//input[@id='pass1']")).sendKeys("abc@97");
		driver.findElement(By.xpath("//input[@id='pass2']")).sendKeys("abc@97");
		Thread.sleep(5000);
	
	   
	}

	@Then("^user click on register$")
	public void user_click_on_register() throws InterruptedException  {
		driver.findElement(By.xpath("//button[@id='registration_submit']")).click();
		Thread.sleep(5000);

	   
	}

	@Then("^user should be able to see the successful registration message$")
	public void user_should_be_able_to_see_the_successful_registration_message()  {
		driver.findElement(By.xpath("//div[@class='col-xs-12 col-md-12']")).isDisplayed();
	    
	}

	@When("^user clicks on profile dropdown$")
	public void user_clicks_on_profile_dropdown()  {
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
	    
	}

	@Then("^user should be able to see to his registered email id$")
	public void user_should_be_able_to_see_to_his_registered_email_id()  {
		driver.findElement(By.xpath("//div[@class='text-center']/p")).isDisplayed();
	    
	}

	@When("^user click on homepage$")
	public void user_click_on_homepage()  {
	    driver.findElement(By.xpath("(//a[@href='http://elearningm1.upskills.in/index.php'])[2]")).click();
	    }

	@When("^user click on compose$")
	public void user_click_on_compose()  {
		driver.findElement(By.xpath("//a[text()='Compose']")).click();
	    
	}

	@When("^user enters data for  send to$")
	public void user_enters_data_for_send_to() throws InterruptedException  {
		Actions act = new Actions(driver);
		
	    driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("naveen");
	    Thread.sleep(2000);
	  driver.findElement(By.xpath("//li[contains(text(),'naveen naveen')]"));
	  Thread.sleep(3000);
	    act.sendKeys(Keys.RETURN).perform();
	    Thread.sleep(3000);
	}

	@When("^user enters data for subject$")
	public void user_enters_data_for_subject()  {
		
	   driver.findElement(By.xpath("//input[@id='compose_message_title']")).sendKeys("Hi For Testing");
	}

	@When("^user enters message in message box$")
	public void user_enters_message_in_message_box() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".cke_wysiwyg_frame"));
		driver.switchTo().frame(0);
		waitForElementToBeLoad("//body");
		driver.findElement(By.xpath("//body")).click();
		waitForElementToBeLoad("//body/p");
		driver.findElement(By.xpath("//body/p")).sendKeys("Hello Mr.Navven \n This is for testing \n From, \n Naveen1");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
	    
	}

	private void waitForElementToBeLoad(String string) {
		// TODO Auto-generated method stub
		
	}

	@When("^user clicks on send message button$")
	public void user_clicks_on_send_message_button() throws InterruptedException  {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=' btn btn-primary ']")).click();
	    
	}

	@Then("^user should be able to see the acknowledgement$")
	public void user_should_be_able_to_see_the_acknowledgement() {
		driver.findElement(By.xpath("//div[@class='alert alert-success']")).isDisplayed();
	   
	}

	
}
