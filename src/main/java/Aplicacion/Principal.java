package Aplicacion;

import Mates.Matematicas;
public class Principal{
    public static void main(String[] args){
        System.out.println("El número PI es " + Matematicas.
                generarNumeroPi(Integer.parseInt(args[0])));
    }
}