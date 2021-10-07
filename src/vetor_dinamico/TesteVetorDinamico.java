package vetor_dinamico;

import java.util.Random;

public class TesteVetorDinamico {
    public static void main(String[] args)
            throws Exception {
        Random gerador = new Random();
        VetorDinamico vetorDinamico = new VetorDinamico();
        for (int i = 0; i < 10; i++){
            vetorDinamico.exibir();
            int aleatorio = gerador.nextInt(20) + 1;
            vetorDinamico.adicionar(aleatorio);
            Thread.sleep(3000);
        }

    }
}
