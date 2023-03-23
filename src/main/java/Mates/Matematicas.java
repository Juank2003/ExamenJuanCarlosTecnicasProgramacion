package Mates;

import java.util.Random;

public class Matematicas {
    public static double generarNumeroPi(long pasos) throws IllegalArgumentException{

        if (pasos <=0){
            System.out.println("El número de pasos debe sser mayor que cero");
        }
        double aciertos = 0;
        double radio = 1;
        double ladoCuadrado = 2 * radio;
        Random rnd = new Random();

        for (long i = 0; i < pasos; i++) {
            double x = rnd.nextDouble() * ladoCuadrado - radio;
            double y = rnd.nextDouble() * ladoCuadrado - radio;
            double distancia = Math.sqrt(x * x + y * y);
            if (distancia <= radio) {
                aciertos++;
            }
        }

        return 4 * (aciertos / pasos);
    }
}
