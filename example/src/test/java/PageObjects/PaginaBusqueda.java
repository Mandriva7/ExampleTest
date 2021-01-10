package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaBusqueda {

    @FindBy(xpath = "(//div[@data-component-type=\"s-search-result\"]//h2)[1]")
    WebElement primerElemento;


    public void seleccionarElemento() { primerElemento.click(); }

    public PaginaBusqueda(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
