package arraylist;

public class Musica implements Comparable <Musica> {
    private String titulo;
    private int avaliacao;

    public Musica(String titulo){
        this.titulo = titulo;
    }

    public void setAvaliacao(int avaliacao){
        this.avaliacao = avaliacao;
    }

    public String getTitulo(){
        return titulo;
    }

    @Override
    public int compareTo(Musica o) {
        //ordenaçaão
        if (this.avaliacao < o.avaliacao)
            return 1;
        if (this.avaliacao == o.avaliacao)
            return 0;
        return -1;
    }

    @Override
    public String toString() {
        return String.format("Título: %s, avaliação: %d", this.titulo, this.avaliacao);
    }
}
