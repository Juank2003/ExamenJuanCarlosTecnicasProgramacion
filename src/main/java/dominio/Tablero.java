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

}
