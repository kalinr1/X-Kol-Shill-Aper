package com.example.xkolshillaper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.idealized.target.model.TargetInfo;
import org.openqa.selenium.devtools.v123.backgroundservice.BackgroundService;
import org.openqa.selenium.devtools.v123.backgroundservice.model.ServiceName;
import org.openqa.selenium.devtools.v123.network.Network;
import org.openqa.selenium.devtools.v123.emulation.Emulation;
import org.openqa.selenium.devtools.v123.network.model.Request;
import org.openqa.selenium.devtools.v123.serviceworker.ServiceWorker;
import org.openqa.selenium.devtools.v123.serviceworker.model.RegistrationID;
import org.openqa.selenium.devtools.v123.serviceworker.model.ServiceWorkerRegistration;
import org.openqa.selenium.devtools.v123.storage.Storage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@SpringBootApplication
public class XKolShillAperApplication {

    public static void main(String[] args) {
        SpringApplication.run(XKolShillAperApplication.class, args);

    }

}
