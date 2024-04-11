package Ejercicio10;

public class LibroUniversitario extends LibroDeTexto {
    private String faculty;

    public LibroUniversitario(String title, String author, double price, String subject, String faculty) {
        super(title, author, price, subject);
        this.faculty = faculty;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Facultad: " + faculty);
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
