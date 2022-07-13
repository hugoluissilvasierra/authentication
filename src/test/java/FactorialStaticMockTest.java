
import ejemploMockStatic.CalculatorAvanzada;
import ejemploMockStatic.MathHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class FactorialStaticMockTest {

    /*
    *   Mockito.when(multiplicaMock.mult(1,1)).thenReturn(1);
        Mockito.when(multiplicaMock.mult(1,2)).thenReturn(2);
        Mockito.when(multiplicaMock.mult(2,3)).thenReturn(6);
    * */
    @Test
    public void verifyFactorial(){
        MockedStatic<MathHelper> objectMocked= Mockito.mockStatic(MathHelper.class);
        objectMocked.when(()->MathHelper.mult(1,1)).thenReturn(1);
        objectMocked.when(()->MathHelper.mult(1,2)).thenReturn(2);
        objectMocked.when(()->MathHelper.mult(2,3)).thenReturn(6);

        CalculatorAvanzada calculatorAvanzada = new CalculatorAvanzada();
        int expectedResult=6;
        int actualResult= calculatorAvanzada.factorial(3);

        Assertions.assertEquals(expectedResult,actualResult,"ERROR el factorial fue incorrecto");

        // evitar problemas de creacion sobre el mismo metodo estatico
        objectMocked.close();
    }

}
