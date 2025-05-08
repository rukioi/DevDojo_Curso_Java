package academy.devdojo.maratonajava.introducao;

public class Aula05EstuturasCondicionais02 {
    public static void main(String[] args){
        // Se a idade for menor do que 15 imprimir categoria Infantil
        // Se idade >= 15 && idade <18 categoria juvenil
        // Se idade>=18 categoria Adulto
        int idade = 17;
        if(idade<15){
            System.out.println("Categoria Infantil");
        }
        if(idade>=15 && idade<18){
            System.out.println("Categoria Juvenil");
        }
        if(idade>=18){
            System.out.println("Categoria Adulto");
        }


    }

    public static class Aula05EstruturasCondicionais01 {
        public static void main(String[] args){
            //Obrigatoriamente tudo que estiver dentro do parenteses tem que ser booleano
            int idade = 20;
            boolean isAutorizadoComprarBebida = idade>=18;

            if(isAutorizadoComprarBebida){
                System.out.println("Autorizado a Comprar Bebida");}

            // Operador de Negacao !

            if(!isAutorizadoComprarBebida){  // O ! funciona para negar a afirmacao e retornar True
                System.out.println("Nao autorizado comprar bebida alcoolica");
            }




        }
    }
}
