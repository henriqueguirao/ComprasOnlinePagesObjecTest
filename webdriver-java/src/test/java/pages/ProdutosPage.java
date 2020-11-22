package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutosPage extends BasePage {

    public ProdutosPage(WebDriver navegador) {
        super(navegador);
    }

    public ProdutoSelecionadoPages ClicarProduto(){
    navegador.findElement(By.id("item_5_title_link")).click();
    return new ProdutoSelecionadoPages (navegador);
    }

}
