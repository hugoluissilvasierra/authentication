import calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorParamTest {

    @ParameterizedTest
    @CsvSource({
            "2,3,5",
            "1,1,2",
            "4,8,12"
    })
    public void verifySuma(int numberA, int numberB, int expectedResult){
        Calculator calculator= new Calculator();
        int actualResult=calculator.suma(numberA,numberB);
        Assertions.assertEquals(expectedResult,actualResult,"ERROR! la suma es incorrecta");
    }
}
