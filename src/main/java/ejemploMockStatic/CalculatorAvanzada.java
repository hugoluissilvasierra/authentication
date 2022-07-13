package ejemploMockStatic;

// Desarrollado 1
public class CalculatorAvanzada {

    public CalculatorAvanzada(){

    }

    public int factorial(int n){
        int fact=1;
        for (int i = 1; i <=n ; i++) {
            fact=MathHelper.mult(fact,i);
        }
        return fact;
    }

}
