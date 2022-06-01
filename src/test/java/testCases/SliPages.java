package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SliPages extends BaseClass {

	@DataProvider
	public Object[][] windowResolution() {

		return new Object[][] { { 2560, 1440 } , { 1920, 1080 }, { 1280, 720 }, { 1366, 768 }, { 1920, 1200 },
				 { 1440, 900 }, { 1536, 864 }, { 1680, 1050 }
		};
	}

	@Test(dataProvider = "windowResolution", enabled = true)
	public void checkResolutionForSliPages(int w, int h) throws InterruptedException {
		setDriver(w, h);
		System.out.println("Resolution for Sli pages = " + w + "*" + h);
		driver.get(config.getProperty("testsiteurl"));

		WebElement strategy = wait
				.until(ExpectedConditions.elementToBeClickable(By.linkText(OR.getProperty("strategy"))));
		js.executeScript("arguments[0].click();", strategy);
		Thread.sleep(3000);
		log.info("strategy is successfully clicked");
		BaseClass.checkResolutionSliPages(driver, w, h);

		WebElement proposals = wait
				.until(ExpectedConditions.elementToBeClickable(By.linkText(OR.getProperty("proposals"))));
		js.executeScript("arguments[0].click();", proposals);
		Thread.sleep(9000);
		log.info("proposals is successfully clicked");
		BaseClass.checkResolutionSliPages(driver, w, h);

		WebElement professional = wait
				.until(ExpectedConditions.elementToBeClickable(By.linkText(OR.getProperty("professional"))));
		js.executeScript("arguments[0].click();", professional);
		Thread.sleep(3000);
		log.info("professional is successfully clicked");
		BaseClass.checkResolutionSliPages(driver, w, h);

		WebElement management = wait
				.until(ExpectedConditions.elementToBeClickable(By.linkText(OR.getProperty("management"))));
		js.executeScript("arguments[0].click();", management);
		Thread.sleep(3000);
		log.info("management is successfully clicked");
		BaseClass.checkResolutionSliPages(driver, w, h);

		WebElement businessproposals = wait
				.until(ExpectedConditions.elementToBeClickable(By.linkText(OR.getProperty("businessproposals"))));
		js.executeScript("arguments[0].click();", businessproposals);
		Thread.sleep(3000);
		log.info("businessproposals is successfully clicked");
		BaseClass.checkResolutionSliPages(driver, w, h);

		WebElement orgCharts = wait
				.until(ExpectedConditions.elementToBeClickable(By.linkText(OR.getProperty("orgCharts"))));
		js.executeScript("arguments[0].click();", orgCharts);
		Thread.sleep(3000);
		log.info("orgCharts is successfully clicked");
		BaseClass.checkResolutionSliPages(driver, w, h);

		WebElement education = wait
				.until(ExpectedConditions.elementToBeClickable(By.linkText(OR.getProperty("education"))));
		js.executeScript("arguments[0].click();", education);
		Thread.sleep(3000);
		log.info("education is successfully clicked");
		BaseClass.checkResolutionSliPages(driver, w, h);

		WebElement digitalMarketing = wait
				.until(ExpectedConditions.elementToBeClickable(By.linkText(OR.getProperty("digitalMarketing"))));
		js.executeScript("arguments[0].click();", digitalMarketing);
		Thread.sleep(3000);
		log.info("digitalMarketing is successfully clicked");
		BaseClass.checkResolutionSliPages(driver, w, h);

		driver.close();
	}
}
