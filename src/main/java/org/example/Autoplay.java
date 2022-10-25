package org.example;

import java.net.URISyntaxException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class Autoplay {

    public static void main(String[] args) throws InterruptedException, URISyntaxException, IOException  {

        // Read Given Links and Names from TXT/CSV
        String[] links = Autoplay.readLinks();
        Autoplay.printList(links, "Links");

        // Set Driver
        System.setProperty("webdriver.chrome.driver", "C://Users//kody//Desktop//kode//code/chromedriver.exe");

        // Init Drivers
        WebDriver driver0 = new ChromeDriver();
        WebDriver driver1 = new ChromeDriver();
        WebDriver driver2 = new ChromeDriver();
        WebDriver driver3 = new ChromeDriver();
        WebDriver driver4 = new ChromeDriver();
        WebDriver driver5 = new ChromeDriver();
        WebDriver driver6 = new ChromeDriver();
        WebDriver driver7 = new ChromeDriver();
        WebDriver driver8 = new ChromeDriver();
        WebDriver driver9 = new ChromeDriver();


        // change to 30 seconds
        // try spotify next

        while(true){

            // Open Link 5 Times
            driver0.get(links[0]);
            driver0.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver1.get(links[0]);
            driver1.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver2.get(links[0]);
            driver2.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver3.get(links[0]);
            driver3.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver4.get(links[0]);
            driver4.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver5.get(links[0]);
            driver5.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver6.get(links[0]);
            driver6.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver7.get(links[0]);
            driver7.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver8.get(links[0]);
            driver8.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver9.get(links[0]);
            driver9.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            driver0.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver1.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver2.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver3.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver4.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver5.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver6.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver7.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver8.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver9.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            driver0.get("https://google.com/");
            driver1.get("https://google.com/");
            driver2.get("https://google.com/");
            driver3.get("https://google.com/");
            driver4.get("https://google.com/");
            driver5.get("https://google.com/");
            driver6.get("https://google.com/");
            driver7.get("https://google.com/");
            driver8.get("https://google.com/");
            driver9.get("https://google.com/");
        }
    }

    public static String[] readLinks() throws IOException {
        // Load Provided Links (txt) and Build String Array
        List<String> listOfLinks = new ArrayList<String>();
        FileReader fr = new FileReader("src/main/resources/links.txt");

        StringBuilder stringBuilder = new StringBuilder(new String());
        char ch;

        while (fr.ready()) {
            ch = (char)fr.read();
            if (ch == '\n') {
                listOfLinks.add(stringBuilder.toString().toString());
                stringBuilder = new StringBuilder(new String());
            }
            else { stringBuilder.append(ch); }
        }
        if (stringBuilder.length() > 0) {listOfLinks.add(stringBuilder.toString().toString()); }

        return listOfLinks.toArray(new String[0]);
    }

    public static void printList(String[] arr, String type){
        System.out.println("Array of " + type + " Provided: ");
        for (String str : arr) {
            System.out.println(str);
        }
    }
}