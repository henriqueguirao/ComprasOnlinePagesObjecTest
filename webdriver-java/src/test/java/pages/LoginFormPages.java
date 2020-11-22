package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginFormPages extends BasePage {


    public LoginFormPages (WebDriver navegador) {
        super(navegador);
    }

    public LoginFormPages typeUsername(String Username) {
        navegador.findElement(By.id("user-name")).sendKeys(Username);
        return this;
        }

        public LoginFormPages typePassword(String Password) {
        navegador.findElement(By.id("password")).sendKeys(Password);
        return this;
        }

        public ProdutosPage clicarLogin() {
        navegador.findElement(By.id("login-button")).click();
        return new ProdutosPage (navegador);
        }


    }


