package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinishpurchasePage extends BasePage {
    public FinishpurchasePage (WebDriver navegador) {
        super(navegador);
    }
    public FinishedMessagePage finalizarcompra(){
        navegador.findElement(By.linkText("FINISH")).click();
        return new FinishedMessagePage (navegador);
    }

}
