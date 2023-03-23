package dominio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tablero {
    private static final int DIMENSION = 30;
    private int [][] estadoActual;
    private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION];


    public void leerEstadoActual() {

        estadoActual = new int[DIMENSION][DIMENSION];
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/estadoActual.txt"))) {
            String linea;
            int i = 0;
            while ((linea = br.readLine()) != null) {
                String[] valores = linea.split(" ");
                for (int j = 0; j < valores.length; j++) {
                    estadoActual[i][j] = Integer.parseInt(valores[j]);
                }
                i++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void generarEstadoActualPorMontecarlo() {
        estadoActual = new int[DIMENSION][DIMENSION];
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                estadoActual[i][j] = (Math.random() < 0.5) ? 0 : 1;
            }
        }
    }

    public void transitarAlEstadoSiguiente() {
    for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                int vecinosVivos = contarVecinosVivos(i, j);
                if (vecinosVivos == 3) {
                    estadoSiguiente[i][j] = 1;
                } else if (vecinosVivos == 2) {
                    estadoSiguiente[i][j] = estadoActual[i][j];
                } else {
                    estadoSiguiente[i][j] = 0;
                }
            }
        }
        estadoActual = estadoSiguiente;
        estadoSiguiente = new int[DIMENSION][DIMENSION];
    }

    private int contarVecinosVivos(int i, int j) {
        int vecinosVivos = 0;
        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                if (k >= 0 && k < DIMENSION && l >= 0 && l < DIMENSION && !(k == i && l == j)) {
                    vecinosVivos += estadoActual[k][l];
                }
            }
        }
        return vecinosVivos;
    }

    public String toString() {


}
