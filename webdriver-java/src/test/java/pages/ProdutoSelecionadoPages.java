package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoSelecionadoPages extends BasePage{

    public  ProdutoSelecionadoPages(WebDriver navegador) {
        super(navegador);
    }

        public ProdutoSelecionadoPages clicarAddToCart(){
        navegador.findElement(By.xpath("//div[@id=\"inventory_item_container\"]//button[@class=\"btn_primary btn_inventory\"]")).click();
        return this;
        }

        public CarrinhoPage clicarcarrinho() {
            navegador.findElement(By.id("shopping_cart_container")).click();

            return new CarrinhoPage (navegador);
        }


    }



