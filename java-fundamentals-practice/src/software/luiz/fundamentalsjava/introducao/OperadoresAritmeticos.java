    package software.luiz.fundamentalsjava.introducao;

    public class OperadoresAritmeticos {
        static void main(String[] args) {
            // + - / *

            int a = 10;
            int b = 20;
            //int result = a +b;
            System.out.println(a + b);
            System.out.println(b / a);//Ordem importa nos operadores  a / b não pode ser feito
            System.out.println(a * b);
            System.out.println(a - b);
            //Operador Restos %
            int resto = 21 % 7 ;
            System.out.println(resto);
            
            //Operador Comparação
            // < menor
            // >maior
            // <= menor igual
            // >= maior igual
            // == igualdades
            //!= diferente
            boolean isDezMaiorQueVinte = 10 > 20 ;
            boolean isDezMenorQueVinte = 10 < 20 ;
            boolean isDezIgualVinte = 10 == 20 ;
            System.out.println(isDezMaiorQueVinte);
            System.out.println(isDezMenorQueVinte);
            System.out.println(isDezIgualVinte);

            //Operadores Lógicos And
            // && e (And)
            // || ou (or)
            // ! não (not)
            int idade = 26;
            float salario = 3500F;
            boolean isEstaDentroDaLei =  idade > 30 && salario >= 4000;
            System.out.println(isEstaDentroDaLei);


        }
    }
