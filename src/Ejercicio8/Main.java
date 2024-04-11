package Ejercicio8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Desea ingresar un Gerente o un Empleado?");
        System.out.println("Escriba '1' para Gerente");
        System.out.println("Escriba '2' para Empleado");
        int option = reader.nextInt();
        reader.nextLine();

        switch (option) {
            case 1:
                System.out.print("Escriba el nombre del gerente: ");
                String name = reader.nextLine();
                System.out.print("Escriba la edad de " + name + ": ");
                int age = reader.nextInt();
                System.out.print("Escriba el salario de " + name + ": ");
                int salary = reader.nextInt();
                reader.nextLine();
                System.out.print("Escriba el departamento donde trabaja " + name + ": ");
                String dept = reader.nextLine();
                Gerente gerente = new Gerente(name, age, salary, dept);
                gerente.trabajar();
                gerente.organizar();
                break;

            case 2:
                System.out.print("Escriba el nombre del trabajador: ");
                name = reader.nextLine();
                System.out.print("Escriba la edad de " + name + ": ");
                age = reader.nextInt();
                System.out.print("Escriba el salario de " + name + ": ");
                salary = reader.nextInt();
                reader.nextLine();
                System.out.print("Escriba el area donde trabaja " + name + ": ");
                String area = reader.nextLine();
                Trabajador trabajador = new Trabajador(name, age, salary, area);
                trabajador.trabajar();
                trabajador.producir();
                break;

        }
    }
}
