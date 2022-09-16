package calc;


class IMC {
    static void calculo(){
    
    double calculo;
    LeDados r = new LeDados();
    r.lerValores();
    calculo = r.valor1/(r.valor2 * r.valor2);     
        
    if (calculo < 18.5)
        System.out.println("Abaixo do Peso");
    else if(calculo) >= 18.5 && 24.9);
        System.out.println("Peso Normal");
    else if(calculo >= 25 && 29.9);
        System.out.println("Sobrepeso");
    else if(calculo >= 30 && 34.9);
        System.out.println("Obesidade Grau |");
    else if(calculo >= 35 && 39.9);
        System.out.println("Obesidade Grau ||");
    else if(calculo >= 40);
        System.out.println("Obesidade Grau ||| ou Mórbida");
    else
        System.out.println("Insira um valor válido");
 }           
