
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public abstract class Planetas {
    public Double Peso, constante, res;
    public ArrayList<Object> lista = new ArrayList<>();
    
    public void setPeso(Double Peso) {
        this.Peso = Peso;
    }
    
    public double FazConta(){
        res = constante * Peso;
        return res;
    }
    
    
}
