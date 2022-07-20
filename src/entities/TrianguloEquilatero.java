package entities;

public class TrianguloEquilatero extends FormaGeometrica {
    @Override
    public double calcArea() {
        return (Math.pow(lado1, 2) * Math.sqrt(3)) / 4;
    }

    @Override
    public double calcPerimetro() {
        return lado1 * 3;
    }
}
