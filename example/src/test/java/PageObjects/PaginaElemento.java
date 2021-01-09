package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaElemento {


    @FindBy(css = "#title")
    private WebElement TituloElemento;

    public boolean resultadoConsulta(String mensaje)
    {
        System.out.println(mensaje);
        System.out.println(TituloElemento.getText());
        return mensaje.equals(TituloElemento.getText());
    }

    public PaginaElemento(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

}
