package io.cucumber.amanda;

import io.cucumber.java.pt.*;
import io.cucumber.amanda.servicos.Configuracao;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class PricePageSteps extends Configuracao {

    @Entao("o usuario escolhe uma opcao")
    public void o_usuario_escolhe_uma_opcao() {
        WebElement plano = Configuracao.seletorQueryCss("#selectultimate");
        Actions actions = new Actions(browser);
		actions.moveToElement(plano).click().perform();
    }
     
    @Entao("o usuario clica em Next para receber orcamento")
    public void o_usuario_clica_em_Next_para_receber_orcamento() throws InterruptedException {
        Thread.sleep(4000);
        WebElement botao = Configuracao.seletorQueryCss("#nextsendquote");
        Actions actions = new Actions(browser);
		actions.moveToElement(botao).click().perform();
    }
}