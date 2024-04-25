package com.example.xkolshillaper.service;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Service;

import java.io.File;
import java.time.Duration;

@Service
public class ApeService {


    public void launch() throws InterruptedException {
        String ca = "test";
        trojanApe(ca);
    }

    private static ChromeDriver launchChrome() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("user-data-dir=" + System.getenv("CHROME_APE_PROFILES_PATH"));
        options.addArguments("profile-directory=" + System.getenv("CHROME_APE_PROFILE_NAME"));
        options.addArguments("--remote-debugging-pipe");

        return new ChromeDriver(options);
    }

    public void trojanApe(String ca) throws InterruptedException {

        System.out.println("Can't open browser");

        ChromeDriver driver = launchChrome();

        driver.get("https://web.telegram.org/k/#@odysseus_trojanbot");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".input-message-input")));

        inputField.sendKeys(ca);

        WebElement sendButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn-send-container .btn-send")));
        sendButton.click();

        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }


        driver.quit();
    }
}
