package pesoplanetas2;


public class Jupiter {
    private int peso;

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public double calculaJupiter(){
        double response = (peso * 2.64);
        PesoPlanetas2.ListHist.add(peso+"=>"+response);
        return response;
    }
}
