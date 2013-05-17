package threadexercicio12;

public class Soma implements Runnable {

    Somador somador;
    int[][] matriz;
    int linha;

    Soma(int linha, Somador somador, int[][] matriz) {
        this.somador = somador;
        this.matriz = matriz;
        this.linha = linha;
    }

    public void run() {

        for (int i = 0; i < 100; i++) {
            somador.setTotal(matriz[linha][i]);
        }
    }
}
