package Mates;

import java.util.Random;

public class Matematicas {
    public static double generarNumeroPi(long pasos){
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
