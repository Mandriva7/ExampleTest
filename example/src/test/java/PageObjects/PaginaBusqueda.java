package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaBusqueda {

    @FindBy(xpath = "//body/div[@id='a-page']/div[@id='search']/span[3]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/h2[1]/span[1]")
    private WebElement primerElemento;


    public void seleccionarElemento() { primerElemento.click(); }

    public PaginaBusqueda(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
