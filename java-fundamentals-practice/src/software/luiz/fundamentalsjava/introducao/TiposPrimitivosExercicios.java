package software.luiz.fundamentalsjava.introducao;
/*
* Crie Variáveis para os campos descritos abaico entre <> e imprima a seguinte mensagem
*   Eu <nome>, morando no endereço <endereço>
cofirmo que recebi o salário de <salário>, na data <data>
 */


public class TiposPrimitivosExercicios {
    public static void main(String[]args){
        String nome = "Luiz Paulo";
        String endereco = "Quadra 123 bloco c casa 8 Tocantins";
        float salario = 5000.2f;
        String dataMes = "março";

        System.out.println(" Eu " +nome+ ", morando no endereço " +endereco+ " cofirmo que recebi o salário de " +salario+ " no mes  de "+dataMes);
    }

}
