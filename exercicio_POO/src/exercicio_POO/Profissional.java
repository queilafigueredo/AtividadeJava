package exercicio_POO;

class Profissional extends Atleta {
    private String patrocinador;

    public Profissional(String nome, int idade, double tempoCorrida, int posicaoChegada, String patrocinador) {
        super(nome, idade, tempoCorrida, posicaoChegada);
        this.patrocinador = patrocinador;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }
}
