package src.MaisExerciciosLogica;
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        // Crie uma classe que calcule uma determinada porcentagem de um dado salário.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um salário: ");
        double salario = scan.nextDouble();
        System.out.println("Digite uma porcentagem (exemplo: 15% - 0.15): ");
        double porcentagem = scan.nextDouble();
        double resultado = salario * porcentagem;
        System.out.println("A porcentagem pedida é: " + resultado);
        scan.close();

    }
}
