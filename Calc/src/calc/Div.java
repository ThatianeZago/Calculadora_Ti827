
package calc;


class Div {

    static void dividir() {
    LeDados div = new LeDados();
    div.lerValores("Insira primeiro valor: ", "Insira o segundo valor: ");
    System.out.println("Divisão: "+ (div.valor1 / div.valor2));
     
    }
    
}
