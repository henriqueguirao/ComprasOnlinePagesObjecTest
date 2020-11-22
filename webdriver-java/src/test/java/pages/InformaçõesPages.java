package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InformaçõesPages extends BasePage {
    public InformaçõesPages (WebDriver navegador) {
        super(navegador);
    }

      public InformaçõesPages typefirstname (String firstname){
        navegador.findElement(By.id("first-name")).sendKeys(firstname);
        return this;
    }
    public InformaçõesPages typelastname (String lastname){
        navegador.findElement(By.id("last-name")).sendKeys(lastname);
        return this;
    }
    public InformaçõesPages typepostalcode (String postalcode){
        navegador.findElement(By.id("postal-code")).sendKeys(postalcode);
        return this;
    }
    public FinishpurchasePage clicarcontinue(){
        navegador.findElement(By.xpath("//div[@class=\"checkout_buttons\"]//input")).click();
        return new FinishpurchasePage (navegador);
    }

}
