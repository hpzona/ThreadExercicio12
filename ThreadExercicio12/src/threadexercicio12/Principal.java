package threadexercicio12;

import java.util.Random;

public class Principal {

    public static void main(String[] args) {

        Random num = new Random();
        int[][] matriz = new int[100][100];
        Somador somador = new Somador();

        for (int linha = 0; linha < 100; linha++) {
            for (int coluna = 0; coluna < 100; coluna++) {
                matriz[linha][coluna] = num.nextInt(100);
            }
        }

        for (int i = 0; i < 100; i++) {
            new Thread(new Soma(i, somador, matriz)).start();
        }

        System.out.println("Total: " + somador.getTotal());
    }
}
