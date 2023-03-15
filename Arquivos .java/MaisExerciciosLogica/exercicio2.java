package MaisExerciciosLogica;
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        /* Crie uma variável que irá guardar o valor de um salário.
        Calcule a porcentagem desse salário, sendo os valores de porcentagem:
        1. 30%
        2. 15%
        3. 5%;
        Obs.: A cada vez que você calcular, guarde o resultado em uma variável.
        Imprima o resultado e reutilize a variável que guarda o resultado para o
        novo cálculo.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um salário: ");
        double salario = scan.nextDouble();
        double porcentagem1 = 0.30 * salario;
        double porcentagem2 = 0.15 * salario;
        double porcentagem3 = 0.05 * salario;
        System.out.println("O percentual 1 (30%) do salário é: " + porcentagem1);
        System.out.println("O percentual 2 (15%) do salário é: " + porcentagem2);
        System.out.println("O percentual 3 (5%) do salário é: " + porcentagem3);
        scan.close();
    }
}
