package academy.devdojo.maratonajava.introducao;

public class Aula05EstuturasCondicionais06 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se e dia util ou final de semana , considere 1 como domingo!
        // Utilizando Switch
        byte num = 43;
        switch (num){
            default:
                System.out.println("Nao existe esse dia da semana!");
                break;
            case (7):
                System.out.println("Final de Semana");
                break;
            case(1):
                System.out.println("Final de Semana");
                break;
            case(2):
                System.out.println("Dia Util");
                break;
            case(3):
                System.out.println("Dia Util");
                break;
                case(4):
                System.out.println("Dia Util");
                break;
            case(5):
                System.out.println("Dia Util");
                break;
            case(6):
                System.out.println("Dia Util");
                break;
        }
    }
}
