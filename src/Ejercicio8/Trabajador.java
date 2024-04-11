package Ejercicio8;

public class Trabajador extends Empleado {
    private String area;

    public Trabajador(String name, int age, double salary, String area) {
        super(name, age, salary);
        this.area = area;
    }

    public void producir() {
        System.out.println(name + " está produciendo en el área de " + area);
    }

    @Override
    public void trabajar() {
        System.out.println(name + " está trabajando como trabajador");
    }
}
