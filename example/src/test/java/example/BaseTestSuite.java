package example;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTestSuite {

    public WebDriver chromeDriver;


    @Before
    public void abrirDrive() {

        /* Encontrar ChromeDriver */
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
        //nueva instancia de ChromeDriver
        chromeDriver = new ChromeDriver();
        //definimos tiempo de espera hasta que aceptemos timeouts
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @After
    public void cerrarDriver()
    {
        //Cerrar ventana, apagar Driver
        chromeDriver.quit();
    }
}
