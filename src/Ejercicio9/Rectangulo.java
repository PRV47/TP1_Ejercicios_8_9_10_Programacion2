package Ejercicio9;

public class Rectangulo extends FiguraGeometrica {
    private double length;
    private double width;

    public Rectangulo(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calcularArea() {
        return length * width;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (length + width);
    }
}
