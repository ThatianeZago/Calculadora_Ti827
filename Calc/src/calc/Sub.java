
package calc;


class Sub {

    static void subtrair() {
    LeDados sub = new LeDados();
    sub.lerValores("Insira primeiro valor: ", "Insira o segundo valor: ");
    System.out.println("Subtração: "+ (sub.valor1 - sub.valor2));
     
    }
   
    
}
