package calculo.stepdefinitions;

import calculo.Resta;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RestarStepDefinitions {

    private Resta substract;

    private int resultado;

    @Given("^quiero restar$")
    public void prepareSubstract() {
        substract=new Resta();
    }

    @When("^resto (\\d+) menos (\\d+)$")
    public void substract(int arg1, int arg2) {
        resultado=substract.subst(arg1,arg2);
    }

    @Then("^deberia ver el resultado de la resta es (\\d+)$")
    public void verifySubstrac(int arg1) {
        Assert.assertEquals(arg1,resultado);
    }
}
