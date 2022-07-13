import calculator.Calculator;
import org.junit.jupiter.api.*;

public class MutationCalculatorTest {
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
        int expectResult=4;
        int actualResult=calculator.suma(2,2);
       Assertions.assertEquals(expectResult,actualResult,"ERROR! la suma es incorrecta");
    }

    @Test
    public void verifySumaImpares(){
        int expectResult=8;
        int actualResult=calculator.suma(5,3);
        Assertions.assertEquals(expectResult,actualResult,"ERROR! la suma es incorrecta");
    }

    @Test

    public void verifyMultPares() throws InterruptedException {
        int expectResult=9;
        int actualResult=calculator.mul(3,3);
        Assertions.assertEquals(expectResult,actualResult,"ERROR! la mul es incorrecta");
    }



}
