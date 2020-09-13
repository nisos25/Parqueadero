package co.unicauca.solid.dip.domain;

public class Product {

    private int ingresoId;

    private String tipo;

    private double tiempo;

    public Product(int ingresoId, String tipo, double tiempo) {
        this.ingresoId = ingresoId;
        this.tipo = tipo;
        this.tiempo = tiempo;
    }

    public Product() {
    }

    public int getIngresoId() {
        return productId;
    }

    public void setIngresoId(int ingresoId) {
        this.ingresoId = ingresoId;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + ingresoId + ", tipo=" + tipo + ", tiempo=" + tiempo + '}';
    }
}
