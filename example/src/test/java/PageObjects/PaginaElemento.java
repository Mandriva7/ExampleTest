package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaElemento {

    @FindBy(id = "productTitle")
     WebElement TituloElemento;

    @FindBy(css = "#mediaTab_heading_2>a>span>div:nth-child(1)>span")
     WebElement PaperBackTab;

    @FindBy(xpath = "//span[@class='a-size-medium a-color-success']")
     WebElement InStock;

    @FindBy(name = "offeringID.1")
    WebElement RadioButtonThisItem;

    @FindBy(id = "iframeContent")
    WebElement TextContent;


    public boolean resultadoConsulta(String mensaje)
    {

        System.out.println(TituloElemento.getText());
        return mensaje.equals(TituloElemento.getText());
    }
    public boolean EstaEnStock(String mensajeStock)
    {

        System.out.println(InStock.getText());
        return mensajeStock.equals(InStock.getText());
    }
    public boolean validarTab() {
        boolean Existe;
        try
        {
            Existe = PaperBackTab.isDisplayed();
        }
        catch (Exception NoSuchElementException)
        {
            Existe = false;
        }
        return Existe;
    }
    public boolean ValidarRadioButton()
    {
        boolean Checked;
        try
        {
            Checked = RadioButtonThisItem.isEnabled();
        }
        catch (Exception NoSuchElementException)
        {
            Checked = false;
        }
        return Checked;
    }
    public boolean ContenidoTextoContiene()
    {
        boolean Esta;

            String text = TextContent.getText();

            if (text.contains("quality assurance professionals")){
                Esta = true;
            } else {
                Esta = false;
            }
        return Esta;
    }



    public PaginaElemento(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
