package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome(){
        //Abrindo o chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navegando para a página do teste
        navegador.get("https://www.saucedemo.com/index.html");

        return navegador;
    }

}
