package threadexercicio12;

public class Somador {
    
    private int total;

    public synchronized int getTotal() {
        return total;
    }

    public synchronized void setTotal(int valor) {
        this.total = total + valor;
    }
    
    public Somador() {
        this.total = 0;
    }
}
