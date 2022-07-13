package withoutTest;

public class Calculator {

    public Calculator(){}

    public int suma(int a, int b){
        return a+b;
    }

    /**
     * NO ES LA FORMA CORRECTA DE TRABAJAR
     * @param args
     */
    public static void main(String[]args){
        Calculator calculator= new Calculator();
        if (calculator.suma(2,5)== 7){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
    }
}
