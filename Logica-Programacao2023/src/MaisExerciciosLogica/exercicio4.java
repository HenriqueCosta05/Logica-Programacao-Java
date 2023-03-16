package src.MaisExerciciosLogica;
import java.util.Scanner;
/* Dado um determinado salário:
1. Se salário > 4500 -> imprimir 30% do valor;
2. Senão imprimir 15% do valor;
 */
public class exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um salário: ");
        double salario = scan.nextDouble();

        if(salario > 4500) {
            String porcentagem = " A porcentagem utilizada foi de 30%";
            System.out.println(salario * 0.3 + porcentagem);
        }
        else {
            String porcentagem = " A porcentagem utilizada foi de 15%";
            System.out.println(salario * 0.15 + porcentagem);
            scan.close();

        }
    }
}
