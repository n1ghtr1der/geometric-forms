package entities;

public class Quadrado extends FormaGeometrica{
    @Override
    public double calcArea() {
        return Math.pow(lado1, 2);
    }

    @Override
    public double calcPerimetro() {
        return lado1 * 4;
    }
}
