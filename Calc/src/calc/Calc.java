
package calc;

import java.util.Scanner;


public class Calc {

    public static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        char op;
        do{
            System.out.println("--- MENU CALCULADORA ---");
            System.out.println(" + -> Soma");
            System.out.println(" - -> Subtração");
            System.out.println(" * -> Multiplicação");
            System.out.println(" / -> Divisão");
            System.out.println(" e -> Expoente");
            System.out.println(" s -> Sair");
            System.out.println("Selecione um operador:");
            op = ler.next().charAt(0);
            switch(op){
                case 's': break;
                case 'S': 
                case '+': Soma.somar(); break;
                case '-': Sub.subtrair(); break;
                case '*': Mult.multiplicar(); break;
                case '/': Div.dividir(); break;
                case 'e': Exp.potencia(); break;
                case 'E':
                default: System.out.println("Operador Incorreto");
            }
        }while(op!='s' && op!='S');
        
    }


    
    
}
