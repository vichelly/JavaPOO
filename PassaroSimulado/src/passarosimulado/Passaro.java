public class Passaro {
    private String cor;
    private boolean voa;
    private int tamanho;

    public String getCor() {
        return cor;
    }

    public boolean getVoa() {
        return voa;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

    public Passaro(int tamanho , boolean voa, String cor) {
        this.cor = cor;
        this.voa = voa;
        this.tamanho = tamanho;
    }

    public Passaro(int tamanho) {
        this.tamanho = tamanho;
    }

    public Passaro(int tamanho, String cor) {
        this.cor = cor;
        this.tamanho = tamanho;
    }

    
    
}