package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // imprima todos os numeros pares de 0 ate 1.000.000
        for(int numero=0;numero<=10;numero+=2){
            System.out.println("Numeros Pares Sao: "+numero);
        }
        for (int i = 1; i <=100 ; i++) { // pensando no futuro!
            if(i%2==0){
                System.out.println("Pares sao: "+i);
            }

        }
    }
}
