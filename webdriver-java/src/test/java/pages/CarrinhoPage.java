package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarrinhoPage extends BasePage{
    public CarrinhoPage(WebDriver navegador) {
        super(navegador);
    }

         public InformaçõesPages clicarcheckout(){
         navegador.findElement(By.linkText("CHECKOUT")).click();

         return new InformaçõesPages(navegador);
     }
}
