package entities;

public class Retangulo extends FormaGeometrica{
    public double lado2;

    @Override
    public double calcArea() {
        return lado1 * lado2;
    }

    @Override
    public double calcPerimetro() {
        return (lado1 + lado2) * 2;
    }

    @Override
    public void exibirDados() {
        System.out.println();
        System.out.println("Primeiro lado informado da forma geométrica: " + lado1);
        System.out.println("Segundo lado informado da forma geométrica: " + lado2);
        System.out.println("Tamanho da área: " + calcArea());
        System.out.println("Tamanho perímetro: " + calcPerimetro());
    }
}
