
package calc;


class Soma {

    static void somar() {
    LeDados s = new LeDados();
    s.lerValores("Insira primeiro valor: ", "Insira o segundo valor: ");
    System.out.println("Soma: "+ (s.valor1 + s.valor2));
     
    }
    
} 