package calculo.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import palabras.ContadorCaracteres;

public class ContarCaracteresStepDefinitions {

    private ContadorCaracteres contadorCaracteres;
    private int resultado;

    @Given("^quiero contar caracteres$")
    public void caracter() {
        contadorCaracteres=new ContadorCaracteres();
    }

    @When("^cuento los caracteres de la palabra (.*)$")
    public void countCaracther(String palabra) {
        resultado=contadorCaracteres.contar(palabra);
    }

    @Then("^deberia ver que el numero de caracteres es (\\d+)$")
    public void verifyCountString(int arg1) {
        Assert.assertEquals(arg1,resultado);
    }
}
