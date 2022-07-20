package app;

import entities.FormaGeometrica;
import entities.Quadrado;
import entities.Retangulo;
import entities.TrianguloEquilatero;

import java.util.Scanner;

public class UsaFormaGeometrica {
    public static void main(String[] args) {
        Scanner receiver = new Scanner(System.in);
        FormaGeometrica quadrado = new Quadrado();
        FormaGeometrica retangulo = new Retangulo();
        FormaGeometrica trianguloEquilatero = new TrianguloEquilatero();

        System.out.printf("1) Quadrado %n2) Retângulo %n3) Triângulo Equilátero%n");
        System.out.print("Insira o número correspondente a forma geométrica desejada: ");
        int escolha = receiver.nextInt();
        switch (escolha) {
            case 1:
                System.out.print("Insira o tamanho do lado do quadrado: ");
                quadrado.lado1 = receiver.nextDouble();
                quadrado.calcArea();
                quadrado.calcPerimetro();
                quadrado.exibirDados();
                break;
            case 2:
                System.out.print("Insira o tamanho da base do retângulo: ");
                retangulo.lado1 = receiver.nextDouble();
                System.out.print("Insira o tamanho da altura do retângulo: ");
                ((Retangulo) retangulo).lado2 = receiver.nextDouble();
                retangulo.calcArea();
                retangulo.calcPerimetro();
                retangulo.exibirDados();
                break;
            case 3:
                System.out.print("Insira o tamanho do lado do triângulo equilátero: ");
                trianguloEquilatero.lado1 = receiver.nextDouble();
                trianguloEquilatero.calcArea();
                trianguloEquilatero.calcPerimetro();
                trianguloEquilatero.exibirDados();
                break;
        }
    }
}
