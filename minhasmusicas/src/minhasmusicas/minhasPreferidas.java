/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minhasmusicas;

/**
 *
 * @author vitor.felicio
 */
public class minhasPreferidas {
    public void inclui(audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo()+" é hit");
        }else{
            System.out.println(audio.getTitulo()+" musica underground");
        }
    }
}
