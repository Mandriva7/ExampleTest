package example;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest extends BaseTestSuite{

    @Test
    public void exampleTest() {

        paginaPrincipal.ingresarBusqueda();
        paginaPrincipal.BuscarInfoIngresada();
        paginaBusqueda.seleccionarElemento();
        Assert.assertTrue(paginaElemento.resultadoConsulta("A Practitioner's Guide to Software Test Design"));
        Assert.assertTrue(paginaElemento.validarTab());
    }

}
