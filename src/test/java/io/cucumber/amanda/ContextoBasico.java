package io.cucumber.amanda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.amanda.servicos.Configuracao;
import io.cucumber.java.pt.*;

public class ContextoBasico extends Configuracao {

    @Dado("que o usuario acessa o site")
    public void que_o_usuario_acessa_o_site() {
        abrir("http://sampleapp.tricentis.com/101/app.php");
        browser.manage().window().maximize();
    }
}
