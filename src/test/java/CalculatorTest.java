import calculator.Calculator;
import org.junit.jupiter.api.*;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
    public void setup(){
        calculator = new Calculator();
    }

    @AfterEach
    public void cleanup(){

    }

    @Test
    public void verifySumaPares(){
         // pasos
        int expectResult=4;
        int actualResult=calculator.suma(2,2);
        // verificacion
        Assertions.assertEquals(expectResult,actualResult,"ERROR! la suma es incorrecta");
    }

    @Test
    @Disabled
    public void verifySumaImpares(){
        // pasos
        int expectResult=4;
        int actualResult=calculator.suma(3,1);
        // verificacion
        Assertions.assertEquals(expectResult,actualResult,"ERROR! la suma es incorrecta");
    }


    @Test
    @Timeout(value = 8) // velocidad
    public void verifyMultPares() throws InterruptedException {
        // pasos
        int expectResult=6;
        int actualResult=calculator.mul(2,3);
        // verificacion
        Assertions.assertEquals(expectResult,actualResult,"ERROR! la mul es incorrecta");
    }



}
