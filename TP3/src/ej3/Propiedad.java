package ej3;

public class Propiedad {
    private String domicilio;
    private float precio;
    private Tipo tipo;


    public Propiedad(String domicilio, float precio, Tipo tipo) {
        this.domicilio = domicilio;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "Propiedad{" +
                "domicilio='" + domicilio + '\'' +
                ", precio=" + precio +
                '}';
    }
}
