package ExerciciosLogicaFATEC;
import java.lang.Math;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double PI = 3.14;
        System.out.println("Digite o raio: ");
        int raio = scan.nextInt();
        double volume = PI * Math.pow(raio, 3);

        System.out.println("O volume do círculo é: " + volume);
        scan.close();
    }
}
