package ExerciciosLogicaFATEC.Aula2;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahreinheit: ");
        double temperaturafahreinheit = scan.nextDouble();

        double temperaturaCelsius = (temperaturafahreinheit - 32) * 0.56;
        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius);
        scan.close();
    }
}
