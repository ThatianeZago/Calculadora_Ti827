package calc;


class IMC {
    static void calculo(){
    double calculo;
    LeDados r = new LeDados();
    r.lerValores("Insira o peso em KG: ", "Insira a altura em metros: ");
    calculo = r.valor1/(r.valor2 * r.valor2);     
        
    if (calculo < 18.5)
        System.out.println("Abaixo do Peso");
    else if(calculo >= 18.5 && calculo <= 24.9)
        System.out.println("Peso Normal");
    else if(calculo >= 25 && calculo <= 29.9)
        System.out.println("Sobrepeso");
    else if(calculo >= 30 && calculo <= 34.9)
        System.out.println("Obesidade Grau |");
    else if(calculo >= 35 && calculo <= 39.9)
        System.out.println("Obesidade Grau ||");
    else if(calculo >= 40)
        System.out.println("Obesidade Grau ||| ou Mórbida");
    else 
        System.out.println("Insira um valor válido");
 }           
}
        