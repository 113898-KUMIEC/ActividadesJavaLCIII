import clases.Persona;

import  clases.Calculadora;

import clases.Rectangulos;

import static java.lang.Math.*; //si importo la clase math puedo usar sus metodos sin llamarlo de la forma Math.PI;

public class Main {

    public static void main(String[] args) {
        
        Persona p = new Persona("EzeKe", 19);
        
        Persona p2 = new Persona("Maradona", 62);
        
        p.mostrarDatos();
        p2.mostrarDatos();
        
        
        System.out.println(Calculadora.PI);
        System.out.println(Calculadora.sumar(40,50));
        System.out.println(PI);
        System.out.println(E);
        System.out.println(pow(4, 3));
        
        //clase calculadora
        Calculadora c = new Calculadora();
        
        System.out.println(c.resta(10, 5));
        System.out.println(c.sumar(4.5, 5.5));
        System.out.println(c.sumar(5, 20));
        
        //clase rectangulo
        
        Rectangulos r = new Rectangulos();
        System.out.println(r.area(8, 4));
        System.out.println(r);
        System.out.println(r.altura);
    }
    
}
