package io.cucumber.amanda;

import io.cucumber.java.pt.*;
import io.cucumber.amanda.servicos.Configuracao;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductPageSteps extends Configuracao {

    @Entao("o usuario seleciona uma data Start Date")
    public void o_usuario_seleciona_uma_data_Start_Date() {
        Configuracao.seletorQueryCss("#startdate").sendKeys("10/04/2021");
    }

    @Entao("o usuario seleciona um valor de seguro Insurance Sum")
    public void o_usuario_seleciona_um_valor_de_seguro_Insurance_Sum() {  
        Configuracao.seletorQueryCss("#insurancesum>option:nth-child(3)").click();
    }

    @Entao("o usuario escolhe uma nota Merit Rating")
    public void o_usuario_escolhe_uma_nota_Merit_Rating() {
        Configuracao.seletorQueryCss("#meritrating>option:nth-child(12)").click();
    }

    @Entao("o usuario escolhe uma cobertura Damage Insurance")
    public void o_usuario_escolhe_uma_cobertura_Damage_Insurance() {
        Configuracao.seletorQueryCss("#damageinsurance>option:nth-child(3)").click();
    }

    @Entao("o usuario seleciona opcionais em Optional Products")
    public void o_usuario_seleciona_opcionais_em_Optional_Products() {
        WebElement euro = Configuracao.seletorQueryCss("#EuroProtection");
        Actions actions = new Actions(browser);
		actions.moveToElement(euro).click().perform();
    }

    @Entao("o usuario seleciona uma cortesia em Courtesy Car")
    public void o_usuario_seleciona_uma_cortesia_em_Courtesy_Car() {
        Configuracao.seletorQueryCss("#courtesycar>option:nth-child(3)").click();
    }

    @Entao("o usuario clica em next para ver a tabela de precos")
    public void o_usuario_clica_em_next_para_ver_a_tabela_de_precos() {
        Configuracao.seletorQueryCss("#nextselectpriceoption").click();
    }
}