package ejemploMock;

// Desarrollado 1
public class CalculatorAvanzada {

    private Multiplica multiplica;

    public CalculatorAvanzada(){
        multiplica=new Multiplica();
    }

    /*
    para empezar un mock, necesitas un metodo de seteo de la clase (dependencia
    del metodo)
     */
    public void setMultiplica(Multiplica multiplica) {
        this.multiplica = multiplica;
    }

    public int factorial(int n){
        int fact=1;
        for (int i = 1; i <=n ; i++) {
            fact=multiplica.mult(fact,i);
        }
        return fact;
    }

}
