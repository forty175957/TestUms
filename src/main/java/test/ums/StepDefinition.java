package test.ums;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import javax.xml.xpath.XPath;

public class StepDefinition {
    private WebDriver driver;

    @Given("L'username è {string}")
    public void l_username_è(String arg1) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.it.gg");
        WebElement e =  driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[1]/div[2]/div[2]/form/div[2]/div[1]/div/input"));
        e.sendKeys(arg1);
        System.out.println(arg1);
    }

    @Given("La password è {string}")
    public void la_password_è(String arg1) throws Exception {
        System.out.println("PASS " + arg1);
    }

    @When("Premo su login")
    public void premo_su_login() throws Exception {
       // WebElement bt = driver.findElement(By.);
       // bt.click();
    }

    @Then("Riceverò a schermo la stinga di benvenuto")
    public void riceverò_a_schermo_la_stinga_di_benvenuto() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
