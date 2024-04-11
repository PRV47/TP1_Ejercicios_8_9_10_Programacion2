package Ejercicio8;

public abstract class Empleado {
    protected String name;
    protected int age;
    protected double salary;

    public Empleado(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public abstract void trabajar();
}
