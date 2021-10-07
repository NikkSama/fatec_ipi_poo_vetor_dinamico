package vetor_dinamico;

import java.util.Random;
public class TesteVetorDinamicoAumentarDiminuir {
    public static void main(String[] args) throws Exception{
        VetorDinamico v = new VetorDinamico();
        Random gerador = new Random();
        while (true){
            double probabilidade = gerador.nextDouble();
            boolean ehParaAdicionar;
            if (v.getQtde() <= v.getCap() / 2)
                ehParaAdicionar = probabilidade <= 0.7;
            else
                ehParaAdicionar = probabilidade <= 0.3;
            if (ehParaAdicionar){
                int elemento = gerador.nextInt(20) + 1;
                v.adicionar(elemento);
            }
            else{
                v.remover();
            }
            v.exibir();
            System.out.println("================================================================");
            Thread.sleep(3000);
        }

    }
}
