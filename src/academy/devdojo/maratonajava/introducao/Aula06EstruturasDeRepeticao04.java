package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condicao: valor da parcela tem que ser >= 1000
    public static void main(String[] args){
        double valorTotal=30000;
        for (int parcela = 1; parcela <=valorTotal ; parcela++) {
            double valorDasParcelas = valorTotal / parcela;
            if (valorDasParcelas <1000) {
                break;}
            System.out.println("Parcela " + parcela + " R$" + valorDasParcelas);
        }
    }
}
