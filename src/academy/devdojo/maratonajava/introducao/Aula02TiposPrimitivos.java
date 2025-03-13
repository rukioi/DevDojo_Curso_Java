package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean ----- 1byte = 8bites = 128
        int age = 10; // (size 4 bytes), -2,147,483,648 até 2,147,483,647
        long giantNumber = 1000000; // (size 8 bytes), números infinitos
        double salaryDouble = 2000.5D; // mas funciona  (size 8 byte), infinito 0.0d (formatação)
        float salaryFloat = 2500.0F; //--> o F funciona para dizer o que está acontecendo a máquina quando adiciona decimal! (size 4 bytes), números infinitos 0.0f (formatação)
        byte ageByte = 10; // (size 1 byte), -128 ate 127
        short ageShort = 10; // (size 2 bytes),-32768 até 32767
        boolean verdadeiro = true; // (size 1 byte), true or false
        boolean falso = false; // (size 1 byte), true or false
        char character = 'M'; // (size 2 bytes), Table Unicode e Table Ascii
        // casting é para forçar a entrada deum tipo primitivo em outro, forçar um long ser um int --> int age = (int) 10000000L

        String name = "Murilo Souza de Barros"; //reference type, não é primitive type(starts always lower case)

        System.out.println("A Idade é "+age+" Anos:");
        System.out.println(verdadeiro);
        System.out.println(name);

    }
}
