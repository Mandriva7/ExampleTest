package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaElemento {

    @FindBy(id = "title")
    private WebElement TituloElemento;

    @FindBy(css = "#mediaTab_heading_2>a>span>div:nth-child(1) span")
    private WebElement PaperBackTab;

    public boolean resultadoConsulta(String mensaje)
    {
        System.out.println(mensaje);
        System.out.println(TituloElemento.getText());
        return mensaje.equals(TituloElemento.getText());
    }
    public boolean validarTab() {

        boolean Existe;
        try
        {
            Existe =   PaperBackTab.isDisplayed();
        }
        catch (Exception NoSuchElementException)
        {
            Existe = false;
        }
        return Existe;

    }

    public PaginaElemento(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

}
