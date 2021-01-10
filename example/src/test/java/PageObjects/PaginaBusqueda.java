package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaBusqueda {

    @FindBy(xpath = "//span[contains(text(),\"A Practitioner's Guide to Software Test Design\")]")
    WebElement primerElemento;


    public void seleccionarElemento() {
        primerElemento.click();
    }

    public PaginaBusqueda(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
