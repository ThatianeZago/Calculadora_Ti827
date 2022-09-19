
package calc;


class Mult {

    static void multiplicar() {
    LeDados m = new LeDados();
    m.lerValores("Insira primeiro valor: ", "Insira o segundo valor: ");
    System.out.println("Multiplicação: "+ (m.valor1 * m.valor2));
     
    }
    
    
}
