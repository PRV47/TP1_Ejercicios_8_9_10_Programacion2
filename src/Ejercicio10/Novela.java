package Ejercicio10;

public class Novela extends Libro {
    private String tipo;

    public Novela(String titulo, String autor, double precio, String tipo) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo: " + tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
