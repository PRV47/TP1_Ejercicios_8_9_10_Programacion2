package Ejercicio10;

public class LibroDeTexto extends Libro {
    private String subject;

    public LibroDeTexto(String title, String author, double price, String subject) {
        super(title, author, price);
        this.subject = subject;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Curso: " + subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
