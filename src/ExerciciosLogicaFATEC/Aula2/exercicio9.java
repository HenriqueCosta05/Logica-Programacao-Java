package ExerciciosLogicaFATEC.Aula2;
import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a N1: ");
        double N1 = scan.nextDouble();
        System.out.println("Digite a N2: ");
        double N2 = scan.nextDouble();

        double mediaSimples = (N1 + N2) / 2;
        System.out.println("A média simples das notas é: " + mediaSimples);
        scan.close();
    }
}
