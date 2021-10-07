package arraylist;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaDeMusicas {
    public static void main(String[] args) {
        //generics
        //polimorfismo parametrico
        List <Musica> musicas = new ArrayList<>();
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "0-Sair\n1-Inserir música\n2-Avaliar música\n3-ver lista de musicas ordenada\n"
            ));
            switch (op){
                case 1:
                    //1º pegar título da musica
                    String tituloMusicaInserir = JOptionPane.showInputDialog("Qual o título da música?");
                    //2ºconstruir um objeto do tipo musica
                    Musica musicaInserir = new Musica(tituloMusicaInserir);
                    //3ºadicionar ao arraylist usando add
                    musicas.add(musicaInserir);
                    //4º confirmar inserção para o usuário
                    JOptionPane.showMessageDialog(null, "Musica adicionada: " + tituloMusicaInserir);
                    break;
                case 2:
                    String tituloMusicaAvaliar = JOptionPane.showInputDialog("Qual música deseja avaliar?");
                    int nota = Integer.parseInt(JOptionPane.showInputDialog("Qual a nota?"));
                    int i = 0;
                    for(i = 0; i < musicas.size(); i++){
                        Musica m = musicas.get(i);
                        if(tituloMusicaAvaliar.equals(m.getTitulo())){
                            m.setAvaliacao(nota);
                            JOptionPane.showMessageDialog(null, "Música avaliada");
                            break;
                        }
                    }
                    if (i == musicas.size())
                        JOptionPane.showMessageDialog(null, "Música não encontrada na coleção");
                    break;
                case 3:
                    Collections.sort(musicas);
                    JOptionPane.showMessageDialog(null, musicas);

                    break;
                case 0: JOptionPane.showMessageDialog(null, "Até logo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida");
                    break;
            }
        }while (op != 0);
    }
}
