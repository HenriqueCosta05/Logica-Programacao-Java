package src.MaisExerciciosLogica;
/*
Receba uma idade como entrada e:
Se idade > 18: imprimir adulto
Se idade < 18: imprimir ainda não é adulto
 */
import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        if(idade < 18) {
            System.out.println("Ainda não é adulto.");
        }

        else{
            System.out.println("Adulto.");
        }
        scan.close();
    }
}
