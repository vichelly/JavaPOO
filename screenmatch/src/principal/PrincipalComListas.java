/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

/**
 *
 * @author vluca
 */
public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Skibiridop", 98723);
        Filme outroFilme = new Filme("YESYESYESYES", 1234);
        Filme filmedovit = new Filme("StreetVile", 123);
        Serie lost = new Serie("Lost", 1999);
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(filmedovit);
        lista.add(outroFilme);
        lista.add(lost);
        
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme){
                Filme filme = (Filme) item;
                System.out.println("Classificação" + filme.getClassificacao());
            }
        }
        List<String> buscaPorArtista = new LinkedList<>();
        
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Addam");
        buscaPorArtista.add("Jim");
        
        System.out.println(buscaPorArtista);
        
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação alfabetica");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de Titulos ordenado");
        Collections.sort(lista);
        System.out.println(lista);
    }
}
