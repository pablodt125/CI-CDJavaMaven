package calculo.stepdefinitions;

import calculo.Suma;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SumarStepDefinitions {

    private Suma sumar;
    private int result;

    @Given("^quiero sumar$")
    public void prepararSuma() {
        sumar=new Suma();
    }


    @When("^sumo (\\d+) mas (\\d+)$")
    public void sumar(int arg1, int arg2) {
        result=sumar.sumar(arg1,arg2);
    }

    @Then("^deberia ver el resultado es (\\d+)$")
    public void verifyResult(int arg1) {
        Assert.assertEquals(arg1,result);
    }
}
