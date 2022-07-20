package entities;

public class FormaGeometrica {
    public double lado1;
    public double calcArea() {
         return lado1;
     }
     public double calcPerimetro() {
        return lado1;
     }
     public void exibirDados() {
         System.out.println();
         System.out.println("Lado da forma geométrica informada: " + lado1);
         System.out.println("Tamanho da área: " + calcArea());
         System.out.println("Tamanho perímetro: " + calcPerimetro());
     }
}
