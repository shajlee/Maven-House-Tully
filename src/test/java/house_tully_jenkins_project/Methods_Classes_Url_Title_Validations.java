package house_tully_jenkins_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods_Classes_Url_Title_Validations {


	
	public static void main(String[] args) {
		Methods_Classes_Url_Title_Validations.HosterTully();
		Methods_Classes_Url_Title_Validations.EdmureTully();
		
		Methods_Classes_Url_Title_Validations HouseTully = new Methods_Classes_Url_Title_Validations();
		HouseTully.BryndenTully();
		HouseTully.CatelynStark();
		
		Methods_Classes_Url_Title_Validations HouseTully1 = new Methods_Classes_Url_Title_Validations();
		HouseTully1.RoslinTully();
	
		
			
	}
	public static void HosterTully() {
		System.out.println("Lord Paramount of the Trident");
	}
	public static void EdmureTully() {
		System.out.println("Lord of Riverrun");
	}
	public static void BryndenTully() {
		System.out.println("Brynden the Blackfish");
	}
	public static void CatelynStark() {
		System.out.println("Lady Stoneheart");
	}
	public static void RoslinTully() {
		System.out.println("Lady of Riverrun");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awoiaf.westeros.org/index.php/House_Tully");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String actualCurrentUrl = "https://awoiaf.westeros.org/index.php/House_Tully";
		String expectedCurrentUrl = driver.getCurrentUrl();
		
		String actualTitle = "House Tully - A Wiki of Ice and Fire";
		String expectedTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
			System.out.println("URL is valid & working");
		}else {
			System.out.println("Url is not valid");
		}
		
		
			
		}
		
		
		
		
		

	



		
		
		
		
		
	
		

	}


