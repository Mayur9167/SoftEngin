package SearchPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebProgram {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://form.jotform.com/202870918610455");
		driver.findElement(By.name("q4_studentName[first]")).sendKeys("Yasin");
		driver.findElement(By.name("q4_studentName[middle]")).sendKeys("Ramzan");
		driver.findElement(By.name("q4_studentName[last]")).sendKeys("Honnolli");
		
		Select select = new Select(driver.findElement(By.name("q24_birthDate24[month]")));
		select.selectByVisibleText("February");
		
		Select select1 = new Select(driver.findElement(By.name("q24_birthDate24[day]")));
		select1.selectByVisibleText("19");
		
		Select select2 = new Select(driver.findElement(By.name("q24_birthDate24[year]")));
		select2.selectByVisibleText("2000");
		
		Select select3 = new Select(driver.findElement(By.name("q3_gender")));
		select3.selectByVisibleText("Male");
		
		driver.findElement(By.name("q23_address[addr_line1]")).sendKeys("Muslim Waddo");
		driver.findElement(By.name("q23_address[addr_line2]")).sendKeys("Near Mosque");
		driver.findElement(By.name("q23_address[city]")).sendKeys("bicholim");
		driver.findElement(By.name("q23_address[state]")).sendKeys("Goa");
		driver.findElement(By.name("q23_address[postal]")).sendKeys("403503");
		
		driver.findElement(By.name("q6_studentEmail6")).sendKeys("yasin@gmail.com");
		driver.findElement(By.name("q27_mobileNumber[full]")).sendKeys("9970811754");
		driver.findElement(By.name("q25_phoneNumber25[full]")).sendKeys("8550925742");
		driver.findElement(By.name("q26_workNumber[full]")).sendKeys("9923326192");
		driver.findElement(By.name("q14_company")).sendKeys("Deccan Chemicals");
		
		Select select4 = new Select(driver.findElement(By.name("q46_courses")));
		select4.selectByVisibleText("Math 101");
		
		driver.findElement(By.name("q45_clickTo45")).sendKeys("Its very intresting to learn about selenium");
		driver.findElement(By.id("input_20")).click();
		driver.close();
	    driver.quit();
	    }
	}
