package exercicio_POO;

class Deficiente extends Atleta {
    private String tipoDeficiencia;

    public Deficiente(String nome, int idade, double tempoCorrida, int posicaoChegada, String tipoDeficiencia) {
        super(nome, idade, tempoCorrida, posicaoChegada);
        this.tipoDeficiencia = tipoDeficiencia;
    }

    public String getTipoDeficiencia() {
        return tipoDeficiencia;
    }

    public void setTipoDeficiencia(String tipoDeficiencia) {
        this.tipoDeficiencia = tipoDeficiencia;
    }
}

