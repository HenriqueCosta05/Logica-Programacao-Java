import java.util.Scanner;
public class Aula1_Exercicio1 {
    /* Faça um algoritmo para calcular o estoque médio de uma peça, sendo que
    estoqueMedio = (qtdMinima + qtdMaxima) / 2
     */
    public static void main(String[] args) {
        //Passo 1: inicializar o Scanner e declarar as variáveis.
        Scanner entradaUsuario = new Scanner(System.in);
        int qtdMinima, qtdMaxima;
        double estoqueMedio;

        //Passo 2: Obter os valores qtdMinima e qtdMaxima pelo Scanner:
        System.out.println("Digite a quantidade mínima de peças: ");
        qtdMinima = entradaUsuario.nextInt();
        System.out.println("Digite a quantidade máxima de peças: ");
        qtdMaxima = entradaUsuario.nextInt();

        //Passo 3: Efetuar a operação e imprimir o resultado:
        estoqueMedio = (qtdMinima + qtdMaxima) / 2;
        System.out.println("O estoque médio desta peça é: " + estoqueMedio);
    }
}
