package MaisExerciciosLogica;
import java.util.Scanner;
/*
Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino)
de 10 pessoas. Fazer um algoritmo que calcule e escreva:
a. A maior e menor altura do grupo;
b. A média da altura dos homens;
c. O número de mulheres;
 */
public class exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numeroHomens = 0;
        int numeroMulheres = 0;
        float somaAlturaH = 0;
        float somaAlturaM = 0;
        float mediaH;
        float maior = 0;
        float menor = 0;



        for (int i=0; i<10; i++) {
            System.out.println("Insira seu sexo (1)Mulher, (2)Homem: ");
            int usuario = entrada.nextInt();
            System.out.println("Insira sua altura: ");
            float alturausuario = entrada.nextFloat();
            if (usuario == 1) {
                numeroMulheres++;
                somaAlturaM = alturausuario + somaAlturaM;
            } else if (usuario == 2) {
                numeroHomens++;
                somaAlturaH = alturausuario + somaAlturaH;
            } else {
                System.out.println("Digite um número (1 - Mulher ; 2 - Homem");
            }
            if (alturausuario < menor) {
                menor = alturausuario;
            }
            else if (alturausuario > maior) {
                maior = alturausuario;
            }
            mediaH = somaAlturaH / numeroHomens;
            System.out.println("A maior altura do grupo é de " + maior + " m, e a menor, " + menor + " m.");
            System.out.println("A média da altura dos homens é: " + mediaH + " m.");
            System.out.println("O número de mulheres é: " + numeroMulheres);
            entrada.close();
        }
    }
}
