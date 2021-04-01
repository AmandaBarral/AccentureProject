package io.cucumber.amanda;

import io.cucumber.java.pt.*;
import io.cucumber.amanda.servicos.Configuracao;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VehiclePageSteps extends Configuracao {

    @Entao("o usuario clica no campo Make e seleciona")
    public void o_usuario_clica_no_campo_Make_e_seleciona() {
        Configuracao.seletorQueryCss("#make>option:nth-child(5)").click();
    }

    @Entao("o usuario clica no campo Model e seleciona")
    public void o_usuario_clica_no_campo_Model_e_seleciona() {
        Configuracao.seletorQueryCss("#model>option:nth-child(4)").click();
    }

    @Entao("o usuario clica no campo Cylinder Capacity e preenche")
    public void o_usuario_clica_no_campo_Cylinder_Capacity_e_preenche() {
        Configuracao.seletorQueryCss("#cylindercapacity").sendKeys("1000");
    }

    @Entao("o usuario clica no campo Engine Performance e preenche")
    public void o_usuario_clica_no_campo_Engine_Performance_e_preenche() {
        Configuracao.seletorQueryCss("#engineperformance").sendKeys("150");
    }

    @Entao("o usuario clica no campo Date of Manufacture e preenche")
    public void o_usuario_clica_no_campo_Date_of_Manufacture_e_preenche() {
        Configuracao.seletorQueryCss("#dateofmanufacture").sendKeys("09/15/2020");
    }

    @Entao("o usuario clica no campo Number of Seats")
    public void o_usuario_clica_no_campo_Number_of_Seats() {
        Configuracao.seletorQueryCss("#numberofseats > option:nth-child(2)").click();
    }

    @Entao("o usuario clica no campo Right Hand Drive e seleciona")
    public void o_usuario_clica_no_campo_Right_Hand_Drive_e_seleciona() {
        Configuracao.seletorQueryCss("#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(2) > span").click();
    }

    @Entao("o usuario clica no campo Number of Seats e seleciona")
    public void o_usuario_clica_no_campo_Numer_of_Seats_e_seleciona(){
        Configuracao.seletorQueryCss("#numberofseatsmotorcycle > option:nth-child(3)").click();
    }

    @Entao("o usuario clica no campo Fuel Type e seleciona")
    public void o_usuario_clica_no_campo_Fuel_Type_e_seleciona(){
        Configuracao.seletorQueryCss("#fuel > option:nth-child(2)").click();
    }

    @Entao("o usuario clica no campo Payload e preenche")
    public void o_usuario_clica_no_campo_Payload_e_preenche(){
        Configuracao.seletorQueryCss("#payload").sendKeys("120");
    }

    @Entao("o usuario clica no campo Total Weight e preenche")
    public void o_usuario_clica_no_campo_Total_Weight_e_preenche(){
        Configuracao.seletorQueryCss("#totalweight").sendKeys("1234");
    }

    @Entao("o usuario clica no campo List Price e preenche")
    public void o_usuario_clica_no_campo_List_Price_e_preenche(){
        Configuracao.seletorQueryCss("#listprice").sendKeys("2000");
    }

    @Entao("o usuario clica no campo License Plate Number e preenche")
    public void o_usuario_clica_no_campo_License_Plate_Number_e_preenche(){
        Configuracao.seletorQueryCss("#licenseplatenumber").sendKeys("ASD3456");
    }

    @Entao("o usuario clica no campo Annual Mileage e preenche")
    public void o_usuario_clica_no_campo_Annual_Mileage_e_preenche(){
        Configuracao.seletorQueryCss("#annualmileage").sendKeys("10000");
    }

    @Entao("o usuario clica em Next e acessa a aba Enter Insurant Data")
    public void o_usuario_clica_em_Next_e_acessa_a_aba_Enter_Insurant_Data(){
        Configuracao.seletorQueryCss("#nextenterinsurantdata").click();
    }    
}