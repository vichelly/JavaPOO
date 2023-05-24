package controller;


import view.NewJFrame;
import java.util.ArrayList;
import javax.swing.JFrame;


public class PesoEmPlanetas {

    public static ArrayList<String> historico = new ArrayList<>();
    public static void main(String[] args) {
        
        // Instanciando o NewJFrame
        NewJFrame frame = new NewJFrame();
        
        // Configurando o comportamento de fechamento do JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Exibindo o JFrame
        frame.setVisible(true);
    }
    
}
