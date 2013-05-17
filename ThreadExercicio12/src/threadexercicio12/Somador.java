package threadexercicio12;

public class Somador {
    
    private int total;

    public Somador() {
        this.total = 0;
    }
    
    public synchronized void setTotal(int valor) {
        this.total = total + valor;
    }
    
    public int getTotal() {
        return total;
    }
    
    
}
