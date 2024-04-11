package Ejercicio9;

import static java.lang.Math.*;
public class Circulo extends FiguraGeometrica {
    private double radius;

    public Circulo(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcularArea() {
        return PI * pow(radius, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * radius;
    }
}
