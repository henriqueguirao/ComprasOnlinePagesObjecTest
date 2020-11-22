package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginFormPages;
import suporte.Web;

import static org.junit.Assert.assertEquals;

public class ComprasOnlinePagesObjecTest {
    private WebDriver navegador;

    @Before
    public void setup(){
        navegador = Web.createChrome();
    }

    @Test
    public void testComprasOnline(){
       String CompleteHeader = new LoginFormPages(navegador)
                .typeUsername("standard_user")
                .typePassword("secret_sauce")
                .clicarLogin()
                .ClicarProduto()
                .clicarAddToCart()
                .clicarcarrinho()
                .clicarcheckout()
                .typefirstname("Henrique")
                .typelastname("Guirao")
                .typepostalcode("02258-310")
                .clicarcontinue()
                .finalizarcompra()
                .capturarCompleteHeader();

        assertEquals("THANK YOU FOR YOUR ORDER", CompleteHeader);

    }
    @After
    public void teardown(){
        navegador.quit();
    }
}
