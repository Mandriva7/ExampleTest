package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaPrincipal {

    @FindBy(css = "#twotabsearchtextbox")
    private WebElement searchBox;

    public void ingresarBusqueda() { searchBox.sendKeys("Software Test Design"); }
    public void BuscarInfoIngresada() { searchBox.sendKeys(Keys.ENTER); }

    public PaginaPrincipal(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
