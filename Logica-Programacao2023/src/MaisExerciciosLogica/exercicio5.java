package src.MaisExerciciosLogica;
import java.util.Scanner;
/*
1. Escreva um programa que, com base em uma temperatura em graus
celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra)
e Fahrenheit (F), seguindo as fórmulas:
1) F = C * 1.8 + 32;
2) K = C + 273.15;
3) Re = C * 0.8;
4)Ra = C * 1.8 + 32 + 459.67
 */
public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira uma temperatura, em graus centígrados: ");
        double temperaturaCelsius = entrada.nextDouble();
        double temperaturaFahrenheit = temperaturaCelsius * 1.8 + 32;
        double temperaturaKelvin = temperaturaCelsius + 273.15;
        double temperaturaReamur = temperaturaCelsius * 0.8;
        double temperaturaRankine = temperaturaFahrenheit + 459.67;

        System.out.println("A temperatura convertida, em graus Fahreinheit, é: " + temperaturaFahrenheit);
        System.out.println("A temperatura convertida, em graus Kelvin. é: " + temperaturaKelvin);
        System.out.println("A temperatura convertida, em graus Réamur, é: " + temperaturaReamur);
        System.out.println("A temperatura convertida, em graus Rankine, é: " + temperaturaRankine);

        entrada.close();
    }
    }