package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import suporte.Web;

public class ComprasOnlineTests {
    private WebDriver navegador;



    @Test
    public void testComprasOnline() {
        navegador = Web.createChrome();

        //Digitar no campo id "user-name" com "standard_user"
        navegador.findElement(By.id("user-name")).sendKeys("standard_user");

        //Digitar no campo id "password" com "secret_sauce"
        navegador.findElement(By.id("password")).sendKeys("secret_sauce");

        //Clicar no botão id "login-button"
        navegador.findElement(By.id("login-button")).click();

        //Clicar em um produto com o id "item_5_title_link"
        navegador.findElement(By.id("item_5_title_link")).click();

        //Clicar no botão "add to cart" a partit do xpath
        navegador.findElement(By.xpath("//div[@id=\"inventory_item_container\"]//button[@class=\"btn_primary btn_inventory\"]")).click();

        //Clicar no carrinho com o id "shopping_cart_container'
        navegador.findElement(By.id("shopping_cart_container")).click();

        //Clicar no checkout com o link
        navegador.findElement(By.linkText("CHECKOUT")).click();

        //Digitar no campo id first-name "Henrique"
        navegador.findElement(By.id("first-name")).sendKeys("Henrique");

        //Digitar no campo id last-name "Guirao"
        navegador.findElement(By.id("last-name")).sendKeys("Guirao");

        //Digitar no campo id postal-code "02258-310"
        navegador.findElement(By.id("postal-code")).sendKeys("02258-310");

        //Clicar no campo continue "//div[@class="checkout_buttons"]//input"
        navegador.findElement(By.xpath("//div[@class=\"checkout_buttons\"]//input")).click();

        //Clicar no link do finish
        navegador.findElement(By.linkText("FINISH")).click();

        //Validar a mensagem "THANK YOU FOR YOUR ORDER"
        WebElement completeheader = navegador.findElement(By.className("complete-header"));
        String mensagem = completeheader.getText();
        assertEquals("THANK YOU FOR YOUR ORDER",mensagem);

        
        //Fechar o navegador
        navegador.quit();
    }


}
