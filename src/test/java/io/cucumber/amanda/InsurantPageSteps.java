package io.cucumber.amanda;

import io.cucumber.java.pt.*;
import io.cucumber.amanda.servicos.Configuracao;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class InsurantPageSteps extends Configuracao {

    @Entao("o usuario clica no campo First Name e completa")
    public void o_usuario_clica_no_campo_First_Name_e_completa() {
        Configuracao.seletorQueryCss("#firstname").sendKeys("Felipe");
    }

    @Entao("o usuario clica no campo Last Name e completa")
    public void o_usuario_clica_no_campo_Last_Name_e_completa() {
        Configuracao.seletorQueryCss("#lastname").sendKeys("Silva");
    }

    @Entao("o usuario clica no campo Date of Birth e completa")
    public void o_usuario_clica_no_campo_Date_of_Birth_e_completa() {
        Configuracao.seletorQueryCss("#birthdate").sendKeys("01/06/1995");
    }

    @Entao("o usuario clica no campo Gender e seleciona")
    public void o_usuario_clica_no_campo_Gender_e_seleciona() {
        Configuracao.seletorQueryCss("#insurance-form>div>section:nth-child(2)>div:nth-child(4)>p>label:nth-child(1)>span").click();
    }

    @Entao("o usuario clica no campo Street Address e completa")
    public void o_usuario_clica_no_campo_Street_Address_e_completa() {
        Configuracao.seletorQueryCss("#streetaddress").sendKeys("Rua Marina,123");
    }

    @Entao("o usuario clica no campo Country e seleciona")
    public void o_usuario_clica_no_campo_Country_e_seleciona() {
        Configuracao.seletorQueryCss("#country>option:nth-child(32)").click();
    }

    @Entao("o usuario clica no campo Zip Code e completa")
    public void o_usuario_clica_no_campo_Zip_Code_e_completa() {
        Configuracao.seletorQueryCss("#zipcode").sendKeys("09070200");
    }

    @Entao("o usuario clica no campo City e completa")
    public void o_usuario_clica_no_campo_City_e_completa() {
        Configuracao.seletorQueryCss("#city").sendKeys("Sao Paulo");
    }

    @Entao("o usuario clica no campo Occupation e seleciona")
    public void o_usuario_clica_no_campo_Occupation_e_seleciona() {
        Configuracao.seletorQueryCss("#occupation>option:nth-child(6)").click();
    }

    @Entao("o usuario clica no campo Hobbies e seleciona") 
    public void o_usuario_clica_no_campo_Hobbies_e_seleciona() {
        WebElement other = Configuracao.seletorQueryCss("#other");
        Actions actions = new Actions(browser);
		actions.moveToElement(other).click().perform();
    }

    @Entao("o usuario clica no campo Website e completa")
    public void o_usuario_clica_no_campo_Website_e_completa() {
        Configuracao.seletorQueryCss("#website").sendKeys("www.meusite.com.br");
    }

    @Entao("o usuario clica no campo Picture")
    public void o_usuario_clica_no_campo_Picture() {
        Configuracao.seletorQueryCss("#picture").click();
    }

    @Entao("o usuario clica em Next e acessa a aba Enter Product Data")
    public void o_usuario_clica_em_Next_e_acessa_a_aba_Enter_Product_Data(){
        Configuracao.seletorQueryCss("#nextenterproductdata").click();
    }
}