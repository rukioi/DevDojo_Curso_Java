package academy.devdojo.maratonajava.introducao;

public class Aula05EstuturasCondicionais04 {
    public static void main(String[] args) {
        // saber quanto tem que pagar na Holanda em 2020 de imposto, baseado no salario anual
        double salario = 70000;
        // de 0 Ate 34.5 - 9,7% || de 34.5 ate 68.5 - 37,35% || maior que 65.5 -49,5%
        double MenorTaxaDeImpostoHolanda = 9.7/100;
        double SegundaTaxaDeImpostoHolanda = 37.35/100;
        double TerceitaTaxaDeImpostoHolanda = 49.5/100;

        if (salario>0 && salario<=34712){
            System.out.println("Seu salario sera de "+(salario-(salario*MenorTaxaDeImpostoHolanda)));}
        else{System.out.println("Seu salario esta abaixo de 0");}
        if(salario>34712 && salario<=68507){
            System.out.println("Seu salario sera de "+(salario-(salario*SegundaTaxaDeImpostoHolanda)));}
        if(salario>68507){
            System.out.println("Seu salario sera de "+(salario-(salario*TerceitaTaxaDeImpostoHolanda)));
        }

    }
}
