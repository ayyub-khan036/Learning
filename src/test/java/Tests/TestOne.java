package Tests;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import BaseSetup.BaseTest;


//import org.openqa.selenium.chrome.ChromeDriver;

public class TestOne extends BaseTest {
	@Test
	public static void test1() {
		System.out.println("In test1 method");
	}
}
