package Ejercicio8;

public class Gerente extends Empleado {
    private String dept;

    public Gerente(String name, int age, double salary, String dept) {
        super(name, age, salary);
        this.dept = dept;
    }

    public void organizar() {
        System.out.println(name + " está organizando actividades en el departamento de " + dept);
    }

    @Override
    public void trabajar() {
        System.out.println(name + " está trabajando como gerente");
    }
}
