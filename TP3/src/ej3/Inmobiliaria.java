package ej3;

import java.util.ArrayList;

public class Inmobiliaria {
    private ArrayList<Propiedad> propiedades = new ArrayList<>();
    private ArrayList<Barrio> barrios;

    public Inmobiliaria(ArrayList<Barrio> barrios) {
        this.barrios = barrios;
        for (Barrio barrio: barrios) {
            propiedades.addAll(barrio.getPropiedades());
        }
    }

    public void mostrarPropiedade(){
        for (Propiedad propiedad: this.propiedades) {
            System.out.println(propiedad);
        }
    }

    public void obtenerBarrioMaxProp(){
        ArrayList<Barrio> acom=new ArrayList<>(barrios);
        int maximo=0;
        for (int i =0;i<barrios.size();i++) {
            if (barrios.get(i).obtenerBarrioMaxProp() > maximo){
                maximo = barrios.get(i).obtenerBarrioMaxProp();
                acom.clear();
                acom.add(barrios.get(i));
            } else if (barrios.get(i).obtenerBarrioMaxProp() == maximo) {
                acom.add(barrios.get(i));
            }
        }
        mostrarBarrios(acom);
    }

    public void mostrarBarrios(ArrayList<Barrio> barrios){
        for (Barrio b: barrios) {
            System.out.println(b);
        }
    }


    private boolean stringValido(String s){
        return !s.isEmpty();
    }


    public void cambiarPropiedadDeBarrio(String domicilio,Barrio barrio){
        Propiedad aux = null;
        int i = 0;
        if (stringValido(domicilio)){
            while(i<barrios.size() && aux == null){
                if (barrios.get(i).buscar(domicilio) != null){
                    aux = barrios.get(i).buscar(domicilio);
                }
                i++;
            }}
        borrarPropiedad(domicilio);
        barrio.getPropiedades().add(aux);

    }

    public void borrarPropiedad(String domicilio){
        Propiedad aux =null;
        int i =0;
        if (stringValido(domicilio)){
            while(i<barrios.size() && aux == null ){
                aux = barrios.get(i).removerPropiedad(domicilio);
                i++;
        }}
    }

    public ArrayList<Barrio> getBarrios() {
        return barrios;
    }
}
