public class Aula05EstruturasCondicionais {
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
