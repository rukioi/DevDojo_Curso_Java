package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while and for
        byte count = 0;
        while (count < 10){ // sempre valor booleano!
            System.out.println(++count);
        }
        // do while vai executar uma vez, memso se a condicao que eu colocar for falsa // pouquissimo utilizado
        do {
            System.out.println("Dentro do do-while "+(++count));
        }while (count < 15);

            for(int i=0;i<10;i++){ // Sintaxe do for --> for(;;){}  // utilizado para contagens, trabalha com index, tem que sempre associar o valor na primeira condicao (aqui);;
                System.out.println("for "+i);

        }
    }
}
