package exercicio_POO;


class Atleta {
    private String nome;
    private int idade;
    private double tempoCorrida;
    private int posicaoChegada;

    public Atleta(String nome, int idade, double tempoCorrida, int posicaoChegada) {
        this.nome = nome;
        this.idade = idade;
        this.tempoCorrida = tempoCorrida;
        this.posicaoChegada = posicaoChegada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getTempoCorrida() {
        return tempoCorrida;
    }

    public void setTempoCorrida(double tempoCorrida) {
        this.tempoCorrida = tempoCorrida;
    }

    public int getPosicaoChegada() {
        return posicaoChegada;
    }

    public void setPosicaoChegada(int posicaoChegada) {
        this.posicaoChegada = posicaoChegada;
    }
}
