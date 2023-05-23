/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minhasmusicas;

/**
 *
 * @author vitor.felicio
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        musica minhaMusica = new musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("kiss");
        
        for(int i = 0; i < 100; i++){
            minhaMusica.reproduz();
        }
        for(int i = 0; i < 200 ; i++){
            minhaMusica.curte();
        }
        
        podcast meuPodcast = new podcast();
        meuPodcast.setTitulo("Paulo junior");
        meuPodcast.setApresentador("Pauliho Gogó");
        meuPodcast.setDescricao("Paulinho cona sobre os tema mais quentes no mundo");
        
        for(int i = 0; i < 5000 ; i++){
            meuPodcast.reproduz();
        }
        for(int i = 0; i < 1000 ; i++){
            meuPodcast.curte();
        }
        
        minhasPreferidas preferidas = new minhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
    
}
