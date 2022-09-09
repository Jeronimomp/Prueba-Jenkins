package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class GoogleStepDefinitions {


    @Given("que puedo abrir el navegado")
    public void quePuedoAbrirElNavegado() {
        System.out.println("Hola mundo desde Screemplay");
    }
    @When("busco la palabra {string} en Google")
    public void buscoLaPalabraEnGoogle(String string) {

    }
    @Then("puedo ver el resultado de la busqueda")
    public void puedoVerElResultadoDeLaBusqueda() {

    }

}
