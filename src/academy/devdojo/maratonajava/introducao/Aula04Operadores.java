package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args){
        // soma , subtração , divisão e multiplicação
        int number01 = 10;
        int number02 = 20;
        int result = number01 / number02;
        System.out.println(number02+number01);

        // operador de resto %
        int resto = 20 % 2;
        System.out.println(resto);

        // operadores lógicos menor (<) e maior (>) / menor igual (<=) e maior igual (>=)
        // operador de comparação de igualdade (==) e diferente (!=)

        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezIgualVinte = 10==20;
        boolean isDezIgualDez = 10==10;
        boolean isDezDiferenteDez = 10!=10;

        System.out.println("isDezMaiorQueVinte= "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte= "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte= "+isDezIgualVinte);
        System.out.println("isDezIgualDez= "+isDezIgualDez);
        System.out.println("isDezDiferenteDez= "+isDezDiferenteDez);

        // Operadores Lógicos: and (&&), or(||), not(!) sempre retorna boolean
        int idade= 35;
        float salario= 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario>=4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario>=3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta= "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta= "+isDentroDaLeiMenorQueTrinta);

        //OR

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation= 5000F;

        boolean isPlaystationCincoCompravel= valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca>valorPlaystation;
        System.out.println("isPlaystationCincoCompravel = "+isPlaystationCincoCompravel);

        // Operadores de Atribuição (=), (+=) ,(-=) ,(*=) ,(/=) ,(%=)
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus*=2; // 3600
        bonus/=2; //1800
        bonus %=2; // 0
        System.out.println(bonus);

        //Para usar em contadores
        int contador=0;
        contador++; // contador = contador+1
        contador--; // contador = contador-1
        // também existe ++contador e --contador , serve para ditar a ordem que a operação tem que ser feita
        System.out.println(contador++); // output = 0
        System.out.println(contador); //output = 1 por causa do ++ da antiga linha

        System.out.println(++contador); //Output == 1 por causa do ++ antes de contador
    }
}
