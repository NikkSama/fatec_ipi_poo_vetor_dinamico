package vetor_dinamico;

public class VetorDinamico{
    private int [] elementos;
    private int qtde;
    private int cap;

    public VetorDinamico(){
        this.qtde = 0;
        this.cap = 4;
        this.elementos = new int[this.cap];
    }

    public boolean estaCheio (){
        return this.qtde >= this.cap;
        // return this.qtde == this.cap ? true : false;
        // if (this.qtde == this.cap)
        //     return true;
        // return false;
    }

    public boolean estaVazio(){
        return this.qtde <= 0;
    }

    public void adicionar (int elemento){
        if (estaCheio())
            aumentarCapacidade();
        this.elementos[this.qtde] = elemento;
        this.qtde++;
        // if(!estaCheio()){
        //     this.elementos[this.qtde] = elemento;
        //     this.qtde++;
        // }
    }

    public void remover (){
        if (!estaVazio()){
            this.qtde--;
            if (this.cap > 4 && this.qtde <= this.cap / 4){
                this.reduzirCapacidade();
            }
        }
    }

    private void aumentarCapacidade () {
        //1. Alocar um vetor novo com o dobro da capacidade
        int [] aux = new int[this.cap * 2];
        //2. Copiar todos os elementos existentes para o vetor novo
        for (int i = 0; i < this.cap; i++){
            aux[i] = this.elementos[i];
        }
        //3. Passar a utilizar o vetor novo, descartando o antigo
        this.elementos = aux;
        //4. Ajustar o valor da variável cap
        this.cap = this.cap * 2;
    }

    public int getQtde() {
        return qtde;
    }

    public int getCap() {
        return cap;
    }

    private void reduzirCapacidade(){
        //1. Alocar um vetor novo com a metade da capacidade
        int [] aux = new int [this.cap / 2];
        //2. Copiar todos os elementos existentes para o vetor novo
        for (int i = 0; i < this.qtde; i++) {
            aux[i] = this.elementos[i];
        }
        //3. Passar a utilizar o vetor novo, descartando o antigo
        this.elementos = aux;
        //4. Ajustar o valor da variável cap
        this.cap /= 2;
    }



    public void exibir (){
        System.out.printf ("Qtde: %d, Cap: %d\n", this.qtde, this.cap);
        //enhanced for ou for each (desde o Java 5)
        // for (int elemento : this.elementos){
        //     System.out.printf ("%d ", elemento);
        // }
        //for comum
        for (int i = 0; i < this.qtde; i++){
            System.out.printf ("%d ", this.elementos[i]);
        }
        System.out.println();
    }
}