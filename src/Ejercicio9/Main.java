package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(6);
        Rectangulo rectangulo = new Rectangulo(5, 11);

        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Perimetro del circulo: " + circulo.calcularPerimetro());

        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Perimetro del rectangulo: " + rectangulo.calcularPerimetro());
    }
}
