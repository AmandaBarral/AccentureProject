package io.cucumber.amanda;

import io.cucumber.java.pt.*;
import io.cucumber.amanda.servicos.Configuracao;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;



public class QuotePageSteps extends Configuracao {

    @Entao("o usuario clica no campo Email e preenche")
    public void o_usuario_clica_no_campo_Email_e_preenche() {
        Configuracao.seletorQueryCss("#email").sendKeys("amanbarral@gmail.com");
    }

    @Entao("o usuario clica no campo Phone e preenche")
    public void o_usuario_clica_no_campo_Phone_e_preenche() {
        Configuracao.seletorQueryCss("#phone").sendKeys("943995636");
    }

    @Entao("o usuario clica no campo Username e preenche")
    public void o_usuario_clica_no_campo_Username_e_preenche() {
        Configuracao.seletorQueryCss("#username").sendKeys("alunoqa");
    }

    @Entao("o usuario clica no campo Password e preenche")
    public void o_usuario_clica_no_campo_Password_e_preenche() {
        Configuracao.seletorQueryCss("#password").sendKeys("Abc123#");
    }

    @Entao("o usuario clica no campo Confirm Password e preenche")
    public void o_usuario_clica_no_campo_Confirm_Password_e_preenche() {
        Configuracao.seletorQueryCss("#confirmpassword").sendKeys("Abc123#");
    }

    @Entao("o usuario clica em Send")
    public void o_usuario_clica_em_Send() {
        Configuracao.seletorQueryCss("#sendemail").click();
    }

    @Entao("o usuario verifica a mensagem de sucesso {string}")
    public void o_usuario_verifica_a_mensagem_de_sucesso(String string) throws InterruptedException {
        Thread.sleep(10000);
        WebElement frase = Configuracao.seletorQueryCss("body>div.sweet-alert.showSweetAlert.visible>h2");
        assertEquals(string, frase.getText());
    }

    @Entao("o usuario clica no botao Ok")
    public void o_usuario_clica_no_botao_Ok() {
        Configuracao.seletorQueryCss("body>div.sweet-alert.showSweetAlert.visible>div.sa-button-container>div>button").click();
        browser.quit();
    }
}