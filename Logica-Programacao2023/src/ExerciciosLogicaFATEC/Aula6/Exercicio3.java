/* 
 Faça um programa que tenha como entrada de dados duas notas de um 
 aluno, digitadas pelo usuário, calcule e apresente a média ponderada,
 sabendo que a primeira nota tem peso 2.5 e a segunda, 4.5.
 */
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner (System.in);
        double Nota1, Nota2;
        System.out.println("Digite a Nota 1: ");
        Nota1 = Entrada.nextDouble();
        System.out.println("Digite a Nota 2: ");
        Nota2 = Entrada.nextDouble();

        double mediaPonderada = ((Nota1 * 2.5) + (Nota2 * 4.5)) / 7;

        System.out.println("A sua média é: " + mediaPonderada);
    }
}
