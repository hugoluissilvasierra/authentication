package runner;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class MyStepdefs {

    /*





    */
    @Given("tengo acceso a {}")
    public void tengoAccesoATodoLy(String url) {
    }

    @When("realizo click en el boton login")
    public void realizoClickEnElBotonLogin() {
    }

    @And("ingreso mi correo electronico: {string}")
    public void ingresoMiCorreoElectronico(String correo) {
    }

    @And("ingreso mi password: {int}")
    public void ingresoMiPassword(int arg0) {
    }

    @Then("deberia ingresar a la aplicacion")
    public void deberiaIngresarALaAplicacion() {
    }

    @And("los siguientes controles deberian ser mostrados")
    public void losSiguientesControlesDeberianSerMostrados(List<String> controls) {
        for (String control:controls
             ) {
            System.out.println("Control: " + control);
        }
    }

    @And("ingreso a la aplicacion usando")
    public void ingresoALaAplicacionUsando(Map<String,String> credentials) {
        for (String control:credentials.keySet()
             ) {
            System.out.println("Control " + control + " tiene el valor: " + credentials.get(control));
        }
    }

    @And("me registro a la pagina")
    public void meRegistroALaPagina(Persona persona) {
        System.out.println("Address: " + persona.getAddress());
        System.out.println("CI: " + persona.getCi());
        System.out.println("Name: " + persona.getName());
        System.out.println("Phone: " + persona.getPhone());
    }

    // | name | phone     | address    | ci       |
    @DataTableType
    public Persona convert(Map<String, String> entity){
        Persona persona = new Persona();
        persona.setCi(entity.get("ci"))
                .setAddress(entity.get("address"))
                .setPhone(entity.get("phone"))
                .setName(entity.get("name"));

        return persona;
    }

}
