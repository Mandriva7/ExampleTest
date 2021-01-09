package example;

import PageObjects.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTestSuite {

    public WebDriver chromeDriver;

    PaginaPrincipal paginaPrincipal;

    private void inicializarPaginas(WebDriver driver){

        paginaPrincipal = new PaginaPrincipal(driver);
    }


    @Before
    public void abrirDrive() {

        /* Encontrar ChromeDriver */
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
        //nueva instancia de ChromeDriver
        chromeDriver = new ChromeDriver();
        //definimos tiempo de espera hasta que aceptemos timeouts
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        inicializarPaginas(chromeDriver);
        //Abrimos una URL
        chromeDriver.get("https://www.amazon.com/");
    }
    @After
    public void cerrarDriver()
    {
        //Cerrar ventana, apagar Driver
        chromeDriver.quit();
    }
}
