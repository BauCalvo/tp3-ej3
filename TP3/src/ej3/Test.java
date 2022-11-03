package ej3;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Propiedad p1 = new Propiedad("Fitz Roy 2355",200000,Tipo.DEPARTAMENTO);
        Propiedad p2 = new Propiedad("Talcahuano 758",150000,Tipo.DEPARTAMENTO);
        Propiedad p3 = new Propiedad("Santa Fe 2400",300000,Tipo.DEPARTAMENTO);
        Propiedad p4 = new Propiedad("Corrientes 956",250000,Tipo.PH);
        Propiedad p5 = new Propiedad("Yatay 4200",700000,Tipo.DEPARTAMENTO);
        Propiedad p6 = new Propiedad("Lavalle 355",1000000,Tipo.CASA);
        Propiedad p7 = new Propiedad("Gorriti 2355",205000,Tipo.CASA);
        ArrayList<Propiedad> props1= new ArrayList<>();
        props1.add(p1);
        props1.add(p2);
        ArrayList<Propiedad> props2= new ArrayList<>();
        props2.add(p3);
        props2.add(p4);
        ArrayList<Propiedad> props3= new ArrayList<>();
        props3.add(p5);
        props3.add(p6);
        props3.add(p7);

        Barrio barrio1 = new Barrio("Palermo",props1);
        Barrio barrio2 = new Barrio("Almagro",props2);
        Barrio barrio3 = new Barrio("Recoleta",props3);
        ArrayList<Barrio> barrios = new ArrayList<>();
        barrios.add(barrio1);
        barrios.add(barrio2);
        barrios.add(barrio3);

        Inmobiliaria inmobiliaria = new Inmobiliaria(barrios);


//        inmobiliaria.mostrarPropiedade();
//        System.out.println("-----------------------------");
//        inmobiliaria.obtenerBarrioMaxProp();
//        inmobiliaria.borrarPropiedad(p1.getDomicilio());
//        System.out.println("-----------------------------");
//        inmobiliaria.mostrarBarrios(inmobiliaria.getBarrios());

        inmobiliaria.cambiarPropiedadDeBarrio(p3.getDomicilio(),barrio3);

        inmobiliaria.mostrarBarrios(inmobiliaria.getBarrios());




    }
}
