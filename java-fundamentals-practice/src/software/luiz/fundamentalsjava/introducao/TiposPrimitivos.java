package software.luiz.fundamentalsjava.introducao;

public class TiposPrimitivos {
    public static void main(String[]args){
        //Tipos primitivo -> Valor simples guardado em memória
        // int , boolean , double , char , long  , float , short
        //Espaço na memória refenciando idade valor guardado nela de 26
        //int idade= 26;
        int idade=(int) 10000000L;//Casting
        long hash=123456789;
        double salario = 2000;
        float salarioFloat= 2500;
        byte idadeByte = -120;
        short idadeShort=20;
        boolean verdadeiro= true;
        boolean falso= false;
        char caractere = 65;//Unicode ou asc

        //String -> Classe
        String nome = "Luiz";


        System.out.println("Idade : " + idade);
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println(nome);


    }

}
