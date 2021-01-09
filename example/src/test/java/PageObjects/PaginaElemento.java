package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaElemento {


    @FindBy(css = "#title")
    private WebElement TituloElemento;

    @FindBy(css = "#mediaTab_heading_2>a>span>div:nth-child(1) span")
    private WebElement PaperBackTab;



    public boolean resultadoConsulta(String mensaje)
    {
        System.out.println(mensaje);
        System.out.println(TituloElemento.getText());
        return mensaje.equals(TituloElemento.getText());
    }
    public boolean validarTab(String Existe) {

        System.out.println(PaperBackTab.getText());
        return Existe.equals(PaperBackTab.getText());
    }

    public PaginaElemento(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

}
