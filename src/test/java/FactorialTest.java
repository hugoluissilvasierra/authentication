import ejemploMock.CalculatorAvanzada;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

    /*
    * cuando un metodo depente de uno o mas metodos , necesitamos crear mocks
    * NOTA: no usar el ejemplo de esta clase
    * */

    @Test
    public void verifyFactorial(){
        CalculatorAvanzada calculatorAvanzada= new CalculatorAvanzada();

        int expectedResult=6;
        int actualResult=calculatorAvanzada.factorial(3);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR el factorial es incorrecto");


    }
}
