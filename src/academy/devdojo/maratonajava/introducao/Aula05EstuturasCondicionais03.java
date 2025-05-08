package academy.devdojo.maratonajava.introducao;

public class Aula05EstuturasCondicionais03 {
    public static void main(String[] args){
        // Doar se salario > 5000
        // OPERADOR TERNARIO  = String resultado = salario>5000 ? mensagemDoar : mensagemNaoDoar;
        double salario = 1500;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda Nao tenho condicoes, mas vou ter";
        String resultado;
        // String resultado = salario>5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado = salario>200 ? mensagemDoar : mensagemNaoDoar);

    }
}
