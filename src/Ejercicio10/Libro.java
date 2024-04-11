package Ejercicio10;

public class Libro {
    protected String title;
    protected String author;
    protected double price;

    public Libro(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void imprimir() {
        System.out.println("Título: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Precio: " + price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
