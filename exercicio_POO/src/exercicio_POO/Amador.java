package exercicio_POO;

class Amador extends Atleta {
    private String categoria;

    public Amador(String nome, int idade, double tempoCorrida, int posicaoChegada, String categoria) {
        super(nome, idade, tempoCorrida, posicaoChegada);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
