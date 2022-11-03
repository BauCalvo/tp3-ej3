package ej3;

import java.util.ArrayList;

public class Barrio {
    private String nombre;
    private ArrayList<Propiedad> propiedades;

    public Barrio(String nombre, ArrayList<Propiedad> propiedades) {
        this.nombre = nombre;
        this.propiedades = propiedades;
    }

    public void mostrarPropiedades(Tipo tipo){
        for (Propiedad prop: propiedades){
            System.out.println(prop.getTipo().equals(tipo) ? prop: "el barrio no tiene ese tipo de propiedad");
        }
    }

    public int obtenerBarrioMaxProp(){
        return propiedades.size();
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }

    public Propiedad buscar(String domicilio){
        int i = 0;
        while (i<propiedades.size()){
            if (propiedades.get(i).getDomicilio().equals(domicilio))
                return  propiedades.get(i);
            else  i++;
        }
        return null;
    }
    public void mostrarPropiedades(){
        for (Propiedad p : propiedades){
            System.out.println(p);
        }
    }


    public Propiedad removerPropiedad(String domicilio){
        Propiedad aux = buscar(domicilio);
        if (aux != null){
            propiedades.remove(aux);
        }
        return aux;
    }

    @Override
    public String toString() {
        return "Barrio{" +
                "nombre='" + nombre + '\'' +
                ", cantidad de propiedades='" + propiedades.size() + '\'' +
                '}';
    }
}
