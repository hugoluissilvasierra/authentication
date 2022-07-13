import ejemploMock.CalculatorAvanzada;
import ejemploMock.Multiplica;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class FactorialMockTest {

    // step 2 crear nuestro objeto mock

    Multiplica multiplicaMock = Mockito.mock(Multiplica.class);

    @Test
    public void verifyFactorialMock(){
        //step 3 configurarlo como se comporta nuestro objeto falso
        Mockito.when(multiplicaMock.mult(1,1)).thenReturn(1);
        Mockito.when(multiplicaMock.mult(1,2)).thenReturn(2);
        Mockito.when(multiplicaMock.mult(2,3)).thenReturn(6);

        //step 4 utilizar el objeto falso - mock
        CalculatorAvanzada calculatorAvanzada= new CalculatorAvanzada();
        calculatorAvanzada.setMultiplica(multiplicaMock);

        int expectedResult=6;
        int actualResult=calculatorAvanzada.factorial(3);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR el factorial es incorrecto");

        //step 5 garantizar que utilizamos el objeto mock se necesita verificarlo

        Mockito.verify(multiplicaMock).mult(1,1);
        Mockito.verify(multiplicaMock).mult(1,2);
        Mockito.verify(multiplicaMock).mult(2,3);
    }

}
