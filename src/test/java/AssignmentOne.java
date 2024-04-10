import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class AssignmentOne {

  WebDriver driver;


    WebElement errorMsgFirstName ;
    WebElement errorMsgLastName;
    WebElement errorMsgEmail;
    WebElement errorMsgJobTitle;
    WebElement errorMsgCompany;
    WebElement errorMsgEmployee;
    WebElement errorMsgPhone;
    WebElement errorMsgCountry;
    WebElement startFreeTrailButton;






 @Test
    public void errorMessage() {
     driver = new ChromeDriver();
     driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

     startFreeTrailButton = driver.findElement(By.cssSelector(".submit"));
     startFreeTrailButton.click();


     ArrayList<String> errorMessages = new ArrayList<>();
     errorMessages.add("Enter your first name");
     errorMessages.add("Enter your last name");
     errorMessages.add("Enter a valid email address");
     errorMessages.add("Select your title");
     errorMessages.add("Enter your company name");
     errorMessages.add("Select the number of employees");
     errorMessages.add("Enter a valid phone number");


     errorMsgFirstName = driver.findElement(By.xpath("//input[@name='UserFirstName']/following-sibling::label/following-sibling::span[text()='Enter your first name']"));
     String expectedErrorFirstNameMsg = errorMsgFirstName.getText();


     errorMsgLastName = driver.findElement(By.xpath("//input[@name='UserLastName']/following-sibling::label/following-sibling::span[text()='Enter your last name']"));
     String expectedErrorLastNameMsg = errorMsgLastName.getText();

     errorMsgEmail = driver.findElement(By.xpath("//input[@name='UserEmail']/following-sibling::label/following-sibling::span[text()='Enter a valid email address']"));
     String expectedErrorEmailMsg = errorMsgEmail.getText();


     errorMsgJobTitle = driver.findElement(By.xpath("//select[@name='UserTitle']/following-sibling::label/following-sibling::span[text()='Select your title']"));
     String expectedErrorJobTitleMsg = errorMsgJobTitle.getText();


     errorMsgCompany = driver.findElement(By.xpath("//input[@name='CompanyName']/following-sibling::label/following-sibling::span[text()='Enter your company name']"));
     String expectedErrorCompanyMsg = errorMsgCompany.getText();

     errorMsgEmployee = driver.findElement(By.xpath("//select[@name='CompanyEmployees']/following-sibling::label/following-sibling::span[text()='Select the number of employees']"));
     String expectedErrorEmployeeMsg = errorMsgEmployee.getText();


     errorMsgPhone = driver.findElement(By.xpath("//input[@name='UserPhone']/following-sibling::label/following-sibling::span[text()='Enter a valid phone number']"));
     String expectedErrorPhoneMsg = errorMsgPhone.getText();


     errorMsgCountry = driver.findElement(By.xpath("//input[@name='UserFirstName']/following-sibling::label/following-sibling::span[text()='Enter your first name']"));
     String expectedErrorCountry = errorMsgCountry.getText();


     Assert.assertTrue(errorMessages.contains(expectedErrorFirstNameMsg));
     Assert.assertTrue(errorMessages.contains(expectedErrorLastNameMsg));
     Assert.assertTrue(errorMessages.contains(expectedErrorEmailMsg));
     Assert.assertTrue(errorMessages.contains(expectedErrorJobTitleMsg));
     Assert.assertTrue(errorMessages.contains(expectedErrorCompanyMsg));
     Assert.assertTrue(errorMessages.contains(expectedErrorEmployeeMsg));
     Assert.assertTrue(errorMessages.contains(expectedErrorFirstNameMsg));
     Assert.assertTrue(errorMessages.contains(expectedErrorPhoneMsg));
     Assert.assertTrue(errorMessages.contains(expectedErrorCountry));





  }




}

