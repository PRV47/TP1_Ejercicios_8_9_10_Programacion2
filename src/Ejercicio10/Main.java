package Ejercicio10;

public class Main {
    public static void main(String[] args) {
        LibroDeTexto libroDeTexto = new LibroDeTexto("Introduccion al Ingles", "Maria Rueda", 30.0, "Ingles I");
        LibroUniversitario LibroUniversitario = new LibroUniversitario("Quimica General 7ma Edicion", "Raymond CHang", 50, "Quimica General", "Facultad de Ciencias");
        Novela novela = new Novela("La suma de todos los miedos", "Tom Clancy", 30, "Belico, Drama");

        libroDeTexto.imprimir();
        LibroUniversitario.imprimir();
        novela.imprimir();
    }
}
