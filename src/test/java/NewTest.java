import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import org.openqa.selenium.By;



@Test
public class NewTest {
	public void checkGoogleSearch() {
	    open("https://www.allegro.pl");
	    sleep(6000);
	    $(byXpath("/html/body/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/button")).click();
	    $(byXpath("/html/body/div[3]/div[2]/nav/div[1]/div/div[2]/div[3]/button/span[1]")).click();
	  	$(byXpath("/html/body/div[3]/div[2]/nav/div[1]/div/div[2]/div[3]/div/div[6]/a[1]")).click();
	  	$(byName("username")).setValue("0plmpoi");
	  	$(byName("password")).setValue("a2aaaaaa");
	  	
	};
	

 @BeforeTest
  public void setUp ()
  {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\PatrykSutkowski\\Desktop\\chromedriver.exe");
      Configuration.browser = "chrome";
      
  }

}
