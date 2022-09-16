
package calc;


public class LeDados {
    public float valor1, valor2;
    
    public void lerValores(){
        System.out.println("Insira um valor");
        valor1= Calc.ler.nextFloat();
        System.out.println("Insira outro valor");
        valor2 = Calc.ler.nextFloat();
    }
}
